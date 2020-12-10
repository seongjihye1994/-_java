package com.kh.chap02_socket.part03_chat.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.chap02_socket.part03_chat.thread.Receiver;
import com.kh.chap02_socket.part03_chat.thread.Sender;

public class ChatServerManager {
	public void startServer() {
		String name = "Server"; // 서버 컴퓨터 이름 정해주기
		
		// 서버용 TCP 소켓 프로그래밍 순서 맞추어 진행
		// 1) 포트 번호 정함
		int port = 8888;
		
		try {
			// 2) 서버용 소켓 객체 생성 후 포트와 결합
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server Start | 서버 대기중....");
			
			// 3) 클라이언트 쪽에서 접속 요청이 오기를 기다림
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			System.out.println("클라이언트와 연결이 되었습니다.");
			
			// *** 송/수신 작업용 스레드 만들기
			// 채팅 프로그램은 무전기처럼 송신을 받고 수신을 하는 것이 아니라
			// 전화기처럼 송신을 받으면서 동시에 수신도 할 수 있어야 함
			// 이를 위해 송신과 수신을 별도의 스레드로 처리
			// 송신만 처리하는 스레드와 수신만 처리하는 스레드 2개를 만듦
			
			// 5) 서버가 사용할 송/수신 작업용 스레드 생성
			Sender sender = new Sender(client, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(client);
			Thread rth = new Thread(receiver);
			
			sth.start(); // 발신 스레드 동작시키기
			rth.start(); // 수신 스레드 동작시키기
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
