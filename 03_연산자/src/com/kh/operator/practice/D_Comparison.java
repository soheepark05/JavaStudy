package com.kh.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자(관계 연산자)
	 *  - 두 값을 비교하는 연산자, 관계 연산자라고도 한다.
	 *  - 비교 연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)을 반환한다.
	 *  
	 *  a < b : a가 b보다 작은가?
	 *  a > b : a가 b보다 큰가?
	 *  a <= b : a가 b보다 작거나 같은가?
	 *  a >= b : a가 b보다 크거나 같은가?
	 *  a == b : a와 b가 같은가?
	 *  a != b : a와 b가 같지 않은가?
	 * 
	 */
	
	public void method1() {
		boolean result = false;
		int num1 = 10, num2 = 25, num3 = 0; // 관례상 잘 사용하지 않는다.
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		
		result = (num1 != num2);
		System.out.println("result : " + result);
		
		result = ('A' == 65); // 65 == 65
		System.out.println(result);
		
		result = (3 == 3.0); // 3.0 == 3.0
		System.out.println(result);
		
		// 단, 예외가 있다. 부동소수점 타입은 오차가 생길 수 있기 때문에 대부분의 비교 연산에서는 정수 타입을 사용한다. 
		result = (0.1 == 0.1f); 
		System.out.println(result);
		System.out.println();
		
		// 산술연산 + 비교연산
		// 사용자에게 입력받은 값이 짝수인지, 홀수인지 판단해보자
		System.out.println("임의의 정수를 입력해주세요.");
		num3 = scanner.nextInt();
		
		System.out.println("num3는 짝수인가? : " + ((num3 % 2) == 0));
		System.out.println("num3는 홀수인가? : " + (num3 % 2 == 1));
		System.out.println("num3는 5의 배수인가? : " + (num3 % 5 == 0));
	}
}
