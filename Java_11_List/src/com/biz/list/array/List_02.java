package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_02 {

	public static void main(String[] args) {

		// 정수값을 담을 nums list를 선언과 생성
		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		// 명령문을 55번 반복실행하라
		for (int i = 0; i < 55; i++) {

			// 4byte 정수 범위의 임의 숫자 1개 생성 (4byte 정수의 정의?)
			int rNum = rnd.nextInt();
			
			// 생성한 숫자를 nums List에 추가
			nums.add(rNum);
		}

		// nums List에는 55개의 요소 생성
		
		// 30번 요소의 값을 num 변수에 복사
		int num = nums.get(30);
		System.out.println(num);
		
		for(int i = 0 ; i < 55 ; i++) {
			System.out.println(nums.get(i));
		}
		
		// System.out.println(nums.get(55));
	}
}
