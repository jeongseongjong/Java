package com.biz.Var;

public class Var_05 {

	public static void main(String[] args) {
		
		// 문자열 -> 숫자형 변환후 num에 저장
		int num = Integer.valueOf("30");
		
		// 변환불가
		// 사유 : 진짜 문자는 숫자로 변경불가
		num = Integer.valueOf("AAA");
		
		num = Integer.valueOf("A33"); // 문자 있어서 불가
		num = Integer.valueOf("33 "); // 불가(숫자외에는 변환 불가하다)
		num = Integer.valueOf(" 33"); // 불가
	}
}
