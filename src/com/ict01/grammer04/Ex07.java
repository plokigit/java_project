package com.ict01.grammer04;
class Ex07
{
	public static void main(String[] args) 
	{
		// break문 : 현재 반복문을 탈출 할 때 사용
		// continue문 : continue문 이하의 수행문을 포기하고 다음 회차를 반복수행
		for (int i = 0; i<11 ; i++)
		{
			if ( i == 4 ) break;
			System.out.print(i + " ");
		}System.out.println();  // 결과 : 0 1 2 3

		for (int i = 0; i<11 ; i++)
		{
			if ( i == 4 ) continue;
			System.out.print(i + " ");
		}System.out.println(); // 결과 : 0 1 2 3 5 6 7 8 9 10 
		// 컨티뉴가 있으면 밑의 문장은 실행안하고 조건식으로 넘어감
		// 그래서 4가 없음

		for (int i = 0; i<11 ; i++)
		{
			System.out.print(i + " ");
			if ( i == 4 ) continue;
		}System.out.println(); // 결과 : 0 1 2 3 4 5 6 7 8 9 10
		// 위에 문장을 입력했으므로 4가 출력되어서 나옴

		int k = 11;
		while (k < 21)
		{
			if (k == 17) break;// 17일때 break이므로 16까지만 출력
			System.out.print(k + " ");
			k++;
		}System.out.println();

		k = 11;
		while (k < 21)
		{
			// if (k == 17) continue; // 17에서 조건식으로 올라가므로 증감식을 거치지않음
			System.out.print(k + " "); // 그래서 무한루프 돔 (k == 17에 멈춰있음)
			k++;
		}System.out.println();System.out.println();

		// 중첩 for문에서 break 사용 j = 3일때 break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ )
			{
				if (j == 3) break;
				System.out.println("i=" + i + " j=" + j);
			} // break를 걸면 여기로 빠져나옴
		}System.out.println("==========================");

		// 중첩 for문에서 break 사용 i = 2일때 break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ )
			{
				if(i == 2) break;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println("==========================");

	// 중첩 for문에서 continue 사용 j = 3일때 break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ ) // continue 마주치면 이쪽으로 다시 옴
			{
				if (j == 3) continue;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println("==========================");

		// 중첩 for문에서 continue 사용 i = 2일때 break;
		for (int i = 1; i<4; i++ )
		{
			for (int j=1; j<6 ;j++ ) // continue 마주치면 이쪽으로 다시 옴
			{
				if(i == 2) continue;
				System.out.println("i=" + i + " j=" + j);
			}
		}System.out.println();
	}
}

//결과 왜 이렇게 나오는지 공부해보기
