package com.ict01.grammer02;
class Ex04{
	public static void main(String[] args){
	int i1= 'a';
	System.out.println(i1);

	char ch1 = 'a' ;
	System.out.println(ch1);

	// char < int < long < float < double 이므로 char은 모든 숫자 자료형에 저장가능

	
	// ch1 변수 데이터도 i2에 저장 가능
	int i2 = ch1;
	System.out.println(i2);

	// long에 int 저장 가능
	long s3 = 117L;
	long s4 = 117;

	System.out.println(s3);
	System.out.println(s4);

	// float나 doubledp long 저장 가능
	float s5 = s3; // float나 double에서는 실수형이므로 117.0으로 출력
	System.out.println(s5);


	// 아래부터 강제형변환
	//byte k1 = 128; 은 오류
	// byte k1 = (byte)(128); // 출력값 -128
 	// byte k1 = (byte)(129); // 출력값 -127
	
	byte k1 = (byte)(256); // 출력값 0
	System.out.println(k1);

	// 값이 -128 부터 +127까지 이므로 127을 넘기면 -128부터 롤백


	// char k2 = (char)(97); 이렇게 안해줘도 char 범위내에서는 알아서 변환
	char k2 = 97;
	System.out.println(k2);

	int k3 = 97;
	// char k4 = k3; //이러면 오류
	char k4 = (char)(k3);
	System.out.println(k4); 

	
	// float, double -> int
	// int k5 = 87.64; // 소숫점 붙어서 오류
	int k5 = (int)(87.64);
	System.out.println(k5);

	}
}