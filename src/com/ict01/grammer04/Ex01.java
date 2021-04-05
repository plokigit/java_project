package com.ict01.grammer04;
class Ex01{
	public static void main(String[] args){
	
	//char k1이 A면 아프리카, B이면 브라질 C=캐나다 나머지 한국
	char k1 = 'D';
	String str = "";

	switch(k1){
		case 'A' : str = "아프리카"; break;
		case 'B' : str = "브라질"; break;
		case 'C' : str = "캐나다"; break;
		default : str = "한국";
		}
	System.out.println("결과 : "+str);

	//char k1이 A=아프리카, b=브라질 C=캐나다 나머지 한국(대소문자 합쳐서)
	
	k1 = 'C';
	switch(k1){
		case 'A' :
		case 'a' : str = "아프리카"; break;
		case 'B' : 
		case 'b' : str = "브라질"; break;
		case 'C' : 
		case 'c' : str = "캐나다"; break;
		default : str = "한국";
		}
	System.out.println("결과 : "+str);
	

	// k2 = 1,3이면 남 2,4는 여자
	int k2 = 3;
	String str2 ="";
	switch(k2){
		case 1 :  
		case 3 : str2 = "남"; break;
		case 2 : 
		case 4 : str2 = "여"; break;
		}
	System.out.println("결과 : "+str2);

	// k3 한국이면 서울, 중국이면 베이징, 일본 = 도쿄
	String k3 = "한국";
	String str3 = "";
	switch(k3){
		case "한국" : str3 = "서울"; break;
		case "중국" : str3 = "베이징"; break;
		case "일본" : str3 = "도쿄"; break;
		default : str3 = "데이터에 없는 나라임"; break;
		}
	System.out.println("결과 : "+str3);

	}

}