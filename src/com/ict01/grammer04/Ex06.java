package com.ict01.grammer04;
import java.util.Scanner;
class Ex06 
{
	public static void main(String[] args) 
	{

		//do-while�� : while���� ���� �ݺ��� ���� ���� �� ���߿� ��
		

		// 0-10���� ���
		int i =0 ;
		do
		{
			System.out.print( i + " ");
			i++;
		}
		while (i < 11);
		System.out.println();System.out.println();

		// �ݺ�Ƚ���� �޾Ƽ� ó������
		Scanner scan = new Scanner(System.in);
		System.out.print("�ݺ�Ƚ�� �Է� : ");
		int su = scan.nextInt();
		i = 0;
		do
		{
			System.out.println("�ȳ��ϼ���");
			i++;
		}while (i < su);
		System.out.println();

		// �ݺ�Ƚ���� �Ϲ� ���ڸ� �޾Ƽ� Ȧ��, ¦���� �Ǻ��ϱ�
		
		System.out.print("�ݺ�Ƚ�� �Է� : ");
		int rutin = scan.nextInt();
		i = 0;
		do
		{
			System.out.print("�Է°�: ");
			int num = scan.nextInt();
			if (num % 2 == 0)
			{
				System.out.println(" �Է°�: " + num + "�� ¦���Դϴ�.");
			}else{
				System.out.println(" �Է°�: " + num + "�� Ȧ���Դϴ�.");
			}
			i++;
		}while (rutin > i);
		System.out.println();
		
		
	}
}
