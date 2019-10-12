package com.biz.pay.exec;

import java.util.List;

import com.biz.pay.service.PayReadServiceV1;

public class PayEx_01 {

	public static void main(String[] args) {
		
		String payFile = "src/com/biz/pay/pay.txt";
		PayReadServiceV1 pr = new PayReadServiceV1(); 
			
				try {
					pr.readPay(payFile);
					List<String> payStrList = pr.getPayStrList();
					
					for (String str : payStrList) {
						System.out.println(str);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
}
