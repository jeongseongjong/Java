package com.biz.pay.service;

import java.text.DecimalFormat;

public class PayServiceV2 extends PayServiceV1 {
	protected int nMoney = 50000;
	protected DecimalFormat paperForm = new DecimalFormat("###,###,###,###");
	/*
	 * PayServiceV1에서 작성된 array(int nPay) method도 사용할 수 있다.
	 */

	public void whilePay(int nPay) {

		int intSw = 0;

		this.headerView(nPay);
		while (true) {

			if (nPay < 5)
				break;

			int nCount = nPay / nMoney; // 매수계산
			nPay -= nCount * nMoney; // nPay= nCount * nMoney - nPay
			System.out.printf("%8s 원권 %4d매\n", paperForm.format(nMoney), nCount);

			if (intSw == 0) {
				nMoney /= 5; // nMoney = nMoney / 5
				intSw = 1;
			} else {
				nMoney /= 2; // nMoney = nMoney /2
				intSw = 0;

			}
		}
		System.out.println("===========================================================");
	} // end whilePay()

	protected void headerView(int nPay) {

		DecimalFormat payform = new DecimalFormat("###,###,###,###");
		String strPay = payform.format(nPay);

		System.out.println("=======================================================");
		System.out.printf("급여 수령액 : %s\n", strPay);
		System.out.println("=======================================================");
	}
}
