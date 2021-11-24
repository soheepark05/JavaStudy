package com.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		number = scanner.nextInt();

		if (number >= 1) {
			for (int i = 1; i <= number; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
			
		}
	}

	public void practice2() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			number = scanner.nextInt();
			
			if (number >= 1) {
				for (int i = 1; i <= number; i++) {
					System.out.print(i + " ");
				}
				
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void practice3() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("1이상의 숫자를 입력하세요 : ");
		number = scanner.nextInt();

		if (number >= 1) {
			for (int i = number; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice4() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			number = scanner.nextInt();
			
			if (number >= 1) {
				for (int i = number; i >= 1; i--) {
					System.out.print(i + " ");
				}
				
				break;
			} else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void practice5() {
		int number = 0;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		number = scanner.nextInt();
		
		for(int i = 1; i <= number; i++) {
			sum += i; 

			if(i < number) { 
				System.out.print(i + " + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		
		System.out.print(sum);
	}

	public void practice6() {
		int min = 0;
		int max = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		firstNumber = scanner.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		secondNumber = scanner.nextInt();
		
		if(firstNumber >= 1 && secondNumber >= 1) {
			min = Math.min(firstNumber, secondNumber);
			max = Math.max(firstNumber, secondNumber);
			
			for(int i = min; i <= max; i++) {
				System.out.print(i + " ");
			}	
		} else {
			System.out.println("1 이상의 숫자만을 입력해주세요.");
		}
	}

	public void practice7() {
		int min = 0;
		int max = 0;
		int firstNumber = 0;
		int secondNumber = 0;
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.print("첫 번째 숫자 : ");
			firstNumber = scanner.nextInt();
			
			System.out.print("두 번째 숫자 : ");
			secondNumber = scanner.nextInt();
			
			if(firstNumber >= 1 && secondNumber >= 1) {
				min = Math.min(firstNumber, secondNumber);
				max = Math.max(firstNumber, secondNumber);
				
				for(int i = min; i <= max; i++) {
					System.out.print(i + " ");
				}	
				
				break; 
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");	
			}
		}
	}

	public void practice8() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		number = scanner.nextInt();
		
		System.out.println("===== " + number + "단 =====");
		
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d\n", number, i, number * i);
		}
	}
	
	public void practice9() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		number = scanner.nextInt();
		
		if(number >= 2 && number <= 9) {
			for(int i = number; i < 10; i++) {
				System.out.printf("===== %d단 =====\n", i);
				
				for(int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %d\n", i, j, (i * j));
				}
				
				System.out.println();
			}
		} else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
	}

	public void practice10() {
		int number = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 : ");
			number = scanner.nextInt();
			
			if(number >= 2 && number <= 9) {
				for(int i = number; i <= 9; i++) {
					System.out.printf("===== %d단 =====\n", i);
					
					for(int j = 1; j <= 9; j++) {
						System.out.printf("%d * %d = %d%n", i, j, (i * j));
					}
					
					System.out.println();
				}
				
				break;
			} else { 
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		}
	}
	
	public void practice11() {
		int startNumber = 0;
		int commonDifference = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		startNumber = scanner.nextInt();
		
		System.out.print("공차 : ");
		commonDifference = scanner.nextInt();
		
		for(int i = 1; i <= 10; i++) {			
			System.out.print(startNumber + " ");
			
			startNumber += commonDifference;
		}
	}

	public void practice12() {
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;
		String operator = "";
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			operator = scanner.nextLine();
			
			if(operator.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				
				break;
			}
			
			System.out.print("정수1 : ");
			firstNumber = scanner.nextInt();
			
			System.out.print("정수2 : ");
			secondNumber = scanner.nextInt();
			scanner.nextLine();
			
			if(operator.equals("/") && secondNumber == 0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
				
				continue;
			}

			result = 0;
			
			switch(operator) {
				case "+": 
					result = firstNumber + secondNumber; 
					
					break;
				case "-": 
					result = firstNumber - secondNumber; 
					
					break;
				case "*": 
					result = firstNumber * secondNumber; 
					
					break;
				case "/": 
					result = firstNumber / secondNumber; 
					
					break;
				case "%": 
					result = firstNumber % secondNumber; 
					
					break;
				default: 
					System.out.println("없는 연산자입니다. 다시 입력해주세요.\n"); 
					
					continue;
			}
			
			System.out.printf("%d %s %d = %d\n", firstNumber, operator, secondNumber, result);
			System.out.println();
		}
	}
}
