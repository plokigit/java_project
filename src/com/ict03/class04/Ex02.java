package com.ict03.class04;

// �Ϲ����� Ŭ������ �߻� Ŭ������ ����ϸ�
// �ݵ�� �߻�Ŭ������ �߻�޼ҵ带 �������̵� �ؾ���
class Ex02 extends Ex01{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ ������
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("�뷡");
	}
}

// �������̵��� ���� �ʴ� ��� : �ڽ�Ŭ������ �߻�Ŭ������ ������
// �θ��� �߻�޼ҵ带 ��üȭ���� �ʾ���
// �߻�޼ҵ� �߰�����
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("����");
	}
	public abstract void pop() ;
	
	
	// ���⼭ Ex03 04�� ������� ������ ���� ���ο� Ŭ������ ���鶧 Ex05���� ����
}