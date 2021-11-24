package com.kh.chap2.sync;

public class Buffer {
	private int data;
	// 플래그 변수 (객체의 상태를 저장하고 흐름을 제어하기 위한 변수)
	private boolean empty = true;
	
	/*
	 * synchronized
	 *   - 동기화 메소드, 동기화 블럭에 사용되는 키워드로 동기화 메소드 선언에 synchronized 키워드를 붙인다. (인스턴스, 정적 메소드 어디든 사용이 가능하다.)
	 *   - 동기화 메소드는 스레드가 동기화 메소드를 실행하면 동기화 메소드 전체에 즉시 락을 걸고 메소드가 종료되면 락이 풀린다. 
	 *   - 메소드 전체가 아니라 일부 내용만 락을 걸고 싶다면 동기화 블록을 만들면 된다. (synchronized(공유 객체(this)) { ... })
	 *   
	 */  
	public synchronized void getData() {
		
		while(empty) {
			try {
				wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.empty = true;
				
		System.out.println("소비자가 " + this.data + "번 상품을 소비하였습니다.");
		notify();  // wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
	}
	
	public synchronized void setData(int data) {
		
		while(!empty) {
			try {
				wait(); // 객체의 잠금을 풀고 스레드를 일시 정지 상태로 만든다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		this.data = data;
		this.empty = false;
		
		System.out.println("생산자가 " + data + "번 상품을 생산하였습니다.");
		notify(); // wait()에 의해 일시 정지된 스레드 중 한 개를 실행 대기 상태로 만든다.
	}
}
