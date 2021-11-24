package com.kh.exception.practice;

import java.util.Scanner;

public class D_UnCheckedException {
	
	/*
	 *  UnCheckedException
	 *    - RuntimeException을 상속하고 있는 예외들을 UnCheckedException이라 한다.
	 *    - 컴파일 시 예외 처리 코드가 있는지 검사하지 않는 예외를 말한다.
	 *    - RuntimeException 같은 경우엔 프로그램 실행할 때 문제가 발생되는 것이기 때문에 충분히 예측이 가능하기 때문에 조건문들을 통해서 처리가 가능하다.
	 *    
	 *    
	 *  RuntimeException의 후손들
	 *    - ArrayIndexOutOfBoundsException : 배열의 접근에 잘못된 인덱스 값을 사용하는 경우 예외 발생
	 *    - NegativeArraySizeException : 배열 크기를 음수로 지정한 경우 예외 발생
	 *    - ArithmeticException : 나누기 연산에서 분모가 0인 경우 예외 발생
	 *    - NullPointerException : Null인 참조 변수로 객체의 멤버 참조 시도 시 예외 발생
	 *    - ClassCastException : 잘못된 Cast 연산자 사용 시 예외 발생
	 */
	
	public void method1() {
		// ArithmeticException
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 1 : ");
		num1 = scanner.nextInt();
		
		System.out.print("정수 2 : ");
		num2 = scanner.nextInt();
		
//		if(num2 == 0) {
//			System.out.println("0으로는 나눌 수 없습니다.");
//			
//			return;
//		}
		
		try {
			result = num1 / num2;
			
			System.out.println("result : " + result);
		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
			System.out.println("0으로는 나눌 수 없습니다.");			
		}
	}

	public void method2() {
		// ArrayIndexOutOfBoundsException, NegativeArraySizeException
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("배열의 길이 : ");
		size = scanner.nextInt();
		
//		if(size <= 0) {
//			System.out.println("양수를 입력해 주세요.");
//			
//			return;
//		}
	
//		try {
//			arr = new int[size];
//			
//			for(int i = 0; i <= arr.length; i++) {
//				arr[i] = size - i;
//			}
//			
//			for(int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
//		} catch (NegativeArraySizeException e) {
//			System.out.println("양수를 입력해 주세요.");
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("잘못된 인덱스에 접근하셨습니다.");
//		} catch (Exception e) {
//			System.out.println("오류가 발생했습니다. 관리자에게 문의해 주세요.");
//		} 

		// 자바 1.7부터 하나의 catch 블록에서 여러 개의 예외를 처리할 수 있도록 멀티 catch 기능이 추가되었다. 
		try {
			arr = new int[size];
			
			for(int i = 0; i < arr.length; i++) {
				arr[i] = size - i;
			}
			
			for(int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 배열의 길이를 입력하셨거나 잘못된 인덱스에 접근하셨습니다.");
		} catch (Exception e) {
			System.out.println("오류가 발생했습니다. 관리자에게 문의해 주세요.");
		}
	}
}
