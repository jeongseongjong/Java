package com.biz.method;

public class MethodEx_02 {

	/*
	 * 1. 콘솔에 대한민국만세 문자열을 10번 출력
	 * 2. 가. 콘솔에 대한민국만세를 5번출력하고,
	 *    나. 줄을 하나 표시하고
	 *    다. 다시 콘솔에 대한민국만세를 3번 출력 
	 * 3. 대한민국만세 대신 Republic of Korea를 같은방법으로
	 * 	  콘솔에 출력하고자 한다.
	 */
	public static void main(String[] args) {
		
		// 문자열 변경을 예상
		String strNation = "Republic of Korea";
		
		for(int i = 0 ; i < 10 ; i ++) {
		//	System.out.println("대한민국만세");
			System.out.println(strNation);
		}
		for(int i = 0 ; i < 5 ; i ++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
			
		}System.out.println("====================");
		for(int i = 0 ; i < 3 ; i ++) {
			// System.out.println("대한민국만세");
			System.out.println(strNation);
		}
	}
}
