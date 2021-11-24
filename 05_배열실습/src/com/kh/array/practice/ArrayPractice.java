package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) { 
			arr[i] = i + 1; 
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	public void practice4() {
		String[] arr = new String[5];
		//String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";
		
		System.out.println(arr[1]);
	}
	
	public void practice5() {
		char ch = '\u0000';
		String str = "";
		char[] arr = null;
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		str = scanner.nextLine();
		
		System.out.print("문자 : ");
		ch = scanner.nextLine().charAt(0);
		
		arr = new char[str.length()];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ch) { 
				System.out.print(i + " ");
				
				count++;
			}
		}

		System.out.println();
		System.out.println(ch + "개수 : " + count);
	}
	
	public void practice6() {
		int num = 0;
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		num = scanner.nextInt();
		
		if(num >= 0 && num <= 6) {
			System.out.println(arr[num] + "요일");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice7() {
		int sum = 0;
		int size = 0;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 : ");
		size = scanner.nextInt();
		
		arr = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	
	public void practice8() {
		int size = 0;
		int count = 1;
		int[] arr = null;
		Scanner scanner = new Scanner(System.in);		
		
		while(true) {			
			System.out.print("정수 : ");
			size = scanner.nextInt();

			if(size >= 3 && size % 2 == 1) { 
				arr = new int[size];
				
				for(int i = 0; i < arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					} else {
						count--;
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					if(i < arr.length-1) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				
				break;
				
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	public void practice9() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice10() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();

		Arrays.sort(arr);
		
		System.out.println("최대값 : " + arr[9]);
		System.out.println("최소값 : " + arr[0]);
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public void practice12() {
		int[] lotto = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					
					break;
				}
			}
		}
		
		Arrays.sort(lotto);
		
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	public void practice13() {
		String pId = "";
		char[] origin = null;
		char[] copy = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		pId = scanner.nextLine();
		
		origin = new char[pId.length()];
		
		for(int i = 0; i < origin.length; i++) {
			origin[i] = pId.charAt(i);
		}
		
		copy = new char[origin.length];
		
		for(int i = 0; i < copy.length; i++) {
			if(i <= 7) { 
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			
			System.out.print(copy[i]);
		}
	}
}
