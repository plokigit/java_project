package com.ict03.class02;

public class Ex05 {
	public static void main(String[] args) {
		// StringBuffer, StringBulider
		// => 문자열을 빈번하게 수정, 삭제, 추가할 경우 사용을 권장
		
		String msg = "hello";
		System.out.println(msg);
		
		// String은 불변의 속성을 가지고 있어 
		// 메모리에 새로운 영역을 차지해서 새로 만듬
		msg = msg + " java";
		System.out.println(msg);
		
		// StringBuffer는 가변의 속성을 가지고 있어
		// 현재 영역에서 내용을 추가함
		StringBuffer sb = new StringBuffer("welcome ");
		System.out.println(sb);
		
		//내용을 추가할때 ( append("문자열"); )
		sb.append("JAVA");
		System.out.println(sb.toString());
	}
}
