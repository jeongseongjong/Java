package com.biz.classes;

import com.biz.classes.model.StudentVO;

public class ClassEx_05 {

	public static void main(String[] args) {
		
		/*
		 * 기본형 변수, String형 변수 등은
		 * 배열을 선언만해도 자체적으로 초기화하는
		 * 코드가 실행되도록 만들어져 있다.
		 * 
		 * 하지만
		 * 사용자가 만든 클래스는
		 * 배열을 선언한 후에
		 * 반드시 각 요솓모두를 초기화 해야만 
		 * 사용, 접근이 가능하다. 
		 */
		StudentVO[] stVO = new StudentVO[100];
		
		// 원시적으로 각 요소를 모두 초기화 하는 방법
		stVO[0] = new StudentVO();
		// : 
		// : 
		stVO[99] = new StudentVO();
		
		// stVO 배열을 모두 초기화 시키는 코드
		// for 반복문을 사용해서 초기화 하는 코드
		for(int i = 0 ; i < 100; i++) {
			stVO[i] = new StudentVO();
		}
		
		StudentVO st01  = new StudentVO();
		StudentVO st02  = new StudentVO();
		StudentVO st03  = new StudentVO();
		
		// st01 이라는 변수명을
		// 코드, 변수의 조합으로 절대 생성할 수 없다!!
		// 아래 코드는 규칙 문법상 존재할 수 없는 코드이다.
		for(int i = 0 ; i <=3 ; i++) {
			// st0i = ???
		}
		
		
	}
}
