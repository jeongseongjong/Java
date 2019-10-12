package com.biz.switch1;

public class SwitchEx_01 {

	public static void main(String[] args) {
		
		int floar = 5;
		String floars = null;
		
		switch(floar){
			case 1 : floars = "drug"; break;
			case 2 : floars = "out"; break;
			case 3 : floars = "skin"; break;
			case 4 : floars = "teeth"; break;
			case 5 : floars = "helth"; break;
			
		}System.out.println(floar + "층은 " + floars + " 샵입니다.");
	}
}
