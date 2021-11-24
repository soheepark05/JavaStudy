package com.kh.lambda.standard;

import java.util.function.BiFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import com.kh.lambda.standard.model.vo.Student;

public class C_Function {
	/*
	 * Function
	 *   - Function 함수적 인터페이스는 매개값 리턴값이 있는 applyXXX() 메소드를 가지고 있다.
	 *   - 주로 매개값을 리턴 값으로 매핑(타입 변환)하는 역할을 한다.
	 */
	
	public void method1() {
		Student student = new Student("문인수", 20, "남자", 80, 70);
		
		Function<Student, String> function = s -> s.getName();
		
		System.out.println("넌 이름이 뭐니? : " + function.apply(student));	
		
		System.out.print("[수학점수] : ");
		printInt((s) -> s.getMath(), student);
		
		System.out.print("[영어점수] : ");
		printInt((s) -> s.getEnglish(), student);
		
		System.out.print("[평균점수] : ");
		printInt((s) -> (s.getEnglish() + s.getMath()) / 2, student);
	}
	
	public void printInt(ToIntFunction<Student> function, Student student) {
		System.out.println(function.applyAsInt(student));
	}
	
}
