package com.kh.chap1.file;

import java.io.File;
import java.io.IOException;

public class A_File {
	public void method1() {
		// File 클래스 테스트

		try {
			// 경로를 지정하지 않으면 현재 project 폴더에 파일이 생성된다.
			File file = new File("test.txt"); // 메모리상에만 존재하는 객체
			
			System.out.println("파일명 : " + file.getName());
			System.out.println("절대 경로 : " + file.getAbsolutePath());
			System.out.println("상대 경로 : " + file.getPath());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("파일 존재 여부 : " + file.exists());
			System.out.println();
			
			file.createNewFile(); // 메소드를 실행해야만 실제 파일이 만들어진다.
			
			// 존재하는 경로까지 지정해 주면 해당 위치에 파일을 생성한다.
			// 만약에 존재하지 않는 경로를 제시하면 IOException이 발생한다.
			File file2 = new File("D:/test2.txt");
//			File file2 = new File("D:/temp/test2.txt");
			
//			file2.mkdirs();
			file2.createNewFile();
			
			// 디렉터리 만들기
			File tempDir = new File("C:/temp2");
			
			tempDir.mkdir();
			
			File file3 = new File("C:/temp2/test2.txt");
			
			file3.createNewFile();
			
			System.out.println("파일2 존재 여부 : " + file2.exists());
			System.out.println("파일3 존재 여부 : " + file3.exists());
			System.out.println("tempDir.isDirectory() : " + tempDir.isDirectory());
			System.out.println("file2.isFile() : " + file2.isFile());
			System.out.println("file3.isFile() : " + file3.isFile());
			System.out.println("file3.isDirectory() : " + file3.isDirectory());
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
