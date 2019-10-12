package com.biz.pay.exec;

import com.biz.pay.service.PaperPrintServiceV1;
import com.biz.pay.service.PaperReadServiceV1;

public class PayReadEx_01 {

	public static void main(String[] args) {
		 
		String payFile = "src/com/biz/pay/Pay.txt";
		PaperReadServiceV1 pr = new PaperReadServiceV1();
		
		try {
			pr.read(payFile);
			pr.
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
