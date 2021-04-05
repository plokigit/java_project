package com.ict03.class04;

// 일반적인 클래스가 추상 클래스를 상속하면
// 반드시 추상클래스에 추상메소드를 오버라이딩 해야함
class Ex02 extends Ex01{
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		
	}
}

// 오버라이딩을 하지 않는 방법 : 자식클래스를 추상클래스로 만들면됨
abstract class Ex03 extends Ex01{
	public void song() {
		System.out.println("노래");
	}
}

// 오버라이딩을 하지 않는 방법 : 자식클래스를 추상클래스로 만들면됨
// 부모의 추상메소드를 구체화하지 않았음
// 추상메소드 추가했음
abstract class Ex04 extends Ex01{
	public void Music() {
		System.out.println("음악");
	}
	public abstract void pop() ;
	
	
	// 여기서 Ex03 04를 만들었기 때문에 옆에 새로운 클래스를 만들때 Ex05부터 가능
}