package com.ict03.class07;

public class Ex03 {
	String name = "둘리";
	int hight = 160;
	public Ex03() {
		System.out.println("외부 : " + this);
	}

	public void sound() {
		String addr = "서울";
		System.out.println("호이~ 호이~");
	}

	// 내부클래스를 담은 메소드
	public void play() {
		int age = 24;
		class Inner02 { // public 못씀
			String name = "희동이";
			int time = 36;

			public Inner02() {
				System.out.println("내부 : " + this);
			}
			public void hobby() {
				 System.out.println(name);
				 System.out.println(hight);
				// System.out.println(addr); 못씀 내가 속한 메소드가 아니라서
				 System.out.println(age);
				 System.out.println(time);
			} // 내부메소드 끝
		} // 내부클래스 끝
		
		// Ex03_main에 있는 내용
		// 내부클래스의 끝과 내부클래스를 가진 메소드의 끝
		// 사이에서 객체를 생성해야 함
		Inner02 in02 = new Inner02();
		// 외부멤버↑
		System.out.println(name);
		// 외부메소드↑
		sound();
	} // 외부메소드 끝
}
