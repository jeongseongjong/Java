package com.biz.string;

import java.util.List;

import com.biz.string.domain.StudentVO;
import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;
import com.biz.string.service.StudentServiceV1;

public class ScoreEx_03 {

	public static void main(String[] args) {
		
		// 학생정보 생성
		StringService stdService = new StudentServiceV1();
		
		// stdService에서 stdList 추출
		stdService.input();
		List<StudentVO> stdList = ((StudentServiceV1)stdService).getScoreList();
		
		// stdList를 ScoreService에 주입
		StringService scService = new ScoreServiceV2();
		((ScoreServiceV2)scService).setStdList(stdList);
		
		// 점수생성
		scService.input();
		scService.list();
	}
}
