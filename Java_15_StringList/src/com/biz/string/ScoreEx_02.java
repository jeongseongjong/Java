package com.biz.string;

import com.biz.string.service.ScoreServiceV2;
import com.biz.string.service.StringService;

public class ScoreEx_02 {

	public static void main(String[] args) {
		StringService scService = new ScoreServiceV2();
		
		scService.input();
		scService.list();
	
	}
}
