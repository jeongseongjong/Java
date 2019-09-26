package com.biz.classes.string;

public class String_10 {

	public static void main(String[] args) {

		/*
		 * 1 부터 100까지 숫자 중에서 
		 * 7의 배수가 2번째로 나타나면
		 * 그 값을 표시하시오
		 */
		int nCount = 0;
		
		int intMax = 1000;
		
		int intMul = 21; // 배수
		int intSearch = 5; // 몇번째
		
		for(int i = 1 ; i < intMax ; i++ ) {
			
			if(i % intMul == 0) nCount ++;
			if(nCount == intSearch) {
			System.out.println(nCount + " : " + i );
			break;
		
			}
	
		}
	}
		/*
		 * 코드를 시작할 때
		 * 나중에 다른 용도로 활용할 것을 염두에 두고
		 * 하드 코딩하는 것보다는 변수를 활용하라
		 */
	
	
}
