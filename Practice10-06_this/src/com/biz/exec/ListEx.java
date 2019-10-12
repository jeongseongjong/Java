package com.biz.exec;

import com.biz.service.ListVO;

public class ListEx {

	public static void main(String[] args) {
	
		ListVO[] vo = new ListVO[10];
		
		for(int i = 0 ; i < vo.length ; i++) {
			vo[i] = new ListVO();
			
		}
		vo[0].setKor(90);
		vo[1].setEng(80);
		vo[2].setMath(70);
		
		int sum = vo[0].getKor();
		sum += vo[1].getEng();
		sum += vo[2].getMath();
		
		System.out.printf("%d", sum);
		
		
		
		
		
	}
}
