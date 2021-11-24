package com.kh.chap2.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileByteStream {
	public void fileSave() {
		// FileOutputStream을 사용해서 파일을 생성하고 데이터를 바이트 단위로 저장한다.
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("a_byte.dat", true);
			
			fos.write(97); // a 문자가 저장
			fos.write('b'); // b 문자가 저장
			fos.write(10); // 줄바꿈 문자가 저장
			fos.write(97);
//			fos.write('한');
			
			byte[] arr = {'a', 'b', 'c', 'd'};
			
			fos.write(arr);
			fos.write(arr, 1, 2);
			fos.flush();
			
			// 위의 write() 메소드 실행 시 IOException이 발생했을 경우 해당 close()가 실행되지 않는다.
			// 따라서 반드시 실행하는 구문인 finally {} 안에서 close() 메소드를 실행시킨다.
//			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// 스트림을 다 이용했으면 닫아주어야 한다.
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead() {
		// FileInputStream을 사용해서 파일에서 데이터를 바이트 단위로 읽어온다.
		FileInputStream fis = null;
		
		try {
			// 파일이 존재하지 않으면 FileNotFoundException 예외가 발생한다.
			fis = new FileInputStream("a_byte.dat");

			/*
			 * 파일로부터 데이터를 읽어올 때는 read() 메소드를 사용하면 된다.
			 * 하지만 실제로 파일에는 얼마만큼의 데이터가 있는지 모른다.
			 * read() 메소드는 더 이상 읽어올 데이터가 없으면 -1을 리턴한다. 
			 * 따라서 반복문을 사용해서 read() 메소드에서 -1이 리턴되기 전까지 데이터를 읽어오면 된다. 
			 */
//			byte[] arr = new byte[100];
//			System.out.println((char) fis.read());
//			System.out.println(fis.read(arr));
//			System.out.println(fis.read());
//			System.out.println(Arrays.toString(arr));
			
			int value = 0;
			
			// read() 메소드가 2번 실행되기 때문에 정상적으로 값을 출력할 수 없다.
//			while(fis.read() != -1) {
//				System.out.print((char) fis.read());
//			}
			
			while((value = fis.read()) != -1) {
				System.out.print((char) value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
