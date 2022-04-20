package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[5];	//변수값 지정 및 개수 설정
		
		//0부터 시작 
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		intArray[3] = 12;
		intArray[4] = 55;

		/*
		 System.out.println(intArray[0]);
		 System.out.println(intArray[1]);
		 System.out.println(intArray[2]); 
		 System.out.println(intArray[3]);
		 System.out.println(intArray[4]);
		 */
		for (int i = 0; i < 5; i++) {
			System.out.println(intArray[i]);
		}
	}

}
