package com.biz.grade.Exec;

import com.biz.grade.service.ScoreServiceImp;

public class ScoreEx_01 {

	public static void main(String[] args) {
		
		ScoreServiceImp scService = new ScoreServiceImp();
		scService.input(10);
		scService.total();
		scService.rank();
		scService.list();
		
	}
}
