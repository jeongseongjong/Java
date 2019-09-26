package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("===========================");
		System.out.println("회원가입>> ");
		System.out.println("---------------------------");
		System.out.print("이름>> ");
		String strName = scanner.nextLine();
		
		System.out.print("전화번호>> ");
		String strTel = scanner.nextLine();
		
		System.out.print("주소>> ");
		String strAddr = scanner.nextLine();
		
		System.out.println("===========================");
		System.out.println("회원가입 환영!!! ");
		System.out.println("---------------------------");
		System.out.println("이름 : " + strName);
		System.out.println("전화 : " + strTel);
		System.out.println("주소 : " + strAddr);
		System.out.println("===========================");
	}

}
