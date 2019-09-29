package com.biz.bjack.exec;

import com.biz.bjack.service.BJackService;

public class BJackEx_02 {

	public static void main(String[] args) {

		BJackService bs = new BJackService();

		bs.makeDeck();
		bs.viewCardList();
	}
}
