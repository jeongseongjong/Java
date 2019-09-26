package com.biz.classes.arrays;

import java.util.Scanner;

public class Array_06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayScanService aService
			= new ArrayScanService(10);
		while(true) {
			aService.scanArrayAll();
			System.out.println("Press Any Key..(END:quit)");
			String keyIn = scan.nextLine();
			if(keyIn.equals("END")) break;
		}
		System.out.println("GAME OVER!!");
		
		
	}
}
