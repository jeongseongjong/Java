package com.biz.model;

import java.util.ArrayList;
import java.util.List;

import com.biz.grade.service.GradeServiceImp;
import com.biz.grade.service.ScoreServiceImpV1;
import com.biz.grade.service.StudentService;

public class StudentVOO implements StudentService {
	List<ScoreVO> scoreList;
	List<GradeVO> gradeList;
	
	public void StudentVO() {
		gradeList = new ArrayList<GradeVO>();
		scoreList = new ArrayList<ScoreVO>();
		
		GradeServiceImp gs = new GradeServiceImp();
		ScoreServiceImpV1 ss = new ScoreServiceImpV1();
	
	}
		
		
	@Override
	public void input(int size) {
		
		GradeVO gVO = new GradeVO();
		ScoreVO sVO = new ScoreVO();
		
		for(int i = 0 ; i < size ; i++) {
			
			if(gradeList.get(i).getStrNum()) {
				
			}
			
		}
		
	
		
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub

	}

}
