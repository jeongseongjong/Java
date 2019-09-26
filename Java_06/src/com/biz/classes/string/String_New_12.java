package com.biz.classes.string;

public class String_New_12 {

	public static void main(String[] args) {

		String s1 = "Korea";
		String s2 = "Korea";
		
		String n1 = new String("Korea");
		String n2 = new String("Korea");
				
		boolean bYes = s1 == s2;
		System.out.println("s1 == s2 : " + bYes);
		
		bYes = n1 == n2;
		System.out.println("n1 == n2 : " + bYes);
		
		bYes = n1.equals(n2);
		bYes = n1.equalsIgnoreCase(n2);
	}

}
