package com.kh.variable.practice;

import java.util.Scanner;

public class CastingPractice {
	
	public void method1() {
		char ch = '\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 : ");
		ch = scanner.nextLine().charAt(0);
		
		/*
		int num = ch;
		System.out.println(ch + " unicode : " + num);
		*/
		
		System.out.println(ch + " unicode : " + (int) ch);
	}
	
	public void method2() {
		double korScore = 0;
		double engScore = 0;
		double mathScore = 0;
		int sum = 0;
		int avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 : ");
		korScore = scanner.nextDouble();
		
		System.out.print("영어 : ");
		engScore = scanner.nextDouble();
		
		System.out.print("수학 : ");
		mathScore = scanner.nextDouble();
		
		sum = (int)(korScore + engScore + mathScore);
		avg = sum / 3;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	public void method3() {
		int iNum1 = 10;
		int iNum2 = 4;
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1 / iNum2); // 2
		System.out.println((int) dNum); // 2
		
		System.out.println((double) iNum1); // 10.0
		System.out.println(iNum2 * dNum); // 10.0

		System.out.println(dNum); // 2.5
		System.out.println((double) iNum1/iNum2); // 2.5
		
		System.out.println((int) fNum); // 3
		System.out.println(iNum1 / (int) fNum); // 3
		
		System.out.println(iNum1/fNum); // 3.3333333
		System.out.println(iNum1/ (double) fNum); // 3.33333333333333335
		
		System.out.println(ch); // 'A'
		System.out.println((int) ch); // 65
		System.out.println(ch + iNum1); // 75
		System.out.println((char) (ch + iNum1)); // 'K'
	}

}
