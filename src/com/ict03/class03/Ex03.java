package com.ict03.class03;

public class Ex03 extends Ex02 { 
	// �� extends Ex02�� ���� Ex03�� Ex02�� ��Ӱ��谡 ��
	// �ڽ��� �θ���� ���� �� �� O �ݴ�� X
	String name = "���θ�";
	int age = 34;
	// private String hobby = "��ȭ����";
	static String hobby = "��ȭ����";
	
	public Ex03() {
		System.out.println("�ڽ�Ŭ���� ������ : " + this);
	}
	
	public void sound() {
		System.out.println("�ڽ�Ŭ���� �޼ҵ�");
	}
	
	public void study() {
		// ��ü �������� �θ�Ŭ������ ����� ����� ��
		System.out.println("������� : " + addr);
		
		System.out.println("name : " + this.name);	// ���θ� // this = ����
		System.out.println("name : " + super.name); // ������ 
							// super = �ڽ� Ŭ�������� �θ� ������ ����
		
	//	System.out.println("�츮�� �ֿϵ��� : " + dog); 
		// ��Ӱ���� dog�� private�̶� �� ���پ�
		
	}
	
	// �������̵� : �θ�޼ҵ带 �Ѹ���� �״�� ����ϸ鼭
	//	(������)	���븸 �����ϴ� ��
	@Override
	public void eat() {
		System.out.println("��ħ���� ����");
	}
	
	// �������̵��� �� �� ���� �ϴ� ����� = final
	// �θ�޼ҵ忡 final�� ������ @Override �Ұ�
	
}
