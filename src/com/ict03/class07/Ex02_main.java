package com.ict03.class07;

public class Ex02_main {
	public static void main(String[] args) {
		// Member ����Ŭ������ ������ ��ü ����X
		// Inner01 t1 = new Inner01();
		
		// �ܺ�Ŭ������ ���ؼ� ����Ŭ���� ��밡��
		// ����Ŭ���� �ּҸ� ���� '$'�� ����
		Ex02 t1 = new Ex02();
		Ex02.Inner01 t2 = t1.new Inner01();
		System.out.println(t1.name);
		System.out.println(t2.i2);
		System.out.println(t2.i4);
		System.out.println();
		t2.play();
	}
}
