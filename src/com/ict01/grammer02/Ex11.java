package com.ict01.grammer02;
class Ex11{
	public static void main(String[] args){
	// �񱳿����� : ������ ����� ���� ���Ҷ� ���
	// ����� �׻� boolean��

	int s1 = 90;
	int s2 = 80;
	boolean res = s1 >= s2;
	System.out.println("��� : " +  res ); // true

	char s3 = 'c';
	char s4 = 'a';
	res = s3 >= s4;
	System.out.println("��� : " + res); // true

	// char�� int ��
	res = 'a' >= 97;
	System.out.println("��� : " + res); // true

	// int�� double ��
	res = 97 >= 97.0;
	System.out.println("��� : " + res); // true
	
	res = 97 == 97.0;
	System.out.println("��� : " + res); // true

	res = 97 >= 97.00001;
	System.out.println("��� : " + res); // false


	// String�� String ��
	String str1 = "���ѹα�";
//	String str1 = "���ѹα�";

	// res = str1 > str2;
	// System.out.println("��� : " + res);	// �ε�ȣ�� �����߻�
	// res = str1 >= str2;
	// System.out.println("��� : " + res);

	// res = str1 == str2;		// ����� : true
	// System.out.println("��� : " + res);	
	// ���� �����°� �ƴϰ� ������� ����
	//  String�� ���ϴ� �޼ҵ尡 ������ ������
	// ���迡 ������ ������� �����ϸ� ��

	}
}