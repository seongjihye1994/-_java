package com.kh.chap02_socket.part03_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.chap02_socket.part03_chat.thread.Receiver;
import com.kh.chap02_socket.part03_chat.thread.Sender;

public class ChatClientManager {
	public void startClient() {
		String name = "Client"; // 클라이언트 명 (~가 보냈습니다.)
		
		int port = 8888;
		String ServerIP = null;
		
		try {
			// 현재 컴퓨터에서 서버, 클라이언트 모두 실행하므로 현재 컴퓨터의 IP가 서버 IP
			ServerIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("Client Start");
			
			// 클라이언트용 소켓 객체 생성
			Socket socket = new Socket(ServerIP, port);
			
			System.out.println("서버와 연결 되었습니다.");
			
			// 클라이언트도 메세지를 보내고 받을 수 있도록 스레드 생성
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver);
			
			sth.start(); // 발신 스레드 동작시키기
			rth.start(); // 수신 스레드 동작시키기
			
			// 4개의 흐름이 동시에 진행중 (서버에서 송수신, 클라이언트에서 송수신)
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
