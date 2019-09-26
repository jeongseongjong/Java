package com.biz.classes.book;

public class Book_01 {

	public static void main(String[] args) {
	
		
		Book book = new Book() ;
				
		book.strBookname = "갈매기";
		book.strBookch = "기러기출판사";
		book.strMake = "오리저자";
		book.intPrice = 1000;
		
		Book book1 = new Book() ;

		book1.strBookname = "갈매기";
		book1.strBookch = "기러기출판사";
		book1.strMake = "오리저자";
		book1.intPrice = 1000;
		
		book.viewInfo();
		book1.viewInfo();
		System.out.println("==================");
		System.out.println("도서명\t출판사\t저자\t가격\n");
		book.list();
		book1.list();
		//value 어떤객체를 담는 단어
		//VO = 정보처리를 하기위한 묶음
}
	}

