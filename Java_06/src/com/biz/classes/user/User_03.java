package com.biz.classes.user;

public class User_03 {

	public static void count() {
		// count() method가 호출될 때 마다
		// nCount는 새로 생성이 되고 0으로 clear
		int nCount = 0;
		nCount ++;
		System.out.println(nCount + "번째 호출");
	}
}
