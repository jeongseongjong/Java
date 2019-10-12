package com.biz.books.service;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.List;

import com.biz.books.domain.BookVO;

/*
 * text 파일은 java에서 기본적으로 읽고 쓰기(저장)이 가능하다
 * 그외 Binary(이미지, 영상, 음성, 엑셀)들은 기본적으로
 * 읽기는 가능하지만 읽어서 무엇인가 연산처리르 하는것은 매우 어렵다.
 * 또 형식에 맞도록 저장하는 것도 매우 어렵다.
 * 
 * Binary 파일을 읽고 쓰는데는 
 * 		3rd Party SDK(Software Devel. Kit) 빌려와서
 * 사용해야 한다.
 * 
 * 엑셀 저장하기는 text 파일 저장하기를 조금 응용하면
 * 아쉬운대로 사용이 가능하다.
 * 
 */
public class ExcelSaveServiceV1 {
	
	private List<BookVO> bookList;
	
	// comma separater values(컴마로 분리된 파일)
	private String excelExt = ".csv";
	
	int listSize = 10;
	
	// FileWriter fileWriter;
	BufferedWriter buffer;
	
	
	public void setBookList(List<BookVO> bookList) {
		this.bookList = bookList;
	}
	
	private void bufferOpen(String fileName) throws IOException {

		FileOutputStream fo = new FileOutputStream(fileName + excelExt);
		
		// 한글 encoding을 변환
		// excel 파일의 한글 encoding으로 변환 : euc-kr 
		OutputStreamWriter os 
				= new OutputStreamWriter(fo ,"euc-kr");
		buffer = new BufferedWriter(os);

	}
	
	public void excelSave(String fileName) throws IOException {
		this.bufferOpen(fileName);
		this.title();
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			this.body(bookVO);
			listSize ++;
		}
		this.footer();
		buffer.flush();
		buffer.close();
	}
	public void excelSave(String fileName,String text) throws IOException {
		this.bufferOpen(fileName);
		this.title();
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			if(bookVO.getB_title().contains(text.trim())) {
				this.body(bookVO);
				listSize ++;
			}
		}
		this.footer();
		buffer.flush();
		buffer.close();
	}
	
	public void excelSave(String fileName,int grPrice, int lessPrice) throws IOException {
		this.bufferOpen(fileName);
		this.title();
		
		listSize = 1;
		// 작성부분
		for(BookVO bookVO : bookList) {
			int price = bookVO.getB_price();
			if(price >= grPrice && price <= lessPrice) {
				this.body(bookVO);
				listSize ++;
			}
		}
		
		this.footer();
		buffer.flush();
		buffer.close();
	}

	
	
	private void title() throws IOException {

		// ISBN,TITLE,COMP,WRITER,DATE,PRICE
		buffer.write("ISBN,");
		buffer.write("도서명,");
		buffer.write("출판사,");
		buffer.write("저자,");
		buffer.write("발행일,");
		buffer.write("가격,");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
		
	}
	
	private void body(BookVO bookVO) throws IOException {
		buffer.write("'" + bookVO.getB_isbn()  +",");
		buffer.write(bookVO.getB_title() + ",");
		buffer.write(bookVO.getB_comp() + ",");
		buffer.write(bookVO.getB_writer() + ",");
		buffer.write(bookVO.getB_date() + ",");
		buffer.write(bookVO.getB_price() + ",");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
	}

	private void footer() throws IOException {
		
		// int nSize = bookList.size();
		buffer.write("도서개수,");
		buffer.write("=COUNTA(B2..B" + listSize + "),");
		buffer.newLine(); // enter 키 입력
		buffer.flush();
	}

}
