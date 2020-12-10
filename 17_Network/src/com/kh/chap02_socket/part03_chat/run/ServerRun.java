package com.kh.chap02_socket.part03_chat.run;

import com.kh.chap02_socket.part03_chat.controller.ChatServerManager;

public class ServerRun {

	public static void main(String[] args) {
		
		ChatServerManager server = new ChatServerManager();
		server.startServer();

	}

}
