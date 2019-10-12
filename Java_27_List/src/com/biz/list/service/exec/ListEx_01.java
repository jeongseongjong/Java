package com.biz.list.service.exec;

import java.util.List;

import com.biz.list.service.ListMakeServiceV1;
import com.biz.list.service.ListRecServiceV1;

public class ListEx_01 {

	public static void main(String[] args) {
		
		ListMakeServiceV1 lm = new ListMakeServiceV1();
		ListRecServiceV1 lr = new ListRecServiceV1();
		
		lm.makeStrList();
		List<String> strList = lm.getStrList();
		
		lr.setStrList(strList);
		lr.viewList();
		
		
	}
	
		
}
