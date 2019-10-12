package com.biz.pay.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PayReadVO;

public class PaperReadServiceV1  { 
	List<String> payList;
	
	public PaperReadServiceV1() {
		payList = new ArrayList<String>();
	}
	
	public void read(String payList) throws IOException {
		
		FileReader fileReader = new FileReader(payList);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		
		while(true) {
			
			String reader = buffer.readLine();
			String[] filePay = reader.split(":");
			if(reader == null)break;
			
			String filePays = String.format("%s:%s", filePay[0], filePay[1]);
			
			
			
			PayReadVO vo = new PayReadVO();
			vo.setNum(Integer.valueOf(filePay[0]));
			vo.setPay(Integer.valueOf(filePay[1]));
			
			payList.add(vo);
		
		}
		buffer.close();
		fileReader.close();
	}

	@Override
	public void list() {

		System.out.println("==============================");
		System.out.println("사원번호\t\t\t\t급여");
		System.out.println("------------------------------");
		for(PayReadVO pVO : payList) {
			System.out.println(pVO.getNum()+"\t");
			System.out.println(pVO.getPay()+"원\n");
		}
		System.out.println("===============================");
		
		
		
	}

}
