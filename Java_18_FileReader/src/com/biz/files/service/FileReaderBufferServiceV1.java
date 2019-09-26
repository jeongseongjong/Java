package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * FileReader만으로 TXT파일을 읽기를 하면
 * OS, JVM, App 사이에서 데이터가 이동되면서 읽는동안
 * 프로세스가 집중되어 비효율적이며 위험성내포
 * 
 * 고급프로그래밍에서는 파일을 메모리로 직접가져오는 대신
 * 완충장치를 사용 안전하게 파일을 읽을 수 있도록 한다.
 * 
 * Java에서는 그중 가장 기본적인 도구로
 * BufferedReader라는 클래스를 제공하고 있다.
 * 
 * Java에서 txt파일을 읽어서 메모리를 가져올 때는
 * FileReader -> BufferedReader를 연결하여
 * 안전하게 파일을 읽어 올 수 있도록 한다.
 */
public class FileReaderBufferServiceV1 {
	
	FileReader fileReader;
	BufferedReader buffer;
	
	public void reade(String fileName) throws IOException {
		
		// fileReader 객체에 담긴 파일읽기 정보를
		// bufferedReader에게 주입하면
		// fileReader와 buffer사이에서
		// 이미 파일내용을 읽어서
		// 메모리 어딘가에 안전하게 보관하고 있을 것이다.
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);
		
		// buffer에서 한줄(~~\n)씩 읽기위해
		// readLine() method를 사용
		String reader = buffer.readLine();
	}

	
}
