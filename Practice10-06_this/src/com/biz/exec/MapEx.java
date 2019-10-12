package com.biz.exec;

import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		
	
	HashMap<String, String> m = new HashMap<String, String>();
	
	m.put("1111", "AAA");
	m.put("2222", "BBB");
	m.put("3333", "CCC");
	
	System.out.println(m.get("1111"));
	
	}
}
