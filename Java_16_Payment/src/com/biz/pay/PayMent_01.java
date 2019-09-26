package com.biz.pay;

import com.biz.pay.service.PayServiceV1;

public class PayMent_01 {

	public static void main(String[] args) {
		int pay = 3785870;
		PayServiceV1 ps = new PayServiceV1();
		ps.array(pay);
		
	//	int won = 3785870;
	//	int[] t = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };
	//	for (int i : t) {
	//		int s = won / i;
	//		won %= i;
	//		System.out.println(i + "원 " + s + "개");
		}
	}

