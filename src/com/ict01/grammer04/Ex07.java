package com.ict01.grammer04;
class Ex07
{
	public static void main(String[] args) 
	{
		// break�� : ���� �ݺ����� Ż�� �� �� ���
		// continue�� : continue�� ������ ���๮�� �����ϰ� ���� ȸ���� �ݺ�����
		for (int i = 0; i<11 ; i++)
		{
			if ( i == 4 ) break;
			System.out.print(i + " ");
		}System.out.println();  // ��� : 0 1 2 3

		for (int i = 0; i<11 ; i++)
		{
			if ( i == 4 ) continue;
			System.out.print(i + " ");
		}System.out.println(); // ��� : 0 1 2 3 5 6 7 8 9 10 
		// ��Ƽ���� ������ ���� ������ ������ϰ� ���ǽ����� �Ѿ
		// �׷��� 4�� ����

		for (int i = 0; i<11 ; i++)
		{
			System.out.print(i + " ");
			if ( i == 4 ) continue;
		}System.out.println(); // ��� : 0 1 2 3 4 5 6 7 8 9 10
		// ���� ������ �Է������Ƿ� 4�� ��µǾ ����

		int k = 11;
		while (k < 21)
		{
			if (k == 17) break;// 17�϶� break�̹Ƿ� 16������ ���
			System.out.print(k + " ");
			k++;
		}System.out.println();

		k = 11;
		while (k < 21)
		{
			// if (k == 17) continue; // 17���� ���ǽ����� �ö󰡹Ƿ� �������� ��ġ������
			System.out.print(k + " "); // �׷��� ���ѷ��� �� (k == 17�� ��������)
			k++;
		}System.out.println();System.out.println();

		// ��ø for������ break ��� j = 3�϶� break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ )
			{
				if (j == 3) break;
				System.out.println("i=" + i + " j=" + j);
			} // break�� �ɸ� ����� ��������
		}System.out.println("==========================");

		// ��ø for������ break ��� i = 2�϶� break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ )
			{
				if(i == 2) break;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println("==========================");

	// ��ø for������ continue ��� j = 3�϶� break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ ) // continue ����ġ�� �������� �ٽ� ��
			{
				if (j == 3) continue;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println("==========================");

		// ��ø for������ continue ��� i = 2�϶� break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ ) // continue ����ġ�� �������� �ٽ� ��
			{
				if(i == 2) continue;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println();
	}
}

//��� �� �̷��� �������� �����غ���
