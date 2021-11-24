package com.kh.chap5.method;

import java.util.Arrays;

import com.kh.chap4.constructor.User;

/*
 * 메소드
 * 
 * [표현법]
 *   [접근 제한자] [예약어] 반환형 메소드명([매개변수, ...]) {
 *      수행내용;
 *      
 *      [return] [반환값];
 *   }
 * 
 */

public class A_Method {
	// 1. 매개 변수가 없고 반환값도 없는 메소드
	public void method1() {
		// 어떤 값도 반환하지 않고 메소드 내용만 수행 후 종료된다.
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		
		// 반환형이 void인 메소드는 반환값이 없어야 하는데 
		// return 문을 사용할 때 return 문 뒤에 반환값이 오면 에러가 발생한다.
//		return 1;
//		return; // 반환값 없이 사용은 가능하다.
//		
//		System.out.println("리턴 이후 실행");
	}
	
	// 2. 매개 변수는 없고 반환값은 있는 메소드
	public String method2() {
//		String str =  "매개변수가 없지만 반환값이 있는 메소드입니다.";
		
//		return str;
		
		return "매개변수가 없지만 반환값이 있는 메소드입니다.";
	}
	
	// 3. 매개 변수가 있고 반환값이 없는 메소드
	public void method3(int num1, int num2) {
		
		System.out.println("매개 변수는 있고 반환값이 없는 메소드입니다.");
		System.out.println("\t입력받은 매개변수 num1 + num2 = " + (num1 + num2));
	}
	
	// 4. 매개 변수가 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		
		return num1 - num2;
	}
	
	// 5. 매개 변수로 User 객체를 전달받는 메소드
	//  - 매개 변수로 객체가 전달되거나 반환값으로 객체를 반환할 때는 객체의 참조 값(주소)이 전달 또는 반환된다.
	public void method5(User user) {
		user.setName("이몽룡");
		user.setAge(10);
	}
	
	// 6. 매개 변수로 가변인자를 전달받는 메소드
	//   - 가변인자의 경우 자바 1.5 부터 지원한다. 
	//   - 가변인자는 항상 매개변수 마지막에 있어야한다.
	//   - 가변인자 사용 시 값을 주지 않아도 호출이 되기 때문에 인자에서 예외 처리하는 코드가 필요하다.
	public void method6(int[] numbers) {
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
	
	public void method7(String name, int ... numbers) {
		System.out.println(name);
		System.out.println(numbers.length);
		System.out.println(Arrays.toString(numbers));
	}
}
