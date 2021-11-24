package com.kh.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 * 
	 * [표현법]
	 *   조건식 ? 식1(조건식이 참일 경우 수행) : 식2(조건식이 거짓일 경우 수행);
	 *   
	 * - 피연산자가 3개인 연산자이다.
	 * - 조건식은 주로 비교, 논리 연산자가 사용된다.(조건식은 반드시 true, false가 나와야 한다.)
	 * - 조건식의 결과가 true이면 식1을 수행한다.
	 * - 조건식의 결과가 false이면 식2를 수행한다.
	 * - 삼항 연산자는 중첩으로 사용이 가능하지만 가독성에 문제가 될 수 있기 때문에 상황에 따라서 적절하게 사용해야 한다.
	 */
	
	public void method1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 : ");
		
		num = scanner.nextInt();
//		result = (num > 0) ? "양수이다." : "음수이다.";
//		result = (num == 0) ? "0 입니다." : (num > 0) ? "양수이다." : "음수이다.";
		result = (num > 0) ? "양수이다." : (num == 0) ? "0 입니다." : "음수이다.";
		
		System.out.println(num + "은(는) " + result);
		
		result = (num % 2 == 0) ? "짝수이다." : "홀수이다."; 
		
		System.out.println(num + "은(는) " + result);
	}

	public void method2() {
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
		String result = "";
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 수 : ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자 입력(+ 또는 -) : ");
		op = scanner.nextLine().charAt(0);
		
		// 정수값과 빈 문자열인 ""와 + 연산하여 문자열로 변경한다.
		// String.valueOf() 메소드는 기본 자료형의 값들을 문자열로 변경한다.
		result = (op == '+') ? (num1 + num2) + "" : 
					(op == '-') ? String.valueOf(num1 - num2) : "잘못 입력했습니다.";
		
		System.out.printf("%d %c %d = %s", num1, op, num2, result);
	}
}