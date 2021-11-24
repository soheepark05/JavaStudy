package co.kh.inherit;

import java.util.Scanner;

import co.kh.inherit.practice.Employee;
import co.kh.inherit.practice.Student;

public class Application {

	public static void main(String[] args) {
		char ch = '\u0000';
		int count = 0, age = 0, salary = 0;
		String name = null, dept = null;
		double height = 0.0, weight = 0.0;
		Student[] students = new Student[3];
		Employee employee[] = new Employee[10];
		Scanner scanner = new Scanner(System.in);
		
		students[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		students[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		students[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신공학과");
		
		for(Student student : students) {
			System.out.println(student.information());
		}
		
		while(true) {
			System.out.print("이름 : ");
			name = scanner.nextLine();
			
			System.out.print("나이 : ");
			age = scanner.nextInt();
			
			System.out.print("키 : ");
			height = scanner.nextDouble();
			
			System.out.print("몸무게 : ");
			weight = scanner.nextDouble();
			
			System.out.print("급여 : ");
			salary = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("부서 : ");
			dept = scanner.nextLine();
			
			employee[count] = new Employee(name, age, height, weight, salary, dept);
			
			count++;
			
			System.out.print("계속 입력하시겠습니까? (y/n) : ");
			ch = scanner.nextLine().toUpperCase().charAt(0);
			
			if(ch == 'N') {
				break;
			}
		}
		
		for(int i = 0; i < count; i++) {
			System.out.println(employee[i].information());
		}
	}

}
