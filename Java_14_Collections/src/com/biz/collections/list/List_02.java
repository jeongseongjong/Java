package com.biz.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		
		List<String> strList = new ArrayList<String>();
		
		strList.add("AAA");
		strList.add("BBB");
		strList.add("CCC");
		strList.add("DDD");
		strList.add("EEE");
		strList.add("FFF");
		
		System.out.println(strList);
		
		// strList 자체를 정렬해서
		// 다시 strList에 저장해준다.
		Collections.sort(strList);
		System.out.println(strList);
		
		// list에 담긴 값을 랜덤으로 섞는다.
		Collections.shuffle(strList);
		System.out.println(strList);
	}
}
