package com.biz.list.exec;

public class Try_Catch {

	public static void main(String[] args) {
		
		int num1 = 0 ;
		try {
			num1 = Integer.valueOf("30");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문자열이 포함되어 숫자로 변환불가");
		}
		
		int num2 = 0 ;
		try {
			num2 = Integer.valueOf("40 ");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문자열이 포함되어 숫자로 변환불가");
		}
		
		int num3 = 0 ;
		try {
			num3 = Integer.valueOf(" 50");	
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("문자열이 포함되어 숫자로 변환불가");
		}
		
		// 문자열형 숫자를 정수로 바꾸어서 변수에 보관
		
		
		
		
		int sum = num1 + num2 + num3;
		
		System.out.println(sum);
	}
}
