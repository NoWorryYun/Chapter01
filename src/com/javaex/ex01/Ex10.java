package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리 연산자 기본 &&
		System.out.println("&& 연산자");
		System.out.println(true&&true);			// true
		System.out.println(true&&false);		// false
		System.out.println(false&&true);		// false #deadcode의 이유는 이미 false가 나왔기 때문에 이후의 true는 의미가 없어서 미리 알려줌
		System.out.println(false&&false);		// false #이하동문
		
		//논리 연산자 기본 ||
		System.out.println(true||true);			// true #deadcode의 이유는 이미 true가 나왔기 때문에 이후의 false는 의미가 없어서 미리 알려줌
		System.out.println(false||true);		// true #이하동문
		System.out.println(true||false);		// true
		System.out.println(false||false);		// false
		
		
		System.out.println("응용");
		System.out.println( a>b&&a<b );			// false ((5>7)F && T(5<7))
		System.out.println((a>b)&&(a>b));		// false ((5>7)F && F(5>7))
		System.out.println("=================");
		System.out.println((a>b)||(a<b));		// true ((5>7)F || T(5<7))
		
		// 논리 연산자 기본 !
		
		System.out.println("=================");
		System.out.println(a>b);				// false 5>7	
		System.out.println(!(a>b));				// ture 5가 7보다 작니? !F -> T
		
		System.out.println(a<b);				// true 5<7
		System.out.println(!(a<b));				// false 5가 7보다 크니? !T -> F
		
/*
		1) result = (((x * y) % z) –(a / b))
		2) m = ((x + y) + (z / 3))
		3) result = ((x % y) * z)
		4) x=y=w=z; 오른쪽에서왼쪽으로
		5) x = y = (((3 / 5) * 2) % 6);
		6) y = ((((a * x) * x) + (b * x)) +c);
*/	
	}
}
