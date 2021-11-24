package com.kh.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if 문
	 * 
	 * [표현법]
	 *   if(조건식) {
	 *     .. 실행할 코드 ..;
	 *   }
	 * - 보통 조건식에는 비교 연산자, 논리 연산자를 사용한다.
	 * - 조건식의 결과가 참(true)이면 중괄호 안의 코드를 실행한다.
	 * - 조건식의 결과가 거짓(false)이면 중괄호 안의 코드를 무시하고 넘어간다.
	 */
	
	public void method1() {
		// 입력받은 정수값이 홀수인지 짝수인지 판별하라 (삼항 연산자를 if로 변경)
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		num = scanner.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("%d은(는) 짝수이다.\n", num);
		}
		
		if(num % 2 != 0) {
			System.out.printf("%d은(는) 홀수이다.\n", num);			
		}
	}
	
	public void method2() {
		// 주민번호를 입력 받아서  
		// 뒷 자리의 첫 번째 값이 1 또는 3이면 "남자입니다." 출력
		// 뒷 자리의 첫 번째 값이 2 또는 4이면 "여자입니다." 출력
		// 뒷 자리의 첫 번째 값이 1, 3 또는 2, 4가 아니면 "잘못 입력하셨습니다." 출력
		// 예시)
		//   주민번호를 입력하세요. (- 포함) : 000525-33333333
		//   남자입니다.     
		char pId = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요. (- 포함) : ");
		
		pId = scanner.nextLine().charAt(7);
		
		if(pId == '1' || pId == '3' ) {
			System.out.println("남자입니다.");
		}
		
		if(pId == '2' || pId == '4' ) {
			System.out.println("여자입니다.");
		}
		
		if(pId != '1' && pId != '3' && pId != '2' && pId != '4' ) {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	/*
	 * if-else 문
	 * 
	 * [표현법]
	 *   if(조건식) {
	 *     .. 실행 코드 1..
	 *   } else {
	 *     .. 실행 코드 2..
	 *   }
	 * 
	 * - 조건식의 결과가 참(true)인 경우 "실행 코드 1"을 수행, else 문은 실행하지 않는다.
	 * - 조건식의 결과가 거짓(false)인 경우 "실행 코드 2"를 수행한다. 
	 */
	 
	public void method3() {
		// 사용자의 이름을 받아서 본인 이름이 맞는지 확인
		String name = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. : ");
		name = scanner.nextLine();
		
//		System.out.println("문인수" == "문인수");
//		System.out.println("문인수" == new String("문인수"));
//		System.out.println(name == "문인수");
		
		// 문자열의 동등 비교는 String 클래스에서 제공하는 equals() 메소드를 이용해서 비교해야 된다.
		if(name.equals("문인수")) {
			System.out.println("본인이 맞습니다.");
		} else {
			System.out.println("본인이 아닙니다.");			
		}
	}
	
	/*
	 * if-else if 문
	 * 
	 * [표현법]
	 *   if(조건식1) {
	 *     .. 실행 코드 1..
	 *   } else if(조건식2) {
	 *     .. 실행 코드 2.. 
	 *   } else if(조건식3) {
	 *     .. 실행 코드 3..
	 *   } [else {
	 *     위의 조건들이 모두 거짓(false)일 경우 실행할 코드..
	 *   }]
	 *   
	 * - if-else if 문은 여러 개의 조건을 제시할 경우 사용한다.
	 * - 단, else 문이 제시되어 있을 경우 위의 조건이 모두 false가 나오게 되면 else 문이 실행된다. 
	 */
	
	public void method4() {
		// 사용자가 입력한 영문자가 대문자인지 소문자인지 판별하라
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("영문자 입력 : ");
		ch = scanner.nextLine().charAt(0);
		
//		System.out.println((int)ch);
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.printf("%c는 대문자이다.\n", ch);
		} else if(ch >= 'a' && ch <= 'z') {
			System.out.printf("%c는 소문자이다.\n", ch);			
		} else {
			System.out.printf("%c는 영문자가 아닙니다.\n", ch);
		}
	}
	
	public void method5() {
		/*
		 * 두 정수를 입력받고 + 또는 -를 입력받아 알맞은 계산을 출력하라
		 * 단, + 또는 - 외의 다른 문자를 입력하는 경우 "잘못 입력했습니다." 출력
		 * 예시)
		 *   첫 번째 수 : 3
		 *   두 번째 수 : 4
		 *   연산자 입력(+ 또는 -) : +
		 *   3 + 4 = 7
		 */
		
		int num1 = 0;
		int num2 = 0;
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 수 : ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		op = scanner.nextLine().charAt(0);
		
		if(op == '+') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 + num2));
		} else if(op == '-') {
			System.out.printf("%d %c %d = %d\n", num1, op, num2, (num1 - num2));
		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
}