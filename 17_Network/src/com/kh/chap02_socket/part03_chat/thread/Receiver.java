package com.kh.chap02_socket.part03_chat.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver implements Runnable { // 수신 스레드
	
	// 1. 클래스에 사용할 필드 선언
	private DataInputStream in; // 전달 된 데이터를 입력 받을 스트림
	
	// 2. 매개변수 있는 생성자
	public Receiver(Socket socket) {
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 3. 스레드 처리 작업
	// Sender에서 출력 된 내용을 현재 화면에 입력하는 작업 처리
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(in.readUTF()); // 보낸 메세지 하나씩 읽어옴
			} catch (IOException e) {
				// e.printStackTrace();
				// 서버나 클라이언트 중 한 쪽이 먼저 종료하면 에러 발생 --> 종료
				break; // 에러 발생 시 종료
			} 
			
		}
		
	} 
	

}
