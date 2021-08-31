package com.kh.operator.practice;

public class A_logicalNegation {
	/*논리 부정 연산자
	 * 
	 * [표현법]
	 * ! 논리값(T/F)
	 * - 논리 값을 반대로 바꾸는 연산자이다.(T->F,F->T)
	 * 
	 */
	public void method1() {
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("b1: " + b1); //T
		System.out.println("b1의 부정 : " +!b1); //F
		System.out.println("b1: "+ b1); //T원본값은 변하지 x
		
		System.out.println("b2: "+b2);//f
		System.out.println("b2의 부정: "+!b2);//t
		
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
