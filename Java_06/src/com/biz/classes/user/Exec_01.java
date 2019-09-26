package com.biz.classes.user;

public class Exec_01 {

	public static void main(String[] args) {

		/*
		 * 30과 40 두수의 덧셈을 계산하여
		 * 콘솔에 보여주는 코드를
		 * User_01 클래스에 add() method를 생성하고
		 * 그 곳에 작성을 한후
		 * 
		 * main() method에서는
		 * User_01.add() method를 호출하여
		 * 실행한다.
		 * 
		 * method()
		 * 여러개의 명령어, 명령문 들을
		 * 하나의 명령어를 사용하는 것처럼
		 * 쓸 수 있도록 하는 기능
		 */
		User_01.add();
		
		/*
		 * User_02.add() method를 5번 호출
		 */
		for(int i = 0 ; i < 5 ; i++) {
			User_02.add();
		}
	}

}
