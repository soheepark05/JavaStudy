package com.kh.chap2.sync;

public class Producer extends Thread {
	private Buffer buffer;
	
	public Producer() {
	}

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				buffer.setData(i);
				
				// 스레드를 매개값에 지정된 시간만큼 지연시키는 메소드
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
