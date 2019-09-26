package com.biz.collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_02 {

	public static void main(String[] args) {
		
		// 랜덤으로 저장
		// 중복배제 저장
		Set<String> strSet = new HashSet<String>();
		
		strSet.add("AAA");
		strSet.add("BBB");
		strSet.add("CCC");
		strSet.add("DDD");
		strSet.add("EEE");
		strSet.add("FFF");
		strSet.add("BBB");
		strSet.add("EEE");
		
		
		// 중복배제 저장
		// 저장되는 값을 정렬(일반적으로 오름차순)한다.
		Set<String> strSet1 = new TreeSet<String>();
		
		strSet1.add("AAA");
		strSet1.add("BBB");
		strSet1.add("CCC");
		strSet1.add("DDD");
		strSet1.add("EEE");
		strSet1.add("FFF");
		strSet1.add("BBB");
		strSet1.add("EEE");
		
		System.out.println(strSet);
		System.out.println(strSet1);
	}
}
