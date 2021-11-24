package com.kh.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class A_Filtering {
	/*
	 * 필터링
	 *   - 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 *     - distinct() : 중복을 제거하는 메소드, Stream의 경우는 Object.equals()가 true를 리턴하면 동일 객체로 판단한다.
	 *     - filter(Predicate) : 매개 값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거한다. 
	 */
	
	// 중복제거
	public void method1() {
		List<String> names = Arrays.asList("문인수", "이몽룡", "성춘향", "문인수", "성춘향", "변사또");
		Stream<String> stream = names.stream();
		
		stream.forEach(str -> System.out.println(str));
		
		// 이미 최종 처리 메소드까지 호출된 스트림은 다시 사용할 수 없다.(컬렉션(배열)로부터 다시 스트림을 얻어와야 한다.)	
		// stream.forEach(str -> System.out.println(str));
		System.out.println();
		
		names.stream().distinct().forEach(str -> System.out.println(str));
	}
	
	// 필터링
	public void method2() {
		List<String> names = Arrays.asList("문인수", "이몽룡", "성춘향", "문인수", "성춘향", "변사또", "이순신");
		
		names.stream()
			 .filter(name -> name.startsWith("이"))
			 .forEach(name -> System.out.println(name));
		
		System.out.println();
		
		names.stream()
			 .distinct()
			 .filter(name -> name.startsWith("성"))
			 .forEach(name -> System.out.println(name));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
