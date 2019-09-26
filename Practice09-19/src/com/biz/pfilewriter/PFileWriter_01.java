package com.biz.pfilewriter;

import java.io.FileWriter;

public class PFileWriter_01 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/pfilewriter/practice.txt";
		FileWriter fileWriter;
		
		try {
			fileWriter = new FileWriter(fileName);
			fileWriter.write("대한민국\n");
			fileWriter.write(97);
			fileWriter.write(13);
			for(int i = 97 ; i < 124 ; i++) {
				fileWriter.write(i);
			}
			fileWriter.write(13);
			for(int i = 'A' ; i <= 'Z'; i++) {
				fileWriter.write(i);
			}
			fileWriter.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}

