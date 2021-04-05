package com.ict03.class02;

import java.util.Random;
import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		// 가위(0)바위(1)보(2)
		// 선택하세요 계속할까요? 이긴승률

		Scanner scan = new Scanner(System.in);

		
		double count = 0;
		double all = 0;

		
		while (true) {
			
			all = all+1;
			System.out.print("가위(0) : 바위(1) : 보(2) / 선택 : ");
			int user = scan.nextInt();
			System.out.println("=====================");
			
			int rsp = (int) (Math.random() * 3);
			switch (rsp) {
			case 0:
				System.out.println("컴퓨터 : 가위");
				if (rsp == user) {
					System.out.println("비김");
				} else if (user == 1) {
					System.out.println("이김");
					count = count+1;
				} else if (user == 2) {
					System.out.println("짐");
				}
			case 1:
				System.out.println("컴퓨터 : 바위");
				if (rsp == user) {
					System.out.println("비김");
				} else if (user == 0) {
					System.out.println("이김");
					count = count+1;
				} else if (user == 2) {
					System.out.println("짐");
				}
			case 2:
				System.out.println("컴퓨터 : 보");
				if (rsp == user) {
					System.out.println("비김");
				} else if (user == 1) {
					System.out.println("이김");
					count = count+1;
				} else if (user == 0) {
					System.out.println("짐");
				}
			default:
				break;
			}
			
			System.out.println();
			System.out.print("계속할까요? (y : 1 / n : 2) >> ");
			int game = scan.nextInt();
			System.out.println("=====================");
			
			if(game == 1) {
				continue;
			}else if (game == 2) {
				double per = (count/all)*100;
				System.out.println("전체 판 : " + (int)all + " " + "이긴 판 : "  + (int)count);
				System.out.println( "승률 "+ (int)per+ " %");
				break;
				}
			
		}

		// 숙제 ) 010-7777-9999 => 010-XXXX-9999, 010-7777-XXXX
		
		String quiz = "010-7777-9999";
		String[] anser = quiz.split("-"); // -로 나눔 010(0) / 7777(1) / 9999(2)임
		anser[1] = anser[1].replace(anser[1], "- XXXX -"); // anser1 전체를 XXXX로 바꿈
		// anser[2] = anser[2].replace(anser[2], "XXXX");
		for (int i = 0; i < anser.length; i++) {
			System.out.print(anser[i]);
		}

		// 숙제) 다음주 월요일까지
		// 숫자야구 숫자 3개 정해놓고 (0 ~ 9까지)
		// 같은 숫자 위치까지 맞추면 스트라이크/ 같은 숫자 다른 위치 볼 / 숫자가 안맞으면 1 아웃
		// 3아웃 시 게임오버 / 맞추면 종료 (기회 : 9번)
	}
}
