package com.ict03.class07;

interface Test {
	int data = 1000;

	void printData();
}

class Test02 implements Test {
	@Override
	public void printData() {
		System.out.println("data : " + data);
	}
}

// 상속받지 않고 사용
class Test03 {
	Test t = new Test() {
		@Override
		public void printData() {
			System.out.println("data : " + data);
		}
	};
}

// ' Test t = '이것도 없애서 사용
class Test04 {
	public void play() {
		new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		}.printData();
		; // 클래스 끝
		// 호출할게 없으니까 클래스 끝나기전에 호출할 것 선언
	} // 메소드 끝
}

// 상속받지 않고 메소드 인자에 넣기
class Test05{
	public void sound(Test test) {
		test.printData();
	}
}
public class Ex08 {
	public static void main(String[] args) {
		// 각각 메소드 실행 시키는 방법
		Test02 t2 = new Test02();
		t2.printData();
		System.out.println();
		
		Test03 t3 = new Test03();
		t3.t.printData();
		System.out.println();
		
		Test04 t4 = new Test04();
		t4.play();
		
		Test05 t5 = new Test05();
		t5.sound(new Test() {
			@Override
			public void printData() {
				System.out.println("data : " + data);
			}
		});
		
	}
}
