package com.ict03.class07;

public class Ex03 {
	String name = "�Ѹ�";
	int hight = 160;
	public Ex03() {
		System.out.println("�ܺ� : " + this);
	}

	public void sound() {
		String addr = "����";
		System.out.println("ȣ��~ ȣ��~");
	}

	// ����Ŭ������ ���� �޼ҵ�
	public void play() {
		int age = 24;
		class Inner02 { // public ����
			String name = "����";
			int time = 36;

			public Inner02() {
				System.out.println("���� : " + this);
			}
			public void hobby() {
				 System.out.println(name);
				 System.out.println(hight);
				// System.out.println(addr); ���� ���� ���� �޼ҵ尡 �ƴ϶�
				 System.out.println(age);
				 System.out.println(time);
			} // ���θ޼ҵ� ��
		} // ����Ŭ���� ��
		
		// Ex03_main�� �ִ� ����
		// ����Ŭ������ ���� ����Ŭ������ ���� �޼ҵ��� ��
		// ���̿��� ��ü�� �����ؾ� ��
		Inner02 in02 = new Inner02();
		// �ܺθ����
		System.out.println(name);
		// �ܺθ޼ҵ��
		sound();
	} // �ܺθ޼ҵ� ��
}
