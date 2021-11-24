package com.kh.variable;

import com.kh.variable.practice.CastingPractice;
import com.kh.variable.practice.VariablePractice;

public class Application {

	public static void main(String[] args) {
		VariablePractice variablePractice = new VariablePractice();
		CastingPractice castingPractice = new CastingPractice();
		
		variablePractice.method1();
		variablePractice.method2();
		variablePractice.method3();
		variablePractice.method4();
		
		castingPractice.method1();
		castingPractice.method2();
		castingPractice.method3();
	}
}
