package com.biz.array.exec.Score;

import com.biz.arrays.model.ScoreVO;

public class ScoreEx_02 {

	public static void main(String[] args) {
		
		ScoreVO sVO = new ScoreVO();
		
		// method의 단순 호출
		// 호출은 하되 수행 결과는 확인하지 않는다.
		sVO.add();
		sVO.add_ret();
		
		// return문이 있는 method의 호출
		// 호출을 하고 결과를 확인한다.
		// add_ret()가 return 한 num 변수의 값을
		// console에 보이는 코드
		System.out.println( sVO.add_ret());

		// return문이 있는 method의 호출 2
		// 호출을 하고 결과를 변수에 받는다(담는다)
		int result = sVO.add_ret();
	}
}
