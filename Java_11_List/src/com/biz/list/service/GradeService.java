package com.biz.list.service;

/*
 * interface(클래스)
 * 1. 메서스들을 정의하는 문장만 있다.
 * 2. 메서드는 실제 작동되는 코드가 한줄도 없다.
 * 3. 메서드는 코드를 작성하는 {} 가 없다.
 * 4. 혼자는 아무런 기능도 수행하지 않는다.
 * 
 * 5. 다른클래를 작성하는데 설계도 역할을 한다.
 * 6. 이 interface를 implement한 클래스는
 * 		여기에 정의된 method를 반드시 구현해야 한다.
 */
public interface GradeService {

	public void input(int size); // {}
	// 과목의 총점, 평균

	public void total();
	public void view();
}