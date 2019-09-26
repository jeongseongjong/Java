package com.biz.files.grade;

import com.biz.files.service.FileGradeService;
import com.biz.files.service.FileGradeServiceV1;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		FileGradeService fg = new FileGradeServiceV1();
		String scoreFile = "src/com/biz/files/Score.txt";
		try {
			fg.read(scoreFile);	
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		fg.list();
		
	}
}
