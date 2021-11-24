package com.kh.chap5.method;

public class B_Overloading {
	/*
	 * 메소드 오버로딩
	 *  - 한 클래스 내에 같은 이름의 메소드를 여러 개 정의하는 것을 메소드 오버로딩이라고 한다.
	 *  - 메소드 오버로딩은 매개변수의 자료형 개수와 순서가 다르게 작성되어야 한다.
	 *  - 단, 매개 변수명, 접근 제한자, 반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 */
	
	public void test() {
		// 메소드 오버로딩이 잘 되어있는 대표적인 메소드!!
		// System.out.println();
	}
	
	public void test(int a) {
	}
	
	public void test(int a, String s) {
	}
	
	public void test(int a, int b) {
	}
	
	/*
	 * 에러가 발생
	 *   - 매개 변수 이름과 상관없이 자료형의 개수와 순서가 같아서 에러가 발생한다.
	 *   - 즉, 매개 변수의 자료형의 개수와 순서가 다르게 작성되어야 한다.
	 */
//	public void test(int c, int d) {
//	}
	
	public void test(int a, int b, String s) {
	}
	
	public void test(int a, String s, int b) {
	}
	
	/*
	 * 에러가 발생
	 *   - 반환형이 다르다고 오버로딩이 적용되지 않는다.
	 *   - 메소드를 호출하는 시점에 매개 변수가 동일하기 때문에 에러가 발생한다. 
	 *   - 즉, 반환형과 상관없이 매개 변수의 자료형의 개수와 순서가 다르게 작성되어야 한다.
	 * 
	 */
//	public int test(int a, int b, String s) {
//	}

	/*
	 * 에러가 발생
	 *   - 접근 제한자가 다르다고 오버로딩이 적용되지 않는다.
	 *   - 즉, 접근 제한자와 상관없이 매개 변수의 자료형의 개수와 순서가 다르게 작성되어야 한다. 
	 */
//	private void test(int a, int b, String s) {
//	}

}
