package com.kh.operator.practice;

public class B_InDecrease {
	/*
	 * 증감 연산자
	 * 
	 * [표현법]
	 *   (증감 연산자)값; 또는 값(증감 연산자);
	 *   
	 * - 증감 연산자는 피연산자의 값을 1 증가시키거나 1 감소시키는 연산자이다.
	 * - ++ : 피연산자의 값을 1 증가시키는 연산자 (++값; 또는 값++;)
	 * - -- : 피연산자의 값을 1 감소시키는 연산자 (--값; 또는 값--;)
	 * - (증감 연산자)값 : 전위 연산자로 먼저 증감 연산을 수행하고 다른 연산을 수행한다.
	 * - 값(증감 연산자) : 후위 연산자로 먼저 다른 연산을 수행하고 증감 연산을 수행한다.
	 * 
	 */
	
	public void method1() {
		int num = 10;
		
		// 전위 연산자 테스트
		System.out.println("전위 연산자 적용 전 num의 값 : " + num); // 10
		System.out.println("1회 수행 후 값 : " + ++num); // 11 (num = num + 1 과 같은 결과를 만들어낸다.)
		System.out.println("1회 수행 후 값 : " + ++num); // 12	
		System.out.println("1회 수행 후 값 : " + ++num); // 13		
		System.out.println("전위 연산자 적용 후 num의 값 : " + num); // 13
		System.out.println();
		
		//후위 연산자 테스트
		System.out.println("후위 연산자 적용 전 num의 값 : " + num); // 13
		System.out.println("1회 수행 후 값 : " + num++); // 13
		System.out.println("2회 수행 후 값 : " + num++); // 14
		System.out.println("3회 수행 후 값 : " + num++); // 15
		System.out.println("후위 연산자 적용 후 num의 값 : " + num); // 16
	}
	
	public void method2() {
		int num = 20;
		int result = num++ * 3; // 20 * 3 = 60, 20 + 1 = 21
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		System.out.println("num : " + num);
		System.out.println("result : " + result);
		
		System.out.println(num1++); // 10(11)
		System.out.println((++num1) + (num2++)); // 12 + 20(21) = 32
		System.out.println((num1++) + (--num2) + (--num3)); // 12(13) + 20 + 29 = 61
		
		System.out.println(num1); // 13
		System.out.println(num2); // 20
		System.out.println(num3); // 29
	}
	
}
