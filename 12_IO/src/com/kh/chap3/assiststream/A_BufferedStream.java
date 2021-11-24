package com.kh.chap3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class A_BufferedStream {
	/*
	 * 보조 스트림
	 *   - 기반 스트림(Input/OutputStream, Reader/Writer)과 연결되 여러가지 편리한 기능을 제공해주는 스트림을 말한다.
	 *   - 단독으로 외부 매체(파일, 네트워크, 키보드, 모니터 등)와 데이터를 직접 주고받을 수 없다.
	 *   - 기반 스트림을 먼저 생성하고 보조 스트림을 연결해 주어야 한다.
	 *   
	 * 성능 향상 보조 스트림
	 *   - 기반 스트림의 속도를 향상시켜주는 기능을 한다.
	 *   - 기반 스트림에 대한 레퍼런스각 필요하다.
	 *   - 버퍼라는 공간을 사용해서 속도 향상에 도움을 준다. (버퍼라는 공간에 데이터를 쌓아 놨다가 한 번에 입/출력 시킨다.)
	 *   - 기반 스트림에서 제공하지 않는 메소드(newLine(), readLine())들을 제공해 준다.
	 * 
	 */
	
	public void fileSave() {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt", true))) {
			bw.write("안녕하세요!!\n");
			bw.write("어진님 아직도 IO가 어려우신가요??");
			bw.newLine(); // 기반 스트림에서 제공하지 않는 메소드, 개행할 때 사용한다.
			bw.write("마상입니다..ㅠㅠ");
			bw.newLine();
			bw.write("농담이에요^^");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileRead() {
		
		try (BufferedReader br = new BufferedReader(new FileReader("c_buffer.txt"))) {
			String value = null;
			
			// 기반 스트림에서 제공하지 않는 메소드, 파일에서 한 줄 읽어올 때 사용한다.
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
