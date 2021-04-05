package com.ict01.grammer02;
class Ex07{
	public static void main(String[] args){
	// 이름이 홍길동인 사람의 성적 국어90, 영어80, 수학 90이다.
	// 총점과 평균을 구해서 이름, 총점, 평균을 출력 (평균 소수점 첫째)


	String name = "홍길동";

	int kor = 90;
	int mat = 90;
	int en = 80;

	int sum = kor + mat + en ;
	// double avg = sum / 3; 이러면 뒤에 소숫점 0으로 나옴

	double avg = sum / 3.0;
	double avg2 = (int)(avg*10)/10.0;
	
	System.out.println("이름 : "+name);
	System.out.println("합계 : " + sum);
	System.out.println("평균 : " + avg2);
	}
}