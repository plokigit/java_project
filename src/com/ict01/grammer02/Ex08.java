package com.ict01.grammer02;
class Ex08{
	public static void main(String[] args){
	// �Ƹ޸�ī�� 2500�� ���̼� ���� ���� �ֹ� �ܵ���? (�ΰ��� 10%)

	int ame = 2500;
	int sum = 2;
	int input = 10000;

	int total = ame*sum;
	int vat = (int)(total*0.1);
	int cost = input - (total+vat);
	System.out.println( "�ܵ� : " + cost + "��");

	//�� �ٸ� ���
	// int total2 = (int)((ame*sum)*1.1);
	// int cost2 = input - (total2);
	// System.out.println( "�ܵ� : " + cost2 + "��");


	
	}
}
	
	