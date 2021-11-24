package com.kh.chap3.assiststream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B_ByteToCharStream {
	// 기반 스트림이 Byte 스트림이고 ==> System.in, System.out
	// 보조 스트림이 Char 스트림인 경우 사용한다.
	
	public void input() {
		// System.in을 InputStreamReader를 사용해서 문자 기반으로 변경하고 사용자로부터 입력을 받고 출력한다.
		// 아래와 같이 보조 스트림 여러 개를 사용하는 것도 가능하다.
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String value = null;
			
			System.out.print("문자열 입력 : ");
			value = br.readLine();
			
			System.out.println("value : " + value);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void output() {
		// System.out을 OutputStreamWriter를 사용해서 문자 기반으로 변경하고 콘솔에 출력한다.
		try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
			bw.write("수정님은 IO가 어려우신가요??");
			bw.newLine();
			bw.write("앞으로 Oracle, JDBC, HTML, CSS, ... 가 남아있습니다^^");
			bw.newLine();
			bw.write("힘내세요~!");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}
