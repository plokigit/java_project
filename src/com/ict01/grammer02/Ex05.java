package com.ict01.grammer02;
class Ex05{
	public static void main(String[] args){
	// �ڷ��� : DataType : �ڹٿ��� ������ ó���Ҷ� �����ϴ� ����
	// 1. �⺻�ڷ��� : �����Ϸ��� ���ؼ� �ؼ��Ǵ� �ڷ���
	// boolean, char, byte,	

	// String : �����ڷ��������� �⺻�ڷ���ó�� ���
	String str = "Hello java";
	System.out.println(str);

	// String  + ���� : ���ϱ� ������ �ƴ϶� ���ڸ� �����ϴ� ������ ��
	// String���� + ������ �ϸ� ����� ������ String

	String k1 = "1000";
	int k2 = 1000;
	System.out.println(k1+10);
	System.out.println(k2+10);

	int s1 = 20;
	int s2 = 4;
	System.out.println(s1 + s2);
	System.out.println("��� : " + s1 + s2); // ��� : ��� : 204
	System.out.println("��� : " +( s1 + s2)); // ��� : ��� :24
	}
}