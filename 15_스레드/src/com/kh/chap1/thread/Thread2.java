package com.kh.chap1.thread;

/*
 * 스레드 생성 방법
 * 
 * 2. Runnable 인터페이스를 구현하는 방법
 *   - Runnable 인터페이스의 run() 메소드를 오버라이딩한다.
 *   - Thread 객체 생성 시 생성자의 Runnable 인터페이스를 구현한 객체를 매개값으로 전달 후 start() 메소드 호출한다.
 */
public class Thread2 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + "[" + i + "]");
		}
	}
}
