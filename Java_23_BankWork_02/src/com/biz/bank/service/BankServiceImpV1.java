package com.biz.bank.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.biz.bank.domain.BankBookVO;
import com.biz.bank.util.BankInfo;

public class BankServiceImpV1 implements BankService {

	// TODO 계좌번호, 계좌정보 VO가 저장될 List
	Map<String, BankBookVO> bankBookList;
	BankBookVO bookVO ;

	// TODO 키보드 장치선언
	Scanner scan;
	
	String bookFile;
	
	// TODO생성자 method
	public BankServiceImpV1() {
		// TreeMap : key값을 중심으로 오름차순 자동정렬
		bankBookList = new TreeMap<String, BankBookVO>();
		scan = new Scanner(System.in);
	}

	@Override
	public void readBook(String bookFile) throws Exception {
		// TODO키워드는 주석문내에서 사용도는 키워드로
		// 소스코드를 쉽게 찾아갈 수 있는 book mark를 설정
		
		this.bookFile = bookFile;
		
		// TODO 장고원장 파일을 읽어서 리스트로 생성

		FileReader fileReader;
		BufferedReader buffer;

		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);

		String reader = new String();
		while (true) {
			reader = buffer.readLine();
			if (reader == null)
				break;

			// 파일에서 한줄을 읽어 reader에 저장된 문자열을
			// 분리하여 계좌정보를 생성
			String[] books = reader.split(":");
			/*
			 * books[0] : 계좌정보 
			 * books[1] : 최종잔액 
			 * books[2] : 최종거래일자 
			 * books[3] : 구분
			 */
			String strNum = books[BankInfo.BOOK.NUM]; // books[0]
			String strBalance = books[BankInfo.BOOK.BALANCE];
			String strLastDate = books[BankInfo.BOOK.LAST_DATE];
			String strRemark = books[BankInfo.BOOK.REMARK];
			
			String strNumAcc = books[BankInfo.ACCC.NUM]; // books[0]
			String strBalanceAcc = books[BankInfo.ACCC.BALANCE];
			String strLastDateAcc = books[BankInfo.ACCC.LAST_DATE];
			String strRemarkAcc = books[BankInfo.ACCC.REMARK];

			int intBalance = Integer.valueOf(strBalance);

			// reader에서 각 항목별로 분리한 값을 BankBookVO에 담기
			BankBookVO bookVO = new BankBookVO();
			bookVO.setNum(strNum);
			bookVO.setBalance(intBalance);
			bookVO.setLastDate(strLastDate);
			bookVO.setRemark(strRemark);

			// 리스트에 추가
			bankBookList.put(strNum, bookVO);

			// Debugging code
			// bookVO에 값이 제대로 담겼는지 확인하는 코드
			System.out.println(bookVO.toString());

		} // end while
		buffer.close();
		fileReader.close();
	}

	/*
	 * 키보드로 계좌번호를 입력받아서
	 * 계좌번호가 list에 있으면
	 * 계좌정보(VO)를 추출하여 임시보관
	 */
	@Override
	public void viewAcc() {
		// TODO 계좌정보 조회
		System.out.print("계좌번호 >> ");
		String strNum = scan.nextLine();

		// bankBookList에서 strNum 값을 조회하고
		// 겨로가를 BankBookVO 에 담기
		
		// bankBookList에서 추추로딘 bookVO를 입출금 처리 method에서
		// 사용할 수 있도록 멤버변수 영역으로 이동
		bookVO = bankBookList.get(strNum);
		
		// bookVO에는 계좌정보 또는 null이 담긴다.
		// 계좌정보가 담기는 경우? : strNum 계좌가 list에 있을때
		// null이 담기는 경우? : strNum 계좌가 list에 없을때
		if(bookVO == null) {
			System.out.println("계좌정보가 없음");
		}
	}
	@Override
	public void input()  throws Exception {
		// TODO 입금처리
		
		this.viewAcc(); // 계좌조회
		
		// 앞에서 조회한 계좌정보가 유효한지 검사
		// viewAcc() 에서 유효하지 않은 계좌정보에 대해서는
		// 이미 메시지를 보여주었으므로
		// 여기에서는 검사만하고 더이상 진행하지 않는다.
		if(bookVO == null)return;
		
		System.out.print("입금액 >>");
		String strInput = scan.nextLine();
		int intInput = Integer.valueOf(strInput);
		
		// 만약 입금액이 (-)라면 입금거부
		if(intInput < 0 ) {
			System.out.println("입금액은 0원이상 필요");
			return;
		}
		
		int intBalance = bookVO.getBalance();
		intBalance += intInput;
		bookVO.setBalance(intBalance);
		
		// 거래일자, 구분 값 추가
		Date date = new Date();
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String lastDate = sd.format(date);
		bookVO.setLastDate(lastDate);
		bookVO.setRemark(BankInfo.REMARK.INPUT);
		
		// 입금처리된 내역을 통장파일에 저장하기
		//구분문자열과 입금된 금액을 파라미터로 전달
		this.accListWrite(BankInfo.REMARK.INPUT, intInput);
		
		// 입금처리 완료후
		// 원장에 내용을 저장하는 bookWriter() method를 호출
		// 여기서 하나의 문제 발생
		// 저장할 파일이름을 넘겨줄 방법을 모색해야 한다.
		// input() method를 변경하여
		// input(String bookFile)형식으로 바꿀수도 있지만,
		// 그렇게하면 interface와 interface를 implements한 클래스 모두를
		// 			변경해야하는 대공사 필요
		
		// 최소한의 코드를 변경하여
		// 원하는 결과를 얻기위해서
		// Service ㅋ르래스에서 bookFile 멤버변수(필드)를 하나 선언하고 
		// readBook() method에서 bookFile 변수값을 setting하여
		// 값을 공유하도록 설정한다.
		this.bookWrite(bookFile);
		// this.bankBookList(bookFile);
		
	}
	/*
	 * 1. 앞에서 조회된 계좌번호가 유효하지않으면 method 종료
	 * 2. 키보드 출금액을 입력받고
	 * 3. 음수이면 출금거부
	 * 4. 잔액 >= 출금이면 출금처리
	 * 5.		  아니면 추금거부
	 */
	@Override
	public void output()  throws Exception {
		// TODO 출금처리
		
		this.viewAcc();
		
		if(bookVO != null){
			System.out.print("출금액 >>");
			String strOutput = scan.nextLine();
			int intOutput = Integer.valueOf(strOutput);
			if(intOutput > 0) {
				int intBalance = bookVO.getBalance();
				if(intBalance >= intOutput) {
					intBalance -= intOutput;
					bookVO.setBalance(intBalance);
					
					LocalDate ld = LocalDate.now();
					DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
					String lastDate = df.format(ld);
					bookVO.setLastDate(lastDate);
					bookVO.setRemark(BankInfo.REMARK.OUTPUT);
					
					this.accListWrite(BankInfo.REMARK.OUTPUT, intOutput);
				}else {
					System.out.println("잔액부족 출금거부");
				}
			}else {
				System.out.println("0원이상 출금하시오");
			}
		}
		this.bookWrite(bookFile);
	}
