package com.biz.classes.arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayScanService {

	private int[] nums;

	// 생성자 메서드 :
	// 클래스에 포함되는 method 중에
	// void 등이 없고
	// 이름이 클래스 이름과 같은 method
	// 생성자 메서드는
	// 누군가 new ArrayScanService() 생성자 메서드를
	// 호출할 때 자동으로 호출되는 method이다
	public ArrayScanService(int length) {

		Random rnd = new Random();
		nums = new int[length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = rnd.nextInt(10) + 1;
		}
	}

	public void scanArray() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("0~10까지 정수 >> ");
		String strNum = scanner.nextLine();

		int intNum = Integer.valueOf(strNum);

		int index;
		for (index = 0; index < nums.length; index++) {
			if (nums[index] == intNum)
				break;
		}
		if (index >= nums.length)
			System.out.println("찾는값이 없음!!!!");
		else
			System.out.printf("%d 번째에서 찾음\n", index);

		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		scanner.close();
	} // scanArray End

	public void scanArrayAll() {

		Scanner scanner = new Scanner(System.in);
		System.out.print("1~10까지의 정수 >> ");
		String strNum = scanner.nextLine();
		int intNum = Integer.valueOf(strNum);

		int nCount = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == intNum) {
				System.out.printf("%d 번째에 찾음!!\n", i);
				nCount++;
			}
		}

		if (nCount < 1) {
			System.out.println("찾지 못함!!!");
		} else {
			for (int i = 0; i < nums.length; i++) {
				System.out.print(nums[i] + ",");
			}
			System.out.println();

		}
		// scanner.close();

	}
}
