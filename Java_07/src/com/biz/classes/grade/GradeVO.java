package com.biz.classes.grade;

/*
 * dynamic class다 라고 정의를 하는데
 * dynamic 이라는 의미로 해석하면
 * 어려움이 있다.
 * static이 아닌 class다 라고 이해를 하자.
 */
public class GradeVO {

	/*
	 * 객체의 정의
	 * 1. 연산을 통해서 얻을 수없는 데이터들을
	 *	  (학번, 이름, 과목점수 들)
	 *    변수로 정의
	 * 	  ==> 맴버변수라고 한다.
	 * 
	 * 2.맴버변수를 기초로하여 연산을 통해서
	 *   얻을 수 있는 항목들을 위하여
	 *   method()를 정의
	 *   (일부 맴버 메서드라고도 한다.)
	 * 
	 * 3. 처리하고자 하는 대상(데이터...)을 객체로 정의하는
	 *    단계를 '추상화'라고 한다.
	 *    추상화는 객체지향 언어를 이용한 프로그래밍에서
	 *    매우 중요한 개념이다.
	 * 
	 */
	//맴버변수 들
	public String strNum;
	public String strName;
	public int intKor;
	public int intEng;
	public int intMath;


	
	public void gradeList() {
		// %d : 정수(int, long)
		// %f : 실수(float, double)
		// %c : 문자(char)
		// %s : 문자열(String)
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\n",
				strNum,
				strName,
				intKor,
				intEng,
				intMath,
				intKor + intEng + intMath);
	}
		public void sum() {
			
			int sum = intKor + intEng + intMath;
			System.out.println("총점 : " + sum);
			System.out.println("총점 : " + sum/3);
			
	}
	
}
