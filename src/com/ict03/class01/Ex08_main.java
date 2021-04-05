package com.ict03.class01;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08 coffee = new Ex08();
		coffee.setName("커피음료");
		coffee.setPrice(1800);

		Ex08 ion = new Ex08();
		ion.setName("이온음료");
		ion.setPrice(1500);

		Ex08 cola = new Ex08();
		cola.setName("탄산음료");
		cola.setPrice(2000);

		Ex08 juice = new Ex08();
		juice.setName("과일음료");
		juice.setPrice(2200);

		// 배열에 넣음
		// 자료형[] 이름 = new 자료형[갯수];
		/*
		 * Ex08[] arr = new Ex08[4]; arr[0] = coffee; arr[1] = ion; arr[2] = cola;
		 * arr[3] = juice;
		 */

		Ex08[] arr = { coffee, ion, cola, juice };

		// arr이 가지고 있는 이름, 가격들 출력
		/*
		 * for (int i = 0; i < arr.length; i++) { System.out.println(arr[i].getName() +
		 * " , " + arr[i].getPrice()); }
		 */

		// 동전 투입
		Scanner scan = new Scanner(System.in);
		System.out.print("입금 : ");
		int input = scan.nextInt();

		// 1500미만이면 금액부족
		// 1500이상이면 구입가능
		if (input < 1500) {
			System.out.println("금액부족");
		} else {
			System.out.println("1.커피\t2.이온\t3.탄산\t4.과일");
			for (int i = 0; i < arr.length; i++) {
				if (arr[i].getPrice() <= input) {
					System.out.print("  o\t");
				} else {
					System.out.print("  x\t");
				}
			}
		}
		System.out.println();

		System.out.print("선택하세요 >> ");
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
			System.out.print("잘못 선택");
		}

		System.out.print("잔돈 : " + output);
		System.out.println();

		// 숙제 잔돈이 남았을 때 다시 물어볼수 있도록 while문 사용
		int coin = 0;
		while (true) {
			if (output < 1500) {
				System.out.println("금액부족");
				break;
			} else {
				System.out.println("1.커피\t2.이온\t3.탄산\t4.과일");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= input) {
						System.out.print("  o\t");
					} else {
						System.out.print("  x\t");
					}
				}
			}
			System.out.println();

			System.out.print("선택하세요 >> ");
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
				System.out.print("잘못 선택");
			}
			output = coin;
			System.out.print("잔돈 : " + output);
			System.out.println();
		}
	}
}
