package com.ict03.class01;

public class Ex03_main {

	public static void main(String[] args) {
		// Ex03 Ŭ������ ��ü�� �����
		Ex03 test = new Ex03();
		
		// plus01�� void�̹Ƿ� ���� �����Ͱ� ����
		System.out.println(1);
		test.plus01();
		System.out.println(2);
		System.out.println(test.result);
		
		// sub01�� ��ȯ���� int
		// ���� ������ int�� ��������
		int sub = test.sub01();
		System.out.println(sub);
	}
}