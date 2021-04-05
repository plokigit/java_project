package com.ict03.class07;

// �͸� ���� Ŭ����(Anonymous) : ����� ���� �߻� Ŭ������ �������̽����� ���� ���
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
				System.out.println("������ �޸���");
			}
		}; // class Car�� �߻�Ŭ�����̹Ƿ� ���⼭ �����������
		car2.run(); // �̰ž��ϸ� Car car2 = new Car() �̰� ����ȵ�
	}
}
