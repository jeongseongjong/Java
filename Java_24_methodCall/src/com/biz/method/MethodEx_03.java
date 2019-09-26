package com.biz.method;

import com.biz.method.service.CalcService;

public class MethodEx_03 {

	public static void main(String[] args) {
		
		CalcService cs = new CalcService();
		
		for(int i = 0 ; i < 10 ; i++) {
			
			// CalcService 클래스에 정의된
			// addNum() method가 무슨일을 하는지는 모르나
			/// 아무튼 반복수행하라.
			cs.addNum();
		}
		
		for(int i = 0 ; i < 5 ; i++) {
			
			// 23이라는 정수를 보내주고(주입하고)
			// 아무튼 반복수행하라.
			cs.addNum(23);
		}

		// 32와 55 두개의 정수를 주입하고
		// 아무튼 1번 수행하라.
		cs.addNum(32, 55);
		
		// 32와 54 두개의 정수를 주입하고
		// 연산을 수행한다음 결과를 result에 담아라
		int result = cs.addNum(32, 54);
		System.out.println(result);
	}
}
