package com.biz.exec;

import com.biz.service.AddrServiceV1;

public class AddrNameEx_01 {

	public static void main(String[] args) {
		
		AddrServiceV1 as = new AddrServiceV1();
		
		as.searchAddrName(true);
		System.out.println("이름검색 종료");
	}
}
