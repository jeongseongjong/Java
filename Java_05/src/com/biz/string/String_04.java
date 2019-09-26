package com.biz.string;

public class String_04 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		
		// 12번째 위치부터 잘라서 strKorea에 담기
		String strKorea = strNation.substring(12);
		System.out.println(strKorea);
		
		// 2번째 위치부터 8번 앞까지 잘라서 strPub에 담기
		String strPub = strNation.substring(2,8);
		System.out.println(strPub);
	}

}
