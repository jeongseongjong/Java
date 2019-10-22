package com.biz.exec;

import com.biz.service.AddrServiceV1;

public class AddrAddrEx_01 {

	public static void main(String[] args) {
		AddrServiceV1 as = new AddrServiceV1();

		as.searchAddrAddr(true);
		System.out.println("주소검색 종료");
	}
}
