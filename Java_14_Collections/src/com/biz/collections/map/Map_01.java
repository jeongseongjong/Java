package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_01 {

	public static void main(String[] args) {
		
		/*
		 * Collection 프레임워크의 List, Set과는 다른 형식의 데이터 구조이다.
		 * List, Set은 한가지 type만을 리스트로 포함하는 구조인데
		 * Map은 2가지 type의 자료를 한 묶음의 리스트로 포함하며
		 * Key, Value 라는 독특한 구조를 가지고 있다.
		 */
		Map<String, String> strMap = new HashMap<String, String>();
	
		// Map에 데이터 추가
		strMap.put("1", "AAA");
		strMap.put("3", "BBB");
		strMap.put("2", "CCC");
		strMap.put("5", "DDD");
		strMap.put("9", "EEE");
		
		System.out.println(strMap.get("9"));
	}
}
