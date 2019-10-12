package com.biz.dp.exec;

import java.util.ArrayList;
import java.util.List;

import com.biz.dp.domain.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		List<ScoreVO> scoreList = new ArrayList<ScoreVO>();
		
		
		
		// 빌드패턴을 이용해서 list에 추가
		/*
		 * 일일이 vo 객체를 별도 생성해서 add()를 수행하는
		 * 자바빈즈 패턴의 효율성을 줄이고
		 * 생성자를 사용할 때 발생하는 필드변수에 잘못된 값이 추가되는
		 * 잠재적 오류를 줄이는
		 * 
		 * 많은 객체를 List에 추가할 때 사용할 수 있는 패턴
		 */
		scoreList.add(new ScoreVO.Builder().s_num("001").build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(90).build());
		scoreList.add(new ScoreVO.Builder().s_num("001").s_kor(90).s_eng(90).build());
	}
}
