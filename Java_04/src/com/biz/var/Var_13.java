package com.biz.var;

public class Var_13 {

	public static void main(String[] args) {
		
		int nC = 0;
		
		// 콘솔에 출력하기 전에
		// 강제로 ++를 먼ㅇ저 실행했으므로
		// 콘솔에 +1 된 값이 출력된다.
		nC++;
		System.out.println(nC);
		
		++nC;
		System.out.println(nC);
		
		/*
		 * 증감연산자를 다른 명령문과 함께 사용 할 경우
		 * ++변수(선행증감), 변수++(후행증감)에 따라
		 * 결과가 전혀 예상과 다르게 나타날 수 있다.
		 * 어떤 연산이 먼저 수행되는지 잘 구별해야 한다.
		 * 따라서 다음 명령문은 2개의 명령문으로
		 * 분해하여 실행되는 것을 잘 연습해야 한다.
		 */
		System.out.println(nC++);
		// 1. System.out.println(nC)
		// 2. nC += 1;
	
		System.out.println(++nC);
		// 1. nC += 1;
		// 2. System.out.println(nC)
	}

}
