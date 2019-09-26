package com.biz.classes.arrays;

import java.util.Random;

/*
 * 10의 정수형 배열을 만들고
 * 1부터 10까지 임의 숫자를 저장한 후
 * 임의 숫자 1개를 지정하여
 * 배열의 몇번째에 있는지 찾기
 */

public class Array_03 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int[] nums = new int[10];

		for (int i = 1; i < nums.length; i++) {

			nums[i] = rnd.nextInt(10) + 1;

		}
		int sNum = 5;

		int index;
		for (index = 1; index < nums.length; index++) {
			if (nums[index] == sNum)
				break;
		}
		if (index >= nums.length)
			System.out.printf("배열에 %d 값이 없음\n", sNum);
		else
			System.out.printf("찾았다!! \n" + "배열의 %d 번째에 값이 있음\n", index);

		for (int i = 1; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
