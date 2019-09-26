package com.biz.files.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderServiceV1 {

	FileReader fileReader;
	
	// 만약 read() method가 실행되는 동안
	// Exception이 발생을 하면
	// read() method를 호출한 곳으로
	// Exception을 toss 하라
	public void read(String fileName) throws IOException { // 메인이 아닌곳에서는 add throws가 더 낫다.
		
		fileReader = new FileReader(fileName);
		
		// 전체파일을 읽기 위해서 while() 반복문을 사용
		while(true) {
			
			int intReadChar = fileReader.read();
			
			// FileReader.read() method는 
			// 파일에서 문자를 읽어오는 중에
			// 모든내용을 읽고 파일끝에 도달하면
			// -1을 return한다.
			// read() method에 return값을 비교하여 
			// while 반복문을 종료
			
			//if(intReadChar== -1)도 가능하지만
			// if(intReadChar < 0 )코드가 더 안전하다.
			if(intReadChar < 0) break;
			
			System.out.print((char)intReadChar);
			
			
		}
		fileReader.close(); // 사용 끝을 표시하는것이 자원을 절약하는 코딩
	}
}
