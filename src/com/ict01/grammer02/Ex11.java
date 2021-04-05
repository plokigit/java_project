package com.ict01.grammer02;
class Ex11{
	public static void main(String[] args){
	// 비교연산자 : 변수나 상수의 값을 비교할때 사용
	// 결과는 항상 boolean임

	int s1 = 90;
	int s2 = 80;
	boolean res = s1 >= s2;
	System.out.println("결과 : " +  res ); // true

	char s3 = 'c';
	char s4 = 'a';
	res = s3 >= s4;
	System.out.println("결과 : " + res); // true

	// char과 int 비교
	res = 'a' >= 97;
	System.out.println("결과 : " + res); // true

	// int와 double 비교
	res = 97 >= 97.0;
	System.out.println("결과 : " + res); // true
	
	res = 97 == 97.0;
	System.out.println("결과 : " + res); // true

	res = 97 >= 97.00001;
	System.out.println("결과 : " + res); // false


	// String과 String 비교
	String str1 = "대한민국";
//	String str1 = "대한민국";

	// res = str1 > str2;
	// System.out.println("결과 : " + res);	// 부등호는 오류발생
	// res = str1 >= str2;
	// System.out.println("결과 : " + res);

	// res = str1 == str2;		// 결과값 : true
	// System.out.println("결과 : " + res);	
	// 값이 나오는게 아니고 오류라고 생각
	//  String은 비교하는 메소드가 별도로 존재함
	// 시험에 나오면 오류라고 생각하면 됨

	}
}