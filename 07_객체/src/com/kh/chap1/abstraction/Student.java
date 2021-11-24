package com.kh.chap1.abstraction;

/*
 * 클래스의 구조
 * 
 * [접근 제한자] [예약어] class 클래스명 {
 *   1) 필드부 (객체의 속성을 정의)
 *      [접근 제한자] [예약어] 자료형 필드명;
 *      ...
 *      
 *   2) 생성자부
 *      [접근 제한자] 클래스명([매개변수, ...]) {
 *        .. 필드를 초기화하거나, 객체를 사용할 준비 ..
 *      }
 *      
 *   3) 메소드부 (객체의 기능을 정의)
 *      [접근 제한자] [예약어] 반환형 메소드명([매개변수, ...]) {
 *        .. 기능 구현 ..
 *        
 *        [return] [반환값];
 *      }
 * }
 * 
 * - 접근 제한자 : 외부에서 접근할 수 있는 범위를 제한할 수 있다.
 *              public(+) > protected(#) > default(~) > private(-)으로 갈수록 접근 제한이 강화된다.
 * 
 */

public class Student {
	// 필드부
	public int id; // 학번
	public String name; // 이름
	public int age; // 나이
	public String address; // 주소
	public String gender; // 성별
	public int mathScore; // 수학점수
	public int engScore; // 영어점수
	
	// 생성자부
	
	// 메소드부
}
