package com.ict03.class03;

public class Ex03 extends Ex02 { 
	// ↑ extends Ex02를 쓰면 Ex03과 Ex02가 상속관계가 됨
	// 자식은 부모것을 갖다 쓸 수 O 반대는 X
	String name = "차두리";
	int age = 34;
	// private String hobby = "영화보기";
	static String hobby = "영화보기";
	
	public Ex03() {
		System.out.println("자식클래스 생성자 : " + this);
	}
	
	public void sound() {
		System.out.println("자식클래스 메소드");
	}
	
	public void study() {
		// 객체 생성없이 부모클래스의 멤버를 사용한 것
		System.out.println("공부장소 : " + addr);
		
		System.out.println("name : " + this.name);	// 차두리 // this = 본인
		System.out.println("name : " + super.name); // 차범근 
							// super = 자식 클래스에서 부모 네임을 뜻함
		
	//	System.out.println("우리집 애완동물 : " + dog); 
		// 상속관계라도 dog은 private이라 못 갖다씀
		
	}
	
	// 오버라이딩 : 부모메소드를 겉모양은 그대로 사용하면서
	//	(재정의)	내용만 변경하는 것
	@Override
	public void eat() {
		System.out.println("아침밥은 생략");
	}
	
	// 오버라이딩을 할 수 없게 하는 예약어 = final
	// 부모메소드에 final이 있으면 @Override 불가
	
}
