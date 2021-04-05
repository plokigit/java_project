package com.ict01.grammer02;
class Ex03{
	public static void main(String[] args){
	
	byte s1 = -127;
	System.out.println(s1);

	s1 = -128;
	System.out.println(s1);

	// s1 = -129;	바이트 범위가 벗어나서 오류남
	// System.out.println(s1);

	// short s2 = 32760 + 100; 	범위 벗어가서 오류
	// System.out.println(s2);

	float s7 = 3.14f;
	System.out.println(s7);

	double s8 = 3.14;
	System.out.println(s8);

	double s9 = 117;
	System.out.println(s9);
	}
}