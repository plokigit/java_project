package com.ict03.class06;

enum Type{
	WALKING, RUNNING, TRACKING, HIKING
}
public class Ex02 {
	String name ;
	int size;
	Type type;
	
	public static void main(String[] args) {
		// ����
		// System.out.println(name);
		// ��ü�� ���� ����� �� �ִ�
		Ex02 shose = new Ex02();
		shose.name = "nike";
		shose.size = 275;
		shose.type = Type.WALKING;
		System.out.println("�Ź��̸� : " + shose.name);
		System.out.println("������ : " + shose.size);
		System.out.println("Ÿ�� : " + shose.type);
	}
}