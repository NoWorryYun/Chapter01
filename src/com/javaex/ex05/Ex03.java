package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[6];
		
		/*
		 nums[0] = (int)(Math.random()*45)+1;
		 nums[1] = (int)(Math.random()*45)+1;
		 nums[2] = (int)(Math.random()*45)+1;
		 nums[3] = (int)(Math.random()*45)+1;
		 nums[4] = (int)(Math.random()*45)+1;
		 nums[5] = (int)(Math.random()*45)+1;
		 */
		/*
		for(int x = 0 ; x < 6 ; x++) {
			nums[x] = (int)(Math.random()*45)+1;
		}
		*/
		for(int x = 0 ; x < nums.length ; x++){
			nums[x] = (int)(Math.random()*45)+1;
		}
		
		/*
		for(int i = 0 ; i < 6 ; i++) {
			System.out.println(nums[i]);
		}
		*/
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.println(nums[i]);
		}
	}

}
