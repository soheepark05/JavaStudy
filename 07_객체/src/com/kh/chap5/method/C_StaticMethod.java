package com.kh.chap5.method;

/*
 * static 메소드
 * 
 * [표현법]
 *   [접근 제한자] static [예약어] 반환형 메소드명([매개변수, ...]) {
 *      수행내용;
 *      
 *      [return] [반환값];
 *   }
 * 
 */
public class C_StaticMethod {
	public static int num1 = 10;
	
	public static int num2 = 20;
	
	// 1. 매개 변수와 반환값이 없는 메소드
	public static void method1() {
		System.out.println(num1 + num2);
		
		C_StaticMethod.num2++;
	}
	
	// 2. 매개 변수가 없고 반환값이 있는 메소드
	public static int method2() {
		
		return num1 + num2;
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public static void method3(String name) {
		System.out.println(name + " 님의 방문을 환영합니다.");
	}
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드
	public static int method4(int ... numbers) {
		int sum = 0;
		
//		for(int number : numbers) {
//			sum += number; // sum = sum + number;
//		}
		
		for(int i = 0; i < numbers.length; i++) {
			sum += numbers[i]; // sum = sum + numbers[i];
		}
		
		return sum;
	}
}
