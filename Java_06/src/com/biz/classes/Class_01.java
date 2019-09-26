package com.biz.classes;

/*
 * 나는 Class_01 이름을 가진 클래스(class) 입니다.
 * 클래스는 첫글자를 대문자로 시작하는 이름을 가져야 한다.
 * 중간에 숫자 _ 를 포함할 수 있다.
 * 빈칸이나 기타 특수 문자는 포함할 수 없다.
 * 
 * 나느 3개의 method를 가지고 있습니다.
 * method의 첫글자는 소문자로 시작하는 이름을 가져야 한다.
 * 변수명을 짓는 규칙과 같다.
 * 
 * 나는 3개의 method를 가지고 있습니다.
 * 나는 더 많은 method를 가질 수 있으며,
 * 더욱 다양한 명령들을 한데 묶어 포함 할 수 있습니다.
 * 내가 포함 method는 static이 없으므로
 * 내가 가지고 있는 method를 실행 하려면
 * 반드시 객체로 먼저 선언, 생성해야 합니다.
 */
public class Class_01 {

	public String strMember = "나는 맴버변수";
			
	public void method_01() {
		System.out.println("나는 method 01 입니다.");
		System.out.println(strMember);
	}
	public void method_02() {
		System.out.println("나는 method 02 입니다.");
		System.out.println("Class 01의 두번째 메서드 입니다.");
}
	public void method_03() {
		System.out.println("나는 method 03 입니다.");
}
}