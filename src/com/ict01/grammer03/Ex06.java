package com.ict01.grammer03;
class Ex06{
	public static void main(String[] args){
	// 중첩 삼항 연산자 : 삼항 연산자가 중첩 된 것
	// char k1이 대문자인지, 소문자인지, 기타문자인지 판별

	char k1 = 'd';
	String res1 = (k1 >=  'A' && k1 <= 'Z')? "대문자"
			 :(k1 >= 'a' && k1 <= 'z')? "소문자" : "기타문자" ;
	System.out.println("결과 : " + res1); // 소문자

	// int k2가 90이상이면 A학점, 80점 이상이면 B학점, 나머지는 F
	int k2 = 95;
	char grade = (k2 >= 90)? 'A' : (k2 >= 80)? 'B' : 'F';
	System.out.println("결과 : 학점은 " + grade); // 
	
	
	// int k3이 1또는 3이면 남, 2또는 4이면 여자, 나머지는 외국인
	int k3 = 1;
	String gender = (k3 == 1 || k3 == 3)? "남" 
			: (k3 == 2 || k3 == 4)? "여" : "외국인";
	System.out.println("결과 : 성별은 " + gender); // 

	 

	}
}