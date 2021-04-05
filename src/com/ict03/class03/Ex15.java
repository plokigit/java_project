package com.ict03.class03;

public class Ex15 extends Ex14{
	String name = "홍일점";
	int id = 2410;
	
	public Ex15() {
		// super(); 생략되어 있음 얘는 기본생성자일때
		super("일지매", 15); // 다른 생성자일 때는
		// 인자값 맞춰서 넣어주면 오류 안남
		System.out.println("자식클래스 생성자 : " + this);
		name = "홍두께";
		id = 1004;
	}

	public Ex15(String name) {
		// super();
		super("태권브이", 37);
		this.name = name;
	}
	
	public void prn() {
		String name = "홍시";
		// 지역, 전역, 부모 모두 같은 이름의 변수를 가지고 있음
		// 반드시 구분해야 함
		System.out.println("지역변수 이름 : " + name);
		System.out.println("전역변수 이름 : " + this.name);
		System.out.println("부모변수 이름 : " + super.name);
		
		// 부모만 가지고 있는 변수
		System.out.println("지역변수 : " + age);
		System.out.println("전역변수 : " + this.age);
		System.out.println("부모변수 : " + super.age);
		//this와 super를 쓸 필요없음
		
		// 전역변수만 가지고 있는 변수
		System.out.println("지역변수 이름 : " + id);
		System.out.println("전역변수 이름 : " + this.id);
		// System.out.println("부모변수 이름 : " + super.id);
		// super에서 오류남 부모변수에 없기 때문
	}
}
