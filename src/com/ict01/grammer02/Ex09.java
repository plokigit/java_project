package com.ict01.grammer02;
class Ex09{
	public static void main(String[] args){
	// 2시간 40분 23초를 초단위로 변경
	// 9630초는 몇시간 몇분 몇초인가

	int hour1 = 2;
	int min = 40;
	int sec = 23;

	int hs = (hour1 * 60 * 60);
	int ms = (min * 60);
	System.out.println("2시간 40분 23초 = " +( hs + ms + sec) +"초");


	int A = 9630;
	int min2 = 0;
	int sec2 = 0;
	int hour2 =0;
	
	//int min2 = 9630/60;
	//int sec2 = 9630%60;

	//int hour2 = min2/60;
	min2 = min2%60;

	System.out.println( hour2  + "시간 " + min2 + "분 " + sec2 + "초");
	

	// 또다른 방법
	// time = 9630;
	// int h1 =  0;
	// int res =  0;
	// m1 =  0;
	// s3 = 0;


	// int h1 = time / (60*60);
	// int res = time % (60*60);

	// 시간 구하고 남은 나머지는 분
	// m1 = res/60;
	// 분을 구하고 남은 나머지는 초
	// s3 = res%60;

	//System.out.println( h1 + "시간 " + m1 + "분 " + s3 + "초");

	}
}
	