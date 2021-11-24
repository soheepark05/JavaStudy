package com.kh.object;

import com.kh.object.practice.NonStaticSample;
import com.kh.object.practice.StaticSample;

public class Application {
	public static void main(String[] args) {
		NonStaticSample nonStaticSample = new NonStaticSample();
		
		System.out.print("1. 랜덤 값 : ");
		nonStaticSample.printLottoNumbers();
		
		System.out.print("2. a문자 5개 출력 : ");
		nonStaticSample.outputChar(5, 'a');
		
		System.out.println("3. 랜덤 영문자 출력 : " + nonStaticSample.alphabette());
		
		System.out.println("4. apple의 2번 4번 인덱스 사이의 값 출력 : " + nonStaticSample.mySubstring("apple", 2, 4));
		System.out.println();
		
		// StaticSample 클래스의 필드인 value를 "Java"로 초기화 후 출력
		StaticSample.setValue("Java");
		System.out.println("value : " + StaticSample.getValue());
		
		// toUpper 메소드 실행 --> 출력
		StaticSample.toUpper();
		System.out.println("대문자로 : " + StaticSample.getValue());
		
		// valueLength 메소드 실행 --> 출력
		System.out.println("길이 : " + StaticSample.valueLength());
		
		// valueConcat 메소드 실행 --> 출력
		System.out.println("PROGRAMMING 붙여서 : " + StaticSample.valueConcat("PROGRAMMING"));
		
		// setChar 메소드 실행 --> 출력
		StaticSample.setChar(0, 'C');
		System.out.println("J => C : " + StaticSample.getValue());

	}
}
