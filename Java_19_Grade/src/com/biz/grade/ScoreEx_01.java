package com.biz.grade;

import java.io.IOException;

import com.biz.grade.service.ScoreServiceV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceV1 sc = new ScoreServiceV1();
		String scoreFileName = "src/com/biz/grade/score.txt";
		
		try {
			sc.read(scoreFileName);
			sc.list();
			sc.total();
			sc.listTotal();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
