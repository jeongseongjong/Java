package com.biz.var;

public class Var_14 {

	public static void main(String[] args) {
		
		int dNum = 6;
		int cNum = 2;
		
		System.out.println("===========================");
		System.out.printf("구구단 %d 단",dNum);
		System.out.println("---------------------------");
		

		System.out.printf(" %d x %2d = %3d\n",
				dNum,
				cNum,
				dNum * cNum++);
		
		System.out.printf(" %d x %2d = %3d\n",   
				dNum,
				cNum,
				dNum * cNum);
		
		System.out.printf(" %d x %2d = %3d\n",
				dNum,
				++cNum,
				dNum * cNum++);
	}

}
