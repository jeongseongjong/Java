package com.biz.books.service;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import com.biz.books.domain.BookVO;

public class BookSaveServiceV1 {
	
	private List<BookVO> bookList;
	private PrintWriter fileOut = null;
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	public void print(String saveFile) throws FileNotFoundException {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for(BookVO bookVO : bookList) {
			body(bookVO);
		}
		fileOut.close();
	}
	public void print(String saveFile, String text) throws FileNotFoundException {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for(BookVO bookVO : bookList) {
			if(bookVO.getB_title().contains(text.trim())) {
				body(bookVO);	
			}
		}
		fileOut.close();
	}
	
	public void print(String saveFile, int grPrice, int lessPrice) throws FileNotFoundException {
		fileOut = new PrintWriter(saveFile);
		this.listTitle();
		for(BookVO bookVO : bookList) {
			int price = bookVO.getB_price();
			if(price >= grPrice && price <= lessPrice) {
				body(bookVO);	
			}
		}
		fileOut.close();
	}
	
	private void listTitle() {
		fileOut.println("============================================");
		fileOut.println("도서정보 v1");
		fileOut.println("============================================");
		fileOut.println("ISBN\t도서명\t출판사\t저자\t가격");
		fileOut.println("--------------------------------------------");
	}

	private void body(BookVO bookVO) {
		fileOut.print(bookVO.getB_isbn() + "\t");
		fileOut.print(bookVO.getB_title() + "\t");
		fileOut.print(bookVO.getB_comp() + "\t");
		fileOut.print(bookVO.getB_writer() + "\t");
		fileOut.print(bookVO.getB_price() + "\n");
	}
	
	
	

}
