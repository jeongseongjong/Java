package com.biz.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class NameServiceV2 extends NameServiceV1 {
	List<String> korNameList;

	public NameServiceV2() {

		korNameList = new ArrayList<String>();

		// Collections.sort(), suffle등을 사용할때는
		// LinkedList로 초기화 하는것이 효율적이다.
		korNameList = new LinkedList<String>();

	}

	@Override
	public void writeNameFile(String korNameFile) throws FileNotFoundException {

		Random rnd = new Random();
		int nameSize = nameList.size();
		int famSize = famList.size();

		System.out.println("=============================");
		System.out.printf("이름표 작성 시작 : %d\n", 
				System.currentTimeMillis());
		
		for (int i = 0; i < 1000; i++) {
			String strName = famList.get(rnd.nextInt(famSize));
			strName += nameList.get(rnd.nextInt(nameSize));

			korNameList.add(strName);
		}
		System.out.println("----------------------------");
		System.out.printf("List 작성 완료 : %d\n",
				System.currentTimeMillis());
		Collections.sort(korNameList);
		System.out.println("----------------------------");
		System.out.printf("정렬완료 : %d\n",
				System.currentTimeMillis());
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		for(String s : korNameList) {
			fileOut.print(s);
		}
		fileOut.close();
		
		System.out.println("----------------------------");
		System.out.printf("모두완료 : %d\n",
				System.currentTimeMillis());
	}

}
