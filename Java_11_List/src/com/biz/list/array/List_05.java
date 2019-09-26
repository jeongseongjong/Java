package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class List_05 {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<Integer>();
		Random rnd = new Random();

		for (int i = 0; i < 67; i++) {
			nums.add(rnd.nextInt());
		}

		// 전체 리스트를 보고자 할 때
		int nSize = nums.size();
		for (int i = 0; i < nSize; i++) {
			System.out.println(nums.get(i));
		}
		
		// a.k.a : 확장for, 향상된for, forEach
		// nums 개수만큼 반복문을 실행하면서
		// nums의 요소를 get하여 n변수에 담아준다
		// 이 코드는 nums가 Collections 일 때 사용
		
		// 전체리스트를 읽어서 연산을 수행할 때 사용가능
		for (int n : nums) {
			System.out.println(n);
		}
		
		int sum = 0 ;
		for(int n : nums) {
			sum += n;
		}
		System.out.println("합계  : " + sum);
		
		for(int n : nums) {
			
			int index;
			for(index = 2 ; index < n ; index++) {
				if(n % index == 0) break;
			}
			if(index >= n) {
				System.out.println(n + "은 소수이다");
			}
		}
	}
}
