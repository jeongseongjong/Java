package com.biz.oracle.service;

import java.util.List;
import java.util.Scanner;

import com.biz.oracle.persistence.BookDTO;
import com.biz.oracle.persistence.dao.BookDao;
import com.biz.oracle.persistence.dao.BookDaoImp;

public class BookServiceV1 {

	// 객체 선언(아직 사용전 단계)
	BookDao bookDao = null;
	Scanner scan = null;
	
	// 클래스 생성자
	public BookServiceV1() {
	
		// 선언된 객체를 사용할 수 있도록 초기화
		// 초기화된 클래스 = 인스턴스(화 됐당)
		scan = new Scanner(System.in);
		bookDao = new BookDaoImp();
		
		
	}
	
	/*
	 * 도서정보 전체 리스트를 DB로부터 읽어서
	 * console에 보이기
	 */
	public void viewBookList() {
		
		// dao의 selectAll() method를 호출하여
		// 전체 리스트를 DB로부터 가져와서
		// bookList에 받기
		List<BookDTO> bookList = bookDao.selectAll();
		
		// bookList에는 전체 리스트가 담겨있을 것
		// viewList() 전체리스트를 콘솔에 보일것이다.
		this.viewList(bookList);
		
		
	} // end viewBookList
	
	/*
	 * bookList를 매개변수로 받아서 
	 * console에 보이기
	 */
	private void viewList(List<BookDTO> bookList) {
		System.out.println("========================================");
		System.out.println("전체 도서 리스트 V1");
		System.out.println("========================================");
		System.out.println("코드\t도서명\t출판사\t저자\t가격");
		System.out.println("----------------------------------------");
		for(BookDTO dto : bookList) {
			System.out.printf("%s\t", dto.getB_code());
			System.out.printf("%s\t", dto.getB_name());
			System.out.printf("%s\t", dto.getB_comp());
			System.out.printf("%s\t", dto.getB_writer());
			System.out.printf("%d\n", dto.getB_price());
		}
		System.out.println("=====================================");
	}
	
	
	
	/*
	 * 키보드에서 도서이름을 입력받아
	 * 리스트를 콘솔에 보이기
	 */
	public void searchBookName(boolean bConti) {
		
		while(true) {
			
			if(this.searchBookName() != null) break;
			
		}
		
	}

	public String searchBookName() {

		System.out.println("==============================");
		System.out.println("도서검색");
		System.out.println("==============================");
		System.out.print("도서명(-Q:quit) >> ");
		String strName = scan.nextLine();
		if (strName.equals("-Q")) return "-Q" ;
		this.searchBookName(strName);
				return strName;
	}

	
	public boolean searchBookName(String strName) {

		List<BookDTO> bookList = bookDao.findByName(strName);
		
			if (bookList == null || bookList.size() < 1) {
			System.out.println("찾는 도서 없음");
			return false;

		}

		// bookList에는 입력한 도서명에 해당하는 리스트가 담겨 있을것
		// viewList()는 검색조건에 맞는 리스트만 보일것
		this.viewList(bookList);
		return true;
	}
	
	
	public void searchBookPrice() {

	while(true) {
		System.out.println("============================");
		System.out.println("도서가격 검색");
		System.out.println("============================");
		
		
		try {
			System.out.print("시작가격 (-Q : quit) >> ");
			String strSPrice = scan.nextLine();
			if(strSPrice.equals("-Q")) break;
			
			int sprice = Integer.valueOf(strSPrice);
			
			System.out.print("종료가격 (-Q : quit) >> ");
			String strEPrice = scan.nextLine();
			if(strEPrice.equals("-Q")) break;
			
			int eprice = Integer.valueOf(strEPrice);
			
			List<BookDTO> bookList = bookDao.findByPrice(sprice, eprice);
			
			this.viewList(bookList);
			
		} catch (Exception e) {

			System.out.println("가격은 숫자로만 입력");
			continue;
		}
		
		
		
	}
	
	}

	public void updateBook() {

		System.out.println("==================================");
		System.out.println("도서정보 수정");
		System.out.println("==================================");
		System.out.print("수정할 도서코드 (-Q:quit) >> ");
		String strCode = scan.nextLine();
		if(strCode.equals("-Q")) ; // 입력 종료
		
		// 키보드로 입력받은 코드에 해당하는 도서정보를 가져오기
		BookDTO bookDTO = bookDao.findById(strCode);
		
		/*
		 * 보통의 경우 PK를 수정하는 프로세스는 안좋다
		 * PK를 수정해야 할 경우는
		 * 기존의 Data를 삭제하고 새로운 데이터를 INSERT 하거나
		 * 기존의 Data는 그대로 유지하고 새로운 데이터를 INSERT 한다. 
		 */
		// 각 항목별로 값을 수정
		System.out.printf("변경할 도서명(%S)", bookDTO.getB_name());
		String strName = scan.nextLine();
		
		// 새로운 도서명을 입력했을때는
		// bookDTO의 도서명 필드를 새로운 도서명으로 대치하고
		// 그냥 Enter만 입력했을때는 변경하지 않는다.
		// 실수로 공백(space bar)가 입력될 때를 대비하여
		// 입력된 도서명의 앞뒤 공백을 제거하고 검사(trim)
		// strName.trim().length() : 객체의 chaining 방법
		if(strName.trim().length() > 0) {
			bookDTO.setB_name(strName.trim());
		}
		System.out.printf("출판사(%s)", bookDTO.getB_comp());
		String strComp = scan.nextLine();
		if(strComp.trim().length() > 0) {
			bookDTO.setB_comp(strComp.trim());
		}
		System.out.printf("저자(%s)", bookDTO.getB_writer());
		String strWriter= scan.nextLine();
		if(strWriter.trim().length() > 0) {
			bookDTO.setB_writer(strWriter.trim());
		}
		System.out.printf("가격(%d)", bookDTO.getB_price());
		String strPrice = scan.nextLine();
		int intPrice = 0;
		
		// 입력된 가격을 숫자로 변환하는 코드에서
		// 만약 값을 입력하지 않고 Enter를 누르면
		// NumberFormatException이 발생하는것을 역이용
		// 만약 값을 입력하면 해당 값을 DTO에 저장하고
		// 그렇지 않면 건너뛰도록 코딩
		try {
			intPrice = Integer.valueOf(strPrice);
			bookDTO.setB_price(intPrice);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 여기 도착했을때
		// bookDTO에 담긴 값은
		// 처음에 table에서 읽은 값이 저장되어 있거나
		// 중간에 키보드로 입력한 값으로 변경되었거나 한다.
		
		
		
		
		
		
		
		
		
		
		
		
		bookDao.update(bookDTO);
		
	}
	
	
	
	
	
	
	
	
	
}

















