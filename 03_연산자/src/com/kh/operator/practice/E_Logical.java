package com.kh.operator.practice;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리연산자
	 *  - 두 개의 논리값을 연산하는 연산자
	 *  - &&(AND) : 왼쪽, 오른쪽 피연산자가 모두 true 경우 참(true)
	 *  			true && true 	=> true
	 *  			true && false 	=> false
	 *  			false && true 	=> false
	 *  			false && false 	=> false
	 *  - ||(OR) : 왼쪽, 오른쪽 피연산자 중에 하나라도 true 경우 참(true)
	 *  			true || true	=> true
	 *  			true || false	=> true
	 *  			false || true	=> true
	 *  			false || false	=> false
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1 부터 100 사이의 값인지 확인하기
		int num = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("임의의 정수를 입력해주세요.");
		num = scanner.nextInt();
		
		// 1 <= num <= 100
//		result = 1 <= num <= 100;
		result = (num >= 1) && (num <= 100);
		
		System.out.println("사용자가 입력한 값이 1이상 100이하의 값인가요? : " + result);
	}
	
	public void method2() {
		// 사용자가 입력한 값이 y 또는 Y 인지 확인하기
		char ch = '\u0000';
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("계속 진행하시려면 y 혹은 Y를 입력하세요.");
		String line = scanner.nextLine();
		ch = line.charAt(0);
//		ch = scanner.nextLine().charAt(0);
//		result = (ch == 'y') || (ch =='Y');
		result = (line.length() == 1) && ((ch == 'y') || (ch =='Y'));
		
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까!? : " + result);
	}
	
	public void method3() {
		// Short Cut 연산 테스트
		int num = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 num의 값 : " + num);

		// && 연산자를 기준으로 앞에서 이미 false가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 5) && (++num > 0);
		
		System.out.println("result : " + result);
		System.out.println("&& 연산 후의 num의 값 : " + num);
		System.out.println();
		
		System.out.println("|| 연산 전의 num의 값 : " + num);
		
		// || 연산자를 기준으로 앞에서 이미 true가 나왔기 때문에 굳이 뒤쪽의 연산은 수행하지 않는다.
		result = (num < 20) || (++num > 0);
		
		System.out.println("result : " + result);		
		System.out.println("|| 연산 후의 num의 값 : " + num);
	}
}
