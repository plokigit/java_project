package com.ict01.grammer04;
class Ex04
{
	public static void main(String[] args) 
	{
		//while�� : for���� ���� �ݺ���

		//0~15���� ���

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

		//0-10���� ¦���� ���
		i = 0;
		while (i <= 10)
		{
			if(i > 0 && i % 2 == 0){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		//0-10���� Ȧ���� ���
		i = 0;
		while (i <= 10)
		{
			if(i > 0 && i % 2 == 1){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		//0-50���� 7�� ����� ���
		i = 0;
		while (i <= 50)
		{
			if(i > 0 && i % 7 == 0){
				System.out.print(i + "  ");
				i++;
			}else i++;
		}System.out.println();System.out.println();

		// 5�� ���
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

		//0-10���� ������ ���ϱ�
		i = 0;
		int sum=0;
		while (i <= 10)
		{
			sum = sum + i;
			i++;
				
		}System.out.println("�հ�� : " + sum);System.out.println();


		// Ȧ���� �����հ� ¦���� �������� ���� ���ϱ�
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
		}System.out.println("Ȧ�� �հ� : " + odd);
		System.out.println("¦�� �հ� : " + even);
		System.out.println();

	}
}
