package com.javaex.ex03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
			System.out.print("점수를 입력하세요: ");
			int three = sc.nextInt();
			
			if(0 == three%3) {
				
			System.out.println(three + "은(는) 3의 배수 입니다.");
				
			} else 
				
			System.out.println(three + "은(는) 3의 배수가 아닙니다.");
		
		
		
		sc.close();
		
		
	}
}
