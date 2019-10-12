package com.biz.date.exec;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateEx_01 {

	public static void main(String[] args) {
		
		/*
		 * Date, Calendar 클래스의 다양한 이슈를 해결하고
		 * locale(국가별) 여러가지 사항들을 해결하여
		 * 새로운 클래스를 도입
		 * JDK 8 이상에서만 사용가능하다.
		 */
		LocalDate localDate = LocalDate.now();
		
		DateTimeFormatter dDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		String curDate = dDate.format(localDate);
		
		System.out.println("오늘날짜 : " + curDate);
		
		
		
	}
}
