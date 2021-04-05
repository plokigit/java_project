package com.ict01.grammer04;
class Ex04
{
	public static void main(String[] args) 
	{
		//while문 : for문과 같은 반복문

		//0~15까지 출력

		int i = 0;
		while (i < 16)
		{
			System.out.print(i + "  ");
			i++;
		}System.out.println();

		i = 0;
		while (true)
		{
			if (i >= 16) break;
			System.out.print(i + "  ");
			i++;
		}System.out.println();System.out.println();

		//0-10까지 짝수만 출력
		i = 0;
		while (i <= 10)
		{
			if(i > 0 && i % 2 == 0){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		//0-10까지 홀수만 출력
		i = 0;
		while (i <= 10)
		{
			if(i > 0 && i % 2 == 1){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		//0-50까지 7의 배수만 출력
		i = 0;
		while (i <= 50)
		{
			if(i > 0 && i % 7 == 0){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		// 5단 출력
		i = 1;
		while (i <= 9)
		{
				System.out.println( "5 * " + i + " = " +i*5 + " ");
				i++;
		}System.out.println();System.out.println();

		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		i = 1;
		while (i <= 16)
		{
			System.out.print( "0 " );
			if (i % 4 == 0)
			{
				System.out.println();
				i++;
			}else i++;
				
		}System.out.println();System.out.println();

		//0-10까지 누적합 구하기
		i = 0;
		int sum=0;
		while (i <= 10)
		{
			sum = sum + i;
			i++;
				
		}System.out.println("합계는 : " + sum);System.out.println();


		// 홀수의 누적합과 짝수의 누적합을 각각 구하기
		i = 0;
		int odd=0;
		int even=0;
		while (i <= 10)
		{
			if (i % 2 ==0)
			{
				even = even + i;
				i++;
			}else{
				odd = odd + i;
				i++;
			}		
		}System.out.println("홀수 합계 : " + odd);
		System.out.println("짝수 합계 : " + even);
		System.out.println();

	}
}
