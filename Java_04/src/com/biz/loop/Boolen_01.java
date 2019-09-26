package com.biz.loop;

public class Boolen_01 {

	public static void main(String[] args) {
		
		Boolean bYes = 3 == 3;
		System.out.println(bYes);
		
		bYes = 4 == 4; // 같냐 ? true
		bYes = 4 > 4; // 보다 크냐 ? false
		bYes = 4 >= 4; // 같거나 크냐? true
		
		//5가 5와 같거나 4가 4와 같냐?
		// || = OR
		bYes = 5 == 5 || 4 == 4; // || = OR
		bYes = 5 > 5 || 4 == 4; // false or true = true
		bYes = 5 >= 5 || 4 > 4; // true or false = true
		
		// 5가 5와 같으며 4와 4가 같냐?
		// && = AND
		bYes = 5 == 5 && 4 == 4;
		bYes = 5 > 5 && 4 == 4;// false and true = false
		bYes = 5 >= 5 && 4 > 4; // true and false = false
		
		// 5가 4보다 작거나 같냐 ?
		bYes = 5 <= 4; // false
		bYes = 3 < 4; // true
		
		// 3과 4가 같지 않느냐 = 다르냐 ?
		// ! = 같지않냐
		bYes = 3 != 4; // true <>   
		System.out.println(bYes);
		
		int n = 1;
		n = n * -1; // -1
		n = n * -1; // 1
		n = n * -1; // -1
		n = n * -1; // 1
		
		// 현재 bYes 가 true 상태
		// ex) true -> false / false -> true
		// NOT 연산 -> 원래값을 반전
		// 한번 실행될 때 마다, true와 false가 반복
		bYes = !bYes; // false
		bYes = !bYes; // true
		bYes = !bYes; // false
		bYes = !bYes; // true
		bYes = !bYes; // false
		
		
		
	}
}
