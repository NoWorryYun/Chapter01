package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		for(int sum = 1 ;sum <= 10 ; sum++) {
			System.out.println(sum + "까지의 합은" + (sum + n));
			n = n+sum;
		}
		System.out.println("1부터 10까지의 정수의 합은 " + n + " 입니다.");
		
	}

}
