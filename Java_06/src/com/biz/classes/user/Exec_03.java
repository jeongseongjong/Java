package com.biz.classes.user;

public class Exec_03 {
	
	public static void main(String[] args) {
	
		// User_03.count() method 10번 호출하라
		for(int i = 0 ; i < 10 ; i++) {
			User_03.count();
		}
		System.out.println("======================");
		// User_033.count() method를 10번 호출하라
		for(int i = 0 ; i < 10 ; i++) {
			User_033.count();
		}
		for(int i = 0 ; i < 10 ; i++) {
			User_033.count();
		}
	}
}
