package com.biz.grade.Exec;

import com.biz.grade.service.ScoreServiceImpV1;
import com.biz.grade.service.ScoreServiceImpV2;

public class ScoreEx_02 {

	public static void main(String[] args) {

		ScoreServiceImpV1 scService = new ScoreServiceImpV2();
		scService.input(10);
		scService.total();
		scService.rank();
		scService.list();
	}
}