package com.biz.files.grade;

import java.io.IOException;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV2;

public class GradeEx_02 {

	public static void main(String[] args) {

		FileGradeService fg = new FileGradeServiceV2();
		String scoreFile = "src/com/biz/files/Score.txt";
		
		try {
			fg.read(scoreFile);
			fg.total();
			fg.list();
		}catch(NumberFormatException e) {
			/*
			 * FileGradeService.read() method가 실행되는중
			 * 만약 문자열형 숫자를 숫자로 바꾸는 과정에서
			 * exception이 발생하면
			 * throw new NumberFormatException으로
			 * exception을 toss하고
			 * main()에서는 해당 exception에 대해서
			 * 다른 exception과 처리를 분리할 수 있다.
			 */
			System.out.println("데이터 파일을 선택하세요 !!");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		fg.list();
	}

}
