package com.ict01.grammer02;
class Ex07{
	public static void main(String[] args){
	// �̸��� ȫ�浿�� ����� ���� ����90, ����80, ���� 90�̴�.
	// ������ ����� ���ؼ� �̸�, ����, ����� ��� (��� �Ҽ��� ù°)


	String name = "ȫ�浿";

	int kor = 90;
	int mat = 90;
	int en = 80;

	int sum = kor + mat + en ;
	// double avg = sum / 3; �̷��� �ڿ� �Ҽ��� 0���� ����

	double avg = sum / 3.0;
	double avg2 = (int)(avg*10)/10.0;
	
	System.out.println("�̸� : "+name);
	System.out.println("�հ� : " + sum);
	System.out.println("��� : " + avg2);
	}
}