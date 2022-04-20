package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int num1 = (int)(Math.random()*45)+1;
		int num2 = (int)(Math.random()*45)+1;
		int num3 = (int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		*/
		
		
		//로또번호 생성기
		
		int num1, num2, num3, num4, num5, num6;
		
		num1 = (int)(Math.random()*45)+1;
		num2 = (int)(Math.random()*45)+1;
		num3 = (int)(Math.random()*45)+1;
		num4 = (int)(Math.random()*45)+1;
		num5 = (int)(Math.random()*45)+1;
		num6 = (int)(Math.random()*45)+1;
		
		System.out.print(num1 + "\t");
		System.out.print(num2 + "\t");
		System.out.print(num3 + "\t");
		System.out.print(num4 + "\t");
		System.out.print(num5 + "\t");
		System.out.print(num6 + "\t");
		
		System.out.println("===================================");
		
		for(int i=1 ; i<=6 ; i++) {
			System.out.println();
		}
		
		
		
		
	}

}
