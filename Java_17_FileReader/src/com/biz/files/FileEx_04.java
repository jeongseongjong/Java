package com.biz.files;

import java.io.IOException;
import com.biz.files.service.FileReaderServiceV2;

/*
 * FileReader 클래스
 * 
 * text 파일을 직접 읽어서 문자단위로
 * CPU로 전송하여 연산을 수행할 때 사용
 * 
 * 파일을 direct로 읽어서 처리를 하기 때문에
 * 파일이 매우크면
 * App 실행 속도가 현저하게 느려진다.
 */
public class FileEx_04 {

	public static void main(String[] args) {
		
		FileReaderServiceV2 fs = new  FileReaderServiceV2();
		String fileName = "src/com/biz/files/data.txt";
		try {
			fs.read(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
