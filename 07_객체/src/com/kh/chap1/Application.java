package com.kh.chap1;

import com.kh.chap1.encapsulation.Student;

public class Application {
	/*
	 * 추상화와 캡슐화
	 * 
	 * 1. 추상화
	 *   - 프로그램에서 사용할 객체들이 가진 공통의 특성을 파악하고 불필요한 특성들을 제거하는 과정을 말한다.
	 *   - 최종적으로 선정된 속성들을 가지고 어떤 자료형으로, 어떠한 변수명으로 사용할지 정리해서 코드로 작성한다.
	 *   
	 * 2. 캡슐화
	 *   - 추상화를 통해서 정의된 속성들과 기능을 하나로 묶어서 관리하는 기법 중 하나로
	 *     클래스의 가장 중요한 목적인 데이터 접근 제한을 원칙으로 외부로부터 데이터의 직접 접근을 막고
	 *     대신에 데이터를 간접적으로 처리하는 메소드들을 클래스 내부에 작성하여 제공하는 방법을 말한다.
	 *   - 객체의 필드, 메소드를 하나로 묶고 실제 구현 내용을 감추는 것을 말한다.
	 *   - 외부에서 객체의 내부를 알지 못하며 객체가 노출해서 제공하는 필드나 메소드만 이용할 수 있다.
	 * 
	 */

	public static void main(String[] args) {
		// 만약에 변수만을 가지고 프로그램에서 필요한 객체를 만들어 본다면?
		// 문인수 학생 객체 만들기
		String name = "문인수";
		int age = 20;
		int id = 1001;
		int mathScore = 80;
		
		// 홍길동 학생 객체 만들기
		String name2 = "홍길동";
		int age2 = 400;
		int id2 = 1002;
		int mathScore2 = 30;
		
		// 클래스를 만들고 나서 객체로 만들기 위해서는 new 연산자를 통해서 Heap 영역에 생성해야 한다.
//		Student moon = new Student(); // 인스턴스(객체) 생성
//		Student hong = new Student();
		
		// 필드에 직접 접근해서 값을 초기화
//		moon.id = 1001;
//		moon.name = "문인수";
//		moon.age = 20;
//		moon.address = "경기도 광주시";
//		moon.gender = "남자";
//		moon.mathScore = 70;
//		moon.engScore = 50;
		
//		hong.id =  1002;
//		hong.name = "홍길동";
//		hong.age = 400;
//		hong.address = "한양";
//		hong.gender = "남자";
//		hong.mathScore = 60;
//		hong.engScore = 100;
		
		// 필드에 직접 접근해서 값을 출력
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다.\n", moon.name, moon.mathScore, moon.engScore);
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다.\n", hong.name, hong.mathScore, hong.engScore);
		
		Student moon = new Student();
		Student hong = new Student();
		
		// 캡슐화 작업으로 인해 직접 접근을 막았다면 간접적으로 접근을 할 수 있도록 메소드를 제공한다.
		moon.setId(1001);
		moon.setName("문인수");
		moon.setAge(20);
		moon.setAddress("경기도 광주시");
		moon.setGender("남자");
		moon.setMathScore(-60);
		moon.setEngScore(-50);
		
		hong.setId(1002);
		hong.setName("홍길동");
		hong.setAge(400);
		hong.setAddress("한양");
		hong.setGender("남자");
		hong.setMathScore(60);
		hong.setEngScore(90);
		
//		System.out.printf("%s님의 수학 점수는 %d, 영어 점수는 %d입니다. 주소는 %s 입니다.\n", moon.getName(), moon.getMathScore(), moon.getEngScore(), moon.getAddress());
		System.out.println(moon.information());
		System.out.println(hong.information());
	}
}
