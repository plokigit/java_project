package com.ict02.array;

public class Ex08 {
	
	public static void main(String[] args) {
		// ������ �迭 �� ��������
		// 1���� �迭 �ȿ� �����ϴ� �迭�� ũ�Ⱑ ���� �ٸ� �迭�� ���Ѵ�.
		// ���� -> ���� -> ����������
			
		char[][] ch1;
		ch1 = new char[3][];
		
		//�������� ������ �Է��� ��������ó�� �ϸ� ���� �߻�
		// ch1[0][0] = 'j';
		// ch1[0][1] = 'a'; �̷������� �Է��ϸ� ����
		
		// 1���� �迭 ���� ������ �迭�� �ֱ�
		char[] c1 = {'j', 'a', 'v', 'a'};
		char[] c2 = {'J', 'S', 'P'};
		char[] c3 = {'A', 'n', 'd', 'r', 'o', 'i', 'd'};
		
		ch1[0] = c1;
		ch1[1] = c2;
		ch1[2] = c3;
		
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j]);
			}System.out.println();
		}System.out.println("=======================");
		
		//���� ���� ������ ���� �� ����
		char[][] ch2 = {{'J', 'A', 'V', 'A'}, {'��', '��'}, {'1', '2', '3'}};
		
		for (int i = 0; i < ch2.length; i++) {
			for (int j = 0; j < ch2[i].length; j++) {
				System.out.print(ch2[i][j]);
			}System.out.println();
		}System.out.println("=======================");
	}
}

