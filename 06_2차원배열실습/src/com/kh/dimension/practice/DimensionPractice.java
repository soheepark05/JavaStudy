package com.kh.dimension.practice;

import java.util.Scanner;

public class DimensionPractice {
	public void practice1() {
		int value = 1;
		int[][] arr = new int[4][4];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice2() {
		int value = 16;
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value--;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice3() {
		String[][] arr = new String[3][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice4() {
		int[][] arr = new int[4][4];
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr[i].length-1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				
				arr[i][3] += arr[i][j];
				arr[3][j] += arr[i][j];
				arr[3][3] += arr[i][j];
			}
		}
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%3d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}
	
	public void practice5() {
		int row = 0;
		int col = 0;
		char[][] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("행 크기 : ");
			row = scanner.nextInt();
			
			System.out.print("열 크기 : ");
			col = scanner.nextInt();
			
			if((row >= 1 && row <= 10) && (col >= 1 && col <= 10)){
				arr = new char[row][col];
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						arr[i][j] = (char) ((int) (Math.random() * 26 + 65));
					}
				}
				
				for(int i = 0; i < arr.length; i++) {
					for(int j = 0; j < arr[i].length; j++) {
						System.out.print(arr[i][j] + " ");
					}
					
					System.out.println();
				}
				
				break;
				
			} else {
				System.out.println("다시입력하세요.");
			}
		}
	}
	
	public void practice6() {
		String[][] arr = {{"이", "까", "왔", "앞", "힘"}, 
						  {"차", "지", "습", "으", "냅"}, 
						  {"원", "열", "니", "로", "시"}, 
						  {"배", "심", "다", "좀", "다"},
						  {"열", "히", "!", "더", "!!"}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[j][i] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice7() {
		int row = 0;
		int col = 0;
		char value = 'a';
		char[][] arr = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		row = scanner.nextInt();
		
		arr = new char[row][];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 크기 : ");
			col = scanner.nextInt();
			
			arr[i] = new char[col];
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice8() {
		int count = 0;
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", 
							 "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];
		
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}
		
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		System.out.println("== 1분단 ==");
		for(int i = 0; i < seat1.length; i++) {
			for(int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int i = 0; i < seat2.length; i++) {
			for(int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice9() {
		int count = 0;
		String[] students = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };
		String[][] seat1 = new String[3][2];
		String[][] seat2 = new String[3][2];

		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				seat1[i][j] = students[count++];
			}
		}

		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				seat2[i][j] = students[count++];
			}
		}

		System.out.println("== 1분단 ==");
		for (int i = 0; i < seat1.length; i++) {
			for (int j = 0; j < seat1[i].length; j++) {
				System.out.print(seat1[i][j] + " ");
			}
			
			System.out.println();
		}

		System.out.println("== 2분단 ==");
		for (int i = 0; i < seat2.length; i++) {
			for (int j = 0; j < seat2[i].length; j++) {
				System.out.print(seat2[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("==================================");
		
		System.out.print("검색할 학생 이름을 입력하세요: ");
		String part = ""; // 분단
		int row = 0; 	  // 몇번째 줄
		String col = "";  // 왼쪽 오른쪽
		String name = new Scanner(System.in).nextLine();
		
		for(int i = 0; i < seat1.length; i++){
			for(int j = 0; j < seat1[i].length; j++){
				if(seat1[i][j].equals(name)) {
					part = "1분단";
					row = i+1;
					
					if(j == 0){
						col = "왼쪽";
					} else {
						col = "오른쪽";
					}
				}
			}
		}
		
		for(int i = 0; i < seat2.length; i++){
			for (int j = 0; j < seat2[i].length; j++){
				if(seat2[i][j].equals(name)){
					part = "2분단";
					row = i+1;
					
					if(j == 0){
						col = "왼쪽";
					} else {
						col = "오른쪽";
					}
				}
			}
		}
		
		if(part.equals("")) {
			System.out.println("검색하신 학생은 없습니다.");
		} else {
			System.out.println("검색하신 " + name + " 학생은 " + part + " " + row + "번째 줄 " + col + "에 있습니다.");			
		}	
	}
}
