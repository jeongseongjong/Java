package com.biz.string.exec;

public class StringEx_01 {

	public static void main(String[] args) {
		
		String strNation = "Republic of Korea";
		// strNation에 담긴 문자열을
		// 알파벳단위로(한글자씩) 잘라서
		// strS1 배열에 담아라.
		String[] strS1 = strNation.split(""); // 17개의 배열 생성
		
		for(String s : strS1) {
			System.out.println(s);
		}
		
		// strNation에 담긴 문자열을
		// space bar (" ")기준으로 잘라서
		// strS2 배열에 담아라
		String[] strS2 = strNation.split(" "); // 3개의 배열생성
		System.out.println("0 : " + strS2[0]);
		System.out.println("1 : " + strS2[1]);
		System.out.println("2 : " + strS2[2]);
		
		// 오류발생시 스킵
		try {
			System.out.println("3 : " + strS2[3]);	
		} catch (Exception e) {
			// 코드 없음
			// 만약 exception이 발생시 스킵
		}
		try {
			System.out.println("3 : " + strS2[3]);
		} catch (Exception e) {
			
			// try { } 내의 코드가 실행되는 과정에서
			// exception 발생시 JVM(자바오토머신)은 catch(e) { } 블럭에게
			// exception 정보를 전달한다.
			// 이때 exception 정보는 변수 e가 받아서 가지고 있다.
			// e 변수의 printStackTrace() method는
			// 어떤 exception이 발생햇는지 콘솔에 보여주는 기능을 수행
			e.printStackTrace();
		}
	}
}
