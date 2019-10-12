package com.biz.pay.exec;

import com.biz.pay.domain.PaperVO;

public class PayEx_01 {

	public static void main(String[] args) {
		
		int pay = 3758750;
		String[] count = { "50000:10000:5000:1000:500:100:50:10"};
		
		for( int i = 0 ; i < count.length ; i++) {
			String[] vo = count[i].split(":");
			
			int moneys = pay / Integer.valueOf(vo.length) ;
			pay = pay - Integer.valueOf(vo.length) * moneys;
			System.out.println(Integer.valueOf(vo.length) + "원권" + moneys + "장");
		}
		
		int 급여 = 3758750;
		int 권명 = 50000;
		int sw = -1;
		while(true) {
			if(급여 < 5)break;
			
			int 매수 = (int) (급여 / 권명);
			System.out.printf("%d 원권 : %d", 권명, 매수);
			급여 -= (매수 * 권명);
			if(sw > 0) {
				권명 /= 5;
			}else {
				권명 /= 2;
			}
			sw *= (-1);
		}
		
	}
}
