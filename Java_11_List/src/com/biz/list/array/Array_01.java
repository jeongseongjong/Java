package com.biz.list.array;

public class Array_01 {

	public static void main(String[] args) {

		/*
		 * 리스트(List) 데이터들의 묶음 
		 * 숫자리스트, 문자리스트 등 다양한 종류가 있다.
		 */

		// 숫자 리스트를 순서대로 표현하는 방법
		// = console에 숫자 리스트를 순서대로 표시하는 방법
		
		// 5부터 22까지 숫자를 console에 나열하고 싶다.
		// i값이 22까지 (i <= 22의 조건이 참인동안)
		// 명령문을 반복적으로 실행해서
		// 어떤것을 표현하라
		for(int i = 5; i < 22 ; i++) {
			System.out.println(i);
		}
		
		// 배열을 이용해서 어떤 값들을 저장하고
		// 저장된 값들을 console에 리스트로 표시하는 방법
		
		// 정수형 배열 nums를 선언하고
		// 요소를 100개를 선언하겠다.
		int[] nums = new int[100];
		
		// nums 배열의 요소에 어떤 값을 저장
		nums[0] = 5;
		nums[1] = 6;
		nums[2] = 7;
		nums[10] = 22;
		
		// nums 배열의 요소에 저장된 값을 이용해서 연산
		// 1. console에 표현
		System.out.println(nums[99]);
		System.out.println(nums[77]);
		System.out.println(nums[2]);
		
		// 2. 배열요소에 저장된 값이 정수형 값이므로
		// 이값을 읽어서 덧셈 연산을 수행
		int sum = nums[1] + nums[10] + nums[55] + nums[88];
		
		// 3. 배열요소에 다른 값을 저장
		nums[1] = 99;
		nums[88] = 91;
		
		// 4. 배열요소의 index를 임의로 지정하지 않고
		// 		배열요소 전체에 대해서 어떤 연산을 수행
		for(int i = 0 ; i < nums.length; i ++) {
			System.out.println(nums[i]);
			sum = sum + nums[i]; // sum += nums[i]; -> 수열을 원할시에
		}
	}
}
