package com.kh.variable.practice;

public class C_Casting {
	/*
	 *  형 변환 (boolean은 제외)
	 *  
	 *  * 컴퓨터에서의 값의 처리 규칙
	 *  1. 대입 연산자를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다.
	 *     즉, 같은 자료형에 해당하는 값만 대입이 가능하고 다른 자료형의 값을 대입하고자 한다면 형 변환이 필수이다.
	 *     
	 *  2. 같은 자료형끼리만 연산이 가능하다. (연산 결과도 같은 자료형으로 나온다.)
	 * 
	 *  * 형 변환의 종류
	 *  1. 자동 형변환(묵시적 형변환)
	 *    - 자동으로 형 변환이 이루어지기 때문에 개발자가 형 변환을 시켜줄 필요가 없다.
	 *    - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다. (값의 표현 범위 표 참고, 자료형의 size X)
	*/
	
	public void autoCasting() {
		short s = 12;
		int i = s; // short -> int 자동 형변환 된다.
		long l = i; // int -> long 자동 형변환 된다.
		double d = l; // long -> double 자동 형변환 된다.
		double result = 12 + 3.3; // 12.0 + 3.3 = 15.3
		long result2 = 30 + 30; // 30 + 30 = 60, 60을 long로 캐스팅하여 저장(60L)
		long result3 = 30 + 30L; // 30L + 30L = 60L
		float f = 10000000000000L; // float이 long 보다 표현 가능한 수의 범위가 더 크기 때문에 자동 형변환이 가능하다.
		
		System.out.println("s : " + s);
		System.out.println("i : " + i);
		System.out.println("l : " + l);
		System.out.println("d : " + d);
		System.out.println("result : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("f : " + f);
		
		i = '문'; // 문자의 유니코드 값을 대입한다.
		char ch = 65; // 숫자 값은 해당 숫자와 일치하는 문자를 유니코드 표에서 찾아서 대입한다.
//		char ch2 = -65; // char 값에 음수 값은 저장할 수 없다. (유니코드의 범위가 0 ~ 65,535)
		System.out.println("i : " + i);
		System.out.println("ch : " + ch);
		
		byte b1 = 1;
		byte b2 = 10;
		byte result4 = (byte)(b1 + b2); // byte나 short는 연산시 무조건 int형으로 처리한다.
		
		System.out.println("result4 : " + result4);
	}
	
	/*
	 *  2. 강제 형변환(명시적 형변환) 
	 *    [표현법]
	 *    	(바꿀 자료형) 값;  
	 *    
	 *    - 범위가 큰 크기의 자료형을 작은 크기의 자료형으로 변환하려면 형 변환 연산자를 사용해야 한다.
	 *    - (바꿀 자료형)을 cast 연산자 즉, 형 변환 연산자라고 한다.
	 *    - 강제 형변환의 경우 데이터의 손실이 발생할 수 있다.
	 */
	public void casting() {
		double d = 4.123;
//		float f = d; // 에러 발생
		float f = (float) d;
		int i = (int) d;
		int iSum = 0;
		double dSum = 0.0;
		
		System.out.println("d : " + d);
		System.out.println("f : " + f);
		System.out.println("i : " + i);

		i = 10;
		d = 5.76;
		
		// 방법 1. 수행 결과를 int로 강제 형변환
//		iSum = (int) (i + d); // 10.0 + 5.76 = 15.76 => 15
		// 방법 2. double 값을 int로 강제 형변환 후 계산 
		iSum = i + (int) d; // 10 + 5 = 15
		// 방법 3. double로 값을 받는다.
		dSum = i + d;
		
		System.out.println("iSum : " + iSum);
		System.out.println("dSum : " + dSum);
		
		// 데이터 손실 테스트
		int iNum = 290;
		byte bNum = (byte) iNum;
		
		System.out.println();
		System.out.println("iNum : " + iNum);
		System.out.println("bNum : " + bNum);
	}
}
