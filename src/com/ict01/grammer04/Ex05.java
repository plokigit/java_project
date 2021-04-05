package com.ict01.grammer04;
class Ex05 
{
	public static void main(String[] args) 
	{

		// 중첩 while문 : while 안에 while

		// 구구단
		int i=2;
		while (i < 10)
		{
			System.out.println(i + "단");
			int j = 1;
			while (j < 10)
			{
				System.out.println(i + "*" + j + "=" + (i*j)+ " ");
				j++;
			} i++; System.out.println();
		}

		// 구구단2
		i = 2;
		while (i < 10)
		{
			int j = 1;
			while (j < 10)
			{
				System.out.print(i + "단  ");
				System.out.print(i + "*" + j + "=" + (i*j)+ "  ");
				if (j == 9)
				{
					System.out.println();
				}
				j++;
			} i++;
		}
	}

}
