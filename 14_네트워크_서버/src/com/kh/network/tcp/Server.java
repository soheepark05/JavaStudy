package com.kh.network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.network.thread.Receiver;

public class Server {
	/*
	 * 서버용 TCP 소켓 프로그래밍 순서
	 *   1. 서버의 포트 번호 지정
	 *   2. 서버용 소켓 객체 생성
	 *   3. 클라이언트 쪽에서 접속 요청이 오길 기다린다.
	 *   4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체를 생성한다.
	 *   5. 연결된 클라이언트와 입출력 스트림을 생성한다.
	 *   6. 보조 스트림을 통해 성능 개선
	 *   7. 스트림을 통해 데이터를 읽고 쓰기
	 *   8. 통신 종료
	 */
	public void serverStart() {
		// 1. 서버의 포트 번호 지정
		//   - 0 ~ 1023 시스템 포트 번호
		//   - 1024 ~ 65535의 포트 번호를 사용하는 것을 추천
		int port = 30027;
		
		// 2. 서버용 소켓 객체 생성
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(port);
			System.out.println("서버 시작...");
			
			while(true) {
				// 3. 클라이언트 쪽에서 접속 요청이 오길 기다린다. (accept())
			    // 4. 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체를 생성한다.
				System.out.println("클라이언트 대기중...");
				Socket client = server.accept();
				
				System.out.println("클라이언트 연결 됨...");
				
				new Thread(new Receiver(client)).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
