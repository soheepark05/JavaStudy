package com.kh.chap2;

import com.kh.chap2.bytestream.FileByteStream;
import com.kh.chap2.charstream.FileCharStream;

public class Application {

	public static void main(String[] args) {
//		new FileByteStream().fileSave();
//		new FileByteStream().fileRead();
		
		new  FileCharStream().fileSave();
		new  FileCharStream().fileRead();
	}

}
