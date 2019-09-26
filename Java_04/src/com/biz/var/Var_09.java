package com.biz.var;

/*
 * 변수를 활용하여 복사붙이기 이후 오류 최소화
 * 
 * 한 두줄의 코드를 복사하여 사용할 경우
 *  같은 형태의 코드가 많아지면
 *  개발자 입장에서는 상당히 불편한 코드가 된다.
 * 이때 
 *  복사 붙인 후, 코드의 수정이 최소한으로 되도록
 *  원본 코드를 작성하는 것이 좋다.
 */

public class Var_09 {

	public static void main(String[] args) {

		int nCount = 0;
		char cA = 'A';
		
		// nCount 값을 1증가 시켜라
		nCount = nCount + 1;
		
		// 1. cA에 담긴 문자 A의 ASCII 코드 값에 1을 더하고
		// 2. 생성된 ASCII 코드값을 문자로 변환하여
		// 3. 다시 cA 변수에 저장하라
		// ==>'B' 문자열이 cA 변수에 저장
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;

		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;

		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		cA = (char)('A' + 1);
		nCount = nCount + 1;
		
		// %d : 정수표시문자
		// %c : char 표시문자
		// System.out.printf("A문자 이후 %d번째 문자는 %c 이다.",nCount, cA);
		System.out.printf("A문자 이후 %d번째 "
				+ "문자는 %c 이고,"
				+ "ASCII 코드는 %d 이다.", nCount, cA,(int)cA);
	}

}
