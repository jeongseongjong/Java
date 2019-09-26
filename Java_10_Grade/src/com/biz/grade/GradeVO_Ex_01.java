package com.biz.grade;

import com.biz.grade.model.GradeVoService;

public class GradeVO_Ex_01 {

	public static void main(String[] args) {
		
		GradeVoService gs = new GradeVoService(20);
		gs.input();
		gs.total();
		gs.view();
		
		gs.rank();
		gs.view();
		
		gs.sort();
		gs.view();
		// test 배열의 임의 숫자가 저장되어 있다고 가정
		int[] test = new int[10];
		
		// 합계
		// test 배열에 저장된 숫자의 평균을 계산
		int intSum = 0;
		int intAvg = 0;
		for(int i = 0 ; i < test.length ; i++) {
			intSum += test[i] ;
			
			
			// intSum을 test.length로 나누면 평균
		}
		intAvg = intSum/test.length;
		
	}
}
