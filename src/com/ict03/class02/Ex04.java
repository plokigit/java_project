package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// ����(0)����(1)��(2)
		// �����ϼ��� ����ұ��? �̱�·�

		Scanner scan = new Scanner(System.in);

		
		double count = 0;
		double all = 0;

		
		while (true) {
			
			all = all+1;
			System.out.print("����(0) : ����(1) : ��(2) / ���� : ");
			int user = scan.nextInt();
			System.out.println("=====================");
			
			int rsp = (int) (Math.random() * 3);
			switch (rsp) {
			case 0:
				System.out.println("��ǻ�� : ����");
				if (rsp == user) {
					System.out.println("���");
				} else if (user == 1) {
					System.out.println("�̱�");
					count = count+1;
				} else if (user == 2) {
					System.out.println("��");
				}
			case 1:
				System.out.println("��ǻ�� : ����");
				if (rsp == user) {
					System.out.println("���");
				} else if (user == 0) {
					System.out.println("�̱�");
					count = count+1;
				} else if (user == 2) {
					System.out.println("��");
				}
			case 2:
				System.out.println("��ǻ�� : ��");
				if (rsp == user) {
					System.out.println("���");
				} else if (user == 1) {
					System.out.println("�̱�");
					count = count+1;
				} else if (user == 0) {
					System.out.println("��");
				}
			default:
				break;
			}
			
			System.out.println();
			System.out.print("����ұ��? (y : 1 / n : 2) >> ");
			int game = scan.nextInt();
			System.out.println("=====================");
			
			if(game == 1) {
				continue;
			}else if (game == 2) {
				double per = (count/all)*100;
				System.out.println("��ü �� : " + (int)all + " " + "�̱� �� : "  + (int)count);
				System.out.println( "�·� "+ (int)per+ " %");
				break;
				}
			
		}

		// ���� ) 010-7777-9999 => 010-XXXX-9999, 010-7777-XXXX
		
		String quiz = "010-7777-9999";
		String[] anser = quiz.split("-"); // -�� ���� 010(0) / 7777(1) / 9999(2)��
		anser[1] = anser[1].replace(anser[1], "- XXXX -"); // anser1 ��ü�� XXXX�� �ٲ�
		// anser[2] = anser[2].replace(anser[2], "XXXX");
		for (int i = 0; i < anser.length; i++) {
			System.out.print(anser[i]);
		}

		// ����) ������ �����ϱ���
		// ���ھ߱� ���� 3�� ���س��� (0 ~ 9����)
		// ���� ���� ��ġ���� ���߸� ��Ʈ����ũ/ ���� ���� �ٸ� ��ġ �� / ���ڰ� �ȸ����� 1 �ƿ�
		// 3�ƿ� �� ���ӿ��� / ���߸� ���� (��ȸ : 9��)
	}
}
