package com.biz.exec;

public class FormatEx {

	public static void main(String[] args) {
		
		String a ;
		String b ;
		String c ;
		
		a = String.format("%d", 50);
		b = String.format("%d", 80);
		c = String.format("%d", 20);
		
		System.out.printf("%s\t%s\t%s", a, b, c);
	}
}
