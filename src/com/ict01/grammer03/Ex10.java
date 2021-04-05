package com.ict01.grammer03;
class Ex10{
	public static void main(String[] args){
	//if~else : 조건식이 참일 때와 거짓일 때 각각 나눠 처리
	// 형식 : if(조건식){
	//		조건식이 참일때 실행할 문장;
	//	 } else {
	//		조건식이 거짓일대 실행할 문장;
	//	 } (실행할 문장이 한 줄이면 괄호 생략 가능)

	
	// int k1 60이상 합 아니면 불합
	int k1 =35;
	String res1 = ""; // 초기값 안주면 오류나는 경우가 있음
	if (k1 >= 60){
		res1 = "합격";
	}else{
		res1 = "불합격";
	}System.out.println("점수" + k1 + "는 " + res1);

	// k2 홀짝
	int k2 = 9;
	String res2 = "";
	if (k2%2 == 0){
		res2 = "짝수";
	}else{
		res2 = "홀수";
	}System.out.println("점수 " + k2 + "는 " + res2);
	

	// char k3 대문자 소문자
	char k3 = 'B';
	String res3 = "";
	if (k3 <= 'Z' && k3 >= 'A'){
		res3 = "대문자";
	}else{
		res3 = "대문자 아님";
	}System.out.println("문자 " + k3 + "는 " + res3);

	// k4 1또는 3 남 아니면 여
	int k4 = 4;
	String res4 = "";
	if (k4 == 1 || k4 == 3){
		res4 = "남";
	}else{
		res4 = "여";
	}System.out.println("성별 " + k4 + "는 " + res4 );

	// 근무시간이 8시간까지 8720 초과시 1.5배 현재 근무시간 10시간 알바비
	int hour = 10;
	int min = 8720;
	int pay = 0;
	if (hour <= 8){
		pay = hour*min;
	}else{
		pay = (8*min) + (int)((hour-8)*min*1.5);
	}System.out.println("일급은 " + pay + "원");


	}
}