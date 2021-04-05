package com.ict01.grammer03;
class Ex11{
	public static void main(String[] args){
	//다중 if문 : 조건이 거짓일 때 다시 조건식을 사용
	// 형식 : if(조건식1){
	//			조건식1이 참일 때 실행할 문장;
	//		}else if(조건식2){
	//			조건식1 거짓, 조건식2이 참일 때 실행;
	//		}else
	//			조건식 모두 거짓일 때, 나머지인 경우;


	// int k1의 점수가 90이상 A, 80이상 B, 70> C, 나머지 F
	int k1 = 85;
	char res1 = ' ';
	if(k1>=90){
		res1 = 'A';
	}else if(k1>80){
		res1 = 'B';
	}else if(k1>=70){
		res1 = 'C';
	}else res1 = 'F';
	System.out.println("점수 : " + k1 + " / 학점 : " + res1);

	// k2가 대문자, 소문자, 숫자, 기타문자인지 판별
	char k2 = '6';
	String res2 = " ";
	if(k2 >= 'A' && k2 <= 'Z'){
		res2 = "대문자";
	}else if(k2 >= 'a' && k2 <= 'z'){
		res2 = "소문자";
	}else if(k2 >= 0 && k2 <= 9){
		res2 = "숫자";
	}else res2 = "기타문자";
	System.out.println("입력값 : " + k2 + " / 문자 : " + res2);


	// K3가 A,a이면 아프리카, B,b이면 브라질, C,c이면 캐나다 나머지 한국
	char k3 = 'k';
	String res3 = " ";
	if(k2 == 'A' || k3 == 'a'){
		res3 = "아프리카";
	}else if(k3 == 'B' || k3 == 'b'){
		res3 = "브라질";
	}else if(k3 == 'C' && k3 == 'c'){
		res3 = "캐나다";
	}else res3 = "한국";
	System.out.println("입력값 : " + k3 + " / 나라 : " + res3);

	// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
	// 3이면 아메리카노 3000, 4는 과일쥬스 3500
	// 친구와 2잔을 10000내고 먹었을 때 잔돈 (부가세 10%추가)
	int menu = 4;
	int pay = 10000;
	int count = 2;
	int cost = 0;

	if(menu == 1){
		cost = pay - (int)((3500*count)*1.1);
	} else if(menu == 2){
		cost = pay - (int)((4000*count)*1.1);
	} else if(menu == 3){
		cost = pay - (int)((3000*count)*1.1);
	}else cost = pay - (int)((3500*count)*1.1);
	System.out.println("입력값 : " + menu + " / 잔돈 : " + cost);
	

	}
}