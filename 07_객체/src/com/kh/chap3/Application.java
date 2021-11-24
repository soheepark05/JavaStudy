package com.kh.chap3;

import java.util.Arrays;

import com.kh.chap3.field.A_Field;
import com.kh.chap3.field.B_StaticField;
import com.kh.chap3.field.C_StaticFinalField;
import com.kh.chap3.field.E_InitBlock;

public class Application {

	public static void main(String[] args) {
		// 1. 변수 구분 테스트
		A_Field fieldTest = new A_Field(); // 인스턴스 생성
		
		fieldTest.test(10); // 매개 값으로 정수형 하나를 메소드 호출 시에 넘겨주어야 한다.

		
		// 2. 접근 제한자 테스트
		// public -> 필드에 직접 접근이 가능하다.
		System.out.println(fieldTest.publicField);
		
		// protected -> 같은 패키지 내에 존재하거나, 상속 구조에서만 접근이 가능하다.
//		System.out.println(fieldTest.protectedField); // 다른 패키지면서 상속 구조도 아니여서 접근 불가
		
		// default -> 같은 패키지 내에서만 접근이 가능하다.
//		System.out.println(fieldTest.defaultField); // 다른 패키지이기 때문에 접근 불가
		
		// private -> 같은 클래스 내에서만 접근이 가능하다.
//		System.out.println(fieldTest.privateField);
		
		// 3. 클래스 변수 테스트
		// 클래스 변수는 프로그램 실행과 동시에 메모리(static)에 생성되었기 때문에 객체를 생성하지 않아도 접근이 가능하다.("클래스명.변수명")
		System.out.println(B_StaticField.pubSta);
		System.out.println(B_StaticField.getPriSta());
				
		// 정적 멤버는 객체 참조 변수로도 접근이 가능하지만 정적 멤버는 클래스 이름으로 접근하는 것이 좋다.
//		System.out.println(new B_StaticField().pubSta);
		
		// 4. 상수 필드 테스트
		System.out.println(C_StaticFinalField.MAX_LEVEL);
		
		// final 키워드로 인해서 값을 변경할 수 없다.
//		C_StaticFinalField.MAX_LEVEL = 30;
		
		// 5. 필드 초기화 테스트
		E_InitBlock initBlock = new E_InitBlock();
		
		System.out.println("===== 필드 =====");
		System.out.println(initBlock.getName());
		System.out.println(initBlock.getPhoneName());
		System.out.println(initBlock.getPrice());		
		
		System.out.println("===== 클래스 변수 =====");
		System.out.println(E_InitBlock.getAge());
		System.out.println(E_InitBlock.getBrand());
	}
}
