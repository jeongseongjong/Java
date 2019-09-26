package com.biz.classes.string;

public class String_11 {

	public static void main(String[] args) {

		/*
		 * 0 부터 100까지 숫자 중에서 
		 * 7의 배수가 2번째로 나타나면
		 * 그 값을 표시하시오
		 */
		int nCount = 0;
		for(int i = 1 ; i < 100 ; i++ ) {
			if(i%7 == 0) nCount ++;
				// System.out.println(i);
			if(nCount == 2) {
				System.out.println(nCount + " : " + i );
				break;
		
			}
	
		}
	}
	/*
	 * Hard Coding : 1개의 경우만 사용할 수 있는 코드
	 * 
	 * 이 코드에서 7의 배수가 2번째 나타나는 경우라고 정의하여
	 * 7과 2의 값을 고정된 숫자로 사용했다.
	 * 
	 * 만약 이 코드를 8의 배수가 5번째 나타나는 경우로
	 * 변경 하고자 할 경우
	 * 코드 중간에 있는 7->8, 2->5로 변경해야 한다.
	 * 
	 * 코드를 다른 용도로 사용하고자 할때
	 * 썩 아름다운 코드가 아니다.
	 */
}
