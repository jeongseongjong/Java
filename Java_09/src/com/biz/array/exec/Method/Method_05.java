package com.biz.array.exec.Method;

import com.biz.array.service.MethodService;

/*
 * method의 다형성
 * 객체지향의 특징중 한가지로
 * method의 매개변수의 type, 개수가 다를경우
 * method의 이름을 같게 중복해서 선언할 수 있는 특징
 * 
 * void add(int n1, int n2)와
 * void add(float f1, float2,)는
 * 같은 이름이지만 매개변수 type이 다르므로
 * 다른 method로 인식을 한다.
 * 
 * 추상화, 캡슐화, 정보은닉, 더불어 
 * 객체지향의 중요한 특징이다.
 */
public class Method_05 {

	public static void main(String[] args) {
		
		MethodService ms = new MethodService();
		
		// void add()가 호출
		ms.add(); 

		// void add(int num)가 호출
		ms.add(100); 
		
		// void add(int num1, int num2)가 호출
		ms.add(30, 40);
		
		// void add(float f1, float f2)가 호출
		ms.add(30.0f, 40.0f);
	}
}
