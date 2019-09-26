package com.biz.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class NameServiceV1 implements NameService {

	List<String> nameList;
	List<String> famList;
	
	// 클래스 이름과 같은이름의 method이고
	// return type이 없다(void, int...등이 있어야 return)
	public NameServiceV1() {
		nameList = new ArrayList<String>() ;
		famList = new ArrayList<String>();
			
		}
	public void readNameList(String nameFile) throws Exception{
		
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(nameFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			nameList.add(reader);
		}
		buffer.close();
		fileReader.close();
		
		
	}

	@Override
	public void readFamList(String famFile) throws Exception {

		FileReader fileReader ;
		BufferedReader buffer;
		
		fileReader = new FileReader(famFile);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			// reader에서 한글성씨만 추출
			// String fam ="";
			
			String[] fam = reader.split(":");
			
		//	String fam = fams[1].substring(0,1);

			String s0 = fam[0];
			String s1 = fam[1];
			String s2 = fam[2];
			String[] famList01 = fam[1].split("");
			famList.add(famList01[0]);
			
			//System.out.println(famList01[0]);
		}
		buffer.close();
		fileReader.close();
		
		
		
	}

	@Override
	public void writeNameFile(String korNameFile) {

		
	}

}
