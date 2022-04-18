package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

			System.out.println("숫자를 입력하세요.");
			System.out.print("숫자:");
			
			int num = sc.nextInt();
			
			if (num > 0) { 
				
				System.out.println( num + "은(는) 양수입니다.");				
			
			} else if (num < 0) {
				
				System.out.println(num + "은(는) 음수입니다.");
				
			} else {
				
				System.out.println(num + "은 0입니다.");
				
			}
			
			
			
		sc.close();
		
		
	}

}
