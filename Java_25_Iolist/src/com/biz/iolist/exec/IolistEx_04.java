package com.biz.iolist.exec;

import java.util.List;

import com.biz.iolist.service.BuyVO;
import com.biz.iolist.service.IolistService;

public class IolistEx_04 {

	public static void main(String[] args) {

		String strProWriteFile = "src/com/biz/iolist/상품정보.txt";
		
		IolistService ls = new IolistService();
		
		try {
			List<BuyVO> buyList = ls.getBuyList(strProWriteFile);
			IolistService is = new IolistService(buyList);
			is.(strProWriteFile);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
