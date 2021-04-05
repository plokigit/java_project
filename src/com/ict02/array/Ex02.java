package com.ict02.array;

public class Ex02 {
	public static void main(String[] args) {
	//배열 생성순서 : 1.선언 2.생성 3.데이터 저장
	
		//선언과 생성 한 번에 해보기
		char[] c1 = new char[4];
		c1[0] = 'J';
		c1[1] = 'A';
		c1[2] = 'V';
		c1[3] = 'A'; // c1[3] = 65; 오류 안남
		// 자료형의 범위 밖으로 벗어나면 오류
		
		for (int i = 0; i< c1.length; i++) {
			System.out.println(c1[i]);
		}
		
		//선언 생성 데이터저장 한번에
		//String[] msg = {"java","jsp","spring","android"};
	}
}
