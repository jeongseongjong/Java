package com.biz.grade.Exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImpV1;

public class GradeEx {

	public static void main(String[] args) {
		
		GradeService gs = new GradeServiceImp();
		gs.input(2);
		gs.list();
		
		ScoreService ss = new ScoreServiceImpV1();
		ss.input(3);
		ss.list();
		
		
		
	}
}
