package com.ict01.grammer03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] args){
	// 숫자를 받아서 홀짝 구분

	Scanner scan = new Scanner(System.in);

	System.out.print(" 숫자를 입력 : ");
	int num = scan.nextInt();

	String num2 = (num%2 == 0)? "짝수" : "홀수";
	System.out.println(" 입력한 숫자 : " + num + "는 " + num2);

	// 국영수 점수를 받아서 점수의 평균이 60이상,
	// 각각 점수는 40점 이상일때 합격, 아니면 불합

	System.out.println();
	System.out.print("국어점수 : ");
	int kor = scan.nextInt();

	System.out.print("영어점수 : ");
	int eng = scan.nextInt();

	System.out.print("수학점수 : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double avg = (int)(sum/3.0*10)/10.0;	

	String pass = (avg >= 60 && kor>=40 && eng>=40 && math >= 40)?
			 "합격" : "불합격";
	System.out.println(" 당신은 " + pass + " 입니다.");

	// 알바시간을 입력 받아서
	// 시간당 8720원이나 8시간 초과시 시간만큼 1.5배
	// 받을 금액은?
	
	System.out.println();
	System.out.print("알바 시간 : ");
	int part = scan.nextInt();
	int min = 8720;

	int pay = (part > 8)? (8*min)+(int)((part-8)*1.5*min) : (part*min);
	System.out.println(" 오늘 일급 " + pay);
	

	}
}