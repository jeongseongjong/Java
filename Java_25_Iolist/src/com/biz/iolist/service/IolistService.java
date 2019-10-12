package com.biz.iolist.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class IolistService {

	
	protected List<String> proList;
	protected List<BuyVO> buyList;
	
	Random rnd = new Random();
	
	
	
	/*
	 * 상품정보.txt 파일을 읽어서
	 * 임의 상품정보를 추출
	 * 상품매입정보 생성
	 * 1. 날짜 : 2019-09-26
	 * 2. 단가 : 상품단가 - 부가세
	 * 3. 부가세 : 상품단가 - 단가
	 * 4. 수량 : 10 ~ 100 랜덤
	 * 5. 합계 : 단가 x 수량
	 * 
	 * 생성된 상품매입정보를 20개 생성하여 
	 * buyList에 추가하기
	 */
	public void buyMake() throws Exception{
		
		Random rnd = new Random();
		int nSize = proList.size();
		
		
		for(int i = 0 ; i < 20 ; i++) {
			
			// proList개수의 범위내에서 정수 1개를 임의생성
			int index = rnd.nextInt(nSize);
			
			// 임의 상품정보 추출
			String strProduct = proList.get(index);
			
			String[] pros = strProduct.split(":");
			//pros[0] 상품명
			//pros[1] 단가
			
			BuyVO bVO = new BuyVO();
			bVO.setProName(pros[0]);
			
			// 상품정보에 있는 금액을 일단bVO의 price에 담기
			bVO.setrPrice(Integer.valueOf(pros[1]));
			
			int intPrice = Integer.valueOf(pros[1]);
			intPrice = (int)(intPrice / 1.1); // 부가세 별도금액 계산
			int intVat = intPrice - bVO.getPrice();
			
			int intQty = rnd.nextInt(90) + 10;
			int intTotal = intPrice * intQty;
			
			bVO.setVat(intVat);
			bVO.setQty(intQty);
			bVO.setTotal(intTotal);
			
			// buyList에 담기
			buyList.add(bVO)
			;
		}
		
	}
	public List<BuyVO> getBuyList (String proWriteFile) throws Exception{
		
		
		
		PrintWriter fileOut = new PrintWriter(proWriteFile);
		for(BuyVO pro : buyList) {
			fileOut.println(pro);
			
			
			}
		fileOut.close();
		return buyList ;
	}
	/*
	 * 상품정보 파일을 읽어서 상품이름 : 가격 형식의 문자열 리스트 생성하는 곳
	 * proList에는 다음과 같은 문자열들이 리스트로 만들어져 있을것이다.
	 * 		상품이름 : 가격
	 */

	public void readeProduct(String proWriterFile) throws Exception{
		
		proList = new ArrayList<String>();
		FileReader fileReader = new FileReader(proWriterFile);
		BufferedReader buffer = new BufferedReader(fileReader);
		
		String reader = new String();
		while(true) {
			reader = buffer.readLine();
			if(reader == null)break;
			
			if(reader.length() < 1) continue;
			
			proList.add(reader);
		}
		buffer.close();
		fileReader.close();
	}
	public void setProIoList(List<BuyVO> buyList) {
		this.buyList = buyList;
		
	}
	
	
}


/*
 * System.out.println("---------------------------------------------------------");
		BuyVO buyVO = new BuyVO();
		
		LocalDate localDate = LocalDate.now();
		DateTimeFormatter df = 
				DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String proDate = localDate.format(df);
		
		buyVO.setPrice(buyVO.getrPrice() - buyVO.getVat());
		buyVO.setVat(buyVO.getrPrice() / 10);
		
		
		for(BuyVO vo : buyList) {
			vo.setDate("yyyy-09-26");
		}
			for(String pro : proList) {
			
			String[] pros = pro.split(":");
			//pros[0] 상품명
			//pros[1] 단가
			
			BuyVO bVO = new BuyVO();
			bVO.setProName(pros[0]);
			bVO.setrPrice(Integer.valueOf(pros[1]));
			
			// int intPrice = 0;
			int intrPrice = bVO.getrPrice();
			int intVat = intrPrice / 10;
			int intPrice = bVO.getrPrice() - bVO.getVat();
			// int intQty = 0 ;
			int intQty = rnd.nextInt(90) + 11;
			int intTotal = intPrice * intQty;
			
			bVO.setPrice(intPrice);
			bVO.setVat(intVat);
			bVO.setQty(intQty);
			bVO.setTotal(intTotal);
			
			// buyList에 담기
			buyList = new ArrayList<BuyVO>();
			buyList.add(bVO)
			;
		}
 */








