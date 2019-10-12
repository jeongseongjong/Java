package com.biz.pay.service;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.pay.domain.PaperVO;

public class PaperPrintServiceV1 {

	PayReadServiceV1 pr;
	PaperMakeServiceV1 pm;
	List<List<PaperVO>> paperAllList;
	
	String payFile;
	
	public PaperPrintServiceV1() {

		pr = new PayReadServiceV1();
		pm = new PaperMakeServiceV1();
	}
	
	// PaperPrintServiceV1 pp == new PaperPrintServiceV1("pay.txt");
	public PaperPrintServiceV1(String payFile) {
		this(); // 기본생성자를 호출하라
		this.payFile = payFile;
		
	}
	
	// pp.setPayFile("pay.txt");
	public void setPayFile(String payFile) {
		
		this.payFile = payFile;
	}
	
	public void printPaper() throws Exception {
		String payPath = "src/com/biz/pay/";
		
		for(List<PaperVO> paperList : this.paperAllList) {
			
			PrintWriter fileOut = new PrintWriter(payPath + paperList.get(0).getMemeber());
			
			fileOut.println("============================================");
			fileOut.print("사원번호 : " + paperList.get(0).getMemeber());
			fileOut.println(", 급여액 : " +paperList.get(1).getMemeber());
			fileOut.println("--------------------------------------------");
			
				 for(PaperVO pVO : paperList) {
					 fileOut.printf("%s\t%d\n",pVO.getPaper(),pVO.getCount());

			}
				 fileOut.close();
		}
	}
	public void viewPaper() throws Exception {
		
		for(List<PaperVO> paperList : this.paperAllList) {
		
			System.out.println("============================================");
			System.out.print("사원번호 : " + paperList.get(0).getMemeber());
			System.out.println(", 급여액 : " +paperList.get(1).getMemeber());
			System.out.println("--------------------------------------------");
			
			 for(PaperVO pVO : paperList) {
				 System.out.printf("%s\t%d\n",pVO.getPaper(),pVO.getCount());
			}

		}

	}
	public void makePaperList() throws Exception {
		
		pr.readPay(this.payFile);
		List<String> payStrList = pr.getPayStrList();
		paperAllList= new ArrayList<List<PaperVO>>();
		
		// payStrList는 문자열(String)을 담고있는 List 형 이기때문에
		// for 반복문을 이용해서 한개씩 추출
		
		for(String pay : payStrList) {
			// 사번 : 급여 형식의 문자열 형식이 들어있다.
			String[] pays = pay.split(":");
			
			int intPay = Integer.valueOf(pays[1]);
			
			pm.make(intPay);
			// pm.getPaperList();
			List<PaperVO> paperList = pm.getPaperList();
			paperList.get(0).setMemeber(pays[0]);
			paperList.get(1).setMemeber(pays[1]);
			
			paperAllList.add(paperList);
			
				
		}
	}
	
}
















