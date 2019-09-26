package com.biz.classes.model;

public class AddressVO__Main01 {

	public static void main(String[] args) {
		
		AddressVO_01 addVO01 = new AddressVO_01();
		
		addVO01.strName = "AAA";
		addVO01.intTel = 1111;
		addVO01.strAdd = "Sinandong";
		addVO01.strComu = "brother";
		
		AddressVO_01 addVO02 = new AddressVO_01();
		
		addVO02.strName = "BBB";
		addVO02.intTel = 2222;
		addVO02.strAdd = "Joongheungdong";
		addVO02.strComu = "sister";
		
		AddressVO_01 addVO03 = new AddressVO_01();
		
		addVO03.strName = "CCC";
		addVO03.intTel = 3333;
		addVO03.strAdd = "Dalmadong";
		addVO03.strComu = "father";
		
		addVO01.view();
		System.out.println("====================");
		addVO02.view();
		System.out.println("====================");
		addVO03.view();
		
		
	}
}
