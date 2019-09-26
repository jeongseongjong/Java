package com.biz.list.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.biz.list.model.IolistVO;

public class IolistServiceImp {

	//iolistVO.JAVA 묶임
	
	List<IolistVO> iolist;
	
	public IolistServiceImp() {
		iolist = new ArrayList<IolistVO>();
	}
	
	public void input() {
		
		IolistVO iolistVO;
		
		/*
		 * 4개의 매개변수를 세팅하면서 객체를 생성하는 방법
		 * 4개의 매개변수가 잇는 생성자가 작동되어
		 * 객체를 만든다.
		 */
		
		iolistVO = new IolistVO("2019-09-09", "14:00:01", "CJ 햇반", 1500);
		iolist.add(iolistVO);

		iolistVO = new IolistVO("2019-09-09", "14:00:02", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-09", "14:00:03", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-09", "14:00:04", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
		iolistVO = new IolistVO("2019-09-09", "14:00:05", "CJ 햇반", 1500);
		iolist.add(iolistVO);
		
	} // input() end
	
	public void input(int count) {
		
		IolistVO iolistVO;
		Random rnd = new Random();
		
		for(int i = 0 ; i < count ; i++) {
		
		String strTime = String.format("14:00:%02d", i);
		int intH= rnd.nextInt(5)+ 1 ;
		String strPname = String.format("일반미 %d 호", intH);
			
		int intQty = rnd.nextInt(30) + 10; // 10~39까지 난수
		
		/*
		 * 매개변수가 5
		 */
		
		iolistVO = new IolistVO("2019-09-09", strTime, strPname, 1000 * intH, intQty);
		iolist.add(iolistVO);
		}
		// setter메서드를 사용해야 할 경우가 있으면
		// 고전 for를 사용해야 한다.
		
	
	}
	public void total() {
			
			for(IolistVO vo : iolist) {
				int intTotal = vo.getIntPrice() * vo.getIntQty();
				vo.setIntTotal(intTotal);
			}
			int nSize = iolist.size();
			for(int i = 0 ; i < nSize ; i++) {
				IolistVO vo = iolist.get(i);
				int intTotal = vo.getIntPrice() * vo.getIntQty();
				vo.setIntTotal(intTotal);
				
			
				
			}
		}
	public void list() {
		System.out.println("============================================================");
		System.out.println("거래내역");
		System.out.println("============================================================");
		System.out.println("일자\t시각\t상품명\t단가\t수량\t합계");
		System.out.println("------------------------------------------------------------");
		for(IolistVO vo : iolist) {
			System.out.print(vo.getStrDate() + "\t");
			System.out.print(vo.getStrTime() + "\t");
			System.out.print(vo.getStrPname() + "\t");
			System.out.print(vo.getIntPrice() + "\t");
			System.out.print(vo.getIntQty() + "\t");
			System.out.println(vo.getIntQty()*vo.getIntPrice() + "\n");
		}
		System.out.println("=============================================================");
	}
}
