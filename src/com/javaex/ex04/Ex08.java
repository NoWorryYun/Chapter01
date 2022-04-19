package com.javaex.ex04;

public class Ex08 {

	public static void main(String[] args) {

		int i = 1;

		while (true) {
			// 조건이 되면 탈출
			if (i % 6 == 0 && i % 14 == 0) {
				// if문이 true
				System.out.println(i);
				break;
			}
			// while 안에 있기 때문에 else를 따로 안써줘도 가능 > 특수한 경우임
			i++;
		}
	}
}
