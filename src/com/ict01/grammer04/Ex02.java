package com.ict01.grammer04;
class Ex02 
{
	public static void main(String[] args) 
	{
		//for�� : ������ ��Ģ�� ���� ���๮�� �ݺ� ó���ϴ� ��

	//�ȳ��ϼ��� 10������
	for(int i= 1; i<11 ; i++){
		System.out.println("�ȳ��ϼ���! - " + i);
		}


	//0~15���� ���
	for(int count=0; count<=15 ; count++){
		System.out.print(count + "  ");
		}
		System.out.println();
		System.out.println();


	//0-10���� ¦���� ���
	for(int i= 0; i<11 ; i++){
			if(i > 0 && i % 2 == 0){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();


	// 0-10���� Ȧ���� ���
	for(int i= 0; i<11 ; i++){
			if(i > 0 && i % 2 == 1){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();


	//0-50���� 7�� ����� ���
	for(int i= 0; i<51 ; i++){
			if(i > 0 && i % 7 == 0){
				System.out.print(i+ "  ");
			}
		}System.out.println();
		System.out.println();

	// 5�� ���
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

	//0-10���� ������ ���ϱ�
	int sum=0;
	for (int i = 0; i<11 ; i++)
	{
		System.out.println(sum + "+" +i + " ");
		sum += i; // i�� ������
		
	}
	System.out.println("�հ� : " + sum);
	System.out.println();

	//Ȧ�� ������
	int odd = 0;
	for (int i=1; i<11 ; i++)
	{
		if (i % 2 == 1)
		{
			odd += i;
		}
	}System.out.println("Ȧ�� �հ� : " + odd);

	//¦�� ������
	int even  = 0;
	for (int i=1; i<11 ; i++)
	{
		if (i % 2 == 0)
		{
			even += i;
		}
	}System.out.println("¦�� �հ� : " + even);

	// Ȧ���� �����հ� ¦���� �������� ���� ���ϱ�
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
	}System.out.println("Ȧ�� �� : " + odd1);
	System.out.println("¦�� �� : " + even1);
	
	// 7! (7*6*5*4*3*2*1)
	int sum1=1;
	for (int i=7; i>0 ; i--)
	{
		sum1 *= i;
	}System.out.println("7! = " + sum1);
	}
}
