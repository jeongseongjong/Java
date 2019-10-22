package com.biz.exec;

import com.biz.service.AddrServiceV1;

public class AddrTelEx_01 {

public static void main(String[] args) {
		
		AddrServiceV1 as = new AddrServiceV1();
		
		as.searchAddrTel(true);
		System.out.println("전화번호검색 종료");
	}
}
