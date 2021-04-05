package com.ict01.grammer02;
class Ex08{
	public static void main(String[] args){
	// 아메리카노 2500원 둘이서 만원 내고 주문 잔돈은? (부가세 10%)

	int ame = 2500;
	int sum = 2;
	int input = 10000;

	int total = ame*sum;
	int vat = (int)(total*0.1);
	int cost = input - (total+vat);
	System.out.println( "잔돈 : " + cost + "원");

	//또 다른 방법
	// int total2 = (int)((ame*sum)*1.1);
	// int cost2 = input - (total2);
	// System.out.println( "잔돈 : " + cost2 + "원");


	
	}
}
	
	