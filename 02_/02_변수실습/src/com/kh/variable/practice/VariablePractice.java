package com.kh.variable.practice;

import java.util.Scanner;


public class VariablePractice {
	public void method1() {
		
		System.out.printf("문제1) 이름,성별,나이,키를 사용자에게 입력받고, 각각의 변수에 값을 담고, 출력하세요.\n");
		Scanner scanner = new Scanner(System.in); //스캐너 클래스 = 읽은 바이트를 문자,정수,실수,불린문자열등 다양한 타입으로 변환해 리턴함
		
		
		String name=""; //name 이라는 변수선언, 타입은 문자열
		int age=0; //나이 변수 선언, 타입은 정수형
		double height =0; //java에서 실수처리 대부분 double로 한다.
	
		
		
		
		System.out.println("이름을 입력하세요: ");
		name = scanner.next();
		
		System.out.println("나이를 입력하세요: ");
		age = scanner.nextInt();
		
		System.out.println("성별을 입력하세요(남/여)");
		//char gender = scanner.next().charAt(0);
		//String line = scanner.nextLine();
		//gender = line.charAt(0);
		char gender = scanner.next().charAt(0);
		
		
		System.out.println("키를 입력하세요(cm)");
		height = scanner.nextDouble();//실수값 받을 때 사용.
		
		//%f 실수 값을 소수점 아래 6쨰 자리가지 보여준다.
		//범위를 넘어가면 반올림. 소수점 아래 값 없으면 0으로 채운다.
		
		System.out.printf("키 %.1f인 %d살  %c자 %s님 반갑습니다^^", height, age, gender, name);
		
		
	
		scanner.close(); //Resource leak 오류 문구 뜨길래 구글링했더니 close문을 넣으라고해서 넣음..
	}

	
	
	
	public void method2() {
		System.out.println();
		System.out.println("문제2)키보드로 정수 두개를 입력받고 두수의 합, 차, 곱, 나누기 한 몫을 출력하세요.");
	
		int num1,num2=0;
		
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("첫 번째 정수를 입력하세요: ");
		num1 = scanner.nextInt();
	
		System.out.println("두 번째 정수를 입력하세요: ");
		num2 = scanner.nextInt();
	
	
		System.out.printf("더하기 결과 : %d \n뺴기 결과: %d \n곱하기 결과: %d \n나누기 결과: %d\n ",
				(num1+num2),(num1-num2),(num1*num2),(num1/num2));
	}
	public void method3() {
		System.out.println("문제3)키포드로 가로,세로값을 실수형으로 입력받아 사각형의 면적과 둘레를 계산하여 출력하세요");
		
		double garo=0,sero = 0,meonjuk=0,dulrae=0;
		
		
		meonjuk = (garo*sero);
		dulrae=(garo+sero)*2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가로: ");
		garo = sc.nextDouble();
		
		System.out.println("세로: ");
		sero = sc.nextDouble();
		
		meonjuk = (garo*sero);
		dulrae=(garo+sero)*2;
		
		System.out.printf("면적: %.2f \n둘레: %.2f \n", meonjuk, dulrae);
	}
	public void method4() {
		System.out.println("문제4)영어 문자열 값을 키보드로 입력받아 앞의 문자 세개를 출력하세요.");
		
		Scanner sc = new Scanner(System.in);
		String a ="";
		char a0;
		char a1;
		char a2;
		
		System.out.println("문자열을 입력하세요: ");
		a = sc.nextLine();
		a0 = a.charAt(0); 	//charA(위치): 해당위치에서 문자값 out
		a1 = a.charAt(1);
		a2 = a.charAt(2);
		
			
		System.out.printf("첫번째 문자: %c\n두번째 문자: %c\n세번째 문자: %c\n",a0,a1,a2);
		
		
		
		
		
		
	}

	
}
