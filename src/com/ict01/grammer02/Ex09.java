package com.ict01.grammer02;
class Ex09{
	public static void main(String[] args){
	// 2�ð� 40�� 23�ʸ� �ʴ����� ����
	// 9630�ʴ� ��ð� ��� �����ΰ�

	int hour1 = 2;
	int min = 40;
	int sec = 23;

	int hs = (hour1 * 60 * 60);
	int ms = (min * 60);
	System.out.println("2�ð� 40�� 23�� = " +( hs + ms + sec) +"��");


	int A = 9630;
	int min2 = 0;
	int sec2 = 0;
	int hour2 =0;
	
	//int min2 = 9630/60;
	//int sec2 = 9630%60;

	//int hour2 = min2/60;
	min2 = min2%60;

	System.out.println( hour2  + "�ð� " + min2 + "�� " + sec2 + "��");
	

	// �Ǵٸ� ���
	// time = 9630;
	// int h1 =  0;
	// int res =  0;
	// m1 =  0;
	// s3 = 0;


	// int h1 = time / (60*60);
	// int res = time % (60*60);

	// �ð� ���ϰ� ���� �������� ��
	// m1 = res/60;
	// ���� ���ϰ� ���� �������� ��
	// s3 = res%60;

	//System.out.println( h1 + "�ð� " + m1 + "�� " + s3 + "��");

	}
}
	