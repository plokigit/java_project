package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("Ŀ������");
		coffee.setPrice(1800);

		Ex08 ion = new Ex08();
		ion.setName("�̿�����");
		ion.setPrice(1500);

		Ex08 cola = new Ex08();
		cola.setName("ź������");
		cola.setPrice(2000);

		Ex08 juice = new Ex08();
		juice.setName("��������");
		juice.setPrice(2200);

		// �迭�� ����
		// �ڷ���[] �̸� = new �ڷ���[����];
		/*
		 * Ex08[] arr = new Ex08[4]; arr[0] = coffee; arr[1] = ion; arr[2] = cola;
		 * arr[3] = juice;
		 */

		Ex08[] arr = { coffee, ion, cola, juice };

		// arr�� ������ �ִ� �̸�, ���ݵ� ���
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i].getName() +
		 * " , " + arr[i].getPrice()); }
		 */

		// ���� ����
		Scanner scan = new Scanner(System.in);
		System.out.print("�Ա� : ");
		int input = scan.nextInt();

		// 1500�̸��̸� �ݾ׺���
		// 1500�̻��̸� ���԰���
		if (input < 1500) {
			System.out.println("�ݾ׺���");
		} else {
			System.out.println("1.Ŀ��\t2.�̿�\t3.ź��\t4.����");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("  o\t");
				} else {
					System.out.print("  x\t");
				}
			}
		}
		System.out.println();

		System.out.print("�����ϼ��� >> ");
		int drink = scan.nextInt();
		int output = 0;

		if (drink == 1) {
			output = input - arr[0].getPrice();
		} else if (drink == 2) {
			output = input - arr[1].getPrice();
		} else if (drink == 3) {
			output = input - arr[2].getPrice();
		} else if (drink == 4) {
			output = input - arr[3].getPrice();
		} else {
			System.out.print("�߸� ����");
		}

		System.out.print("�ܵ� : " + output);
		System.out.println();

		// ���� �ܵ��� ������ �� �ٽ� ����� �ֵ��� while�� ���
		int coin = 0;
		while (true) {
			if (output < 1500) {
				System.out.println("�ݾ׺���");
				break;
			} else {
				System.out.println("1.Ŀ��\t2.�̿�\t3.ź��\t4.����");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= input) {
						System.out.print("  o\t");
					} else {
						System.out.print("  x\t");
					}
				}
			}
			System.out.println();

			System.out.print("�����ϼ��� >> ");
			drink = scan.nextInt();

			if (drink == 1) {
				coin = output - arr[0].getPrice();
			} else if (drink == 2) {
				coin = output - arr[1].getPrice();
			} else if (drink == 3) {
				coin = output - arr[2].getPrice();
			} else if (drink == 4) {
				coin = output - arr[3].getPrice();
			} else {
				System.out.print("�߸� ����");
			}
			output = coin;
			System.out.print("�ܵ� : " + output);
			System.out.println();
		}
	}
}