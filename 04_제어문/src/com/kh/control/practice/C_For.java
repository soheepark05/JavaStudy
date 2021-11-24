package com.kh.control.practice;

import java.util.Scanner;

public class C_For {
	/*
	 * for 문
	 * 
	 * [표현법]
	 *   for(초기식; 조건식; 증감식) {
	 *       .. 반복적으로 실행시키고자하는 실행구문 ..
	 *   }
	 *   
	 * - 초기식 : 반복문이 수행될 때 단 한 번만 실행되는 구문으로 반복문 안에서 사용될 변수를 선언하고 초기값을 대입한다.
	 * - 조건식 : 반복문이 수행될 때 조건을 작성하는 구문으로 조건식이 참(true)이면 실행 구문을 실행하고, 조건식이 거짓(false)이
	 *          되는 순간 반복을 멈추고 빠져나온다.
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 부분으로 주로 초기식에 제시한 변수를 가지고 증감 연산자(++, --)를 사용한다.
	 * * 초기식, 조건식, 증감식은 생략이 가능하고 모두 생략하면 무한 루프에 빠진다. (생략 시에도 ;은 반드시 필요하다.(for(;;)))
	 */
	
	public void method1() {
		/*		 
		 System.out.println("안녕하세요.");
		 System.out.println("안녕하세요.");
		 System.out.println("안녕하세요.");
		 System.out.println("안녕하세요.");
		 System.out.println("안녕하세요.");
		 */
		
		System.out.println("i++로 반복");
		
		for(int i = 0; i < 5; i++) { // 0 1 2 3 4
			System.out.println("Hello");
		}
		
		System.out.println();
		System.out.println("i--로 반복");
		
		for(int i = 20; i > 15; i--) { // 20 19 18 17 16  
			System.out.println("안녕하세요.");
		}
		
		System.out.println();
		System.out.println("1부터 10까지 숫자 중에 짝수인 경우만 출력되도록 해보자^^");
		
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " "); //2 4 6 8 10
		}
	}
	
	public void method2() {
		// 1부터 10까지 정수들의 합계
		// 1 + 2 + 3 + 4 + ... + 10
		// sum += 1
		// sum += 2
		// ...
		// sum += 10
		
		int sum = 0;
		
		// 반복문
		for(int i = 1; i <= 10; i++) {
//			sum = sum + i;
			sum += i;
		}
		
//		System.out.println(i);
		System.out.println("합계 : " + sum);
	}

	/*
	 * 중첩 for 문
	 * 
	 * [표현법]
	 *   for(초기식1; 조건식1; 증감식1) {
	 *     수행할 문장 1;
	 *     
	 *     for(초기식2; 조건식2; 증감식2) {
	 *       수행할 문장2;
	 *     }
	 *     
	 *     수행할 문장3;
	 *   }
	 *   
	 * - 반복문도 중첨해서 사용할 수 있는데 바깥쪽 반복문이 한 번 실행할 때마다 
	 *   중첩된 반복문은 지정된 횟수만큼 반복해서 문장을 수행하고 다시 바깥쪽 반복문으로 돌아간다.
	 */
	
	public void method3() {
		// 2단 ~ 9단
		// 단 --> 2부터 9까지 1씩 증가 --> 바깥쪽 for문을 통해 해결
		// 곱해지는 수 --> 매 단 마다 1부터 9까지 1씩 증가 --> 안쪽 for문을 통해 해결
		// == 2단 ==
		// 2 * 1 = 2
		// 2 * 2 = 4
		// ...
		// 2 * 9 = 18
		
		for(int i = 2; i < 10; i++) {
			System.out.printf("== %d단 ==\n", i);
			
			for(int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
			
			System.out.println();
		}
	}

	public void method4() {
		/*
		 * ==============
		 * q 또는 Q : 종료
		 * ==============
		 */
		
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.println("==============");
			System.out.println("q 또는 Q : 종료");
			System.out.println("==============");
			
			ch = scanner.nextLine().charAt(0);
			
			if(ch == 'q' || ch == 'Q') {
				System.out.println("프로그램을 종료합니다.");
				
//				return;
				break;
			}
		}	
	}
}
