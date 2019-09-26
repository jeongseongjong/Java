package com.biz.list.grade;

import com.biz.list.service.GradeServiceImp_01;

public class GradeEx_01 {

	public static void main(String[] args) {
		
		GradeServiceImp_01 gs = new GradeServiceImp_01();
		
		gs.input(10);
		gs.view();
	}
}
