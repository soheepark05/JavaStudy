package com.kh.control.practice;

import java.util.Scanner;

public class E_DoWhile {

	/*
	 * do-while 문
	 * 
	 * [표현식]
	 *   
	 *   [초기식]
	 *   
	 *   do {
	 *      .. 반복적으로 실행될 코드 ..
	 *      
	 *      [증감식, 분기문]
	 *   } while(조건식);
	 *   
	 * - while 문은 처음 수행될 때도 조건식을 검사하고 조건식이 참(true)일 경우에만 실행이 되는데
	 *   do-while 문은 첫 실행은 조건식에 관계없이 무조건 실행된다.
	 * - 작성 시 주의할 점은 while() 뒤에 반드시 세미콜론(;)을 붙여야 한다.
	 */
	
	public void method1() {
		int num = 1;
		
		while(num == 0) {
			System.out.println("while문 실행!!");
		}
		
		do {
			System.out.println("do-while문 실행!!");
		} while(num == 0);
	}
	
	public void method2() {
		// 1부터 랜덤값(1 ~ 10)까지의 합계
		int sum = 0;
		int random = (int) (Math.random() * 10 + 1);
		
		System.out.println("랜덤 값 : " + random);
		
		int i = 1;
		
		do {
			sum += i;
			
			i++;
		} while(i <= random);
		
		System.out.println("합계 : " + sum);
	}
	
	public void method3() {
		char menu = '\u0000';
		Scanner scanner = new Scanner(System.in);
		C_For example = new C_For();
		
		do {
			System.out.println();
			System.out.println("============== 메뉴 ==============");
			System.out.println("1. new C_For().method1() 실행!!");
			System.out.println("2. new C_For().method2() 실행!!");
			System.out.println("3. new C_For().method3() 실행!!");
			System.out.println("4. new C_For().method4() 실행!!");
			System.out.println("Q(q). 프로그램 종료.");
			System.out.println("=================================");
			System.out.print("> ");
			
			menu = scanner.nextLine().charAt(0);
			
			switch(menu) {
				case '1' :
					example.method1();
					
					break;
				case '2' :
					example.method2();
					
					break;
				case '3' :
					example.method3();
					
					break;
				case '4' :
					example.method4();
					
					break;
				case 'Q' :
				case 'q' :
					System.out.println("프로그램을 종료합니다.");
					
					return;
				default :
					System.out.println("메뉴를 잘못 입력했습니다.");
			}
		} while(true);
	}
}
