package com.biz.grade.service;

import java.util.Map;
import java.util.Set;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.LineMake;

public class GradeServiceV1 {

	Map<String, StudentVO> stdList;
	Map<String, ScoreVO> scList;

	public GradeServiceV1() {
		// 기본생성자
	}
	
	public GradeServiceV1(Map<String, ScoreVO>scList) {
		// scList를 호출한 곳으로 부터 받는 생성자
		this.scList = scList;
		
	}
	public GradeServiceV1(Map<String, ScoreVO>scList, 
							Map<String, StudentVO> stdList) {
		//scList와 stdList를 호출한 곳으로부터 받는 생성자
		this.scList = scList;
		this.stdList = stdList;
	}
	
	public void setScList(Map<String,ScoreVO> scList) {
		this.scList = scList;
	}
	
	public void setStdList(Map<String,StudentVO> stdList) {
		this.stdList = stdList;
	}
	
	public void list() {
		
		int length = 60;
		
		System.out.println(LineMake.make("=", length));
		System.out.println("성적일람표");
		System.out.println(LineMake.make("=", length));
		System.out.println("학번\t이름\t전화번호\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println(LineMake.make("-", length));
		
		Set<String> keys = scList.keySet();
		for(String key : keys) {
			ScoreVO scVO = scList.get(key);
			StudentVO stVO = stdList.get(scVO.getNum());
			
			System.out.print(scVO.getNum() + "\t");
			System.out.print(stVO.getName() + "\t");
			System.out.print(stVO.getTel() + "\t");
			System.out.printf("%4d\t", scVO.getKorScore());
			System.out.printf("%4d\t", scVO.getEngScore());
			System.out.printf("%4d\t", scVO.getMathScore());
			System.out.printf("%5d\t", scVO.getSumScore());
			System.out.printf("%5.1f\t", scVO.getAverage());
			System.out.printf("%5d\n", scVO.getRank());
		}
		System.out.println(LineMake.make("=", length));
		
		System.out.println();
	}
	
}
