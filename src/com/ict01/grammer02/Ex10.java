package com.ict01.grammer02;
class Ex10{
	public static void main(String[] args){
	// 증감 연산자 : ++ --
	
	int s1 = 10;
	int s2 = 10;

	System.out.println(++s1 + 2); // 출력값 13 (먼저 11이 된 뒤 +2)
	System.out.println(s2++ + 2); // 출력값 12 (나중에 증가하므로 현재는 10 + 2)
	System.out.println();
	System.out.println("s1 = " + s1);
	System.out.println("s2 = " + s2);
	}
}