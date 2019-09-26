package com.biz.list.array;

import java.util.ArrayList;
import java.util.List;

public class List_03 {

	public static void main(String[] args) {
		// 1번코드 : 일반적 코딩방식
		// ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// 2번코드 : 객체지향의 패턴을 중요시 준수하는 코딩방식
		// primitive(기본형) 변수 -> 리스트 저장하기 위해 선언하는 명령문
		List<Integer> nums = new ArrayList<Integer>();
		List<String> sts = new ArrayList<String>();
		List<Long> longs = new ArrayList<Long>();
		List<Float> floats = new ArrayList<Float>();
		List<Double> doubles = new ArrayList<Double>();
		List<Character> chars = new ArrayList<Character>();
		List<Boolean> bools = new ArrayList<Boolean>();
	}
}
