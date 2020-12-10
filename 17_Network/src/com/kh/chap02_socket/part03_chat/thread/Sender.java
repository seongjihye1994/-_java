package com.kh.chap02_socket.part03_chat.thread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender implements Runnable { // 발신만 처리하는 스레드

	// 1. 클래스에서 사용할 필드 선언
	private String name; // 데이터를 보내는 사용자명
	private DataOutputStream out; // 데이터 출력용 스트림 (보내는 발신자 스레드니까 output))
	private Scanner sc; // 채팅 내용을 입력 받을 Scanner
	
	// 2. 매개변수 있는 생성자
	// Sender 객체 생성 시 매개변수로 Socket과 name을 받아옴
	// Servere에서 생성 : 요청을 수락한 Client의 소켓, 서버명
	// Client 에서 생성 : 연결된 Server의 소켓, 클라이언트명
	
	public Sender(Socket socket, String name) {
		this.name = name;
		try {
			this.out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
		
	@Override
	public void run() {
		sc = new Scanner(System.in);
		
		while (true) {
			try {
				out.writeUTF(name + " > " + sc.nextLine());
			} catch (IOException e) {
				// e.printStackTrace();
				// 서버나 클라이언트 중 한 쪽이 먼저 종료하면 에러 발생 --> 종료시키기
				break; // 익셉션 발생시 종료
			}
		}
		
	}


}
