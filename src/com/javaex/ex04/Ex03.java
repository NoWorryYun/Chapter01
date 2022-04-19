package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("단을 입력하세요: ");
		int dan = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

//		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요: ");
//		int dan = sc.nextInt();
//		int i; 
//		for(i = 1 ; i <= 9 ; i++) {
//			System.out.println(i);
//			System.out.println(dan + " * " + i + " = " + (dan * i));
//		}
//			
		sc.close();
	}
}
