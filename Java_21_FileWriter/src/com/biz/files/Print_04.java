package com.biz.files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Print_04 {

	public static void main(String[] args) {
		
		String fileName = "src/com/biz/files/data4.txt";
		FileWriter fileWriter ;
		PrintWriter fileOut ;
		try {
			/*
			 * java 1.5부터
			 * PrintWriter클래스만 단독으로 사용하여
			 * 파일에 txt기록 가능
			 * 
			 * PrintWriter는 무조건 모든 파일을 새로 생성한다.
			 * append mode 파일을 open할 수 없다.
			 * 
			 * FileWriter로 파일을 open하고
			 * PrintWriter에 주입하면
			 *
			 * PrintWriter의 두번째 메서드를 지정하여
			 * flush() method를 자동으로 실행할 수 있다.
			 * 
			 * 자동 flush는 print() 메서드를 실행할때마다
			 * 		기록되는것이 아니고
			 * 		내부에서 buffer를 별도로 관리하면서 내용을 기록
			 * 자동 flush는 원하는 만큼의 안정성을 보장하지 않는다.
			 */
			
			fileWriter = new FileWriter(fileName);
			
			fileOut = new PrintWriter(fileWriter, true);
			fileOut.println("우리나라만세");
			fileOut.println(30*40);
			fileOut.println(200%2);
			
			fileOut.printf("%5d\n", 30+40);
			fileOut.print("Republic of Korea\n");
			
			fileOut.flush();
			fileOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
