package com.ict02.array;

import java.util.Arrays;
import java.util.Collections;
//import java.util.Iterator;

public class Ex03 {
	public static void main(String[] args) {
		// �迭 �����ϱ� (��������)
		int[] su= {3,4,9,5,6,1,7,2,10,8};
		int tmp=0;
		
		for (int i = 0; i < (su.length-1); i++) {
			for (int j = i+1; j < su.length; j++) {
				if (su[i] > su[j]) {
					tmp = su[i];
					su[i] = su[j];
					su[j] = tmp;
				}
			}
		}
		for (int j = 0; j < su.length; j++) {
			System.out.print(su[j] + " ");
		}	System.out.println(); 
		System.out.println("======================");
		
		// sort �޼ҵ�� �ش� �迭�� �������� �ϴ� ���
		// ���� for���̶� ���� ����� ����
		Arrays.sort(su);
		for (int i = 0; i < su.length; i++) {
			System.out.print(su[i] + " ");
		}System.out.println(); 
		
		// �迭 ���� ��������
		int[] su1= {3,4,9,5,6,1,7,2,10,8};
		int tmp1=0;
		
		for (int i = 0; i <(su1.length-1); i++) {
			for (int j = i+1; j <su1.length; j++) {
				if (su1[i] < su1[j]) {
					tmp1 = su1[i];
					su1[i] = su1[j];
					su1[j] = tmp1;
				}
			}
		}
		for (int j = 0; j < su1.length; j++) {
			System.out.print(su1[j]+" ");
		}	System.out.println(); 
		System.out.println("======================");
		
		// ���߿� ���Ŵϱ� �Ű澲��X
		Integer[] su2 = {3,4,9,5,6,1,7,2,10,8};
		
		//Arrays.sort(�迭, Collections.reveresOrder()) = ������������ ���ִ°�
		Arrays.sort(su2, Collections.reverseOrder());
		for (int i = 0; i < su2.length; i++) {
			System.out.print(su2[i] + " ");
		}
	}
}
