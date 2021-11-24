package com.kh.network;

import com.kh.network.tcp.Server;

public class Application {

	public static void main(String[] args) {
		new Server().serverStart();
	}

}
