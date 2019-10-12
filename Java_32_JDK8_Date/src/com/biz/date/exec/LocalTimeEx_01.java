package com.biz.date.exec;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalTimeEx_01 {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter fTime = DateTimeFormatter.ofPattern("hh:mm:ss"); // 12시기준
		
		String curTime = fTime.format(localTime);
		System.out.println(curTime);
		
		DateTimeFormatter f24Time = DateTimeFormatter.ofPattern("HH:mm:ss"); // 24시기준
		curTime = f24Time.format(localTime);
		System.out.println(curTime);
	}
}
