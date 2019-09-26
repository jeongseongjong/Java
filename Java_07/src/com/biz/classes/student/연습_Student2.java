package com.biz.classes.student;
	
	public class 연습_Student2 {
		public String strNum;
		public String strName;
		public int intYear;
		public String strMajor;
	
	public void viewInfo() {
		System.err.println("학번 : " + strNum);
		System.err.println("이름 : " + strName);
		System.err.println("년도 : " + intYear);
		System.err.println("전공 : " + strMajor);
		System.out.println("학년 : "+ (2019 - intYear));
}
	public void list() {
		System.out.printf("%s\t%s\t%d\t%s\t%d\n"
				,strNum
				,strName
				,intYear
				,strMajor
				,2019-intYear);
	}

}
