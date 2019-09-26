package com.biz.array;

import java.util.Random;

public class Array_04 {

	public static void main(String[] args) {

		int[] nums = new int[10];
		Random rnd = new Random();

		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
		System.out.println("\n=========================================");

		/*
		 * 이 정렬 코드는
		 * bubble, insert, selection 정렬의 기초가 되는
		 * 정렬 코드로 다른 알고리즘의 복잡한 코드를
		 * 사용하지 않고
		 * 단순하게  비교, 교체만을 수행해서
		 * 정렬을 한다. 
		 */
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					int _temp = nums[i];
					nums[i] = nums[j];
					nums[j] = _temp;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ", ");
		}
	}
}
