package com.javaex.ex03;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
			System.out.print("근무시간: ");
			int time = sc.nextInt();
			int pay;
			
			if(time <= 8) {
				
				pay = time * 10000;
				
				System.out.println("임금은 " + pay +"원 입니다.");
				
			} else {
				
				//pay = (time * 10000) + (time - 8)* 10000 * 1 / 2;
				
				pay = (time * 10000) + (time - 8)* (int)(10000 * 1.5);
				
				
			}

			System.out.println("임금은 "+ pay + "원 입니다.");
		
		sc.close();
		
	}

}