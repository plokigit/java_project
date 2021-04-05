package com.ict01.grammer03;
class Ex04{
	public static void main(String[] args){
	// 삼항연산자 (= 조건연산자 = 조건문인 if~else문과 동일)
	
	int result = true ? 14 : 10;
	System.out.println("결과 : " + result); // 14

	result = false ? 14 : 10;
	System.out.println("결과 : " + result); // 10

	int result2 = false ? 14 : 'C';
	System.out.println("결과 : " + result2); // 67
	System.out.println("결과 : " + (char)(result2)); // C로 출력하기 위해 형변환

	// 주어진  sum이 80이상이면 합격, 그렇지 않으면 불합격
	int sum = 81;
	String result3  = (sum >= 80) ? "합격" : "불합격" ;
	System.out.println("결과 : " + result3); // 합격

	// 평균 90이상이면 A, 아니면 B
	double avg = 87.0;
	double result4  = (avg >= 90) ? 'A' : 'B' ;
	System.out.println("결과 : " + result4); // 66.0
	System.out.println("결과 : " + (char)(result4)); // B

	}
}