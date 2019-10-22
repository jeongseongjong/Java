package com.biz.exec;

import com.biz.service.AddrServiceV1;

public class AddrEx_01 {

	public static void main(String[] args) {
		
		AddrServiceV1 as = new AddrServiceV1();
		as.viewAddrList();
		System.out.println("검색 종료");
		
	}
}
