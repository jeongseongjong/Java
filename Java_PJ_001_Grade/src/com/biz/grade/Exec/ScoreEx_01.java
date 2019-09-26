package com.biz.grade.Exec;

import com.biz.grade.service.ScoreServiceImpV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceImpV1 scService = new ScoreServiceImpV1();
		scService.input(10);
		scService.total();
		scService.rank();
		scService.list();
		
	}
}
