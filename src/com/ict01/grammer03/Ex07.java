package com.ict01.grammer03;
import java.util.Scanner;
class Ex07{
	public static void main(String[] args){
	// scanner 클래스 알아보기
	// scanner의 소속은 java.util.scanner임
	// java.lang의 소속된 클래스는 마음대로 사용가능
	// 이외의 클래스는 소속을 표시해야 한다. (import)
	// 클래스 안에는 Constructors(생성자), Method(메소드), Field(필드) 존재
	
	// method : 동작, 기능, 하는 것
	// 키보드에 입력된 내용 scan에 저장
	Scanner scan = new Scanner(System.in);

	System.out.print("당신의 이름 : ");
	//↓ 저장된 정보를 가져옴 (가지고 온 정보를 String으로)
	// scan.next(); // next는 띄어쓰기해서 입력하면 안됨
	// ex) 당신의 이름 : 홍 길동 (이렇게 하면 오류남)
	String name = scan.next(); 

	System.out.print("국어 점수 : ");
	int kor = scan.nextInt();

	System.out.print("영어 점수 : ");
	int eng = scan.nextInt();

	System.out.print("수학 점수 : ");
	int math = scan.nextInt();

	int sum = kor + eng + math;
	System.out.println("총점 : " + sum);

	// 들어온 정보를 double로 만듬
	System.out.print("당신의 키 : ");
	double height = scan.nextDouble();

	// 들어온 정보 boolean형으로 기억
	System.out.print("당신은 남성입니까(true/false) : ");
	boolean gender =  scan.nextBoolean();
	String str = gender? "남성" : "여성" ;
	System.out.println(str);
	

	}
}