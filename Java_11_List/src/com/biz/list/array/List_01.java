package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_01 {

	/*
	 * 자바의 Collections(컬렉션 프레임워크, 도구모음)
	 * 다량의 데이터를 취급하는 용도로 사용되며
	 * 기본 배열의 단점들을 해결하기위해 만들어진 모음집
	 * 
	 * List(ArrayList)
	 * Collection 중에서 가장많이 사용되는 데이터 구조
	 * 1. 데이터 개수(List의 개수)를 미리 정하지 않는다.
	 * 2. 필요에 따라서 개수를 추가, 삭제 할 수 있다.
	 * 3. 다양한 method를 활용하여 
	 * 		여러 연산을 쉽게 처리할 수 있다.
	 */
	public static void main(String[] args) {
		
		// 정수들을 담을 nums 리스트를 선언
		// int[] nums;
		List<Integer> nums ;
		
		// nums리스트를 사용할 수 있도록 생성, 초기화
		// nums = new int[?? / 기본적으로 0 으로 추측]
		nums = new ArrayList<Integer>();
		
		nums.add(100);
		nums.add(5);
		nums.add(1);
	}
}
