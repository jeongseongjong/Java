package com.biz.pay.service;

public class PayServiceV4 extends PayServiceV2 {

	@Override
	public void whilePay(int nPay) {

		this.headerView(nPay);
		int intSw = 1;

		/*
		 * 조건문(if, while, for)를 코딩할 때
		 * 부등호(< >)와 EQ(=)를 같이(=< , >=) 사용해야할 조건문을
		 * 부등호만 사용해서 만들 수 있다면 부등호만 써라
		 */
		while (true) {

			// if (nPay < 5) break;

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
	}
}