package com.ict01.grammer02;
class Ex06{
	public static void main(String[] args){
	// ��������� : + - * / %
	// �����ڷ����� ū�ڷ����� �����ϸ� ū�ڷ������� ���
	

	// �� ���� ����
	int k1 = 21755; // ����ؾ� �Ǵ� �� => 2175
	// int s1 = k1 / 10; // 2175
	// int s2 = s1 * 10; // 21750

	int s3 = (k1 / 10) * 10; // s1, s2 ������ ��ģ ��
	System.out.println(" s3 = " + s3);

	int s4 = (21755 / 10) * 10; // �ƿ� ó������ ������������ ����
	System.out.println(" s4 = " + s4);

	//�Ҽ��� ù°�ڸ����� ���ϱ�
	double k2 = 24.6843; // => 24.6
	int s5 = (int)(k2 * 10);	 // 246
	// double s6 = s5 / 10;	//24.0 => s5 : int / 10 : int�� ���� �Ҽ��� ���ư�
	double s6 = s5 / 10.0; //�̷��� �������
	System.out.println(" s6 = " + s6);
	
	double s7 = (int)(k2*10)/10.0; // ó������ ������������ ���ϱ�
	System.out.println(" s7 = " + s7);


	// % = ������

	int su1 = 7;
	int su2 = 3;
	int res1 = 7/3;
	int res2 = 7%3;	
	
	}
}