package com.biz.classes.string;

public class String_06 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String strSearch = "r";
		int intLength = strNation.length();
		int index = 0;
		
		// 5번째 위치부터 문자열을 잘라서 보여달라
		strNation.substring(5);
		
		// 5번째 위치부터 8번 앞까지 문자열을 잘라서 보여달라.
		strNation.substring(5, 8);
		
		String strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println((index-1) + "번째 위치에서 찾음");
		
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index + "번째 위치에서 찾음");

		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index + "번째 위치에서 찾음");
		
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index + "번째 위치에서 찾음");
		
		strAt = strNation.substring(index,++index);
		if(strAt.equalsIgnoreCase(strSearch))
			System.out.println(index + "번째 위치에서 찾음");

		
		

	}

}
