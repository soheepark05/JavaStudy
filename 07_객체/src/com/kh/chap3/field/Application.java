package com.kh.chap3.field;

// protected, default 접근 제한자 확인을 위한 Application.java 
public class Application {

	public static void main(String[] args) {
		A_Field fieldTest = new A_Field();
		
		// 2. 접근 제한자 테스트
		// public -> 필드에 직접 접근이 가능하다.
		System.out.println(fieldTest.publicField);
		
		// protected -> 같은 패키지 내에 존재하거나, 상속 구조에서만 접근이 가능하다.
		System.out.println(fieldTest.protectedField);
		
		// default -> 같은 패키지 내에서만 접근이 가능하다.
		System.out.println(fieldTest.defaultField);
		
		// private -> 같은 클래스 내에서만 접근이 가능하다.
//		System.out.println(fieldTest.privateField);
	}
}
