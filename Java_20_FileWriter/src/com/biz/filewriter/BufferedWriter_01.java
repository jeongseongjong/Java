package com.biz.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/fileWriter/data2.txt";
		FileWriter fileWriter;
		BufferedWriter buffer;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			String str = String.format("%20s\n","Republic of Korea");
			
			// buffer.write() method로 데이터를 기록하면
			// 메모리의 buffer 영역을 만들고 데이터를 기록
			// buffer 메모리 영역이 가득차면 
			// JVM과 OS는 자동으로 해당 내용을 파일에 기록
			buffer.write(str);
			
			// 현재 buffer에 저장되어 있는 내용을 파일에
			// 강제로 기록하라
			// close() 차이는 close() 실행하면
			// 더이상 write() 실행할 수 없지만
			// flush()는 실행후에 writer()를 재실행 가능
			buffer.flush();
			buffer.write("12345");
			
			// 더이상 파일에 기록을 하지 않겠다.(선언)
			buffer.close();
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
