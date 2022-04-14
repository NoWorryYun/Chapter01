package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		double v01 = 5/4;					//정수 기본값은 int기 때문에 1(.25)가 되어 실수로 표현해도 .25가 없이 1.0으로 표현
		System.out.println(v01);

		double v02 = (double)5 / 4 ;
		System.out.println(v02);

		double v03 = 5 / (double)4 ;
		System.out.println(v03);

		double v04 = (double)5 / (double)4 ;
		System.out.println(v04);

		int v05 = (int)1.3 + (int)1.8 ;		//int를 먼저 적용하여 1 + 1 = 2가 나옴
		System.out.println(v05);
		
		
		
		
		
	}
}
