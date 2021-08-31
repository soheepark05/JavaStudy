package com.kh.dimension.practice;

public class DimensionalArray {
	/*
	 * 
	 * 이차원 배열
	 * [표현법]
	 * 1) 이차원 배열의 선언
	 * 		자료형 [][] 배열명;
	 * 		자료형 배열명[][];
	 * 		자료형[] 배열명 []; <--잘사용하진않음
	 * 2) 이차원배열의 할당
	 * 		배열명 = new 자료형[행크기][열크기]
	 * 3) 이차원 배열의 선언과 할당을 동시에진행
	 * 		자료형 [][] 배열명 = new 자료형[행크기][열크기];
	 * 		자료형 배열명[][] = new 자료형[행크기][열크기];
	 * 		자료형[] 배열명 [] = new 자료형[행크기][열" ]; <--잘사용하진않음
	 * 
	 * 4) 이차원 배열의 초기화
	 * 		4-1) 인덱스를 이용한 초기화
	 * 			배열명[0][0] = 값1;
	 * 			배열명[0][1] = 값2;
	 *			배열명[1][0] = 값3;
	 * 			배열명[1][1] = 값4;
	 * 			..
	 * 
	 * 		4-2) 선언과 동시에 초기화
	 * 			자료형[][] 배열명 = new int[][]{{값1, 값2, ...}, {값1,값2, ...},...};
	 * 			자료형 배열명[][] = new int[][]{{값1, 값2, ...}, {값1,값2, ...},...};
	 * 			자료형 [][] 배열명 = {{값1, 값2,...}, {값1,값2, ..}, ...};
	 * 			자료형 배열명 [][] = {{값1,2,...},{값1,2,...}};
	 * 
	 * 
	 * 		4-3) 반복문을 이용한 초기화(중첩 반복문 이용)
	 * 
	 * 
	 */
	
	//메소드1 
	public void method1() {
		int[][] iArray1; //메모리(Stack)에 정수형 이차원 배열의 주소를 보관할 공간이 할당된다.(참조변수)
		int iArray2[][];
		int [] iArray3[];
		int [][] arr = {{15,14,13,12,11},{10,9,8,7,6},{5,4,3,2,1}};
		
		
		iArray1 = new int[3][5]; 
		//메모리(힙)에 총 15개의 정수형 데이터를 저장할 수 있는 이차원 배열을 생성한다.
		//--->> 배열의 시작 주소를 참조 변수에 전달한다.
		
		
		//행 길이 출력
		System.out.println("행의 길이: "+ iArray1.length);
	
		
		//각 행별 열의 길이 출력
		System.out.println("1번쨰 행의 열의 길이: " + iArray1[0].length);
		System.out.println("2번쨰 행의 열의 길이: " + iArray1[1].length);
		System.out.println("3번쨰 행의 열의 길이: " + iArray1[2].length);
		
		/*
		 * 1 2 3 4 5
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 * 
		 * 밖쪽 for문 ->행의 개수만큼 반복
		 * 안쪽  " --> 열의 개수만큼 반복
		 * 
		 */
		int value = 1;
		
		//값을 초기화
		for(int i = 0; i<iArray1.length; i++) {
			for(int j = 0; j <iArray1[i].length; j++)
			{
				iArray1[i][j] = value++;
			}
		}
		
		
		//값의 출력
		for(int i = 0; i<iArray1.length; i++) {
			for(int j = 0; j <iArray1[i].length; j++)
			{
				System.out.printf("%2d ",iArray1[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		
		
		//생성과 동시에 초기화된 배열의 출력
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
			}
		}
	
	public void method2() {
		/*
		 * 가변 배열
		 * - 행은 정해졌으나, 각행에 대한 열의 개수가 정해지지 않은 상태의 배열이다.
		 * - 2차원 배열은 자료형이 같은 1차원 배열여러개가 하나로 묶은 것.
		 * 묶여있는 1차원 배열의 길이가 꼭 같을 필요는 없다.
		 * 
		 */
		
		int[][] arr1 = new int[3][]; //가변 배열 할당( 행의 크기는 3행)
		int[][] arr2 = {{1,2,3}, {4}, {5,6,7,8,9},{10}}; //이것도가능
		
		//각행에 다른 배열을 참조할 수 있도록 할당
		arr1[0] = new int[2]; //0행은 2열
		arr1[1] = new int[3]; //1행은 3열
		arr1[2] = new int[5]; //2행은 5열
		
		
		System.out.println("-----------가변 배열------------");
		for(int i =0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-----------가변 배열(생성과 동시에 초기화)------------");
		for(int i =0; i<arr1.length; i++) {
			for(int j = 0; j<arr1[i].length; j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method3() { //--------------->중복인경우<------------------
		//1~10까지의 랜덤값을 3행 3열의 2차원 배열에 대입하세요
		// 단 랜덤값에 중복을 제거해서 2차원 배열에 대입해라.
		
		int n = 3;
		int baeyeol [][] = new int [n][n];
		
		
		
		
		for( int i = 0; i<n ;i++)
		{
			for(int j = 0; j<n ; j++)
			{
				baeyeol[i][j] = (int)(Math.random()*10+1); //왜 10을 곱하냐? 0-9까지범위인데 여기에 +1하면 1~10범위됨.
			}
		}
		
		System.out.println("----랜덤 배열 출력(중복ㅇ)----");
		for( int i = 0; i<n ;i++)
		{
			for(int j = 0; j<n ; j++)
			{
				System.out.print(baeyeol[i][j]+" ");
			}
		}
		
		
	}
	// <----------------중복되지 않는 경우--------------------->
	public void method4() { //(실습...)
		
		//1) 1차원 배열을 이용해서 먼저 중복 제거 된 랜덤 값을 추출
		int[] arr = new int[9];
		int[][] newArr = new int[3][3];
		int index = 0;
		
		
		for(int i = 0; i<arr.length; i++)
		{
			//2. 일로와서 다시 시작
			
			arr[i] =(int)(Math.random()*10+1);
			
			//중복제거
			for(int j =0; j<i;j++) //이전까지 와의 값과 비교하면되니까.
			{
				if(arr[i] == arr[j])
				{
					i--; //다시 값 넣기.
					
					break;//1. 탈출
				}			
			}		
		}
		
		//System.out.println(Arrays.toString(arr)); 
		//toString은 객체가 가지고있는 정보나 값들을 문자열로 마들어 리턴하는 메소드.
	
		//2) 3행 3열의 2차원 배열에 랜덤값을 대입
		
		for(int i = 0; i<newArr.length; i++)
		{
			for(int j = 0; j < newArr.length ; j++)
			{
				newArr[i][j] = arr[index++]; //오류남 왜
			}
		}
		//3) 3행 3열의 2차원 배열에 출력
		
		for(int i = 0; i<newArr.length;i++)
		{
			for(int j = 0;j<newArr[i].length;j++) //새로운오류
			{
				System.out.printf("%2d ",newArr[i][j]);
			}
			System.out.println();
		}
	}
	
	
	
		
	}


