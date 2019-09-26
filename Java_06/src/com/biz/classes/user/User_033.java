package com.biz.classes.user;

public class User_033 {

	
	/*
	 * class 변수 영역(scope)
	 * class 맴버변수 영역
	 * 
	 * class 맴버변수 영역에 선언 변수는
	 * 최초에 한번 count가 호출될 때
	 * 선언, 생성, 초기화 된 후
	 * 코드가 더이상 실행되지 않는다.
	 * 
	 * 이 코드에서 count() method가 호출되면
	 * nCount는 1씩 증가되도록 되어 있다.
	 * 
	 * 따라서
	 * 프로젝트가 실행되는 동안
	 * count() method를 호출하면
	 * nCount가 계속 1씩 증가하고
	 * 그 결과가 console에 표시된다.
	 */
	public static int nCount = 0;

	public static void count() {
		// count() method가 호출될 때 마다
		// nCount는 새로 생성이 되고 0으로 clear
		// int nCount = 0;
		nCount ++;
		System.out.println(nCount + "번째 호출");
	}
}
