package com.biz.arrays.model;

public class ScoreVO {

	public String strNum; // 학번
	public int intKor; // 국어점수
	public int intEng; // 영어점수
	public int intMath; // 수학점수
	

	// public, private 키워드를 접근 제한자라고 한다.
	// public 다른 클래스에서 자유롭게 값을 읽기, 쓰기가
	// 가능하도록 개방하겠다 라는 의미
	
	
	// private : 현재 클래스(ScoreVO)에서만
	// 값을 읽기, 쓰기가 가능하도록 제한하겠다 라는 의미
	// 		외부의 어떤 코드에 이 값들을 변경하거나
	//	 	읽어서 사용하지 못하도록 하겠다.
	private int intSum; // 총점
	private int intAvg; // 평균
	private int intRank; // 석차

	public void add() {
		int num = 100 + 200 + 300 ;
	}
	
	public int add_ret() {
		int num = 100 + 200 + 300;
		return num;
	}
	
	/*
	 * return type : int형
	 * 1. 3과목의 점수를 덧셈하여 intStum 맴버변수에 저장
	 * 2. intSum 맴버변수는 private으로 제한이 된 상태이다.
	 * 		외부에서 과목 총점을 읽을 수 없는 상태이다.
	 * 3. 그래서 sum() method가 대신 
	 * 		intSum 변수 값을 외부로 return 해 준다.
	 * 4. 외부에서는 sum() method가 return 해준 값을
	 * 		받아서 필요한 곳에서 처리하면 된다.
	 * 
	 * 5. intSum 맴버변수는 3과목의 점수를 덧셈한 값을
	 * 		가지고 있어야 의미(필요)가 있는 변수이다.
	 * 		intSum 맴버변술르 직접 접근하여 값을 읽을 경우
	 * 		과목 접수가 합산되지 않아 0이 저장되어 있을 
	 * 		가능성도 있다.
	 * 		아주작은 확률이지만 실제 필요하지 않은 0의
	 * 		값을 읽는 것은
	 * 		코드 실행과정에서 논리적 오류가 날 수 있다.
	 * 6. 이럴경우 intSum 변수를 외부로부터 격리하고 
	 * 		반드시 intSum 변수에 과목점수가 합산된 결과만	
	 *  	외부에서 조회할 수 있도록 해야 한다.
	 *  7. intSum을 private으로 제한하여
	 *  	가. 외부에서 직접 접근 금지
	 *  	나. sum() method를 통해서 intSum을
	 *  		return 하도록 작성
	 *  	다. sum() method에서는 return문을 실행하기 전에
	 *  		과목점수를 합산하여 intSum에 저장
	 *  
	 *  == 정보의 은닉, 캡슐화
	 */
	public int sum() {
		intSum = intKor + intEng + intMath ;
		return intSum;
		

		
	}
	
	
	/*
	 * ScoreVO에 맴버변수인 
	 * intSum은 
	 * 입력된 과목점수에 의해
	 * 계산되어서 값을 보관하는 변수이다.
	 * intSum을 계산하기 위해 sum() 메서드를 생성해 두었다.
	 * 
	 * 하지만,
	 * intSum을 public으로 선언해 두면
	 * sum()메서드를 호출하지 않고
	 * intSum 값을 읽었을때
	 * 0의 값이 읽혀지고 sum() 메서드는
	 * 아무런 의미가 없는 코드가 된다.
	 * 
	 * 그래서
	 * intSum을 private으로 선언하고
	 * 반드시 sum() 메서드가 실행된 후에
	 * intSum을 외부에서 읽도록 해두어야 한다.
	 */
}
