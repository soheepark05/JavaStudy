package com.kh.chap2;

import com.kh.chap2.sync.Buffer;
import com.kh.chap2.sync.Consumer;
import com.kh.chap2.sync.Producer;

public class Application {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();
		Thread producer = new Producer(buffer);
		Thread consumer = new Thread(new Consumer(buffer));
		
		producer.start();
		consumer.start();
		
		try {
			// 아래의 스레드의 join() 메소드를 호출한 스레드(main 스레드)는 아래의 스래드가 종료될 때까지 기다렸다가
			// 아래의 스레드가 종료되면 join() 메소드를 호출한 스레드(main 스레드)를 다시 실행한다.
			
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 스레드 종료..");
	}

}
