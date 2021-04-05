package com.ict01.grammer03;
class Ex05{
	public static void main(String[] args){

	// int k1가 60이상이면 합 아니면 불합
	int k1 = 58;
	String res1 = (k1 >= 60) ? "합격" : "불합격";
	System.out.println("결과 : " + res1);

	// int k2가 홀짝인지 판별
	int k2 = 31;
	String res2 = ((k2%2) == 0)? "짝수" : "홀수";
	System.out.println("결과 : " + k2 + "는 " + res2);

	// char k3가 대문자인지 아닌지 판별
	char k3 = 'Z';
	String res3 = (k3 <= 'a')? "대문자" : "소문자";
	System.out.println("결과 : " + k3 + "는 "  + res3);

	// 근무시간이 8시간까지는 시간당 8720이고
	// 8시간을 초과한 시간만큼은 1.5배이다.
	// 현재 근무시간이 10시간이다.
	// 얼마를 받아야하는가 (조건연산을 이용해서 하기)

	// int hour = 10;
	// double res4 = (hour >= 8)? (hour*8720)+(hour*8720*1.5) : (hour*8720) ;
	// System.out.println("결과 : " +  hour + "시간 " + (int)(res4) + "원"); // 틀림

	int hour = 10;
	int min = 8720;
	int pay = (hour >= 8)? (8*min)+(int)((hour-8)*min*1.5) : hour*8720 ;
	System.out.println("결과 : " +  hour + "시간 " + pay + "원");

	}
}