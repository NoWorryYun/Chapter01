package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA;		//주소 복사
		
		
		
		for(int i = 0 ; i < arrA.length ; i++) {
		System.out.print(arrA[i] + " ");
		}
		
		System.out.println("");
		
		for(int i = 0 ; i < arrB.length ; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println("");
		

		System.out.println("===================");
		
		
		
		System.out.println("arrA[1]번째 값 변경");
		
		arrA[1] = 100;			// arrA와 arrB가 같이 변경되는 것을 확인 (주소가 같기때문에)
		
		
		
		for(int i = 0 ; i < arrA.length ; i++) {
		System.out.print(arrA[i] + " ");
		}
		System.out.println("");
		for(int i = 0 ; i < arrB.length ; i++) {
			System.out.print(arrB[i] + " ");
		}
		System.out.println("");
		

		System.out.println("===================");
		

		
		
		

		
		
	}

}
