package com.biz.classes;

import com.biz.classes.model.GradeScoreVO;
import com.biz.classes.service.GradeScoreService;

public class GSEx_03 {

	public static void main(String[] args) {

		GradeScoreService gService = new GradeScoreService();
		
		// new() 메서드를 호출하면서
		// 숫자 100을 전달해준다.
		// 순서만 정확히 해준다면 원하는 리스트를 뽑아올 수 있다.
		gService.newVO(100);
		gService.makeScore();
		gService.scoreList();
		

	}

}
