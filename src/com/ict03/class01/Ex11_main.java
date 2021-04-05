package com.ict03.class01;

public class Ex11_main {
	public static void main(String[] args) {
		
		// ↓오류남 / Ex11 기본생성자가 아닌 다른 생성자가 있어서
		// 그러므로 다른 생성자로 객체 생성을 해야함
		
		// Ex11 test1 = new Ex11();
		// Ex11 test1 = new Ex11("임꺽정", 17); 
		Ex11 test1 = new Ex11(17,"임꺽정"); 
		//다른 생성자일때는 이렇게 선언↑
		System.out.println("이름 : " + test1.getName());
		System.out.println("주소 : " + test1.getAge());
		System.out.println("성별 : " + test1.isGender());
		//							**boolean형은 is
		System.out.println();
		
		/*
		Ex11 test2 = new Ex11();
		System.out.println("이름 : " + test2.getName());
		System.out.println("주소 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		// 초기값이므로 똑같이 나옴
		System.out.println();

		// setter를 이용해서 변경
		test2.setName("일지매");
		System.out.println("이름 : " + test2.getName());
		System.out.println("주소 : " + test2.getAge());
		System.out.println("성별 : " + test2.isGender());
		System.out.println();
		*/
	}
}
