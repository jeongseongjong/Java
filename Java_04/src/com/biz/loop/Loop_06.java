package com.biz.loop;

public class Loop_06 {

	public static void main(String[] args) {
		
		int nCount = 0;
		for(;nCount < 10;) {
			nCount ++;
			System.out.println(nCount);
		}
		// nCount = 0;
		for(;nCount <= 10;) {
			nCount ++;
		}
		System.out.println("카운트 : " + nCount);
		
		// nCount = 11;
		for(;nCount > 10;) {
			nCount --;
		}
		System.out.println("카운트 : " + nCount);


	}

}
