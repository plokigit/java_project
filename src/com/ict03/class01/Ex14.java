package com.ict03.class01;

public class Ex14 {
	//static : 객체 생성과 상관없이 미리 만들어지는 필드와 메소드
	// 			클래스와 지역변수에서는 static 사용불가
	//			공유 개념(모든 객체 사용 O)
	//			접근 제한자가 private이면 static이라도 접근 X
	
	int su1 = 10;
	static int su2 = 10;
	
	//기본생성자
	public Ex14() {
		su1++;
		su2++;
	}
	public void prn() {
		int su3 = 10;
		// static int su4 = 10;	오류 지역변수 static 사용X
	}
	
	//static 메소드는 static변수와 참조할수 있음
	public static void prn2() {
		// System.out.println(su1);	인스턴스변수 참조 안됨
		System.out.println(su2);
		int su4 = 10;
		// static int su5=10;	지역변수 static 사용X
	}
}
