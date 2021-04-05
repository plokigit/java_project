package com.ict01.grammer02;
class Ex02{
	public static void main(String[] args){
	// 문자형 char : 한 글자 저장 ('1' -> 가능 / '10' -> 오류 / '가' -> 가능)
	// 홑따옴표 필수, 숫자로 저장가능. 최종 저장 숫자(연산O), 호출은 문자
	char ch1 = 'a'+1; //a=97
	System.out.println(ch1);

	ch1 = 65+32;
	System.out.println(ch1);

	char ch2 = '대';
	System.out.println(ch2);
	}
}