package com.biz.practice;

public class GradeEx {

	public static void main(String[] args) {
		
		GradeService gs = new GradeServiceImp();
		gs.input(2);
		gs.list();
	
	}
}
