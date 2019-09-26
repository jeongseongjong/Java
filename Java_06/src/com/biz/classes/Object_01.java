package com.biz.classes;

public class Object_01 {

	
	public static void main(String[] args) {

		// 클래스를 객체로 선언, 생성, 초기화
		// 객체(class_01)의 이름은
		// 일반적으로 클래스 이름의 첫글자를 소문자로 하여
		// 명명한다.
		// 추가로 객체를 선언할때는 뒤에 숫자를 나열하기도 한다.
		Class_01 class_01 = new Class_01();
		Class_01 class_01_01 = new Class_01();
		Class_01 class_01_02 = new Class_01();
		Class_01 class_01_03 = new Class_01();
		
		class_01.method_01();
		
		class_01_01.strMember = "대한민국";
		class_01_01.method_01();
		
		class_01.method_01();
		
		
		
		
		}

}
