package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		
		
		//자동형변환
		System.out.println(2+3.5);
		
		
		

		double var01 = 2+3.5;		//'2'가 '2.0'으로 자동 형변환되어 실수 3.5와 계산됨
		System.out.println(var01);
		
		
		//자동형변환
		long var02 = 12345L;
		float var03 = 1.1f;
		
		System.out.println(var02+var03);
		
		float result = var02 + var03;	//var02(12345L) --> 12345.0f로 변환
		
		System.out.println(result);
		
		
		////////////////////////////////////////
		
		
		//강제형변환
		
		float var04 = 1111.2345f;
		int var05 = (int)var04;			// 값에 (int)형을 넣어 실수형(float)을 정수형(int)로 강제 형변환시킴. 실수형부분 (.2345)를 떼고 정수 부분만 출력
		System.out.println(var05);
		
		
		
		//축소변환
		int v01 = 10;
		byte v02 = (byte)v01;
		System.out.println(v02);
		
		
		//축소변환 비정상 ( int -> byte )
		
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04);		//v03(int)의 2진수 자리를 byte형식의 2진수 8bit만큼 잘라서 넣기 때문에 10이 나옴. 앞자리 2자리 짤라서 나온느게 아님 오해하지 말것.
		
		
		
		//확대 변환 (byte ---> int)
		
		byte v05 = 10;
		int v06 = (int)v05;
		System.out.println(v06);
		
		
		//실수 --> 정수
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		
		
		//정수 --> 실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
	}
}
