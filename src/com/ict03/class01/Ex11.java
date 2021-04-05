package com.ict03.class01;

public class Ex11 {
	// 생성자 : 클래스를 객체로 만들 때 자동으로 한 번 호출
	// 목적 : 멤버필드(변수와 상수)의 초기화
	// 특징 : 클래스 이름 == 생성자 이름
	//		 클래스 이름([인자=매개변수]);
	//		 반환형이 없는 메소드라고도 함
	//		 생성자를 만들지 않으면 자동으로 기본생성자로 객체 생성
	//		 기본생성자 : 인자가 없는 생성자 ( = '클래스이름()')
	//		 클래스 안에서 생성자를 만들었으면 만들어진 생성자를 사용해야함
	
	//		 생성자도 오버로딩 가능(하나의 클래스에 여러개 생성자 존재 가능)
	//		 (단, 인자의 종류나 갯수나 순서가 달라야함)
	//		 오버로딩이란 하나의 클래스안에 같은 이름의 메소드가 여러개 존재
	//		 (단, 인자의 종류나 갯수나 순서가 달라야함)
	
	private String name = "둘리";
	private int age = 24;
	private boolean gender = true;
	
	// 생성자 오버로딩
	// 기본생성자
	/*public Ex11() {
		System.out.println("기본생성자");
		name = "태권브이";
		age = 43;
		// 위에 열심히 써도 생성자에서 값을 바꾸면 얘로 출력
		// 목적 : 멤버필드(변수와 상수)의 초기화
	}*/
	
	// 기본 생성자가 아닌 다른 생성자(= 인자가 있는 생성자)
	public Ex11(String name, int age) {
		System.out.println(1);
		//클래스 안에서 생성자를 만들었으면 만들어진 생성자를 사용
		this.name = name;	// main에서 받아 온 값 다시 받아들임
		this.age = age;
	}
	
	public Ex11(int age, String name) {
		System.out.println(2);
	// 같은 놈이면 오류가 나지만 ↑인자 순서를 
	// 바꾸면 다른 놈으로 인식
	// main에서 인자 순서를 바꿔서 입력해주면
	// 각각 맞는 인자쪽 생성자로 간다
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
