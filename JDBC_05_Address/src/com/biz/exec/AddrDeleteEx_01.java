package com.biz.exec;

import com.biz.service.AddrCUDServiceV1;
import com.biz.service.AddrServiceV1;

public class AddrDeleteEx_01 {

	public static void main(String[] args) {
		AddrServiceV1 bs = new AddrServiceV1();
		AddrCUDServiceV1 bc = new AddrCUDServiceV1();
		
		bs.viewAddrList();
		bc.deleteAddr();
	}
}
