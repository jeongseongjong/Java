package com.biz.collections.set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Set_03 {

	public static void main(String[] args) {
		
		Set<Integer> intSet = new TreeSet<Integer>();
		Random rnd = new Random();
		
		for(int i = 0 ; i < 10 ; i ++) {
			intSet.add(rnd.nextInt(10));
			
		}
		System.out.println(intSet);
		
		Set<String> strSet = new TreeSet<String>();
		
		/*
		 * 문자열의 TreeSet에 저장할때
		 * 문자열의 자릿수(길이)가 일정하지 않으면
		 * 원하는대로 정렬이 이루어지지 않을 수 있다.
		 */
		for(int i = 0 ; i < 10 ; i ++) {
			strSet.add(String.format("%02d",rnd.nextInt(100)));
					
		}
		System.out.println(strSet);
	}
}
