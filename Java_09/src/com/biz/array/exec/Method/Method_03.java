package com.biz.array.exec.Method;

import com.biz.array.service.MethodProtoType;

public class Method_03 {

	public static void main(String[] args) {

		MethodProtoType mt = new MethodProtoType();

		/*
		 * mt 클래스에는 view() 메서드가 있을텐데 아마도 public void view(){ } 형식 일것이다.
		 */

		mt.view();

		/*
		 * public int ret() { } 형식이다.
		 */
		int n = mt.ret();

		/*
		 * public void(int num1, int num2) {
		 * 
		 * } 형식 일 것이다.
		 */
		mt.mret(30, 40);

		/*
		 * 같은 mret() 메서드를 또 다시 호출햇는데
		 *  이 호출 명령문에 의해서 mret() method()는
		 *   public int mret(int num1, int num2) {return 0;} 메스디임이 확인된다.
		 */
		int m = mt.mret(50, 30);

	}
}
