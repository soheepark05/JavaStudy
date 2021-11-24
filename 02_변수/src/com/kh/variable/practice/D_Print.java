package com.kh.variable.practice;

public class D_Print {
	public void printMethod() {
		int iNum = 10;
		int iNum2 = 20;
		
		// System.out.printf("포멧", 출력하고자 하는 값1, 값2, 값3, ... );
		// 출력하고자 하는 값들을 제시된 포멧(서식)에 맞춰서 출력을 진행, 줄바꿈 X
		System.out.printf("%d\n", iNum);
		System.out.printf("%-5d\n", iNum);
		System.out.printf("%d\n", iNum, iNum2);
//		System.out.printf("%d %d\n", iNum); // 에러가 발생한다. (서식 지정자에 해당하는 값들이 모두 존재해야 한다.)
		System.out.printf("%d + %d = %d\n", iNum, iNum2, (iNum + iNum2));
		
		System.out.println("====================");
		
		float fNum = 3.14159272f;
		double dNum = 4.56;
		
		//%f - 실수값을 소수점 아래 여섯째 자리까지 보여준다.
		//     범위를 넘어가면 반올림, 소수점 아래의 값이 없으면 0으로 채운다.
		System.out.printf("%f\t%f\n", fNum, dNum);
		System.out.printf("%.3f\t%.3f\n", fNum, dNum);
		
		System.out.println("====================");
		
		char ch = 'A';
		String str = "\"Hello\"";
		
		System.out.printf("%c %s\n", ch, str);
		System.out.printf("%s %s\n", ch, str); // %s는 char 타입도 표현이 가능하다.
		System.out.printf("%C %S\n", ch, str); // 대문자로 출력 가능
	}
}
