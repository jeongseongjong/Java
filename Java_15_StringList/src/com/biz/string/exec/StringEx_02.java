package com.biz.string.exec;

public class StringEx_02 {

	public static void main(String[] args) {
		
		String[] nameList = new String[] {
				"AAA : 001 : 01",
				"BBB : 002 : 02",
				"CCC : 003",
				"AAA : 001 : 01",
				"BBB : 002 : 02",
				"CCC : 003",
				"AAA : 001 : 01",
				"BBB : 002 : 02",
				"CCC : 003",
		};
		
		int nCount = 0 ;
		for(String s : nameList) {
			try {
				String[] names = s.split(" : ");
				
				System.out.println("이름 : " + names[0]);
				System.out.println("학번 : " + names[1]);
				System.out.println("나이 : " + names[2]);
				
			} catch (Exception e) {
				System.out.println("Exception 발생");
				System.out.printf("%d 번 데이터\n", nCount++);
			}
			nCount ++;
		}
	}
}
