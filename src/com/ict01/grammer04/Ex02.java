package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문

	//안녕하세요 10번실행
	for(int i= 1; i<11 ; i++){
		System.out.println("안녕하세요! - " + i);
		}


	//0~15까지 출력
	for(int count=0; count<=15 ; count++){
		System.out.print(count + "  ");
		}
		System.out.println();
		System.out.println();


	//0-10까지 짝수만 출력
	for(int i= 0; i<11 ; i++){
			if(i > 0 && i % 2 == 0){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();


	// 0-10까지 홀수만 출력
	for(int i= 0; i<11 ; i++){
			if(i > 0 && i % 2 == 1){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();


	//0-50까지 7의 배수만 출력
	for(int i= 0; i<51 ; i++){
			if(i > 0 && i % 7 == 0){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();

	// 5단 출력
	for(int i= 1; i<10 ; i++){
				System.out.println("5 X " + i + " = " + 5*i);
		}System.out.println();

	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0
	// 0 0 0 0

	for(int i= 1; i<=16 ; i++){
			System.out.print('0' + " "); 

			if(i % 4 ==0){
				System.out.println("");
			}
		}System.out.println();

	//0-10까지 누적합 구하기
	int sum=0;
	for (int i = 0; i<11 ; i++)
	{
		System.out.println(sum + "+" +i + " ");
		sum += i; // i의 누적합
		
	}
	System.out.println("합계 : " + sum);
	System.out.println();

	//홀수 누적합
	int odd = 0;
	for (int i=1; i<11 ; i++)
	{
		if (i % 2 == 1)
		{
			odd += i;
		}
	}System.out.println("홀수 합계 : " + odd);

	//짝수 누적합
	int even  = 0;
	for (int i=1; i<11 ; i++)
	{
		if (i % 2 == 0)
		{
			even += i;
		}
	}System.out.println("짝수 합계 : " + even);

	// 홀수의 누적합과 짝수의 누적합을 각각 구하기
	int odd1=0; 
	int even1 = 0;
	for (int i=1; i < 11; i++)
	{
		if (i % 2 == 0)
		{
			even1 += i;
		} else{
			odd1 += i;
		}
	}System.out.println("홀수 합 : " + odd1);
	System.out.println("짝수 합 : " + even1);
	
	// 7! (7*6*5*4*3*2*1)
	int sum1=1;
	for (int i=7; i>0 ; i--)
	{
		sum1 *= i;
	}System.out.println("7! = " + sum1);
	}
}
