package com.ict01.grammer04;
class Ex05 
{
	public static void main(String[] args) 
	{

		// ��ø while�� : while �ȿ� while

		// ������
		int i=2;
		while (i < 10)
		{
			System.out.println(i + "��");
			int j = 1;
			while (j < 10)
			{
				System.out.println(i + "*" + j + "=" + (i*j)+ " ");
				j++;
			} i++; System.out.println();
		}

		// ������2
		i = 2;
		while (i < 10)
		{
			int j = 1;
			while (j < 10)
			{
				System.out.print(i + "��  ");
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
