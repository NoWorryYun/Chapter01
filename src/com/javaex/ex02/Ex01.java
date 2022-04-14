package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		int i = 2345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String name = "윤성한";
		String str = "Good Morning";
		
		
		
		System.out.println("안녕하세요");
		System.out.println(str);
		
		
		System.out.print("안녕");			//ln은 한칸 내림
		System.out.println("하세요");
		
		System.out.println(str + str + " means, 안녕하세요");	// +로 표현 (없으면 변수인지 뭔지 몰라서 프로그램이 헷갈려함)
		System.out.println(str + i);						// int i가 String으로 변환되어 String + String으로 나타내짐
		String var01 = str + i;	
		System.out.println(str + "이랑 " + i);				// ""안에는 공백도 포함
		System.out.println(str + d);
		System.out.println( i + i );
		System.out.println( d + d );
		System.out.println( i + d );
		
		System.out.println(c);
		System.out.println(c + c);						// char은 코드값이 불러와지기 때문에 숫자로 연산된다.
		System.out.println(s);
		System.out.println(s + s);						// String은 문자열로 나타내진다.
		
		System.out.println("제이름은 " + name + " 입니다.");
		
		System.out.println("===========================");
		
		System.out.println("안녕\n하세요.");				// \n 내용 안의 줄바꿈기호
		System.out.println("안녕\t하세요.");				// \t 일정 간격을 띄움 (흔한 tap키 이용때)
		
		System.out.println("안녕\"하\"세요");				// 글자 안에 따옴표를 넣고 싶으면 \" 사용
		
		//System.out.println("안녕\하\세요");				// \(역슬래쉬)는 특수기호를 나타내기때문에 따로 한개만 사용을 못함. 오류남
		System.out.println("안녕\\하\\세요");
		
		
		
	}
	
}
