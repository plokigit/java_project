package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBulider
		// => ���ڿ��� ����ϰ� ����, ����, �߰��� ��� ����� ����
		
		String msg = "hello";
		System.out.println(msg);
		
		// String�� �Һ��� �Ӽ��� ������ �־� 
		// �޸𸮿� ���ο� ������ �����ؼ� ���� ����
		msg = msg + " java";
		System.out.println(msg);
		
		// StringBuffer�� ������ �Ӽ��� ������ �־�
		// ���� �������� ������ �߰���
		StringBuffer sb = new StringBuffer("welcome ");
		System.out.println(sb);
		
		//������ �߰��Ҷ� ( append("���ڿ�"); )
		sb.append("JAVA");
		System.out.println(sb.toString());
	}
}
