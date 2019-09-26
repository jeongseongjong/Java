package com.biz.classes.model;

public class Prime_03 {

	// 2~100까지 숫자중 소수들의 리스트 보기
	public static void main(String[] args) {
		
		for(int i = 2; i <= 100 ; i++) {
			
			// 2부터 i-1까지 각각의 수로 i값을 나누어
			// 나머지가 한번도 0이 아니면 소수
			int index;
			for (index = 2; index < i ; index++) {
				if(i % index == 0) break;
			}
			if(index >= i )
				System.out.println("Prime : " + i);
			
		}

	}
}
