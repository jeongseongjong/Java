package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_03 {

	public static void main(String[] args) {
		
		Map<String, Integer> mapAge = new HashMap<String, Integer>();
		
		mapAge.put("AAA", 11);
		mapAge.put("BBB", 22);
		mapAge.put("CCC", 33);
		mapAge.put("DDD", 44);
		mapAge.put("EEE", 55);
		
		System.out.println("CCC의 나이 : " + mapAge.get("CCC"));
		
	}
}
