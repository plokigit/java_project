package com.ict03.class07;

// 익명 내부 클래스(Anonymous) : 대상이 보통 추상 클래스나 인터페이스에서 많이 사용
abstract class Car {
	abstract void run();
}

class Bus extends Car {
	@Override
	void run() {
		System.out.println("80KM/h");
	}
}

class Taxi extends Car {
	@Override
	void run() {
		System.out.println("160KM/h");
	}
}

class Ex05{
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.run();
		System.out.println();
		
		Car car = new Taxi();
		car.run();
		
		Car car2 = new Car() {
			@Override
			void run() {
				System.out.println("무조건 달린다");
			}
		}; // class Car가 추상클래스이므로 여기서 선언해줘야함
		car2.run(); // 이거안하면 Car car2 = new Car() 이거 실행안됨
	}
}
