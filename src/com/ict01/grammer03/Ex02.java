package com.ict01.grammer03;
class Ex02{
	public static void main(String[] args){
	

	int s1 = 10;
	int s2 = 7;

	boolean result = false || false;
	System.out.println("��� : " + result);

	result = (s1 >= 15) || (s2 <= 5);
	System.out.println("��� : " + result);

	result = true || false;
	System.out.println("��� : " + result);

	result = (s1 >= 15) || (s2 >= 5);
	System.out.println("��� : " + result);


	// OR�� true�� ������ �ڿ� ������ ���� �ʴ´�.
	result = ((s1 = s1 + 2) > 20) || (s1 == (s2 = s2 + 5));
	System.out.println("��� : " + result);	// true
	System.out.println("s1 : " + s1); // 12
	System.out.println("s2 : " + s2); // 12

	result = ((s1 = s1 + 2) < 20) || (s1 == (s2 = s2 + 5));
	System.out.println("��� : " + result); // true
	System.out.println("s1 : " + s1); // 14
	System.out.println("s2 : " + s2); // 12

	// ! ����
	result = true;
	System.out.println(!result); // false
	System.out.println(!!result); // true
	System.out.println(!!!result); // false

	}
}