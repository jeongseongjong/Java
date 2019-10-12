package com.biz.Var;

public class Var_02 {

	public static void main(String[] args) {
		
		int num = 30;
		
		// 실수형 변수 f 를 선언하고
		// 변수 num에 저장된 값을 변수 f에 복사하라
		// float는 int에 비해 큰 값 저장가능
		// int 값 -> float 저장가능
		// 소수점이 추가되어 저장
		float f = num; // 30.0으로 저장
		
		// 앞에서 선언된 정수형 num 변수에
		// 앞에서 선언된 실수형 f 변수에 저장된 값을
		// 복사하라
		
		// int형 변수는 소수점 이하 값이 잘린다.
		// int에 저장하게되면 float형은 소수점을 잃게 된다.
		// 이와같은 경우 코딩잘못이라 판단 Type missmatch오류 발생
		
		// 만약 소수점이하 값이 필요없고
		// int형 변수에 float를 저장할 이유가 타당할 경우
		// 강제로 float형 값을 int형 변수에 저장하도록
		// 코드를 작성해 주어야 한다.
		// 이 코드를  cascading, 강제형변환 이라고한다.
		num = (int)f;
	}
}
