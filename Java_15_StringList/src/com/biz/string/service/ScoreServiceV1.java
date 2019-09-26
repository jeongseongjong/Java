package com.biz.string.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.string.domain.ScoreVO;

public class ScoreServiceV1 implements StringService {

	// scList를 상속받은 클래스에서 접근 할 수 있도록
	// 일부 개방
	protected List<ScoreVO> scList ;
	private Random rnd = new Random();
	
	public ScoreServiceV1() {
		scList = new ArrayList<ScoreVO>();
	}
	
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 10 ; i++) {
			String strNum = String.format("%05d", i+1);
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;
			
			ScoreVO scVO = new ScoreVO();
			scVO.setStrNum(strNum);
			scVO.setIntKor(intKor);
			scVO.setIntEng(intEng);
			scVO.setIntMath(intMath);
			
			this.total(scVO);
			
			scList.add(scVO);
		}
	}
	private void total(ScoreVO sVO) {
		int total = sVO.getIntKor();
		total += sVO.getIntEng();
		total += sVO.getIntMath();
		
		sVO.setIntTotal(total);
		sVO.setIntAvg(total/3);
		
	}

	@Override
	public void list() {

		System.out.println("=====================================");
		System.out.println("성적일람표");
		System.out.println("=====================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-------------------------------------");
		for(ScoreVO vo : scList) {
			System.out.printf("%5s\t", vo.getStrNum());
			System.out.printf("%3d\t", vo.getIntKor());
			System.out.printf("%3d\t", vo.getIntEng());
			System.out.printf("%3d\t", vo.getIntMath());
			System.out.printf("%3d\t", vo.getIntTotal());
			System.out.printf("%3d\n", vo.getIntAvg());
			
		}
		System.out.println("=======================================");
	}

	@Override
	public void view() {
		// TODO Auto-generated method stub

	}

}
