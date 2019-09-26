package com.biz.grade.Exec;

public class StringComp {

	public static void main(String[] args) {

		int sort = "A".compareTo("A");
		System.out.println(sort);
		System.out.println("A". compareTo("B"));
		System.out.println("B". compareTo("A"));
		
		System.out.println("F".compareTo("A"));
		System.out.println("A".compareTo("F"));
	}

}
