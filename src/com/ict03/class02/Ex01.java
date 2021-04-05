package com.ict03.class02;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		// stringŬ����
		String str1 = "abc";
		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("=== �ֿ� �޼ҵ� ===");
		String msg = "�ѱ� ICT ���� ���߿� 1������";
		// 1. charAt(int index) : char
		// ��ġ���� �޾Ƽ� �� ��ġ�� �����ϴ� ���ڸ� ��ȯ
		// �̶� ��ġ��(index�� 0����)
		char c1 = msg.charAt(7); // �ѱ� ICT ���� ���߿� 1������
									// 0 1 234567 �̹Ƿ� '��'�ڰ� ���� ���⵵ ������

		// ���� ���� �߿� �ҹ��ڸ� �빮�ڷ� ����
		// a = 97 / A = 65
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ������ : length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

		// 2. concat(String str)
		// ������ ���ڿ��� �� ���ڿ� ���� ����
		String msg1 = "���ѹα�";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2); // ����
		System.out.println();

		// 3. contains(String s) : boolean
		// ���� ���ڿ��� �ش繮�ڿ��� �����ϸ� true, �������� ������ false
		msg = "���� I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("����");
		} else {
			System.out.println("���� X");
		}
		System.out.println();

		// 4. equals(Object anObject) : boolean
		// ���� ���ڿ��� ���� ���ڿ� ������ T , �ٸ��� F(��ҹ��� ����)

		// 5. equalsIgnoreCase(String anotherString) : boolean
		// ���� ���ڿ��� ���� ���ڿ� ������ T , �ٸ��� F(��ҹ��� ����X)
		// ** ���� ) ���ڿ��̳� ��ü�� ���� �� (String�϶�, ���ڴ� '==' ���� ����)
		// '=='�� ����ϸ� �ּҰ� ���İ� ���°���
		// ���� ���ڿ����� '=='�� �ƴ϶� equals �Ǵ� equalsIgnoreCase�� ����ؾ���

		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");

		System.out.println(s1 == s2); // false '==' �Ἥ �ּҰ� ���İ� ������ ������
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul"; // �̶��� �ּҰ� ���Ƽ� true��� ����
		s2 = "seoul"; //
		System.out.println(s1 == s2); // �ּ� ����
		System.out.println(s1.equalsIgnoreCase(s2)); // ���� ����

		// 6. format(String format, Object... args) : static string
		// ������ �����ϰ� ���Ŀ� �°� ����
		// %s�� ���ڿ�, %d�� ����, %f �Ǽ�(�ݿø���)
		String msg4 = "�ѱ� ICT ���� ���߿�";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s�� ���۳⵵�� %d���̰� ��� ������ %.2f�̴�.", msg4, s5, s6);
		System.out.print(msg5);
		System.out.println();

		// 7. getBytes() : byte[]
		// �ش� ���ڿ��� byte[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���Ҷ� ���(������, ��ҹ���, ���ڸ� ����)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print((char) (b[i]) + " : " + b[i]);
		}
		System.out.println();

		// �ݴ�� �ش� byte �迭�� ���ڿ��� ������� ����(String �������̿�)
		String msg7 = new String(b);
		System.out.print(msg7);
		System.out.println();

		// 8.tocharArray() : char[]
		// �ش� ���ڿ��� char[]�� �����Ų��.
		// ���� ��/��� ��Ʈ���Ҷ� ��� (������ ���� ����)
		String msg8 = "�ڹ�8 java8 �������� 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		// �ݴ�� �ش� char�迭�� ���ڿ��� ���� ���� ����(String ������ �̿�)
		String msg9 = new String(c);
		System.out.print(msg9);
		System.out.println();

		// 9. indexOf(int ch) : int
		// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.

		// 10. indexOf(int ch, int fromIndex) : int
		// ���ڿ� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1. ��� ������ġ�� ����.

		// 12. indexOf(String str) : int
		// ���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
		// ������ġ�� ó������, ã�� ���ڰ� ������ -1

		// 13. indexOf(String str, int fromIndex) : int
		// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
		// ã�� ���ڰ� ������ -1. ��� ������ġ�� ����.

		String msg10 = "BufferedReader";
		// e�� ã�ƶ�
		int k1 = msg10.indexOf('e');
		System.out.println(k1);

		// �ι�° e�� ã�¹�
		// k1 = msg10.indexOf('e', 5); // 5��° ��ġ���� ã�����. (ù��° e�� 4��ġ�� �����Ƿ�)
		k1 = msg10.indexOf('e', msg10.indexOf('e') + 1); // 5��° ��ġ���� ã�����. (ù��° e�� 4��ġ�� �����Ƿ�)
		System.out.println(k1);

		// ����° e�� ã�¹�
		// �ι�° e�� ��ġ 6
		k1 = msg10.indexOf('e', msg.indexOf('e', msg10.indexOf('e') + 1) + 1);
		System.out.println(k1);

		// ���� ���� ã�� ('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1); // ��� : -1

		b1 = msg10.contains("A");
		System.out.println(b1); // ��� : false

		// char���� String���� ã��
		k1 = msg10.indexOf("er");
		System.out.println(k1);

		// �ι�° er ã��
		k1 = msg10.indexOf("er", msg10.indexOf("er") + 1);
		System.out.println(k1);

		// 11. lastIndexOf(int ch) : int
		// lastIndexOf(String str) : int
		// ã�� ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);

		// 12. isEmpty() : boolean
		// ���ڿ��� ���̰� 0�̸� T, �ƴϸ� F
		// ��������� T, �ƴϸ� F
		// 13. length() : int
		// ���ڿ��� ���̸� ���ڷ� ǥ��
		String msg11 = ""; // null�̶��� �ٸ�
		String msg12 = "java";

		System.out.println(msg11.isEmpty()); // true
		System.out.println(msg12.isEmpty()); // false

		System.out.println(msg11.length()); // 0
		System.out.println(msg12.length()); // 4
		System.out.println();

		// 14. replace(char oldChar, char newChar) : String
		// replace(CharSequence target, String replacement) : Stirng
		// ���ڳ� ���ڿ��� �޾Ƽ� ġȯ�� �� ����
		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('��', '��');

		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);

		// ** 15. split(String regex) : String[]
		// �����ڸ� �޾Ƽ� �迭�� ������. (�迭ũ��� �˾Ƽ� �ڵ�����)
		// split(String regex, int limit) : String[]
		// �����ڸ� �޾Ƽ� �迭�� ������. (limit�� �迭�� ũ��)
		String msg17 = "���,����,����,������,���ξ���";
		String[] res = msg17.split(","); // ,�� �������ּ���
		// System.out.println(res[0]); // ���
		// System.out.println(res[1]); // ����

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();

		String[] res2 = msg17.split(",", 3); // ,�� �������� 3���� �������ּ���
		System.out.println(res2[0]); // ���
		System.out.println(res2[1]); // ����
		System.out.println(res2[2]); // ����, ������, ���ξ���
		// ,�� �������� ���������Ƿ� , , �� ����~���ξ��� �� ���� ���
		
		// 16. substring(int beginIndex) : String
		//	  ������ġ�� �޾Ƽ� �ش� ���ڿ� ������ ���ڿ� ����
		//	  substring(int beginIndex, int endIndex) : String
		//	  ������ġ�� �� ��ġ�� �޾Ƽ� �ش� ���ڿ� ���� (�� ��ġ�� ���� �ȵ�)
		
		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		System.out.println(res4); // 7979-9999�� ���� ������ġ�� 4�̹Ƿ�
		
		String res5 = msg18.substring(4,8);
		System.out.println(res5); // 7979
		// ����ġ�� ���� �ȵǹǷ� 8��° '-'���� ���Խ��Ѿ� 7979�� ����
		
		String res6 = msg18.substring(msg18.indexOf('-')+1,msg18.lastIndexOf('-'));
		System.out.println(res6); // 7979
		// ���� �̷������� ��
		
		String msg19 = "770707";
		// �¾ �⵵ ����
		String res7 = msg19.substring(0, 2);
		// �� ����
		String res8 = msg19.substring(2, 4);
		
		// 17. toLowerCase() : String
		//	   �ش� ���ڿ��� ��� �빮�ڸ� �ҹ��ڷ� ����
		//	   toUpperCase() : String
		//	   �ش� ���ڿ��� ��� �ҹ��ڸ� �빮�ڷ� ����
		
		String msg20 = "�ڹ�8 java8 Java8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		System.out.println();
		
		// 19. toString() : String
		// String�� toString() : ���ڿ� ��ü�� ��ȯ
		// Object�� toString() : ��� ��ü���� ��밡��
		//						 ��ü�� ������ �ִ� ������ ������ ���ڿ��� ������ �� ���
		//						 (�������̵��� �� �ٽ� ����)
		String msg21 = "java8 Java8 �ڹ�8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
		
		// 20. trim() : String
		// �ش� ���ڿ��� ��, �� �ִ� ���� ����, �߰� ������ ����X
		// (�߰� ������ ���� �����)
		
		String msg22 = "      java �ڹ� JAVA      ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length());
		System.out.println(msg22.trim().length());
		System.out.println();
		
		// 21. valueOf(�����ڷ���) : static String
		// � �ڷ����̵� String���� �����Ų��.
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// ���� �ڷ����� +1;
		// System.out.println(p1+1); boolean�� + ���� �Ұ���
		System.out.println(p2+1);
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		// String���� ������Ѽ� +1
		System.out.println(String.valueOf(p1)+1); // "true"�� String ���
		System.out.println(String.valueOf(p2)+1); // "d"
		System.out.println(String.valueOf(p3)+1); // "100"
		System.out.println(String.valueOf(p4)+1); // "100"
		System.out.println(String.valueOf(p5)+1); // "100.0"
		System.out.println(String.valueOf(p6)+1); // �տ��� ���� ���
		
		// �������
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		
		// 21�� �ݴ밳�� : ���� �ڷ��� ����� ���ڿ��� ���� �ڷ������� ����
		// ex. "1" = string������ �̰� 1 = int��
		// Wrapper Class(Boolean, Byte, Short, Integer, Long, Float, Double, )
		//				 parseXXXX(String s) �޼ҵ带 �̿��ؼ� ����(Char ����)
		// : �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� ���� ��Ű�� Ŭ������
		//	 ���� �ǹ̴� �⺻�ڷ����� ��ü�� ���� �� ����ϴ� Ŭ����
		//	 ������ �ڵ����� ������� => ���� �ڽ�
		//	 �⺻ �ڷ��� => ��ü�� �ڵ����� ����(����ڽ�)
		//	 ��ü�� => �⺻ �ڷ��� �ڵ����� ����(�����ڽ�)
		
		// 1. boolean������ ���ڿ��� boolean������ ����
		// Boolean.parseBoolean("true"); Boolean.parseBoolean("����������") => false

		// msg = "true"; // ���漺��
		msg = "0"; // ���漺��2
		
		Boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("���漺��");
		}else {
			System.out.println("���漺��2");
		}System.out.println();
		
		// 2. int������ ���ڿ��� int������ ���� : Integer.parseInt(String s)
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(a2 + 10);
		
		// char ������ ���ڿ��� char������ ������ �޼ҵ�� ����
		// (��, Character Ŭ������ ����)
		// ���ڿ����� charAt(��ġ��) �̿��ϸ� ��
		msg = "C";
		char a3 = msg.charAt(0);
		System.out.println(msg + 1); // C1
		System.out.println(a3 + 1);  // 68
		System.out.println((char)(a3 + 1)); //D
		
		// �ֹι�ȣ ���ڸ� �޾Ҵ� ? ���̸� ������
		String jumin = "970107";
		String gender = "1";
		// ���ڸ� ���ڸ�
		String year = jumin.substring(0, 2);
		int y_year = Integer.parseInt(year);
		
		// ���ڸ� ���ڸ��� 19�� 20�� ��������
		// gender�� 1�Ǵ� 2�� 19 3�Ǵ� 4�� 20
		if(gender.equals("1") || gender.equals("2")) {
			y_year = y_year + 1900;
		}else if(gender.equals("3") || gender.equals("4")) {
			y_year = y_year + 2000;
		}
		
		// (���س⵵ - ���ѳ⵵) + 1
		int age = 2021 - y_year + 1;
		System.out.println("���̴�" + age + "�Դϴ�.");
	}
}
