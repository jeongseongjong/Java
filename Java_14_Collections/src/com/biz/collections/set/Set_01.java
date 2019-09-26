package com.biz.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_01 {

	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		Set<String> strSet = new HashSet<String>();
		
		// List는 추가한 순서대로 저장
		// 추가한 데이터 모두 저장
		strList.add("AAA");
		strList.add("BBB");
		strList.add("CCC");
		strList.add("DDD");
		strList.add("EEE");
		strList.add("FFF");
		strList.add("BBB");
		strList.add("EEE");
		
		// Set은 랜덤으로 저장
		// 이미 저장된 값은 재저장 안된다.
		// 즉, 중복된 데이터 제외
		strSet.add("AAA");
		strSet.add("BBB");
		strSet.add("CCC");
		strSet.add("DDD");
		strSet.add("EEE");
		strSet.add("FFF");
		strSet.add("BBB");
		strSet.add("EEE");

		System.out.println(strList.toString());
		System.out.println(strSet.toString());
	
		// List형을 Set형으로 변환
		// List 데이터 중 중복값을 제외하고
		// List를 얻기위한 방법
		Set<String> strSet1 = new HashSet<String>(strList);
		System.out.println(strSet1);
		
		strList = new ArrayList<String>(strSet1);
	}
}
