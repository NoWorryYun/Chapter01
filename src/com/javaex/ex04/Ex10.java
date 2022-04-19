package com.javaex.ex04;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0 && i % 3 == 0) {
				/* break; */
				continue;
			}
			System.out.println(i);
		}
		System.out.println("종료");
	}

}
