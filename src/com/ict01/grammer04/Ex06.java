package com.ict01.grammer04;
import java.util.Scanner;
class Ex06 
{
	public static void main(String[] args) 
	{

		//do-while문 : while문과 같은 반복문 먼저 실행 후 나중에 비교
		

		// 0-10까지 출력
		int i =0 ;
		do
		{
			System.out.print( i + " ");
			i++;
		}
		while (i < 11);
		System.out.println();System.out.println();

		// 반복횟수를 받아서 처리하자
		Scanner scan = new Scanner(System.in);
		System.out.print("반복횟수 입력 : ");
		int su = scan.nextInt();
		i = 0;
		do
		{
			System.out.println("안녕하세요");
			i++;
		}while (i < su);
		System.out.println();

		// 반복횟수와 일반 숫자를 받아서 홀수, 짝수를 판별하기
		
		System.out.print("반복횟수 입력 : ");
		int rutin = scan.nextInt();
		i = 0;
		do
		{
			System.out.print("입력값: ");
			int num = scan.nextInt();
			if (num % 2 == 0)
			{
				System.out.println(" 입력값: " + num + "은 짝수입니다.");
			}else{
				System.out.println(" 입력값: " + num + "은 홀수입니다.");
			}
			i++;
		}while (rutin > i);
		System.out.println();
		
		
	}
}
