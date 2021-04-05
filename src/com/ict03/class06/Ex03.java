package com.ict03.class06;

enum Type2{
	// 순서를 지키자
	// 1. 들어갈 정보
	WALK("워킹화", 270),
	RUN("런닝화", 275),
	TRACK("트래킹화", 265),
	HIK("하이킹화", 260);
	
	// 2. 전역변수
	final private String name;
	final private int size;
	
	// 3. 생성자
	Type2(String name, int size) {
		this.name = name;
		this.size = size;
	}

	// 4. getter/setter
	// 상수기 때문에 setter는 안생김
	public String getName() {
		return name;
	}

	public int getSize() {
		return size;
	}
}
	
	

public class Ex03 {
	public static void main(String[] args) {
		Type2[] arr = Type2.values();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName()+ ", " + arr[i].getSize());
		}
		System.out.println("===================");
		(Type2 type2 : arr) {
			System.out.println(k.getname() + " , " + k.getSize());
		}
		
		// 개선된 for문 = foreach = forin : 배열이나 나중에 배울 컬렉션에서 주료 사용
		// ' : '의 의미가 배열이 가지고 있는 처음부터 끝까지 차례대로 변수에 대입시키는 역할
		// 내부에서 사용할 변수에 저장시키는 역할
		// 단점 : 배열의 특정한 요소를 처리 할수는 없다.
		// for (자료형 내부에서 사용할 변수 : 배열) {
		// 	
		// }
		
		String[] msg = {"java","jsp","spring","android"};
		for (String k : msg) {
			System.out.println(k);
		}
	}
}
