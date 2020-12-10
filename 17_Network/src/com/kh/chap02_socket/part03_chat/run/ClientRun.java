package com.kh.chap02_socket.part03_chat.run;

import com.kh.chap02_socket.part03_chat.controller.ChatClientManager;

public class ClientRun {
	public static void main(String[] args) {
		
		ChatClientManager client = new ChatClientManager();
		client.startClient();
	}

}
