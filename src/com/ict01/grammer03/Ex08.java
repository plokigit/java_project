package com.ict01.grammer03;
import java.util.Scanner;

class Ex08{
	public static void main(String[] args){
	// ���ڸ� �޾Ƽ� Ȧ¦ ����

	Scanner scan = new Scanner(System.in);

	System.out.print(" ���ڸ� �Է� : ");
	int num = scan.nextInt();

	String num2 = (num%2 == 0)? "¦��" : "Ȧ��";
	System.out.println(" �Է��� ���� : " + num + "�� " + num2);

	// ������ ������ �޾Ƽ� ������ ����� 60�̻�,
	// ���� ������ 40�� �̻��϶� �հ�, �ƴϸ� ����

	System.out.println();
	System.out.print("�������� : ");
	int kor = scan.nextInt();

	System.out.print("�������� : ");
	int eng = scan.nextInt();

	System.out.print("�������� : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	double avg = (int)(sum/3.0*10)/10.0;	

	String pass = (avg >= 60 && kor>=40 && eng>=40 && math >= 40)?
			 "�հ�" : "���հ�";
	System.out.println(" ����� " + pass + " �Դϴ�.");

	// �˹ٽð��� �Է� �޾Ƽ�
	// �ð��� 8720���̳� 8�ð� �ʰ��� �ð���ŭ 1.5��
	// ���� �ݾ���?
	
	System.out.println();
	System.out.print("�˹� �ð� : ");
	int part = scan.nextInt();
	int min = 8720;

	int pay = (part > 8)? (8*min)+(int)((part-8)*1.5*min) : (part*min);
	System.out.println(" ���� �ϱ� " + pay);
	

	}
}