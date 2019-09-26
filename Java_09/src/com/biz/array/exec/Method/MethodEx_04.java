package com.biz.array.exec.Method;

import com.biz.array.exec.MethodeEx_04_test;

/*
 * main() method에서
 * MethodService 클래스를 ms객체로 선언하고
 * 다음코드를 실행하여 30*40의 결과가
 * console에 나타나도록 코드를 완성하시오
 * 
 * int retNum=ms.getSum(30,40) ;
 */
public class MethodEx_04 {

	public static void main(String[] args) {

		MethodeEx_04_test ms = new MethodeEx_04_test();

		int retNum = ms.getSum(30, 40);

		System.out.println("30 x 40 = " + retNum);

	}

}
