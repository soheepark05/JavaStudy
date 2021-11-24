package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {

	public void method1() {
		String name = "";
		int age = 0;
		char gender = '\u0000';
		double height = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name = scanner.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
		age = scanner.nextInt();
		scanner.nextLine(); // nextInt() 메소드 뒤에 nextLine() 메소드가 올 것이기 때문에 그 사이에 엔터를 버퍼에서 빼주는 작업을 해줘야된다. 
		
		System.out.print("성별을 입력하세요(남/여) : ");
		gender = scanner.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		height = scanner.nextDouble();
		
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " + name + "님 반갑습니다^^");
	}
	
	public void method2() {
		int num1 = 0;
		int num2 = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		num1 = scanner.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		num2 = scanner.nextInt();
		
		System.out.println("더하기 결과 : " + (num1 + num2));	// 괄호를 안하게 되면 문자열로 인식하여 숫자 두개가 붙어서 나온다.
		System.out.println("빼기 결과 : " + (num1 - num2));	// 마찬가지로 괄호를 안하게되면 '문자열-정수'로 인식하여 오류 발생
		System.out.println("곱하기 결과 : " + (num1 * num2));		
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
	}
	
	public void method3() {
		double width = 0;
		double height = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("가로 : ");
		width = scanner.nextDouble();
		
		System.out.print("세로 : ");
		height = scanner.nextDouble();
		
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + ((width + height) * 2));
	}
	
	public void method4() {
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		str = scanner.nextLine();
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}
}
