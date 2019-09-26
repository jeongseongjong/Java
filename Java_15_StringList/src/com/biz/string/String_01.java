package com.biz.string;

import com.biz.string.service.StringService;
import com.biz.string.service.StringServiceImpV1;

public class String_01 {

	/*
	 * main() method
	 * 자바에서 진입점 method
	 * 1. main method는 원칙적으로 프로젝트에서 
	 * 		1개의 클래스에만 있어야한다.
	 * 2. 이클립스 같은 개발 도구에서는
	 * 		여러 클래싀에 main method가 있는것을 허용
	 * 3. 개발 도구에 따라 Run을 실행했을때
	 * 		어떤 클래스의 main method를 실행할것인지가
	 * 		서로 다르다. 
	 * 4. 이클립스에서는 현재 포커스가 있는 클래스(지금보고있는)의
	 * 		main method가 제일 먼저 실행된다.
	 * 5. 만약 포커스가 있는 클래스에
	 * 		main method가 없으면 가장 최근실행 클래스의
	 * 		main method실행
	 */
	public static void main(String[] args) {
		
		StringService strService = new StringServiceImpV1();
		strService.input();
		strService.list();
		strService.view();
		
	}

}
