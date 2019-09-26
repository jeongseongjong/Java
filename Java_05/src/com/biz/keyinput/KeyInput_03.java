package com.biz.keyinput;

import java.util.Scanner;

public class KeyInput_03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String strIn = "";
		
		System.out.println("문자열을 입력하고 Enter를 누르면");
		System.out.println("입력한 문자열을 Console에 보여줍니다.");
		System.out.print("문자열입력 > ");
		strIn = scanner.nextLine();
		System.out.println("입력문자열 : " + strIn);
	}

}
