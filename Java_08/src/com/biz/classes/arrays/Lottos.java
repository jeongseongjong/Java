package com.biz.classes.arrays;

import java.util.Random;

public class Lottos {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] lottos = new int [6];
		
		// 로또번호 6개를 모두 생성했는지 확인하기 위한
		// 변수
		int nLottoIndex = 0;
		while(true) {
			
			// 1부터 45까지 임의 숫자 생성
			int lotNum = rnd.nextInt(45) + 1;
			
			// 새로 생성한 번호가
			// 이미 생성된 번호중에 있냐? 를 확인
			int index;
			for(index = 0 ; index < lottos.length ; index++) {
				
				// lottos 배열에 저장된 값이
				// 새로 생성한 값과 같은 것이 있냐?
				if(lottos[index] == lotNum) break;
			}
			
			// 같은 값이 없다.
			if(index >= lottos.length)
				
				// nLottoIndex 위치에
				// 새로 생성한 값을 채워라.
				// 위치값을 1 증가시켜라
				lottos[nLottoIndex++] = lotNum;
			
			if(nLottoIndex >= lottos.length) break;
		}
		
		System.out.println("행운의 로또번호 : ");
		for(int i = 0 ; i < lottos.length ; i++) {
			System.out.print(lottos[i] + ", "  );
		}
	}

}
