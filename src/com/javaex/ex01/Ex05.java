package com.javaex.ex01;

public class Ex05 {

	public static void main(String[] args) {
		
		//일반적인 방식
		
		/*final*/ double pi = 3.14;  	//final을 붙이면 변수를 상수로 고정시킴 이후에는 변경 불가
		double result01 = pi*5*5;
		
		System.out.println(result01);
		
		
		//pi값이 변경되는 경우
		
		pi = 3.1415926;         // final을 지정할 경우 변경이 안됨
		double result02 = pi*5*5;
		
		System.out.println(result02);
		
		
		//상수로 정의할 경우
		
		final double PI = 3.14;     // 상수값을 지정할땐 PI 대문자로 지정해주거나 함 << 변수 pi와 혼동없게
		double result03 = PI*5*5;
		System.out.println(result03);
		
		
		//**상수의 값을 변경 하려고 할 때
		/*
		PI = 3.1415926;			// PI가 상수로 선언되어 변경되지 않음
		double result04 = PI * 5 * %;
		System.out.println(result04);
		*/
		
		
	}
	
}
