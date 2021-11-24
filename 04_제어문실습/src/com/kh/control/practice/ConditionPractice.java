package com.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		int menu = 0;
		String str = "";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 : ");
		menu = scanner.nextInt();
		
		switch(menu) {
			case 1 : 
				str = "입력"; 
				
				break;
			case 2 : 
				str = "수정"; 
				
				break;
			case 3 : 
				str = "조회"; 
				
				break;
			case 4 : 
				str = "삭제"; 
				
				break;
			case 9 : 
				System.out.println("프로그램이 종료됩니다."); 
				
				return;
			default : 
				System.out.println("잘못입력하셨습니다."); 
				
				return;
		}
		
		System.out.println(str + " 메뉴입니다.");
	}
	
	public void practice2() {
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		num = scanner.nextInt();
		
		if(num > 0) { 
			if(num % 2 == 0) {
				System.out.println("짝수다.");
			} else {
				System.out.println("홀수다.");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	
	public void practice3() {
		int korScore = 0;
		int mathScore = 0;
		int engScore = 0;
		int sum = 0;
		double avg = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		korScore = scanner.nextInt();
		
		System.out.print("수학 점수 : ");
		mathScore = scanner.nextInt();
		
		System.out.print("영어 점수 : ");
		engScore = scanner.nextInt();
		
		sum = korScore + mathScore + engScore;
		avg = sum / 3.0;
		
		if (korScore >= 40 && engScore >= 40 && mathScore >= 40 && avg >= 60) {
			System.out.println("국어 : " + korScore);
			System.out.println("수학 : " + mathScore);
			System.out.println("영어 : " + engScore);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		int num = 0;
		String season = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 ~ 12 사이의 정수 입력 : ");
		num = scanner.nextInt();
		
		switch(num) {
			case 12:
			case 1:
			case 2:
				season = "겨울";
				
				break;
			case 3:
			case 4:
			case 5: 
				season = "봄";
				
				break;
			case 6:
			case 7:
			case 8:
				season = "여름";
				
				break;
			case 9:
			case 10:
			case 11:
				season = "가을";
				
				break;
			default : 
				season = "잘못 입력된 달";
				
				break;
		}
		
		System.out.println(num + "월은 " + season + "입니다.");
	}
	
	public void practice5() {
		String inputId = "";
		String inputPwd = "";
		String userId = "ismoon";
		String userPwd = "1234";
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		inputId = scanner.nextLine();
		
		System.out.print("비밀번호 : ");
		inputPwd = scanner.nextLine();
		
		if(userId.equals(inputId) && userPwd.equals(inputPwd)) {
			System.out.println("로그인 성공");
		} else if(userId.equals(inputId)) {
			System.out.println("비밀번호가 틀렸습니다.");
		} else if(userPwd.equals(inputPwd)) {
			System.out.println("아이디가 틀렸습니다.");
		} else {
			System.out.println("모두 틀렸습니다^^");			
		}
	}
	
	public void practice6() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		
		switch(scanner.nextLine()) { // 사용자 입력을 읽어와서 바로 비교할 수 있다.
			case "관리자" : 
				System.out.println("회원관리, 게시글 관리");
			case "회원"  : 
				System.out.println("게시글 작성, 댓글 작성");
			case "비회원" : 
				System.out.println("게시글 조회"); 
				
				break; // 여기서 break해야 default문까지 넘어가지 않는다.
			default : 
				System.out.println("잘못 입력하셨습니다."); 
				
				break;
		}
	}
	
	public void practice7() {
		double height = 0;
		double weight = 0;
		double bmi = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해주세요 : ");
		height = scanner.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해주세요 : ");
		weight = scanner.nextDouble();
		
		bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if(bmi < 23) {
			System.out.println("정상체중");
		} else if(bmi < 25) {
			System.out.println("과체중");
		} else {
			System.out.println("비만");
		}
	}

	public void practice8() {
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char op = '\u0000';
		Scanner scanner = new Scanner(System.in);

		System.out.print("피연산자1 입력 : ");
		num1 = scanner.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		num2 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		op = scanner.nextLine().charAt(0);
		
		if(num1 > 0 && num2 > 0) {
			switch(op) {
				case '+': 
					result = num1 + num2; 
					
					break;
				case '-': 
					result = num1 - num2; 
					
					break;
				case '*': 
					result = num1 * num2; 
					
					break;
				case '/': 
					result = num1 / num2; 
					
					break;
				case '%': 
					result = num1 % num2; 
					
					break;
				default: 
					System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다."); 
					
					return;
			}
			
		} else {
			System.out.println("양수가 아닌 값을 입력하셨습니다. 프로그램을 종료합니다."); return;
		}
		
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}

	
	public void practice9() {
		double midTerm = 0.0;
		double finalTerm =0.0;
		double homework = 0.0;
		double attendance = 0.0;
		double sum = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.print("중간 고사 점수 : ");
		midTerm = sc.nextInt() * 0.2; // 사용자가 입력한 중간고사 점수를 20% 반영

		System.out.print("기말 고사 점수 : ");
		finalTerm = sc.nextInt() * 0.3; // 사용자가 입력한 기말고사 점수를 30% 반영

		System.out.print("과제  점수 : ");
		homework = sc.nextInt() * 0.3; // 사용자가 입력한 과제점수를 30% 반영

		System.out.print("출석 회수 : ");
		attendance = sc.nextInt(); // 사용자가 입력한 출석 횟수를 100% 반영 (왜? 출석횟수가 20회만점 기준으로 입력할 것이기 때문에!)
		
		sum = midTerm + finalTerm + homework + attendance; // 위의 값들을 모두 더해서 총 100점 만점 기준으로 만듬
		
		System.out.println("===========결과==========");
		
		if(sum >= 70 && attendance >= 20 * 0.7) { // 1_1. 총점이 70점 이면서 출석횟수도 20회 만점 기준으로 70% 이상일 경우
			System.out.println("중간 고사 점수(20) : " + midTerm);
			System.out.println("기말 고사 점수(30) : " + finalTerm);
			System.out.println("과제 점수       (30) : " + homework);
			System.out.println("출석 점수       (20) : " + attendance);
			
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
			
		} else { // 1_2. 그게 아닐 경우 (총점이 부족할 수도 있고, 출석 횟수가 부족할 수도 있고, 아니면 둘다 부족할 수도 있을 경우)
			
			if(attendance < 20 * 0.7) { // 2. 근데 그 중에서도 출석횟수가 부족할 경우 
				System.out.println("FAIL [출석 횟수 부족] (" + (int) attendance + "/20)");
			}
			
			// 위아래 두개의 조건문 각각 별개  --> 만일 둘다 부족할 경우 둘 다 실행될것!
			
			if(sum < 70) { // 3. 근데 그 중에서도 총점이 부족할 경우
				System.out.println("FAIL [점수 미달] (총점 " + sum + ")");
			}
		}
	}
	
	public void practice10() {
		int menu = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		menu = scanner.nextInt();
		
		switch (menu) { 
			case 1:	
				practice1(); 
				
				break;
			case 2:	
				practice2(); 
				
				break;
			case 3:	
				practice3(); 
				
				break;
			case 4:	
				practice4(); 
				
				break;
			case 5:	
				practice5(); 
				
				break;
			case 6:	
				practice6(); 
				
				break;
			case 7:	
				practice7(); 
				
				break;
			case 8:	
				practice8(); 
				
				break;
			case 9:	
				practice9(); 
				
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
		}
	}
}
