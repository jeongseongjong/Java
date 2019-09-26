package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.list.model.BookVO;

public class BookServiceImpV1 implements BookService {

	Scanner scan; // 키보드에서 값 입력받기 위한 준비
	List<BookVO> bookList; // 입력받은 도서 정보 리스트 저장

	public BookServiceImpV1() {
		scan = new Scanner(System.in);
		bookList = new ArrayList<BookVO>();
	}
	public void input(int count) {
		for (int i = 0; i < count; i++) {
			this.input();
		}
	}

	// 생성자 메서드
	// scan과 bookList를 사용할 수 있도록 초기화, 생성
	public void input() {



		System.out.print("도서번호 > ");
		String strNum = scan.nextLine();

		System.out.print("도서명 > ");
		String strName = scan.nextLine();

		System.out.print("저자 > ");
		String strWriter = scan.nextLine();

		System.out.print("출판사 > ");
		String strComp = scan.nextLine();

		/*
		 * 이 코드에서 사용자가 데이터를 입력하는 중에 가격, 
		 * 출판연돌르 숫자가 아닌 문자열을 입력하게 되면 
		 * 문자열을 숫자로 바꾸는 과정에서
		 * NumberFormatException이 발생할 것이다.
		 * 
		 * 이 App에서 NumberFormatException은 발생할 확률이 매우 높다.
		 * 
		 * 이럴경우 사용자가 입력하는 과정에서 
		 * 약간의 실수만 하게 되어도 앞에서 입력했던 
		 * 모든 데이터를 잃게된다.
		 * 
		 * 개발자 입장에서는 별다른 의미가 없고 
		 * 추가 코드가 없어서 좋겠지만 사용자 입장에서는
		 *  매우 불편한 코드가 된다. 사용자 입장에서 좋은 코드를
		 * 작성하기 위해 개발자는 이런 상황에서 발생할 수 있는
		 *  exception을 예측하고 적절한 해결방법을 만들어야 한다.
		 *  
		 * 위와같은것을
		 * exception handling이라고 한다.
		 * 
		 * 1. 만약 사용자가 가격, 출판년도를 문자열에 포함하여
		 * 입력할 경우 안내 메시지를 보여주고,
		 * 다음값을 입력하도록 유도하는 코드작성
		 */

		System.out.print("가격 > ");
		String strPrice = scan.nextLine();
		int intPrice = 0;

		/*
		 * <예외처리>
		 * 사용자가 app을 사용하는 중에 데이터를 입력하거나
		 * 어떤 연산을 수행할 때 Run time error가 발생할 확률이
		 * 조금이라도 있다면 그 app은 사용자에게 상당한 스트레스 발생
		 * 
		 * 개발자는 그러한 상황을 만들지 않기 위해 
		 * 예측할 수 있는 예외가 발생할 코드에서 예외 처리를 해주어야 한다.
		 * 
		 * 예외처리는 개발의 필수항목으로 인식해야 한다.
		 */

		/*
		 * 예외가 발생할 가능성이 있는 코드는 try { }안에 작성
		 * 
		 * 만약 예외가 발생할 경우 처리할 코드는 catch() { }에 작성
		 */
		try {
			intPrice = Integer.valueOf(strPrice);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("가격에 문자열이 포함됨");
			System.out.println("현재 도서 정보는 추가되지 않음");
			return;
		}

		System.out.print("출판연도 > ");
		String strPubYear = scan.nextLine();
		int intPubYear = 0;
		try {
			intPubYear = Integer.valueOf(strPubYear);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("출판년도에 문자열이 포함됨");
			System.out.println("현재 도서 정보는 추가되지 않음");
			return;
		}

		// 1. 키보드로 입력받은 데이터를 VO를 생성하여 저장
		BookVO bookVO = new BookVO();
		bookVO.setStrNum(strNum);
		bookVO.setStrName(strName);
		bookVO.setStrComp(strComp);
		bookVO.setStrWriter(strWriter);
		bookVO.setIntPrice(intPrice);
		bookVO.setIntPubYear(intPubYear);

		// 2. 생성한 VO를 bookList에 추가
		bookList.add(bookVO);
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("=============================================");
		System.out.println("도서정보 일람표");
		System.out.println("=============================================");
		System.out.println("ISBN\t도서명\t출판사\t저자\t가격\t출판년도");
		System.out.println("---------------------------------------------");

		int nSize = bookList.size();
		for (int i = 0; i < nSize; i++) {

			BookVO vo = bookList.get(i);

			System.out.print(vo.getStrNum() + "\t");
			System.out.print(vo.getStrName() + "\t");
			System.out.print(vo.getStrComp() + "\t");
			System.out.print(vo.getStrWriter() + "\t");
			System.out.printf("%5d\t", vo.getIntPrice());
			System.out.printf("%4d\n", vo.getIntPubYear());

		}
	}

	@Override
	public void view(int index) {

		BookVO vo = bookList.get(index);
		System.out.println("===================================");
		System.out.println("ISBN : " + bookList.get(index).getStrNum());
		System.out.println("도서명 : " + bookList.get(index).getStrName());
		System.out.println("출판사 : " + bookList.get(index).getStrComp());
		System.out.println("저자 : " + bookList.get(index).getStrWriter());
		System.out.println("가격 : " + bookList.get(index).getIntPrice());
		System.out.println("출판년도 : " + bookList.get(index).getIntPubYear());
		System.out.println("===================================");
	}

	// 도서명 검색
	@Override
	public void view(String strName) {
		// TODO Auto-generated method stub
		int nSize = bookList.size();
		for (int i = 0; i < nSize; i++) {
			if (bookList.get(i).getStrNum().equalsIgnoreCase(strName)) {
				this.view(i);
				break;
			}
		}
	}
}
