package com.ict01.grammer03;
class Ex06{
	public static void main(String[] args){
	// ��ø ���� ������ : ���� �����ڰ� ��ø �� ��
	// char k1�� �빮������, �ҹ�������, ��Ÿ�������� �Ǻ�

	char k1 = 'd';
	String res1 = (k1 >=  'A' && k1 <= 'Z')? "�빮��"
			 :(k1 >= 'a' && k1 <= 'z')? "�ҹ���" : "��Ÿ����" ;
	System.out.println("��� : " + res1); // �ҹ���

	// int k2�� 90�̻��̸� A����, 80�� �̻��̸� B����, �������� F
	int k2 = 95;
	char grade = (k2 >= 90)? 'A' : (k2 >= 80)? 'B' : 'F';
	System.out.println("��� : ������ " + grade); // 
	
	
	// int k3�� 1�Ǵ� 3�̸� ��, 2�Ǵ� 4�̸� ����, �������� �ܱ���
	int k3 = 1;
	String gender = (k3 == 1 || k3 == 3)? "��" 
			: (k3 == 2 || k3 == 4)? "��" : "�ܱ���";
	System.out.println("��� : ������ " + gender); // 

	 

	}
}