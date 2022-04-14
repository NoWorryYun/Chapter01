package com.javaex.ex01;

public class Ex08 {
	
	public static void main (String[] args) {
		
		
		//대입연산자
		
		int a = 7;
		int b = 2;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);	// 정수 정수 --> 정수 (몫)
		System.out.println(a%b);	// (나머지)
		
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("================");
		System.out.println(7/2);		// 3
		System.out.println(7.0/2.0);	// 3.5
		System.out.println(7%2);		// 1 (나머지)
		System.out.println(7.0%2.0);	// 1.0
		System.out.println("================");
		
		//부호연산자
		int var = -3;
		int pVar = +var;
		int mVar = -var;
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		// 증감 연산자
		System.out.println("증감연산자");
		System.out.println(a);			//7
		System.out.println(++a);		//8	 a는 원래 7이었으나 ++이후 출력할 때 +1 올려버림
		System.out.println(a);			//8  <메모리 값이 8로 변경됬음을 확인
		
		System.out.println(b);			//2
		System.out.println(--b);		//1  2에서 1로 줄어듬
		System.out.println(b);			//메모리값이 1로 변경된걸 확인
		
		System.out.println(a);			//8  변경된 값 그대로있음
		System.out.println(a++);		//8	 8로 출력됨 / 8출력하고 본인++
		System.out.println(a);			//9  ++이 출력이후 나중에 입력되어 9로 출력됨
		
		System.out.println(b);			//1	변경된 값 그대로있음
		System.out.println(b--);		//1	1로 출력됨 / 1출력하고 본인--
		System.out.println(b);			//0	--이 출력이후 나중에 입력되어 0으로 출력됨
		
	}

}
