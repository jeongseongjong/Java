package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferServiceV3 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void reade(String fileName) throws IOException {
		
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = "";
		// reader = null이기 때문에 while문 작동 x
		/* while(reader != null) {
			reader = buffer.readLine();
			if(reader == null)break;
			System.out.println(reader);
		}
		*/
		/*
		 * do문을 먼저 실행하고 while문 적용 (선언문은 나중에)
		 * 먼저 buffer에서 한줄을 console에 표시한 후
		 * null이 아니면 다음줄을 읽어라
		 */
		do {
			reader = buffer.readLine();
			System.out.println(reader);
			
		}while(reader != null);
		
		buffer.close();
		fileReader.close();
	}

	
}
