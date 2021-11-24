package com.kh.control.practice;

import java.util.Scanner;

public class F_Break {
	/*
	 * break 문
	 * 
	 * [표현법]
	 *   반복문/switch(조건식) {
	 *   	[break;] // 해당 구문을 빠져나가는 역할을 한다.
	 *   }
	 *   
	 *   - 반복문의 경우 중첩 되어있으면 가장 가까운 반복문을 빠져나가는 역할을 한다.
	 *     단, switch 문안의 break는 switch 문을 빠져나가는 역할을 한다. 
	 */
	
	public void method1() {
		// 사용자에게 문자열을 입력받고 문자열의 길이를 출력한다.
		// 단, exit를 입력하면 반복을 종료한다.
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("문자열을 입력하세요. : ");
			str = scanner.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.printf("입력하신 문자열 %s의 길이는 %d 입니다.\n", str, str.length());
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}
	
	public void method2() {
		// 1부터 랜덤 값(1 ~ 10)까지의 합계를 반복문을 통해서 출력한다.
		// 단, 랜덤 값이 숫자 5가 나오면 프로그램을 종료한다.
		int sum;
		int random = 0;
		
		while(true) {
			if(random == 5) {
				break;
			}
			
			sum = 0;
			random = (int) (Math.random() * 10 + 1);
			
//			if(random == 5) {
//				break;
//			}
			
			for(int i = 0; i <= random; i++) {
				sum += i;
			}
			
			System.out.printf("1부터 %d까지의 합계 : %d\n", random, sum);
		}
		
		System.out.println("프로그램을 종료합니다.");		
	}
}
