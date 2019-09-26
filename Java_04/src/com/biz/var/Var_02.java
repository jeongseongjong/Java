package com.biz.var;

public class Var_02 {

	public static void main(String[] args) {

		// 변수를 선언하는 목적 1
		// 같은 값(5)을 여러번 반복적으로 사용해야 할 경우
		int num = 3;
		System.out.println(num + " x " + 2 + " = " + num * 2);
		System.out.println(num + " x " + 3 + " = " + num * 3);
		System.out.println(num + " x " + 4 + " = " + num * 4);
		System.out.println(num + " x " + 5 + " = " + num * 5);
		System.out.println(num + " x " + 6 + " = " + num * 6);
		System.out.println(num + " x " + 7 + " = " + num * 7);
		System.out.println(num + " x " + 8 + " = " + num * 8);
		System.out.println(num + " x " + 9 + " = " + num * 9);
		System.out.println("============================");
		//					5  x  2 = 10
		System.out.printf("%d x %d = %2d\n" ,num,2,num*2);
		System.out.printf("%d x %d = %2d\n" ,num,3,num*3);
		System.out.printf("%d x %d = %2d\n" ,num,4,num*4);
		System.out.printf("%d x %d = %2d\n" ,num,5,num*5);

		
	}

}
