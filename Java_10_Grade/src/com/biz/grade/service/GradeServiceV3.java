package com.biz.grade.service;

import java.util.Scanner;

public class GradeServiceV3 {

	private int[] intKor;
	private int[] intEng;
	private int[] intMath;

	private int[] sum;
	private int[] avg;

	private Scanner scan;

	// 생성자(메서드)만들기
	// public으로 선언
	// 메서드 이름은 클래스 이름과 같게
	// return type이 없다.
	// (void, int, String 등등 키워드 붙이지 못함)
	public GradeServiceV3(int length) {

		// 여기에서 4의 맴버배열변수들을 사용할 수 있도록
		// 생성하는 일(연산)을 수행
		intKor = new int[length];
		intEng = new int[length];
		intMath = new int[length];

		sum = new int[length];

		scan = new Scanner(System.in);

	} // GradeService() end

	public void input() {

		for (int i = 0; i < intKor.length; i++) {
			this.inputKor(i);
			this.inputEng(i);
			this.inputMath(i);
			this.total(i);
		}
	} // input () end

	// private
	// 이 method는 GradeServiceV2 클래스에 같이 있는
	// method에서만 호출할 수있다.
	private void inputKor(int index) {
		System.out.print((index + 1) + "번 국어 >> ");
		this.intKor[index] = Integer.valueOf(scan.nextLine());

	}

	private void inputEng(int index) {
		System.out.print((index + 1) + "번 영어 >> ");
		this.intEng[index] = Integer.valueOf(scan.nextLine());

	}

	private void inputMath(int index) {
		System.out.print((index + 1) + "번 수학 >> ");
		int intMath = Integer.valueOf(scan.nextLine());
		this.intMath[index] = intMath;

	}

	private void total(int index) {
		int intTotal = this.intKor[index];
		intTotal += this.intEng[index];
		intTotal += this.intMath[index];

		this.sum[index] = intTotal;

	}

	public void view() {
		System.out.println("===========================");
		System.out.println("성적 일람표");
		System.out.println("---------------------------");
		System.out.println("국어\t영어\t수학\t총점");
		for (int i = 0; i < intKor.length; i++) {
			System.out.printf("%d\t%d\t%d\t%d\n", this.intKor[i], this.intEng[i], this.intMath[i], this.sum[i]);
		}
		System.out.println("===========================");
	} // view() end

	// 총점 점수를 기준으로 내림차순 정렬을 하자
	// 총점 점수를 기준으로 내림차순 정렬을 수행했더니
	// 총점은 잘 정렬이 되어있는데,
	// 과목점수와 총점의 점수순서가 뒤죽박죽이 되었다.

	// 원인은
	// 총점은 순서를 바꾸면서
	// 각 과목의 순서는 고려하지 않아서 발생한 문제

	// 총점의 순서를 바꾸면서 과목의 순서를 바꾸는
	// 코드로 변경을 하자
	public void sort() {
		for (int i = 0; i < sum.length; i++) {
			for (int j = i + 1; j < sum.length; j++) {

				// 내림차순 정렬
				if (sum[i] < sum[j]) {

					// 배열의 두 요소에 저장된 총점을
					// 서로 바꾸는 코드
					int _temp = sum[i];
					sum[i] = sum[j];
					sum[j] = _temp;

					// 국어점수
					_temp = intKor[i];
					intKor[i] = intKor[j];
					intKor[j] = _temp;

					// 영어점수
					_temp = intEng[i];
					intEng[i] = intEng[j];
					intEng[j] = _temp;

					// 수학점수
					_temp = intMath[i];
					intMath[i] = intMath[j];
					intMath[j] = _temp;
				}
			}
		}
	}
}
