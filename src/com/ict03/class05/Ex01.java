package com.ict03.class05;

public interface Ex01 {
	// 인터페이스 : 서비스를 제공하는 목록과 같은 것
	//				상수와 추상메소드로만 이루어짐
	//				생성자 없음 (= 객체 생성 못함) 
	//				=> 실제 사용X => 다중상속 가능 
	//				실제 사용하기 위해서는 인터페이스를 상속받은 클래스가 있고
	//				상속받은 클래스를 사용하는 것
	// ** '인터페이스'가 같다라는 말은 대체(호환)이 가능하다라는 뜻
	// ** 인터페이스는 상수와 추상메소드만 갖고 있다
	
	final int su1 = 10;
	static final int su2 = 20;
	int su3 = 30;
	static int su4 = 40;
	// 위 멤버필드들은 모두 static final임
	
	// 추상메소드가 아니므로 오류
	// public void play() {};
	
	// 일반적인 추상메소드 형태
	public abstract void like();
	// interface 안에서는 abstract 예약어 생략 가능
	public void sound();	
}
