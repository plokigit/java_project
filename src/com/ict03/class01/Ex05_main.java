package com.ict03.class01;

public class Ex05_main {
	public static void main(String[] args) {
		// static ��ü ������ ������� ��밡��
		// Ŭ�����̸�.����ʵ�, Ŭ�����̸�.����޼ҵ�
		 System.out.println(Ex05.s3);
		 
		 //static�̶� private�� ���� �Ұ�
		 //System.out.println(Ex05.s4);
		 
		 Ex05 test = new Ex05();
		 System.out.println(test.s1);
		 
		 //private�� ���� �Ұ�
	//	 System.out.println(test.s2);
		 System.out.println(test.s3);
		 
		 // �޼ҵ�鵵 ��������
		 test.add();
		 
		 //���پȵ�
		 //test.add2();
		 
		 test.add3();
	}
}
