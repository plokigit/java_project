package com.ict01.grammer03;
class Ex10{
	public static void main(String[] args){
	//if~else : ���ǽ��� ���� ���� ������ �� ���� ���� ó��
	// ���� : if(���ǽ�){
	//		���ǽ��� ���϶� ������ ����;
	//	 } else {
	//		���ǽ��� �����ϴ� ������ ����;
	//	 } (������ ������ �� ���̸� ��ȣ ���� ����)

	
	// int k1 60�̻� �� �ƴϸ� ����
	int k1 =35;
	String res1 = ""; // �ʱⰪ ���ָ� �������� ��찡 ����
	if (k1 >= 60){
		res1 = "�հ�";
	}else{
		res1 = "���հ�";
	}System.out.println("����" + k1 + "�� " + res1);

	// k2 Ȧ¦
	int k2 = 9;
	String res2 = "";
	if (k2%2 == 0){
		res2 = "¦��";
	}else{
		res2 = "Ȧ��";
	}System.out.println("���� " + k2 + "�� " + res2);
	

	// char k3 �빮�� �ҹ���
	char k3 = 'B';
	String res3 = "";
	if (k3 <= 'Z' && k3 >= 'A'){
		res3 = "�빮��";
	}else{
		res3 = "�빮�� �ƴ�";
	}System.out.println("���� " + k3 + "�� " + res3);

	// k4 1�Ǵ� 3 �� �ƴϸ� ��
	int k4 = 4;
	String res4 = "";
	if (k4 == 1 || k4 == 3){
		res4 = "��";
	}else{
		res4 = "��";
	}System.out.println("���� " + k4 + "�� " + res4 );

	// �ٹ��ð��� 8�ð����� 8720 �ʰ��� 1.5�� ���� �ٹ��ð� 10�ð� �˹ٺ�
	int hour = 10;
	int min = 8720;
	int pay = 0;
	if (hour <= 8){
		pay = hour*min;
	}else{
		pay = (8*min) + (int)((hour-8)*min*1.5);
	}System.out.println("�ϱ��� " + pay + "��");


	}
}