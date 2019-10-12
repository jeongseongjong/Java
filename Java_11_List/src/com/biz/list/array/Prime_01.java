package com.biz.list.array;

import java.util.Random;

public class Prime_01 {

	public static void main(String[] args) {

		/*
		 * 50개의 정수형 배열을 생성하고 각 요소에 1 부터 100까지 임의 수를 저장하고 그 수가 소수인지 찾아라
		 */

		int[] nums = new int[50];

		// 랜덤으로 사용하는 class
		// 랜덤클래스를 사용하기 위해 rnd객체 생성
		// rnd -> Random class 호출하여 연산을 수행하기 위한 대리자
		Random rnd = new Random();

		int num = rnd.nextInt(); // 정수 임의 숫자생성
		num = rnd.nextInt(100); // 0~99 임의숫자 생성
		num = rnd.nextInt(100); // 1~100 임의숫자 생성

		for (int i = 0; i < nums.length; i++) {

			// 1번코드
			int rndNum = rnd.nextInt(100) + 1;
			nums[i] = rndNum;

			// 2번코드
			nums[i] = rnd.nextInt(100) + 1;
		}

		for (int i = 0; i < nums.length; i++) {
			// System.out.println(nums[i]);
			System.out.printf("%4d", nums[i]);

			if ((i + 1) % 5 == 0) {
				System.out.println();
			} else {
				System.out.print(", ");
			}
		}

		// 소수를 찾아서 리스트를 보이는 코드
		int[] intNum = new int[50];

		for (int i = 0; i < nums.length; i++) {

			int r = nums[i];
			
			// 만약 nums 배열의 i 위치의 값이 2미만(0, 1) 이면
			// 해당값은 소수 검사를 하지말고
			// i++를 수행하여 다음번 위치에 있는 값으로 건너뛰어라
			
			// ex)
			// nums[3] 값이 1이다 라고 가정
			// nums[3]의 값은 소수검사를 하지말고
			// nums[4]로 건너뛰어라
			if(r < 2) {
				
				/*
				 * for, while 등의 반복문내에서
				 * 어떤 이유로든 continue 명령문을 만나면 
				 * 그 이후에 코드는 모두 무시하고 건너뛴다(++값으로 이동)
				 */
				continue;
			}
			int j;
			for (j = 2; j < r; j++) {

				if (r % j == 0) { // 1번이라도 true이면 소수가 아니다
					break;
				}
			}

			// 소수이면 break를 만나서 j 반복 중단
			// 아니라면 break를 만나지 않았기 대문에
			// j 반복이 모두 완료
			if (j >= r) { // 반복문이 모두 완료 !
				System.out.println(i + "번째 소수 : " + r);
			} else { // 반복문이 중간에 break를 만났다.
			}

		}
	}
}
