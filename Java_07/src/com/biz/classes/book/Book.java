package com.biz.classes.book;

public class Book {

		
	// 1. 도서 정보에는 도서명, 출판사, 저자, 가격
	// 2. 다음과 같은 기능이 구현된 메스드가 필요하다
	//		가. 도서의 개별정보
	//		나. 도서 리스트 보기
	
	public String strBookname;
	public String strBookch;
	public String strMake;
	public int intPrice;
	
	public void viewInfo() {
		System.out.println("도서명 : "+ strBookname);
		System.out.println("출판사 : "+ strBookch);
		System.out.println("저자 : "+ strMake);
		System.out.println("가격 : "+ intPrice + "원");
}
	
	public void list() {
		System.out.printf("%s\t%s\t%s\t%d\n",
				strBookname,
				strBookch,
				strMake,
				intPrice);
	}
}