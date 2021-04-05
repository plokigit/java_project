package com.ict01.grammer02;
class Ex06{
	public static void main(String[] args){
	// 산술연산자 : + - * / %
	// 작은자료형과 큰자료형을 연산하면 큰자료형으로 출력
	

	// 원 단위 절삭
	int k1 = 21755; // 출력해야 되는 값 => 2175
	// int s1 = k1 / 10; // 2175
	// int s2 = s1 * 10; // 21750

	int s3 = (k1 / 10) * 10; // s1, s2 수식을 합친 것
	System.out.println(" s3 = " + s3);

	int s4 = (21755 / 10) * 10; // 아예 처음부터 변수선언으로 절삭
	System.out.println(" s4 = " + s4);

	//소수점 첫째자리까지 구하기
	double k2 = 24.6843; // => 24.6
	int s5 = (int)(k2 * 10);	 // 246
	// double s6 = s5 / 10;	//24.0 => s5 : int / 10 : int라서 뒤의 소수점 날아감
	double s6 = s5 / 10.0; //이렇게 해줘야함
	System.out.println(" s6 = " + s6);
	
	double s7 = (int)(k2*10)/10.0; // 처음부터 변수선언으로 구하기
	System.out.println(" s7 = " + s7);


	// % = 나머지

	int su1 = 7;
	int su2 = 3;
	int res1 = 7/3;
	int res2 = 7%3;	
	
	}
}