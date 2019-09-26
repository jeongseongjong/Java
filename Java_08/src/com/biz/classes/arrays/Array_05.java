package com.biz.classes.arrays;

public class Array_05 {

	public static void main(String[] args) {
		
		// 클래스를 객체로 선언할때
		// new ArrayScanService(10) 생성자 메서드를 호출하면
		// ArrayScanService 클래스에 정의된
		// 생성자 메서드가 호출된다.
		ArrayScanService aService 
		= new ArrayScanService(10);
		
		aService.scanArray();
	}
}
