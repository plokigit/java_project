package com.ict03.class01;

import java.util.Scanner;

public class Ex12_main {
		// 5���� �̸�, ������ ������ �޾�
		// �̸�, ����, ���, ����, ���� ���ϱ�
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex12[] arr = new Ex12[5]; // Ŭ������ �����ϴ� �迭
	
		for(
		int i = 0; i<arr.length; i++)
		{
			System.out.print("�̸� : ");
			String name = scan.next();
			System.out.print("���� : ");
			int kor = scan.nextInt();
			System.out.print("���� : ");
			int eng = scan.nextInt();
			System.out.print("���� : ");
			int math = scan.nextInt();
	
			Ex12 person = new Ex12(name, kor, eng, math);
			arr[i] = person;
		}
	
		// ����
		for(
		int i = 0;i<arr.length;i++)
		{
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j])
					continue;
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
	
		// ����
		// �ڸ��� �����ϱ� ���� �ӽ�����
		Ex12 tmp = new Ex12();
		for(
		int i = 0;i<arr.length-1;i++)
		{
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		// ���
	
		for(
		int i = 0;i<arr.length;i++)
		{
			System.out.print(arr[i].getName() + " " + arr[i].getSum() + " " + arr[i].getAvg() + " " + arr[i].getHak() + " "
					+ arr[i].getRank());
			System.out.println();
		}
	}
}
