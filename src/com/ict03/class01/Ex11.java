package com.ict03.class01;

public class Ex11 {
	// ������ : Ŭ������ ��ü�� ���� �� �ڵ����� �� �� ȣ��
	// ���� : ����ʵ�(������ ���)�� �ʱ�ȭ
	// Ư¡ : Ŭ���� �̸� == ������ �̸�
	//		 Ŭ���� �̸�([����=�Ű�����]);
	//		 ��ȯ���� ���� �޼ҵ��� ��
	//		 �����ڸ� ������ ������ �ڵ����� �⺻�����ڷ� ��ü ����
	//		 �⺻������ : ���ڰ� ���� ������ ( = 'Ŭ�����̸�()')
	//		 Ŭ���� �ȿ��� �����ڸ� ��������� ������� �����ڸ� ����ؾ���
	
	//		 �����ڵ� �����ε� ����(�ϳ��� Ŭ������ ������ ������ ���� ����)
	//		 (��, ������ ������ ������ ������ �޶����)
	//		 �����ε��̶� �ϳ��� Ŭ�����ȿ� ���� �̸��� �޼ҵ尡 ������ ����
	//		 (��, ������ ������ ������ ������ �޶����)
	
	private String name = "�Ѹ�";
	private int age = 24;
	private boolean gender = true;
	
	// ������ �����ε�
	// �⺻������
	/*public Ex11() {
		System.out.println("�⺻������");
		name = "�±Ǻ���";
		age = 43;
		// ���� ������ �ᵵ �����ڿ��� ���� �ٲٸ� ��� ���
		// ���� : ����ʵ�(������ ���)�� �ʱ�ȭ
	}*/
	
	// �⺻ �����ڰ� �ƴ� �ٸ� ������(= ���ڰ� �ִ� ������)
	public Ex11(String name, int age) {
		System.out.println(1);
		//Ŭ���� �ȿ��� �����ڸ� ��������� ������� �����ڸ� ���
		this.name = name;	// main���� �޾� �� �� �ٽ� �޾Ƶ���
		this.age = age;
	}
	
	public Ex11(int age, String name) {
		System.out.println(2);
	// ���� ���̸� ������ ������ ������ ������ 
	// �ٲٸ� �ٸ� ������ �ν�
	// main���� ���� ������ �ٲ㼭 �Է����ָ�
	// ���� �´� ������ �����ڷ� ����
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
