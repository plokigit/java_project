package com.ict03.class01;

public class Ex07 {
	
	private String name = "둘리";
	private int age = 13;
	private double height = 135.15;
	private boolean gender = true;
	private char rank = 'A';
	
	
	// getter/setter 호출 => 메뉴-source
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// set
		// 지역변수이름(안쪽)과 전역변수이름(바깥쪽선언)이 같을 때
		// 전역변수에는 this.을 붙임
		// 지역변수와 전역변수이름이 같을 때 지역변수 우선순위가 높음
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public boolean isGender() { //**boolean형은 get말고 is라고 붙음
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public char getRank() {
		return rank;
	}
	public void setRank(char rank) {
		this.rank = rank;
	}
	
	

}
