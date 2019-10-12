package com.biz.pay.exec;

import com.biz.pay.service.PaperServiceV1;

public class PaperEx_01 {

	public static void main(String[] args) {
			
		
		PaperServiceV1 ps = new PaperServiceV1();
		
		ps.make(3785750, 50000);
		
		
	}
}
