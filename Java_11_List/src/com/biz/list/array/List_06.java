package com.biz.list.array;

import java.util.LinkedList;
import java.util.List;

/*
 * List interface의 활용
 * ArrayList, LinkedList는 List interface를 설계도로 하여
 * 작성되었고
 */
public class List_06 {

	public static void main(String[] args) {
		
		// List<Integer> nums = new ArrayList<Integer>();
		List<Integer> nums = new LinkedList<Integer>();
		
		// --------------------------------------------------
		// ArrayList의 기능을 활용하여 연산을 수행하는 코드
		// 이 코드는 매우 잘 만들어진 코드이고
		// 아무런 오류나 문제가 없는 코드이다.
		nums.add(100);
		nums.add(100);
		nums.add(100);
		int total = nums.get(0) + nums.get(1) + nums.get(2);
	}
}
