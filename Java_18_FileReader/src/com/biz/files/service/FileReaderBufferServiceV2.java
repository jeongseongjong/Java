package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV2 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void reade(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// buffer.readLine()은 파일에서 한줄(~~\n)을 읽는다
		// buffer.readLine()이 반복해서 실행될 때마다
		// 계속해서 다음줄의 문자열을 읽어 들이도록 되어있다.
		// 파일에 저장된 문장의 줄수 만큼buffer.readLine()을 반복실행시
		// 파일의 모든내용을 읽을 수 있다.
		
		while(true) {
			String reader = buffer.readLine();
			if(reader == null)break;
			System.out.println(reader);
		}
		// close 실행시 나중에 실행된 buffer -> fileReader순으로
		buffer.close();
		fileReader.close();
	}

	
}
