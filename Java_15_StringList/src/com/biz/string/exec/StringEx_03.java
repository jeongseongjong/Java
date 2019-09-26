package com.biz.string.exec;

public class StringEx_03 {

	/*
	 * strNation에 담긴 문자열을
	 * 역순으로 콘솔에 표시하시오
	 * aeroK fo cilbupeR
	 */
	public static void main(String[] args) {
		
		String strNation = "aeroK fo cilbupeR";
		String strS1 = ""; // 0
		String[] strS = strNation.split("");
		for(int i = strS.length-1 ; i>-1 ; i--) {
			strS1 += strS[i];
			}System.out.println(strS1);
		
		
		
	}
}
