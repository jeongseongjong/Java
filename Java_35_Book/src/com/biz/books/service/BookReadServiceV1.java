package com.biz.books.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.books.domain.BookVO;
import com.biz.books.utils.BookSettings;

/*
 * 
 * 도서정보.txt 파일을 읽어서
 * 문자열을 콜론(:)을 기준으로 분리하고
 * BookVO에 담은 후 bookList에 추가하는 method를 작성
 * 
 */
public class BookReadServiceV1 {
	
	private List<BookVO> bookList ;
	
	public List<BookVO> getBookList() {
		return bookList;
	}
	
	public void readBookInfo(String bookFile) throws IOException {
		
		String s = "1000  ";
		s = s.trim(); // 앞뒤 빈칸 제거
		int p = Integer.valueOf(s);
		
		bookList = new ArrayList<BookVO>();
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(bookFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		
		int lineNum = 0 ;
		while(true) {
			
			System.out.println(++lineNum);
			
			reader = buffer.readLine();
			if(reader == null) break;
			String[] books = reader.split(":");
			
			BookVO bookVO = new BookVO();
			bookVO.setB_isbn( books[ BookSettings.FILE.ISBN ] );
			bookVO.setB_title(books[ BookSettings.FILE.TITLE ] );
			bookVO.setB_writer(books[ BookSettings.FILE.WRITER ]);
			bookVO.setB_comp(books[ BookSettings.FILE.COMP ]);
			bookVO.setB_date(books[ BookSettings.FILE.DATE ]);
			bookVO.setB_trans(books[ BookSettings.FILE.TRANS ]);

			int price = Integer.valueOf(books[ BookSettings.FILE.PRICE ].trim());
			bookVO.setB_price(price);
			
			int page = Integer.valueOf(books[ BookSettings.FILE.PAGE ].trim());
			bookVO.setB_page(page);
			
			bookList.add(bookVO);
			
		}
		buffer.close();
		fileReader.close();
		
	}

}
