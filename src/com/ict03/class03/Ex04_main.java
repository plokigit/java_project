package com.ict03.class03;

public class Ex04_main {
	public static void main(String[] args) {
		Ex03 t1 = new Ex03();
		System.out.println(t1);
		// �ڽ��� ȣ���� ������ ���ٰ� �ڽſ��� �ǵ��ƿ�
		// �׷��� �θ�Ŭ���� ������ ���ڰ� ���� ������ �ڽ� Ŭ������ ��
		
		// �θ�� �ڽ��� �������� ���� ������ ������
		// �ڽ� ����� ���� ���
		 System.out.println(t1.name);
		 // �ڽĿ��� ���� �����
		 // �θ𿡰� �ִ� ����� ���
		 System.out.println(t1.addr);
		 
		 // �޼ҵ嵵 ��������
		 t1.sound();
		 t1.prn();
		 System.out.println("===================");
		 // static�� ��ü ������ ���X
		 System.out.println(Ex03.hobby);
		 System.out.println(Ex02.car);
		 
		// �ڽİ� �θ� ���� �޼ҵ带 ������ ������
		// �ڽ� �޼ҵ带 ����
		t1.eat();
	}
}
