package com.ict01.grammer04;
class Ex03 
{
	public static void main(String[] args) 
	{
		//다중 for문
		for (int i=1; i<4; i++)
		{
			for (int j=1;j<6 ;j++ )
			{
				System.out.println("i= "+i + " , j= " + j);
			}
		}System.out.println();
		System.out.println();


		// -------------------------------------------------------------
		// 구구단 세로 한줄

		for (int i=2; i<=9 ; i++)
		{
			System.out.println(i + "단");
			for (int j=1; j<= 9 ; j++ )
			{
				System.out.println( i + " * " + j + " = " + i * j + "  ");
			}
			System.out.println();
		}System.out.println();

		// 가로 단씩(1*1=1 1*2=2 1*3=3) 이런식
		//			(2*1=2 2*2=4 2*3=6)

		for (int i=2; i<=9 ; i++)
		{
			for (int j=1; j<= 9 ; j++ )
			{
				System.out.print( i + " * " + j +  " = " + i * j + "  ");
			}System.out.println();
		}System.out.println();

		// 구구단처럼 (1*1 2*1 3*1) 이런식
		//			  (1*2 2*2 3*2)
		
		for (int i=1; i<=9 ; i++)
		{
			for (int j=2; j<= 9 ; j++ )
			{
				System.out.print( j + " * " + i +  " = " + i * j + "  ");
			}System.out.println();
		}System.out.println();

		// 이중 for문으로
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0

		for (int i=0; i<4 ; i++)
		{
			for (int j=0; j<4 ; j++ )
			{
				System.out.print( "0 " );
			}System.out.println();
		}System.out.println();

		// 1 0 0 0
		// 0 1 0 0
		// 0 0 1 0
		// 0 0 0 1

		for (int i=0; i<4 ; i++)
		{
			for (int j=0; j<4 ; j++ )
			{
				if (j == i)
				{
					System.out.print("1 ");
				} else System.out.print("0 ");
			}System.out.println();
		}System.out.println();




	}
}
