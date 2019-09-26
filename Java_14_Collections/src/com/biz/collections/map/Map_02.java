package com.biz.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map_02 {

	public static void main(String[] args) {
		
		Map<String, String> strAddr = new HashMap<String, String>();
		
		strAddr.put("AAA","서울");
		strAddr.put("BBB","광주");
		strAddr.put("CCC","목포");
		strAddr.put("DDD","창원");
		strAddr.put("EEE","부산");
		
		System.out.println("DDD의 주소 : " + strAddr.get("DDD"));
		
		
		
		
		
	}
}
