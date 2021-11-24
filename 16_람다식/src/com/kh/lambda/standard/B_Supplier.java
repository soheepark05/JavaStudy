package com.kh.lambda.standard;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class B_Supplier {
	/*
	 * Supplier
	 *   - Supplier 함수적 인터페이스는 매개 변수가 없고 리턴 값이 있는 getXXX() 메소드를 가지고 있다.
	 *   - 이 메소드들은 실행 후 호출한 곳으로 데이터를 리턴(공급)하는 역할을 한다.  
	 */
	
	public void method1() {
//		Supplier<String> supplier = () -> {
//			return "Supplier : 제네릭으로 지정된 타입의 객체를 리턴한다.";
//		};
		
		Supplier<String> supplier = () -> "Supplier : 제네릭으로 지정된 타입의 객체를 리턴한다.";
		
		System.out.println(supplier.get());
		
//		IntSupplier intSupplier = () -> {
//			return 10 + 20;
//		};
		
		IntSupplier intSupplier = () -> 10 + 20;
		
		System.out.println("IntSupplier : int 값을 리턴한다. \t리턴값 : " + intSupplier.getAsInt());
		
	}
}
