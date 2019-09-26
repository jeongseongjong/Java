package com.biz.classes;

import java.util.Scanner;

public class ScannerB {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름>> ");
		String strName = scanner.nextLine();
		
		System.out.print("국어>> ");
		int intKor = scanner.nextInt();
		
		System.out.print("영어>> ");
		int intEng = scanner.nextInt();
		
		System.out.print("전화>> ");
		String inTel = scanner.nextLine();
		
		System.out.print("전화>> ");
		String inTel1 = scanner.nextLine();
		//nextInt다음의 nextLine 나오지 않는다(뛰어넘는다 / Int버그라고 불린다)---> 사용x
	}
}
