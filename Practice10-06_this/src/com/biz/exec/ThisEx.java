package com.biz.exec;

import com.biz.service.ThisService;

public class ThisEx {

	public static void main(String[] args) {

		ThisService ts = new ThisService(90, 80, 70);
		System.out.println(ts.getKor());
		System.out.println(ts.getEng());
		System.out.println(ts.getMath());
	}
}
