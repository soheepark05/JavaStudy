package com.kh.control.practice;

public class G_Continue {
	/*
	 * continue 문 
	 *   [표현법]
	 *     반복문(조건식) {
	 *       [continue;]
	 *     }
	 *     
	 *  - 반복문 안에서만 사용 가능하고 continue를 만나게 되면 다음 구문들은 실행하지 않고
	 *    가장 가까운 반복문의 조건식/증감식으로 이동한다.
	 */
	
	public void method1() {
		// 1부터 100까지의 정수들의 합을 출력
		// 단, 5의 배수는 제외하고 덧셈 연산을 한다.
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 5 == 0) {
				continue;
			}
			
			sum += i; // sum = sum + i;
		}
		
		System.out.println("합계 : " + sum);
	}
	
	public void method2() {
		// 2 ~ 9단 까지의 구구단을 출력
		// 단, 홀수단은 빼고 출력한다.
		
		for(int i = 2; i <= 9; i++) {
			
			if(i % 2 != 0) {
				continue;
			}
			
			System.out.printf("=== %d단 ===\n", i);
			
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n", i, j, (i * j));
			}

			System.out.println();
		}
	}
}
