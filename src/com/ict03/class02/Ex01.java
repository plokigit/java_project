package com.ict03.class02;

import java.util.Iterator;

public class Ex01 {
	public static void main(String[] args) {
		// string클래스
		String str1 = "abc";
		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data);

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("=== 주요 메소드 ===");
		String msg = "한국 ICT 인재 개발원 1강의장";
		// 1. charAt(int index) : char
		// 위치값을 받아서 그 위치에 존재하는 문자를 반환
		// 이때 위치값(index는 0부터)
		char c1 = msg.charAt(7); // 한국 ICT 인재 개발원 1강의장
									// 0 1 234567 이므로 '인'자가 나옴 띄어쓰기도 세어짐

		// 다음 문자 중에 소문자를 대문자로 변경
		// a = 97 / A = 65
		msg = "대한 I Love You 123";
		// 문자열의 길이를 구하자 : length() : int
		System.out.println(msg.length());
		for (int i = 0; i < msg.length(); i++) {
			char c2 = msg.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
			}
			System.out.print(c2);
		}
		System.out.println();

		// 2. concat(String str)
		// 지정한 문자열을 이 문자열 끝에 연결
		String msg1 = "대한민국";
		String msg2 = "KOREA";
		String msg3 = msg1.concat(msg2);
		System.out.println(msg3);
		System.out.println(msg1 + msg2); // 동일
		System.out.println();

		// 3. contains(String s) : boolean
		// 받은 문자열이 해당문자열에 존재하면 true, 존재하지 않으면 false
		msg = "대한 I Love You 123";
		boolean b1 = msg.contains("You");
		if (b1) {
			System.out.println("포함");
		} else {
			System.out.println("포함 X");
		}
		System.out.println();

		// 4. equals(Object anObject) : boolean
		// 받은 문자열과 현재 문자열 같으면 T , 다르면 F(대소문자 구별)

		// 5. equalsIgnoreCase(String anotherString) : boolean
		// 받은 문자열과 현재 문자열 같으면 T , 다르면 F(대소문자 구별X)
		// ** 주의 ) 문자열이나 객체를 비교할 때 (String일때, 숫자는 '==' 같다 맞음)
		// '=='는 사용하면 주소가 같냐고 묻는것임
		// 따라서 문자열에는 '=='가 아니라 equals 또는 equalsIgnoreCase를 사용해야함

		String s1 = "Korea";
		String s2 = "KOREA";
		String s3 = new String("Korea");
		String s4 = new String("Korea");

		System.out.println(s1 == s2); // false '==' 써서 주소가 같냐고 물었기 때문에
		System.out.println(s2 == s3); // false
		System.out.println(s3 == s4); // false
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println();

		s1 = "seoul"; // 이때는 주소가 같아서 true라고 나옴
		s2 = "seoul"; //
		System.out.println(s1 == s2); // 주소 같냐
		System.out.println(s1.equalsIgnoreCase(s2)); // 내용 같냐

		// 6. format(String format, Object... args) : static string
		// 형식을 지정하고 형식에 맞게 생성
		// %s는 문자열, %d는 정수, %f 실수(반올림됨)
		String msg4 = "한국 ICT 인재 개발원";
		int s5 = 14;
		double s6 = 89.167;
		String msg5 = msg4.format("%s의 시작년도는 %d년이고 평균 점수는 %.2f이다.", msg4, s5, s6);
		System.out.print(msg5);
		System.out.println();

		// 7. getBytes() : byte[]
		// 해당 문자열을 byte[]로 변경시킨다.
		// 보통 입/출력 스트림할때 사용(영문자, 대소문자, 숫자만 가능)
		String msg6 = "java";
		byte[] b = msg6.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print((char) (b[i]) + " : " + b[i]);
		}
		System.out.println();

		// 반대로 해당 byte 배열을 문자열로 만들수도 있음(String 생성자이용)
		String msg7 = new String(b);
		System.out.print(msg7);
		System.out.println();

		// 8.tocharArray() : char[]
		// 해당 문자열을 char[]로 변경시킨다.
		// 보통 입/출력 스트림할때 사용 (전세계 문자 가능)
		String msg8 = "자바8 java8 大韓民國 123";
		char[] c = msg8.toCharArray();
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		// 반대로 해당 char배열을 문자열로 만들 수도 있음(String 생성자 이용)
		String msg9 = new String(c);
		System.out.print(msg9);
		System.out.println();

		// 9. indexOf(int ch) : int
		// 문자를 받아서 해당 문자의 위치값을 표시
		// 시작위치는 처음부터, 찾는 문자가 없으면 -1이다.

		// 10. indexOf(int ch, int fromIndex) : int
		// 문자와 시작위치를 받아서 해당 문자의 위치값을 표시
		// 찾는 문자가 없으면 -1. 얘는 시작위치를 받음.

		// 12. indexOf(String str) : int
		// 문자열을 받아서 해당 문자열의 위치값을 표시
		// 시작위치는 처음부터, 찾는 문자가 없으면 -1

		// 13. indexOf(String str, int fromIndex) : int
		// 문자열과 시작위치를 받아서 해당 문자의 위치값을 표시
		// 찾는 문자가 없으면 -1. 얘는 시작위치를 받음.

		String msg10 = "BufferedReader";
		// e를 찾아라
		int k1 = msg10.indexOf('e');
		System.out.println(k1);

		// 두번째 e를 찾는법
		// k1 = msg10.indexOf('e', 5); // 5번째 위치부터 찾아줘라. (첫번째 e가 4위치에 있으므로)
		k1 = msg10.indexOf('e', msg10.indexOf('e') + 1); // 5번째 위치부터 찾아줘라. (첫번째 e가 4위치에 있으므로)
		System.out.println(k1);

		// 세번째 e를 찾는법
		// 두번째 e의 위치 6
		k1 = msg10.indexOf('e', msg.indexOf('e', msg10.indexOf('e') + 1) + 1);
		System.out.println(k1);

		// 없는 글자 찾기 ('A')
		k1 = msg10.indexOf('A');
		System.out.println(k1); // 출력 : -1

		b1 = msg10.contains("A");
		System.out.println(b1); // 출력 : false

		// char말고 String으로 찾기
		k1 = msg10.indexOf("er");
		System.out.println(k1);

		// 두번째 er 찾기
		k1 = msg10.indexOf("er", msg10.indexOf("er") + 1);
		System.out.println(k1);

		// 11. lastIndexOf(int ch) : int
		// lastIndexOf(String str) : int
		// 찾는 마지막 문자나 문자열의 위치를 표시
		k1 = msg10.lastIndexOf('e');
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);

		// 12. isEmpty() : boolean
		// 문자열의 길이가 0이면 T, 아니면 F
		// 비어있으면 T, 아니면 F
		// 13. length() : int
		// 문자열의 길이를 숫자로 표시
		String msg11 = ""; // null이랑은 다름
		String msg12 = "java";

		System.out.println(msg11.isEmpty()); // true
		System.out.println(msg12.isEmpty()); // false

		System.out.println(msg11.length()); // 0
		System.out.println(msg12.length()); // 4
		System.out.println();

		// 14. replace(char oldChar, char newChar) : String
		// replace(CharSequence target, String replacement) : Stirng
		// 문자나 문자열을 받아서 치환할 때 쓰임
		String msg13 = "대한민국";
		String msg14 = msg13.replace("대한민국", "korea");
		String msg15 = msg13.replace(msg13, "korea");
		String msg16 = msg13.replace('한', '韓');

		System.out.println(msg14);
		System.out.println(msg15);
		System.out.println(msg16);

		// ** 15. split(String regex) : String[]
		// 구분자를 받아서 배열로 나눈다. (배열크기는 알아서 자동으로)
		// split(String regex, int limit) : String[]
		// 구분자를 받아서 배열로 나눈다. (limit가 배열의 크기)
		String msg17 = "사과,딸기,망고,오렌지,파인애플";
		String[] res = msg17.split(","); // ,로 나누어주세요
		// System.out.println(res[0]); // 사과
		// System.out.println(res[1]); // 딸기

		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();

		String[] res2 = msg17.split(",", 3); // ,를 기준으로 3개로 나누어주세요
		System.out.println(res2[0]); // 사과
		System.out.println(res2[1]); // 딸기
		System.out.println(res2[2]); // 망고, 오렌지, 파인애플
		// ,를 기준으로 나누어지므로 , , 뒤 망고~파인애플 한 번에 출력
		
		// 16. substring(int beginIndex) : String
		//	  시작위치를 받아서 해당 문자열 끝까지 문자열 추출
		//	  substring(int beginIndex, int endIndex) : String
		//	  시작위치와 끝 위치를 받아서 해당 문자열 추출 (끝 위치는 포함 안됨)
		
		String msg18 = "010-7979-9999";
		String res4 = msg18.substring(4);
		System.out.println(res4); // 7979-9999만 나옴 시작위치가 4이므로
		
		String res5 = msg18.substring(4,8);
		System.out.println(res5); // 7979
		// 끝위치는 포함 안되므로 8번째 '-'까지 포함시켜야 7979만 나옴
		
		String res6 = msg18.substring(msg18.indexOf('-')+1,msg18.lastIndexOf('-'));
		System.out.println(res6); // 7979
		// 보통 이런식으로 함
		
		String msg19 = "770707";
		// 태어난 년도 추출
		String res7 = msg19.substring(0, 2);
		// 달 추출
		String res8 = msg19.substring(2, 4);
		
		// 17. toLowerCase() : String
		//	   해당 문자열의 모든 대문자를 소문자로 변경
		//	   toUpperCase() : String
		//	   해당 문자열의 모든 소문자를 대문자로 변경
		
		String msg20 = "자바8 java8 Java8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		System.out.println(res9);
		System.out.println(res10);
		System.out.println();
		
		// 19. toString() : String
		// String의 toString() : 문자열 자체를 반환
		// Object의 toString() : 모든 객체에서 사용가능
		//						 객체가 가지고 있는 정보나 값들을 문자열로 리턴할 때 사용
		//						 (오버라이딩할 때 다시 배운다)
		String msg21 = "java8 Java8 자바8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
		
		// 20. trim() : String
		// 해당 문자열의 앞, 뒤 있는 공백 제거, 중간 공백은 제거X
		// (중간 공백은 문자 취급함)
		
		String msg22 = "      java 자바 JAVA      ";
		System.out.println(msg22);
		System.out.println(msg22.trim());
		System.out.println(msg22.length());
		System.out.println(msg22.trim().length());
		System.out.println();
		
		// 21. valueOf(각종자료형) : static String
		// 어떤 자료형이든 String으로 변경시킨다.
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 100L;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		// 각종 자료형에 +1;
		// System.out.println(p1+1); boolean은 + 연산 불가능
		System.out.println(p2+1);
		System.out.println(p3+1);
		System.out.println(p4+1);
		System.out.println(p5+1);
		System.out.println(p6+1);
		System.out.println();
		
		// String으로 변경시켜서 +1
		System.out.println(String.valueOf(p1)+1); // "true"로 String 취급
		System.out.println(String.valueOf(p2)+1); // "d"
		System.out.println(String.valueOf(p3)+1); // "100"
		System.out.println(String.valueOf(p4)+1); // "100"
		System.out.println(String.valueOf(p5)+1); // "100.0"
		System.out.println(String.valueOf(p6)+1); // 앞에걸 문자 취급
		
		// 같은결과
		System.out.println(p1 + "1");
		System.out.println(p2 + "1");
		System.out.println(p3 + "1");
		System.out.println(p4 + "1");
		System.out.println(p5 + "1");
		System.out.println(p6 + "1");
		
		// 21의 반대개념 : 각종 자료형 모양의 문자열을 각종 자료형으로 변경
		// ex. "1" = string이지만 이걸 1 = int로
		// Wrapper Class(Boolean, Byte, Short, Integer, Long, Float, Double, )
		//				 parseXXXX(String s) 메소드를 이용해서 변경(Char 제외)
		// : 각 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경 시키는 클래스들
		//	 원래 의미는 기본자료형을 객체로 만들 때 사용하는 클래스
		//	 이제는 자동으로 만들어짐 => 오토 박싱
		//	 기본 자료형 => 객체형 자동으로 변경(오토박싱)
		//	 객체형 => 기본 자료형 자동으로 변경(오토언박싱)
		
		// 1. boolean형태의 문자열을 boolean형으로 변경
		// Boolean.parseBoolean("true"); Boolean.parseBoolean("나머지글자") => false

		// msg = "true"; // 변경성공
		msg = "0"; // 변경성공2
		
		Boolean a1 = Boolean.parseBoolean(msg);
		if (a1) {
			System.out.println("변경성공");
		}else {
			System.out.println("변경성공2");
		}System.out.println();
		
		// 2. int형태의 문자열을 int형으로 변경 : Integer.parseInt(String s)
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg + 10);
		System.out.println(a2 + 10);
		
		// char 형태의 문자열을 char형으로 변경할 메소드는 없음
		// (단, Character 클래스는 존재)
		// 문자열에서 charAt(위치값) 이용하면 됨
		msg = "C";
		char a3 = msg.charAt(0);
		System.out.println(msg + 1); // C1
		System.out.println(a3 + 1);  // 68
		System.out.println((char)(a3 + 1)); //D
		
		// 주민번호 앞자를 받았다 ? 나이를 구하자
		String jumin = "970107";
		String gender = "1";
		// 앞자리 두자리
		String year = jumin.substring(0, 2);
		int y_year = Integer.parseInt(year);
		
		// 앞자리 두자리에 19나 20을 붙혀야함
		// gender가 1또는 2면 19 3또는 4면 20
		if(gender.equals("1") || gender.equals("2")) {
			y_year = y_year + 1900;
		}else if(gender.equals("3") || gender.equals("4")) {
			y_year = y_year + 2000;
		}
		
		// (올해년도 - 구한년도) + 1
		int age = 2021 - y_year + 1;
		System.out.println("나이는" + age + "입니다.");
	}
}
