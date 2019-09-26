package com.biz.var;

public class Var_12 {

	public static void main(String[] args) {

		int nCount = 0;
		
		nCount = nCount + 1;
		System.out.println("카운트 1 : " + nCount);
		
		nCount += 1;
		System.out.println("카운트 2 : " + nCount);
		
		System.out.println("카운트 3 : " + (nCount++));
		// 실제코드 다음과 같이 2번 실행된다.
		// System.out.println("카운트 3 : " + (nCount));
		// nCount += 1;
		System.out.println("카운트 4 : " + nCount);
		System.out.println("카운트 5 : " + (++nCount) );
		// 실제코드는 다음과 같이 2번실행
		// nCount += 1;
		// System.out.println("카운트 5 : " + nCount);
		
		int n = (nCount++) + 1;
		// 실제 코드는
		// int n = nCount + 1;
		// nCount += 1;
	}

}
