package com.kh.io;

import java.util.Scanner;

import com.kh.io.model.dao.FileDao;

public class Application {

	public static void main(String[] args) {
		int menu = 0;
		FileDao dao = new FileDao();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("****** MyNote ******");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			System.out.print("번호를 입력하세요 : ");
			menu = scanner.nextInt();
			
			switch(menu) {
				case 1 : dao.fileSave(); break;
				case 2 : dao.filOpen(); break;
				case 3 : dao.fileEdit(); break;
				case 4 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
