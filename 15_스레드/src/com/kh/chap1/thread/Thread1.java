package com.kh.chap1.thread;

import java.util.Iterator;

/*
 * 스레드 생성 방법
 * 
 * 1. Thread 클래스를 상속받는 방법
 *   - Thread 클래스를 상속 후에 run() 메소드를 오버라이딩한다.
 *   - Thread 클래스를 상속한 자식 클래스의 객체를 생성 후 start() 메소드를 호출한다.
 */
public class Thread1 extends Thread {

	@Override
	public void run() {
		// 작업하고자 하는 코드를 작성한다.
		
		for (int i = 0; i < 1000; i++) {
			System.out.println(this.getName() + "[" + i + "]");
		}
	}
}
