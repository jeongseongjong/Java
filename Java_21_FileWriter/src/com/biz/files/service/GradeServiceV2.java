package com.biz.files.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GradeServiceV2 extends GradeServiceV1 {

	protected List<String> nameList ;

	public GradeServiceV2() {
		nameList = new ArrayList<String>();
	}
	
	// nameFile을 읽어서 nameList를 생성
	// 
	@Override
	public void readNameFile(String nameFile) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			nameList.add(reader);
			System.out.println(reader);
			
		}
		buffer.close();
		fileReader.close();
		this.nameList();
	}
	
	private void nameList() {
		for(String s : nameList) {
			System.out.println(s);
		}
	}

	// nameList에서 length 개수만큼의 리스트 보이기
	// A0001, 이름 형식으로 리스트를 보이도록
	@Override
	public void makeStudentFile(String studentFile, int length) throws Exception {
		
		Random rnd = new Random();
		
		PrintWriter fileOut;
		
		fileOut = new PrintWriter(studentFile);
		
		int num = 0 ;
		// for(String s : nameList) {
		for(num = 0 ; num < length; num++) {
			String strNum = String.format("A%03d:",num +1);
			int tel1st = rnd.nextInt(9999) +1 ; // 1~9999 중 1개의 숫자
			int tel2nd = rnd.nextInt(9999) +1 ; // 1~9999 중 1개의 숫자
			
			String strTel = String.format("010-%04d-%04d", tel1st, tel2nd);
			
			int intYear = rnd.nextInt(100) + 1980; // 1980~1899 중 1개의 숫자
			int intMonth = rnd.nextInt(12) +1 ; // 1~12 중 1개의 숫자
			int intDay = rnd.nextInt(28) +1; // 1~28까지
			
			String strBirth = String.format("1993-%02d-%02d", 
					intMonth,
					intDay);
			// console에 보이기
			System.out.printf("%s\t%s\t%s\t%s\n", 
					strNum, 
					nameList.get(num), 
					strTel,
					strBirth);
			
			// 파일에 기록하기
			fileOut.printf("%s:%s:%s:%s\n", 
					strNum, 
					nameList.get(num), 
					strTel,
					strBirth);
			fileOut.flush();
			
		}
		fileOut.close();
		
		
	}
}
