package com.biz.classes.search;

import java.util.Scanner;

public class SearchSub {

	/*
	 * 임의의 문자열중에 포함된 1개의 문자열을 찾는 클래스
	 * 
	 * 1. 임의의 문자열을 제시하고 
	 * 2. 키보드에서 1개의 문자열을 입력받고 
	 * 3. 해당하는 문자열이 몇번째 위에 있나?
	 */
	
	// 맴버변수 영역에 선언된 변수는
	// 현재 클래스(SearchSub)r가 아닌곳에서
	// 값을 참조(읽기, 쓰기)가 가능하다.
	// 단, public 키워드가 포함되어 있어야 한다.
	public String strNation ;
	public void main() {

		// strNation 변수를 맴버변수 영역으로 이동!!
		// String strNation = "Republic of Korea";
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
			if (strAt.equalsIgnoreCase(strS)) break;
		}
		/*
		 * 만약 문자열에 포함된 문자가 있으면
		 * index < 17
		 * 만약 문자열에 포함된 문자가 없으면
		 * index == 17
		 */
		System.out.println(index);
		
		// index를 검사하는 안전한 코드
		if(index < intLength)
			System.out.println(index + "번째에서 찾음");
		else
			System.out.println("없는 문자열!!");
		
		// 조금 덜 안전한 코드
		if(index == intLength) // >=가 더 안전하다.
			System.out.println("없음");
		else
			System.out.println(index + " 번째에서 찾음");
	}
}