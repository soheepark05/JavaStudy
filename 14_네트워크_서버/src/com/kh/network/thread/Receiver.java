package com.kh.network.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// 클라이언트와 통신을 위한 Thread 구현
public class Receiver implements Runnable {
	
	// Thread에서 사용할 필드 선언
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	
	public Receiver() {
	}
	
	public Receiver(Socket client) {
		try {
			this.client = client;
			// 5. 연결된 클라이언트와 입출력 스트림을 생성한다.
			// 6. 보조 스트림을 통해 성능 개선
			this.br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			this.pw = new PrintWriter(client.getOutputStream(), true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		try {
			//  7. 스트림을 통해 데이터를 읽고 쓰기
			while(true) {
				String message = br.readLine(); // 클라이언트로부터 입력이 있을 때까지 블로킹된다.
				
				if(message == null || message.equals("exit")) {
					System.out.println("접속 종료.");
					
					break;
				} else {
					System.out.println(client.getInetAddress().getHostAddress() + "가 보낸 메시지 : " + message);
					
					pw.println("메시지 받기 성공.");
				}
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			// 8. 통신 종료
			try {
				br.close();
				pw.close();
				client.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