/*
 * 입출금이 완료되는 순간 bookFile에 변동내역 저장
 * 
 * bookFile 변수를 매개변수로 받아
 * 변수값을 파일명으로 하는 처리를 수행해야 한다.
 */
	@Override
	public void bookWrite(String bookFile) throws Exception {
		// TODO 원장정보 파일에 저장
		PrintWriter fileOut = null;
		
		try {
			fileOut = new PrintWriter(bookFile);	
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Set<String> keys = bankBookList.keySet();
		for(String s : keys) {
			fileOut.printf("%s:%d:%s:%s\n", 
					bankBookList.get(s).getNum(),
					bankBookList.get(s).getBalance(),
					bankBookList.get(s).getLastDate(),
					bankBookList.get(s).getRemark()
					);
			fileOut.flush();
		}
		fileOut.close();
	}

	/*
	 * 어떤 계좌에서 입금이나 출금이 발생을 하면
	 * 내역을 계좌번호 파일에 저장
	 */
	@Override
	public void accListWrite(String remark, int money) throws Exception {
		// TODO 거래내역 파일로 저장
		
		String strAccPath = "src/com/biz/bank/books/";
		
		FileWriter fileWriter;
		PrintWriter accBook;
		
		// 계좌번호로 거래내역을 저장할 파일이름을 생성
		// BOOK-0001
		String accBookFile = String.format("BOOK-%s", bookVO.getNum());
		
		// FileWriter(, true)
		//  파일이 이미있으면 append(추가) mode로 open하고
		// 그렇지 않으면(파일이 없으면) 생성하라
		//  파일생성 src/com/biz/bank/acc/BOOK-0001.txt
		fileWriter = new FileWriter(strAccPath + accBookFile,true);
		accBook = new PrintWriter(fileWriter);
		
		int intBalance = bookVO.getBalance();
		String lastDate = bookVO.getLastDate();
		
		int intInput = 0 ;
		int intOutput = 0 ;
		
		intInput = money ;
		if(remark.equals(BankInfo.REMARK.OUTPUT)) {
			intInput = 0;
			intOutput = money;
		}
		// 거래일자, 구분, 입금, 출금, 현잔액
		String strWriter = String.format("%s:%s:%d:%d:%d", 
				lastDate, remark, intInput,intOutput,intBalance);
		
		accBook.println(strWriter);
		
		accBook.flush();
		accBook.close();
		fileWriter.close();
	}
}
