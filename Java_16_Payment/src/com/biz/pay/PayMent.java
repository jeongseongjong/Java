package com.biz.pay;

/*
 * 화ㅖ매수 계산
 */
public class PayMent {

	public static void main(String[] args) {

		int pay = 3785870;
		int mo = 50000;

		// 5만원권 매수
		int count = (int) (pay / mo); // -> 5만원권 매수
		System.out.println(mo + "원 권 : " + count);
		pay = pay - count * mo; // -> 5만원권매수를 제외한 금액

		// 만원권 매수
		mo = mo / 5; // -> 1만원
		count = (int) (pay / mo); // -> 1만원권 매수
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 만원권매수 제외한 금액

		// 5천원권 매수
		mo = mo / 2; // ->5천원권
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 5천원권매수 제외한 금액

		mo = mo / 5;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 천원권매수 제외한 금액

		mo = mo / 2;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 오백원권 매수 제외한 금액

		mo = mo / 5;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 백원권 매수 제외한 금액

		mo = mo / 2;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 오십원권 매수 제외한 금액

		mo = mo / 5;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 십원권 매수 제외한 금액

		mo = mo / 2;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 오원권 매수 제외한 금액

		mo = mo / 5;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> 일원권 매수 제외한 금액

		mo = mo / 2;
		count = (int) (pay / mo);
		System.out.println(mo + "원권 : " + count);
		pay = pay - count * mo; // -> ?원권 매수 제외한 금액

	}
}
