package com.ict01.grammer02;
class Ex04{
	public static void main(String[] args){
	int i1= 'a';
	System.out.println(i1);

	char ch1 = 'a' ;
	System.out.println(ch1);

	// char < int < long < float < double �̹Ƿ� char�� ��� ���� �ڷ����� ���尡��

	
	// ch1 ���� �����͵� i2�� ���� ����
	int i2 = ch1;
	System.out.println(i2);

	// long�� int ���� ����
	long s3 = 117L;
	long s4 = 117;

	System.out.println(s3);
	System.out.println(s4);

	// float�� doubledp long ���� ����
	float s5 = s3; // float�� double������ �Ǽ����̹Ƿ� 117.0���� ���
	System.out.println(s5);


	// �Ʒ����� ��������ȯ
	//byte k1 = 128; �� ����
	// byte k1 = (byte)(128); // ��°� -128
 	// byte k1 = (byte)(129); // ��°� -127
	
	byte k1 = (byte)(256); // ��°� 0
	System.out.println(k1);

	// ���� -128 ���� +127���� �̹Ƿ� 127�� �ѱ�� -128���� �ѹ�


	// char k2 = (char)(97); �̷��� �����൵ char ������������ �˾Ƽ� ��ȯ
	char k2 = 97;
	System.out.println(k2);

	int k3 = 97;
	// char k4 = k3; //�̷��� ����
	char k4 = (char)(k3);
	System.out.println(k4); 

	
	// float, double -> int
	// int k5 = 87.64; // �Ҽ��� �پ ����
	int k5 = (int)(87.64);
	System.out.println(k5);

	}
}