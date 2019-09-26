package com.biz.loop;

public class Loop_01 {

	public static void main(String[] args) {

		int nCount = 0;
		
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		System.out.println("카운트 : " + nCount++);
		
		System.out.println("========================");
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
		System.out.printf("%d x %d = %d\n",
				3,nCount,nCount++ * 3);
	}

}
