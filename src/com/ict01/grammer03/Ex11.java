package com.ict01.grammer03;
class Ex11{
	public static void main(String[] args){
	//���� if�� : ������ ������ �� �ٽ� ���ǽ��� ���
	// ���� : if(���ǽ�1){
	//			���ǽ�1�� ���� �� ������ ����;
	//		}else if(���ǽ�2){
	//			���ǽ�1 ����, ���ǽ�2�� ���� �� ����;
	//		}else
	//			���ǽ� ��� ������ ��, �������� ���;


	// int k1�� ������ 90�̻� A, 80�̻� B, 70> C, ������ F
	int k1 = 85;
	char res1 = ' ';
	if(k1>=90){
		res1 = 'A';
	}else if(k1>80){
		res1 = 'B';
	}else if(k1>=70){
		res1 = 'C';
	}else res1 = 'F';
	System.out.println("���� : " + k1 + " / ���� : " + res1);

	// k2�� �빮��, �ҹ���, ����, ��Ÿ�������� �Ǻ�
	char k2 = '6';
	String res2 = " ";
	if(k2 >= 'A' && k2 <= 'Z'){
		res2 = "�빮��";
	}else if(k2 >= 'a' && k2 <= 'z'){
		res2 = "�ҹ���";
	}else if(k2 >= 0 && k2 <= 9){
		res2 = "����";
	}else res2 = "��Ÿ����";
	System.out.println("�Է°� : " + k2 + " / ���� : " + res2);


	// K3�� A,a�̸� ������ī, B,b�̸� �����, C,c�̸� ĳ���� ������ �ѱ�
	char k3 = 'k';
	String res3 = " ";
	if(k2 == 'A' || k3 == 'a'){
		res3 = "������ī";
	}else if(k3 == 'B' || k3 == 'b'){
		res3 = "�����";
	}else if(k3 == 'C' && k3 == 'c'){
		res3 = "ĳ����";
	}else res3 = "�ѱ�";
	System.out.println("�Է°� : " + k3 + " / ���� : " + res3);

	// menu�� 1�̸� ī���ī 3500, 2�̸� ī��� 4000,
	// 3�̸� �Ƹ޸�ī�� 3000, 4�� �����꽺 3500
	// ģ���� 2���� 10000���� �Ծ��� �� �ܵ� (�ΰ��� 10%�߰�)
	int menu = 4;
	int pay = 10000;
	int count = 2;
	int cost = 0;

	if(menu == 1){
		cost = pay - (int)((3500*count)*1.1);
	} else if(menu == 2){
		cost = pay - (int)((4000*count)*1.1);
	} else if(menu == 3){
		cost = pay - (int)((3000*count)*1.1);
	}else cost = pay - (int)((3500*count)*1.1);
	System.out.println("�Է°� : " + menu + " / �ܵ� : " + cost);
	

	}
}