package com.kh.variable;

import com.kh.variable.practice.B_KeyBoardInput;
import com.kh.variable.practice.D_Print;

public class Application {

	public static void main(String[] args) {
		// 클래스 생성
//		A_Variable variable = new A_Variable();
		
		// 메소드 호출(실행)
//		variable.printValue();
//		variable.declear();
//		variable.overflow();
//		variable.constant();
		
		new B_KeyBoardInput().inputByScanner();
//		new C_Casting().autoCasting();
//		new C_Casting().casting();
		new D_Print().printMethod();
	}

}
