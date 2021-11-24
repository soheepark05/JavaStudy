package com.kh.stream;

import com.kh.stream.intermediate.A_Filtering;

public class Application {

	/*
	 * Stream
	 *   - 스트림은 자바 8 부터 추가된 기능으로 컬렉션(배열)의 저장 요소들을 하나씩 참조해서 람다식으로
	 *     처리할 수 있도록 해주는 반복자이다.
	 *   - 스트림은 Iterator와 비슷한 역할을 하지만 람다식으로 요소 처리 코드를 제공할 수 있고,
	 *     내부 반복자를 사용해서 병렬 처리와 중간 처리, 최종 처리 작업을 수행할 수 있다는 점에서 차이가 있다.
	 *   - 스트림은 컬렉션 요소에 대해서 중간 처리와 최종 처리를 할 수 있다.
	 *     - 중간 처리에서는 반복, 매핑, 필터링, 정렬 등을 수행한다.
	 *     - 최종 처리에서는 반복, 카운팅, 평균, 총합 등의 집계 처리를 수행한다.
	 *   - 중간 처리 메소드와 최종 처리 메소드를 쉽게 구분하는 방법은 리턴 타입을 보면 쉽게 구분이 가능하다.
	 *     - 리턴 타입이 Stream이라면 중간 처리 메소드이다.
	 *     - 리턴 타입이 기본 타입거나, OptionalXXX이라면 최종 처리 메소드이다. 
	 */
	public static void main(String[] args) {
//		System.out.println("=========================");
//		new A_Create().method1();
//		new A_Create().method2();
//		new A_Create().method3();
		
		System.out.println("=========================");
//		new A_Filtering().method1();
		new A_Filtering().method2();
		
	}

}
