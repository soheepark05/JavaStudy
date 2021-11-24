package com.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : " );
		num = scanner.nextInt();
		
		result = num > 0 ? "양수다." : "양수가 아니다";
		
		System.out.println(result);
	}

	public void practice2() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수  : ");
		num = scanner.nextInt();
		
		result = num > 0 ? "양수다" : (num < 0 ? "음수다" : "0이다");
		
		System.out.println(result);
	}

	public void practice3() {
		int num = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		num = scanner.nextInt();
		
		result = num % 2 == 0 ? "짝수다" : "홀수다";
		
		System.out.println(result);
	}
	
	public void practice4() {
		int people = 0;
		int candy = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		people = scanner.nextInt();
		
		System.out.print("사탕 개수 : ");
		candy = scanner.nextInt();

		System.out.println("1인당 사탕 개수 : " + (candy / people));
		System.out.println("남는 사탕 개수 : " + (candy % people));
	}

	public void practice5() {
		int age = 0;
		String result = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이 : ");
		age = scanner.nextInt();	
		
		result = (age <= 13) ? "어린이" : (age <= 19 ? "청소년" : "성인");
		
		System.out.println(result);
	}

	public void practice6() {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		boolean isTrue = false;
		Scanner scanner = new Scanner(System.in);

		System.out.print("입력1 : ");
		num1 = scanner.nextInt();

		System.out.print("입력2 : ");
		num2 = scanner.nextInt();

		System.out.print("입력3 : ");
		num3 = scanner.nextInt();

		isTrue = (num1 == num2) && (num2 == num3);
		
		System.out.println(isTrue);
	}

}
