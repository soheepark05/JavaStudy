package com.kh.lambda.basic;

import com.kh.lambda.basic.functional.A_FuncInterface;
import com.kh.lambda.basic.functional.B_FuncInterface;
import com.kh.lambda.basic.functional.C_FuncInterface;

public class B_Functional {
	
	private int num = 100;
	
	public void method1() {
		A_FuncInterface fi = () -> {
//			String str = "매개변수와 반환값이 없어요~~";
			
			System.out.println("매개변수와 반환값이 없는 람다식 1");
			
//			System.out.println(str);
		};
		
		fi.method();
		
//		실행문이 한줄이라면 중괄호({})를 생략 가능
		
		fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 2");
		
		fi.method();
		
//		fi = new A_Functional() {
//			
//			@Override
//			public void method() {
//				System.out.println("익명 구현 객체를 통한 인터페이스 구현");
//			}
//		};
	}
	
	public void method2() {
		B_FuncInterface fi = (int a) -> {
			System.out.println(a * a);
		};
		
		fi.method(5);
		
		// 매개변수의 자료형을 생략 가능
		// 매개변수가 하나이면 괄호()를 생략 가능
		fi = a -> System.out.println(a * 5);
		
		fi.method(10);
	}
	
	public void method3() {
		int result = 0;
		C_FuncInterface fi = null;
		
		fi = (int x, int y) -> {
			return x + y;
		};
		
		result = fi.method(10, 20);
		
		System.out.println("10 + 20 = " + result);
		
		// 매개변수의 자료형, return 구문과 중괄호({})를 생략 가능
		fi = (x, y) -> x * y;
		
		System.out.println("10 * 20 = " + fi.method(10, 20));
	}
	
	/*
	 * 람다식의 실행 블록에서는 필드(인스턴스 변수) 및 로컬변수(매개변수)를 사용할 수 있다.
	 * 필드(인스턴스 변수)는 제약사항 없이 사용하지만, 로컬변수(매개변수)는 제약사항이 따른다.
	 * 람다식에서 사용되는 this는 익명 구현 객체의 참조가 아니라 람다식을 실행하는 객체의 참조이다.
	 * 람다식에서 로컬변수(매개변수)를 이용할 때는 변수들이 final 이거나 effectively final 이어야한다.
	 *   - 로컬변수(매개변수)는 람다식에서 읽는 것은 허용하지만, 람다식 내부에서 또는 외부에서 변경할 수 없다.
	 *   - 초기화 된 이후에 값이 한번도 변경되지 않는 변수를  effectively final이라고 한다.
	 */
	
	public void method4(int arg) {
		int num = 20;
		
//		필드(인스턴스 변수)사용
//		this.num = 200;
		A_FuncInterface fi = () -> {
			this.num = 200;
			
			System.out.println(this.num);
		};
		
		fi.method();
		
//		fi = new A_FuncInterface() {
//			
//			@Override
//			public void method() {
//				System.out.println(this.num);
//			}
//		};
		
//		로컬 변수 사용
//		num = 200;
//		arg = 300;
		fi = () -> {
//			num = 200;
//			arg = 300;
			
			System.out.println(num + ", " + arg);
		};
		
		fi.method();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
