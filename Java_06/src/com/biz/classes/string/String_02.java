package com.biz.classes.string;

public class String_02 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
				char cSearch = 'l';
		int index = 0;
		
		char cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 1로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 2로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 3로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
		
		index ++; // 4로 증가
		cA = strNation.charAt(index);
		if(cA == cSearch)
			System.out.println(index + " 번 위치에 있음");
	}

}
