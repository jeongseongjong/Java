package com.biz.loop;

public class Loop_02 {

	public static void main(String[] args) {

		/*
		 * 6단 구구단 표시
		 * 조건 : nCount++ 이용
		 */
		int nCount = 0;
		int nDan = 6;
		
		System.out.printf("카운트 : " + nCount++);
		
		System.out.printf(" %d x %2d = %2d\n ",nDan,nCount, nCount++ * nDan);
		System.out.printf(" %d x %2d = %2d\n ",nDan,nCount, nCount++ * nDan);
		System.out.printf(" %d x %2d = %2d\n ",nDan,nCount, nCount++ * nDan);
		System.out.printf(" %d x %2d = %2d\n ",nDan,nCount, nCount++ * nDan);
		System.out.printf(" %d x %2d = %2d\n ",nDan,nCount, nDan * nCount++);
		
		
	}

}
