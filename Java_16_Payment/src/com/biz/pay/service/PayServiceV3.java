package com.biz.pay.service;

public class PayServiceV3 extends PayServiceV2 {
	// array(int pay)
	// whilePay(int pay)

	@Override
	public void whilePay(int nPay) {

		this.headerView(nPay);
		int intSw = 1;

		while (true) {

			if (nPay < 5)
				break;

			int nCount = nPay / nMoney; // 매수계산
			nPay -= nCount * nMoney; // nPay= nCount * nMoney - nPay
			System.out.printf("%8s 원권 %4d매\n", paperForm.format(nMoney), nCount);

			if (intSw == 1) {
				nMoney /= 5; // nMoney = nMoney / 5
			} else {
				nMoney /= 2; // nMoney = nMoney /2
				
			}
			intSw = intSw * (-1);
		}
		System.out.println("===========================================================");
	}
}
