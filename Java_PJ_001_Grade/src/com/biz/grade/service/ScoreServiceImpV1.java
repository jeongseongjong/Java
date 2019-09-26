package com.biz.grade.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.model.ScoreVO;

public class ScoreServiceImpV1 implements ScoreService {

	protected Random rnd;
	protected List<ScoreVO> scoreList;

	public ScoreServiceImpV1() {
		
		rnd = new Random();
		scoreList = new ArrayList<ScoreVO>();

	}

	@Override
	public void input(int box) {
		// TODO Auto-generated method stub
		for (int i = 0; i < box; i++) {

			ScoreVO sVO = new ScoreVO();

			String strNum = String.format("%4d", (i + 1));

			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			sVO.setStrNum(strNum);
			sVO.setIntKor(intKor);
			sVO.setIntEng(intEng);
			sVO.setIntMath(intMath);

			sVO.setIntTotal(intKor + intEng + intMath);
			sVO.setIntAvg((intKor + intEng + intMath) / 3);

			scoreList.add(sVO);

		}

	}
	
	public void rank() {
		for(int i = 0 ; i <scoreList.size(); i++) {
			for(int j = i+1 ; j < scoreList.size(); j++) {
				
				int total_i = scoreList.get(i).getIntTotal();
				int total_j = scoreList.get(i).getIntTotal();
				
				// List.set(index, 값)
				// 이미 추가된 list의 index위치의 값을
				// 변경하고자 할 때
				if(total_i < total_j) {
					
					// scoreList의 두 위치 vo를 서로 교환
					ScoreVO _vo = scoreList.get(i);
					scoreList.set(i, scoreList.get(j));
					scoreList.set(j, _vo);
				}
			}
		}
		
		int intRank = 1;
		for(ScoreVO sVO : scoreList) {
			sVO.setIntRank(intRank++);
		}
	}
	

	@Override
	public void total() {

		for(ScoreVO sVO : scoreList) {
			int total = sVO.getIntKor();
			total += sVO.getIntEng();
			total += sVO.getIntMath();
			int avg = total / 3 ;
			
			sVO.setIntTotal(total);
			sVO.setIntAvg(avg);
		}
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		System.out.println("===========================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차");
		System.out.println("===========================================");
		for (ScoreVO sVO : scoreList) {
			System.out.printf("%4s\t", sVO.getStrNum());
			System.out.printf("%4d\t ", sVO.getIntKor());
			System.out.printf("%4d\t", sVO.getIntEng());
			System.out.printf("%4d\t", sVO.getIntMath());
			System.out.printf("%4d\t", sVO.getIntTotal());
			System.out.printf("%4d\t", sVO.getIntAvg());
			System.out.printf("%4d\n", sVO.getIntRank());
		}
		System.out.println("-----------------------------------------");

	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		
	}

}
