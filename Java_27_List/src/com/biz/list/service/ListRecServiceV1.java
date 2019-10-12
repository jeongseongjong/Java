package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;

/*
 * ReceiveService
 */
public class ListRecServiceV1 {

	List<String> myStrList;
	List<String> recStrList;

	/*
	 * myStrList : ListServiceV1에서 임의로 생성한 List recStrList : 외부에서 주입되는 List
	 */
	public ListRecServiceV1() {

		myStrList = new ArrayList<String>();
		this.recStrList = recStrList;

	}

	public void setStrList(List<String> recStrList) {

		this.recStrList = recStrList;

	}
	
	public void viewList() {
		for(String str : this.recStrList) {
			System.out.println(str);	
		}
	}
}
