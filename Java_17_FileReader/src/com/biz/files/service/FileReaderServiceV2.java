package com.biz.files.service;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV2 {

	FileReader fileReader = null;
	
	/*
	 * 만약 read(String fileName) method가 실행되는 동안
	 * exception 발생을 하면
	 * read() method를 호출한 곳으로 exception을 toss하라
	 */
	public void read(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		while(true) {
			int al = fileReader.read();
			
			if(al < 0) break;
			System.out.print((char) al);	
		}
		
	}
}
