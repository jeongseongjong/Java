package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.biz.grade.domain.ScoreVO;
import com.biz.grade.domain.StudentVO;
import com.biz.grade.utill.StudentIDX;

public class StudentServiceV1 {
		//key,  value
	private Map<String,StudentVO> stdList;
	
	public StudentServiceV1() {
		stdList = new TreeMap<String,StudentVO>();
			
	}
	public Map<String, StudentVO> getStdList() {
		return this.stdList;
	}
	public void read(String stdFileName) throws Exception {
		FileReader fileReader;
		BufferedReader buffer;
		
		fileReader = new FileReader(stdFileName);
		buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null) break;
			
			String[] stds = reader.split(":");
			
			StudentVO stdVO = new StudentVO();
			stdVO.setNum(stds[ StudentIDX.NUM]);
			stdVO.setName(stds[StudentIDX.NAME]);
			stdVO.setTel(stds[ StudentIDX.TEL]);
			stdVO.setAddr(stds[StudentIDX.ADDR]);
			
			stdList.put(stds[StudentIDX.NUM], stdVO);
		}// while end
		buffer.close();
		fileReader.close();
	}//read end
	public void list() {
		Set<String> stdNums = stdList.keySet();
		System.out.println("=====================================================");
		System.out.println("학생명부");
		System.out.println("=====================================================");
		System.out.println("학번\t이름\t전화번호\t주소");
		System.out.println("-----------------------------------------------------");
		for(String key : stdNums) {
			// stdList <String,StudentVO> 형태의 자료가 저장되어 있기때문에
			// stdList.get("A001")형태로 값을 추출하면 추출된 데이터는 StudentVO type
			// 따라서 stdList.get(key) method가 return하는 값을 변수에 담으려면 
			// 변수 type이 StudentVO이어야 한다 
			StudentVO stdVO = stdList.get(key);
			System.out.print(stdVO.getNum()+"\t");
			System.out.print(stdVO.getName()+"\t");
			System.out.print(stdVO.getTel()+"\t");
			System.out.print(stdVO.getAddr()+"\n");
		}
		System.out.println("==================================================");
	}// list end
	
	// 학번으로 학생정보를 조회하는 method
	public StudentVO getStudent(String strNum) {
		
		return stdList.get(strNum);
		
	}
}
