package com.biz.grade.service;

import java.util.Collections;
import java.util.Comparator;

import com.biz.model.ScoreVO;

public class ScoreServiceImpV2 extends ScoreServiceImp implements ScoreService {

	/*
	 * method내의 익명클래스를 사용한 보조연산
	 */

	@Override
	public void rank() {

		Collections.sort(scoreList, new Comparator<ScoreVO>() {

			@Override
			public int compare(ScoreVO o1, ScoreVO o2) {
				return o1.getIntTotal() - o1.getIntTotal();
			}
		});
		int rank = 1;
		for(ScoreVO vo : scoreList) {
			vo.setIntRank(rank++);
		}
		Collections.sort(scoreList, new Comparator<ScoreVO>() {
			
		
		public int compare(ScoreVO o1, ScoreVO o2) {
			
		return 0 ;
			/*
			 * return Integer.valueOf(o1.getStrNum()) - 
			 * Integer.valueOf(o1.getStrNum());
			 */
					
		}
	
		

		Collections.sort(scoreList,inClass);
	}
}