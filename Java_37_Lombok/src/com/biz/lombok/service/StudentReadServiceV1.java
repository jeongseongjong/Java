package com.biz.lombok.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.biz.lombok.domain.StudentVO;

public class StudentReadServiceV1 {

	private List<StudentVO> stdList;

	public List<StudentVO> getStdList() {
		return this.stdList;
	}

	/*
	 * 파일로부터 학생정보를 읽어서 stdList에 저장
	 */
	FileReader fileReader;
	BufferedReader buffer;

	public void readStudent(String fileName) throws Exception {
		fileReader = new FileReader(fileName);
		buffer = new BufferedReader(fileReader);

		while (true) {
			String reader = buffer.readLine();
			if (reader == null)
				break;
			System.out.println(reader);
		}
		buffer.close();
		fileReader.close();
	}
}
