package com.ict01.grammer03;
import java.util.Scanner;
class Ex07{
	public static void main(String[] args){
	// scanner Ŭ���� �˾ƺ���
	// scanner�� �Ҽ��� java.util.scanner��
	// java.lang�� �Ҽӵ� Ŭ������ ������� ��밡��
	// �̿��� Ŭ������ �Ҽ��� ǥ���ؾ� �Ѵ�. (import)
	// Ŭ���� �ȿ��� Constructors(������), Method(�޼ҵ�), Field(�ʵ�) ����
	
	// method : ����, ���, �ϴ� ��
	// Ű���忡 �Էµ� ���� scan�� ����
	Scanner scan = new Scanner(System.in);

	System.out.print("����� �̸� : ");
	//�� ����� ������ ������ (������ �� ������ String����)
	// scan.next(); // next�� �����ؼ� �Է��ϸ� �ȵ�
	// ex) ����� �̸� : ȫ �浿 (�̷��� �ϸ� ������)
	String name = scan.next(); 

	System.out.print("���� ���� : ");
	int kor = scan.nextInt();

	System.out.print("���� ���� : ");
	int eng = scan.nextInt();

	System.out.print("���� ���� : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	System.out.println("���� : " + sum);

	// ���� ������ double�� ����
	System.out.print("����� Ű : ");
	double height = scan.nextDouble();

	// ���� ���� boolean������ ���
	System.out.print("����� �����Դϱ�(true/false) : ");
	boolean gender =  scan.nextBoolean();
	String str = gender? "����" : "����" ;
	System.out.println(str);
	

	}
}