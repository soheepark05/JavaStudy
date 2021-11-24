package com.kh.exception;

import java.io.IOException;

import com.kh.exception.practice.E_CheckedException;

public class Application {

	public static void main(String[] args) throws IOException, Exception {
//		new A_TryCatch().method1();
//		new B_Throws().method1();
//		new D_UnCheckedException().method1();
//		new D_UnCheckedException().method2();
		new E_CheckedException().method1();
	}

}
