package com.biz.classes.search;

import java.util.Scanner;

public class FakeTrue {

	public static void main(String[] args) {
		String strNation = "Republic of Korea";
		Scanner scanner = new Scanner(System.in);
		int intLength = strNation.length();

		// 문자열 제시
		System.out.println(strNation);
		System.out.println("1개의 문자열을 입력하세요");
		System.out.print("문자 >> ");

		String strS = scanner.nextLine();

		int index = 0;
		for (index = 0 ; index < intLength; index++) {
			String strAt = strNation.substring(index, index + 1);
			if (strAt.equalsIgnoreCase(strS))
				System.out.println(index + " 번째에서 찾음");
			else
				System.out.println("못 찾음");
			break;
		}
		
	}
}