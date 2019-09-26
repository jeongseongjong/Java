package com.biz.filewriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_04 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/filewriter/data2.txt";
		FileWriter fileWriter;
		try {
			
			// FileWriter() 생성자의 두번째 옵션
			// false 옵션 : 기존 파일을 삭제하고 새로 생성한 후
			// 				기록할 수 있도록 open 하라
			// 값을 추가하지 않으면 false를 추가한것과 동일
			// true 옵션 : 기존파일이 없으면 생성하고 
			// 			   이미 있으면 파일을 열어서 내용을 추가하라!!
			// 			   append mode open 이라고 한다.
			fileWriter = new FileWriter(fileName, false);
			String str = String.format("%s\n", "대한민국");
			fileWriter.write(str);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
