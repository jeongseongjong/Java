package com.biz.books.exec;

import java.io.IOException;

import com.biz.books.service.BookReadServiceV1;

public class BookEx_01 {

	public static void main(String[] args) {

		BookReadServiceV1 bs = new BookReadServiceV1();
		String bookFile = "src/com/biz/books/도서정보.txt";
		
		try {
			bs.readBookInfo(bookFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
