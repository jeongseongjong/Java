package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.GradeVO;

public class GradeServiceImp_01 implements GradeService{

	private List<GradeVO> gradeList;

	Random rnd;

	public GradeServiceImp_01() {
		// 리스트를 사용할 수 있도록 생성
		gradeList = new ArrayList<GradeVO>();

		rnd = new Random();

	}

	// GradeVO를 gradeList에 추가하는 코드
	// input() method 를 호출할 때
	// 생성할 리스트 개수를 보내주면
	// 개수를 size 변수에 받고
	// 그 개수만큼 생성해서 gradeList에 추가
	public void input(int size) {

		for (int i = 0; i < size; i++) {

			// 데이터 생성
			String strNum = String.format("%05d", (i + 1));
			int intKor = rnd.nextInt(50) + 51;
			int intEng = rnd.nextInt(50) + 51;
			int intMath = rnd.nextInt(50) + 51;

			// 2. VO를 작성
			GradeVO gVO = new GradeVO();
			gVO.strNum = strNum;
			gVO.intKor = intKor;
			gVO.intEng = intEng;
			gVO.intMath = intMath;

			// 3. VO를 List에 추가
			gradeList.add(gVO);

		}
	}// intput() end
		// 과목의 총점, 평균

	public void total() {
		int nSize = gradeList.size();
		for (int i = 0; i < gradeList.size(); i++) {

			// gradeList의  i 번째에 저장되어 있는
			// gVO의 intKor 값을 읽어서
			// total 변수에 복사
			
			int total = gradeList.get(i).intKor;
			
			// gradeList의 i 번째에 저장되어 있는
			// gVO intEng 값을 읽어서
			// total에 저장된 값과 더하여
			// 다시 total에 저장하라
			total += gradeList.get(i).intEng;
			
			total += gradeList.get(i).intMath;

			
			// gradeList의  i 번째에 저장되어 있는
			// gVo intTotal 맴버변수에
			// total 변수에 저장된 값을 복사하라
			gradeList.get(i).intTotal = total;
			
			// gradeList의  i 번째에 저장되어 있는
			// gVo intAvg 맴버변수에
			// total / 3 값을 계산하여 저장하라
			gradeList.get(i).intAvg = total / 3;

		}
	}

	

	public void view() {

		System.out.println("==============================================");
		System.out.println("성적일람표");
		System.out.println("==============================================");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t석차\n");
		System.out.println("----------------------------------------------");
		for (GradeVO vo : gradeList) {
			System.out.printf("%5s\t", vo.strNum);
			System.out.printf("%3d\t", vo.intKor);
			System.out.printf("%3d\t", vo.intEng);
			System.out.printf("%3d\t", vo.intMath);

			System.out.printf("%3d\t", vo.intTotal);
			System.out.printf("%3d\t", vo.intAvg);

			System.out.printf("%3d\n", vo.intRank);
		}

		System.out.println("=============================================");
	}

}
