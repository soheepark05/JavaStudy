package com.kh.dimension.practice;

import java.util.Arrays;

public class DimensionalArray {
	/*
	 * 이차원 배열
	 *   [표현법]
	 *     1) 이차원 배열의 선언
	 *        자료형[][] 배열명;
	 *        자료형 배열명[][];
	 *        자료형[] 배열명[];
	 *     
	 *     2) 이차원 배열의 할당
	 *        배열명 = new 자료형[행크기][열크기];
	 *        
	 *     3) 이차원 배열의 선언과 할당을 동시에 진행
	 *        자료형[][] 배열명 = new 자료형[행크기][열크기];
	 *        자료형 배열명[][] = new 자료형[행크기][열크기];
	 *        자료형[] 배열명[] = new 자료형[행크기][열크기];
	 * 
	 *     4) 이차원 배열의 초기화
	 *        4-1) 인덱스를 이용한 초기화
	 *             배열명[0][0] = 값1;
	 *             배열명[0][1] = 값2;
	 *             배열명[1][0] = 값3;
	 *             배열명[1][1] = 값4;
	 *             ...
	 *             
	 *        4-2) 선언과 동시에 초기화
	 *             자료형[][] 배열명 = new int[][] {{값1, 값2, ...}, {값1, 값2, ...}, ...}; 
	 *             자료형 배열명[][] = new int[][] {{값1, 값2, ...}, {값1, 값2, ...}, ...}; 
	 *             자료형[][] 배열명 = {{값1, 값2, ...}, {값1, 값2, ...}, ...}; 
	 *             자료형 배열명[][] = {{값1, 값2, ...}, {값1, 값2, ...}, ...}; 
	 *             
	 *        4-3) 반복문을 이용한 초기화(중첩 반복문 이용)
	 * 
	 */
	
	public void method1() {
		int[][] iArray1; // 메모리(Stack)에 정수형 이차원 배열의 주소를 보관할 공간이 할당된다. (참조 변수)
		int iArray2[][];
		int[] iArray3[];
		int[][] arr = {{15, 14, 13, 12, 11}, {10, 9, 8, 7, 6}, {5, 4,3, 2, 1}};
//		arr = {{15, 14, 13, 12, 11}, {10, 9, 8, 7, 6}, {5, 4,3, 2, 1}};
//		arr = new int[][] {{15, 14, 13, 12, 11}, {10, 9, 8, 7, 6}, {5, 4,3, 2, 1}};
		
		iArray1 = new int[3][5]; // 메모리(Heap)에 총 15개(3 X 5)의 정수형 데이터를 저장할 수 있는 이차원 배열을 생성한다. -> 배열의 시작 주소를 참조 변수에 전달한다.
		
		// 행 길이 출력
		System.out.println("행의 길이 : " + iArray1.length);
		
		// 각 행별 열의 길이 출력
		System.out.println("1번째 행의 열의 길이 : " + iArray1[0].length);
		System.out.println("2번째 행의 열의 길이 : " + iArray1[1].length);
		System.out.println("3번째 행의 열의 길이 : " + iArray1[2].length);
		
		/*
		 *  1  2  3  4  5
		 *  6  7  8  9 10
		 * 11 12 13 14 15
		 *
		 * 바깥쪽 for문 -> 행의 개수만큼 반복
		 * 안쪽 for문  -> 열의 개수만큼 반복
		 */
		
		int value = 1;
		
		// 값을 초기화
		for(int i = 0; i < iArray1.length; i++) {
			for(int j = 0; j < iArray1[i].length; j++) {
				iArray1[i][j] = value++;
			}
		}
		
		// 값의 출력
		for(int i = 0; i < iArray1.length; i++) {
			for(int j = 0; j < iArray1[i].length; j++) {
				System.out.printf("%2d ", iArray1[i][j]);
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		// 생성과 동시에 초기화된 배열의 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			
			System.out.println();
		}
	}

	public void method2() {
		/*
		 * 가변 배열
		 *  - 행은 정해졌으나 각 행에 대한 열의 개수가 정해지지 않은 상태의 배열이다.
		 *  - 2차원 배열은 자료형이 같은 1차원 배열 여러 개가 하나로 묶은 것, 묶여있는 1차원 배열의 길이가 꼭 같은 필요는 없다.
		 */
		
		int[][] arr1 = new int[3][]; // 가변 배열 할당 (행의 크기는 3행)
		int[][] arr2 = {{1, 2, 3}, {4}, {5, 6, 7, 8, 9}, {10}};
		
		// 각 행에 다른 배열을 참조할 수 있도록 할당
		arr1[0] = new int[2]; // 0행은 2열
		arr1[1] = new int[3]; // 1행은 3열
		arr1[2] = new int[5]; // 2행은 5열
		
		System.out.println("==== 가변 배열 ====");		
		for(int i = 0; i< arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.print( arr1[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println("==== 가변 배열(생성과 동시에 초기화) ====");
		for(int i = 0; i< arr2.length; i++) {
			for(int j = 0; j < arr2[i].length; j++) {
				System.out.print( arr2[i][j] + " ");
			}
			
			System.out.println();
		}
	}

	public void method3() {
		// 1부터 10 사이의 랜덤 값을 3행 3열의 2차원 배열에 대입하시오.
		// 단, 랜덤 값에 중복을 제거해서 2차원 배열에 대입하시오. 
		
		// 1. 1차원 배열을 이용해서 먼저 중복 제거 된 랜덤 값을 추출
		int[] arr = new int[9];
		int[][] newArr = new int[3][3];
		int index = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
			
			// 중복 제거
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					
					break;
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		
		// 2. 3행 3열의 2차원 배열에 랜덤 값을 대입
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[index++];
			}
		}
		
		// 3. 3행 3열의 2차원 배열 출력
		for(int i = 0; i < newArr.length; i++) {
			for(int j = 0; j < newArr[i].length; j++) {
				System.out.printf("%2d ",newArr[i][j]);
			}
			
			System.out.println();
		}
	}
}
