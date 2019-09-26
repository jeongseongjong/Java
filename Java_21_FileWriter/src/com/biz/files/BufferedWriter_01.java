package com.biz.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data3.txt";
		FileWriter fileWriter ;
		BufferedWriter buffer ;
		
		try {
			fileWriter = new FileWriter(fileName);
			buffer = new BufferedWriter(fileWriter);
			
			buffer.write("우리나라만세\n");
			buffer.write("우리나라만세\n");
			
			// buffer에 임시 저장된 데이터를
			// 파일에 강제로 기록시키는 method
			buffer.flush();
			buffer.write("Korea\n");
			buffer.write("Republic of Korea\n");
			
			buffer.close();
			fileWriter.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
