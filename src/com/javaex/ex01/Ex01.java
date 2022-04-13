/*

작성자 : 윤성한
작성일 : 2022-04-13
설명 : 나이 기록 프로그램

 */


package com.javaex.ex01;

public class Ex01 {

		public static void main(String[] args) {
			/*
			int myAge;					//선언
			myAge = 25;					//초기화
			
			System.out.println(myAge);	//메모리의 값을 출력하는 메소드
			
			myAge = 26;
			System.out.println(myAge);
			*/
			
			byte no;
			no = -128;
			System.out.println(no);
			
			int no2;
			no2 = 2147483647;
			System.out.println(no2);

			long no3;
			no3 = 214748322647L;		//int범위까지는 L을 붙이지 않아도 된다. int범위가 넘어가는 부분부턴 L을 붙여야한다. 작은수에 L을 붙여도 상관은 없다.
			System.out.println(no3);
			
			int myAge = 25;				//변수 선언 초기화 > 선언과 초기화를 한꺼번에 함
			System.out.println(myAge); 
			
			
			//////////////////////////////////////////////////////
			//변수선언, 초기화
			//////////////////////////////////////////////////////
			
			/*
			int var01;
			int var02;
			int var03;
			*/
			
			int var01, var02, var03;
			
			var01 = 10; 
			var02 = 20;
			var03 = 30;
			
			//변수 여러개일때 변수 + 초기화
			/*
			int var04 = 10;
			int var05 = 20;
			int var06 = 30;
			*/
			
			int var04=10, var05=20, var06=30;
			
			System.out.println(var01);
			System.out.println(var02);
			System.out.println(var03);
			System.out.println(var04);
			System.out.println(var05);
			System.out.println(var06);
			
		}
}
