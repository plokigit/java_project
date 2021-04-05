package com.ict01.grammer03;
class Ex01{
	public static void main(String[] args){
	


	int s1 = 10;
	int s2 = 7;
	boolean result = true && true;
	System.out.println(result);

	result = (s1 >= 7) && (s2 >= 5);
	System.out.println(result);

	result = false && true;
	System.out.println(result);

	result = (s1 <= 7) && (s2 >= 5);
	System.out.println(result);

	// false를 만나면 그 뒤는 연산하지 않음
	result = ((s1 = s1 + 2) > s2 ) && (s1 == (s2 = s2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);

	result = ((s1 = s1 + 2) < s2 ) && (s1 == (s2 = s2 + 5));
	System.out.println("결과 : " + result);
	System.out.println("s1 : " + s1);
	System.out.println("s2 : " + s2);


	s1 = 24;
	result = (s1 >= 20) && (s1 <= 30);
	System.out.println("결과 : " + result);

	// char c1이 소문자인가?
	char c1 = 'D';
	result = (c1 >= 97) && (c1 <= 122);
	System.out.println("결과 : " + result);

	result = (c1 >= 'a') && (c1 <= 'z');
	System.out.println("결과 : " + result);

	}
}