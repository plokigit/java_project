package com.ict01.grammer03;
class Ex05{
	public static void main(String[] args){

	// int k1�� 60�̻��̸� �� �ƴϸ� ����
	int k1 = 58;
	String res1 = (k1 >= 60) ? "�հ�" : "���հ�";
	System.out.println("��� : " + res1);

	// int k2�� Ȧ¦���� �Ǻ�
	int k2 = 31;
	String res2 = ((k2%2) == 0)? "¦��" : "Ȧ��";
	System.out.println("��� : " + k2 + "�� " + res2);

	// char k3�� �빮������ �ƴ��� �Ǻ�
	char k3 = 'Z';
	String res3 = (k3 <= 'a')? "�빮��" : "�ҹ���";
	System.out.println("��� : " + k3 + "�� "  + res3);

	// �ٹ��ð��� 8�ð������� �ð��� 8720�̰�
	// 8�ð��� �ʰ��� �ð���ŭ�� 1.5���̴�.
	// ���� �ٹ��ð��� 10�ð��̴�.
	// �󸶸� �޾ƾ��ϴ°� (���ǿ����� �̿��ؼ� �ϱ�)

	// int hour = 10;
	// double res4 = (hour >= 8)? (hour*8720)+(hour*8720*1.5) : (hour*8720) ;
	// System.out.println("��� : " +  hour + "�ð� " + (int)(res4) + "��"); // Ʋ��

	int hour = 10;
	int min = 8720;
	int pay = (hour >= 8)? (8*min)+(int)((hour-8)*min*1.5) : hour*8720 ;
	System.out.println("��� : " +  hour + "�ð� " + pay + "��");

	}
}