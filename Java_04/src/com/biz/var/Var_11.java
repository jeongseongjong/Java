package com.biz.var;

public class Var_11 {

	public static void main(String[] args) {

		int nCount = 0;
		
		// 자신을 1씩 증가시키는 복합 대입 연산자 사용
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		nCount += 1;
		
		// 자신을 1씩 감소시키는 복합 대입 연산자 사용
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		nCount -= 1;
		
		// 자신을 '1씩' 증가시키는 코드
		// 복합 대입 연산자 대신
		// 증가 연산자(++)를 사용한다.
		nCount ++; // nCount = nCount + 1;
		nCount ++; // nCount = nCount + 1;
		nCount ++; // nCount = nCount + 1;
		
		// 감소 연산자(--)
		nCount ++; // nCount = nCount + 1;
		nCount ++; // nCount = nCount + 1;
		nCount --; // nCount = nCount - 1;
	}

}
