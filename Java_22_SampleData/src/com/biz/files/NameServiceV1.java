package com.biz.files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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
			System.out.println(reader);
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
			//  String fam ="";
			
			
			String[] fams = reader.split(":");
			//1번코드
			String fam = fams[1].substring(0,1);
			
			//2번코드
			String[] fams1 = fams[1].split("");
			fam = fams1[0];
			
			famList.add(fam);

			
			
			//System.out.println(famList01[0]);
		}
		buffer.close();
		fileReader.close();
		
		for(String s : famList) {
			System.out.println(s);
		}
		
		
		
	}

	@Override
	public void writeNameFile(String korNameFile) throws FileNotFoundException {

		Collections.shuffle(nameList);
		Collections.shuffle(famList);
		
		int nameSize = nameList.size();
		int famSize = famList.size();
		
		PrintWriter fileOut = new PrintWriter(korNameFile);
		
		String strName = "";
		// --------------------------------------
		// 1번코드
		for(int i = 0 ; i < 100 ; i++) {
			strName = famList.get(i) + nameList.get(i);
			System.out.println(strName);
		}
		
		
		//----------------------------------------
		// 2번코드
		Random rnd = new Random();
		for(int i = 0 ; i < 100 ; i ++) {
			strName = famList.get(rnd.nextInt(famSize));
			strName += nameList.get(rnd.nextInt());
			System.out.println(strName);
		}
		fileOut.close();
	}

}
