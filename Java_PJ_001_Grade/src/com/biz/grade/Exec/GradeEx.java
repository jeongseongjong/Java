package com.biz.grade.Exec;

import com.biz.grade.service.GradeService;
import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImp;

public class GradeEx {

	public static void main(String[] args) {
		
		GradeService gs = new GradeServiceImp();
		gs.input(2);
		gs.list();
		
		ScoreService ss = new ScoreServiceImp();
		ss.input(50);
		ss.list();
		
		
	}
}
