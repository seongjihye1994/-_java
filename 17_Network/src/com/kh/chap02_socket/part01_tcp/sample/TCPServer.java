package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer { // 클라이언트가 서버에 요청함
	public void serverStart() {
		// 1) 포트 번호 지정 (포트 번호가 필요함)
		
		int port = 8888;
		// 포트는 호스트(컴퓨터)가 외부와 통신하기 위한 통로로 하나의 호스트가 65536개의 포트를 가짐
		// 0 ~ 66535 사이에서 지정 가능 (단, 1023번 이하는 이미 사용중인 포트가 많으니 이외의 포트 지정)
		
		try {
			// 2) ServerSocket 객체 생성 후 포트 결합
			ServerSocket server = new ServerSocket(port); 
			
			// 3) 클라이언트로부터 접속 요청이 올 때 까지 대기
			//	    서버 소켓은 요청이 올 때까지 실행을 멈추고 대기 상태로 있음
			System.out.println("클라이언트의 요청을 기다리고 있습니다.");
			
			// 4) 접속 요청이 오면 요청 수락 후 해당 클라이언트에 대한 소켓 객체 생성
			Socket client = server.accept();
			
			// 요청을 보낸 클라이언트의 ip 출력
			System.out.println(client.getInetAddress().getHostAddress() + "가 연결을 요청함....");
			
			// 5) 연결 된 클라이언트와의 입출력 스트림 생성
			// 소켓은 두개의 스트림(입/출력)을 가지고 있으며 이 스트림은 연결 된 상대편 소켓의 스트림들과 교차 연결 됨
			InputStream input = client.getInputStream(); // 클라이언트 소켓의 OutputStream 과 연결 됨
			OutputStream output = client.getOutputStream(); // 클라이언트 소켓의 InputStream과 연결 됨
			
			// 6) 보조스트림을 통해 성능 개선
			BufferedReader br = new BufferedReader(new InputStreamReader(input)); // input을 char단위로 변환해서 한 줄(버퍼드리더)로 읽어옴
			PrintWriter pw = new PrintWriter(output);
			
			// 7. 스트림을 통해 읽고 쓰기
			// 클라이언트 -> 서버로 전송한 메세지 읽어들임
			String message = br.readLine();
			System.out.println("받은 메세지 : " + message);
			
			// 서버 -> 클라이언트 메세지 전송
			pw.println("만나서 반갑습니다.");
			pw.flush(); // 버퍼에 쌓인 글이 내보내짐
			
			// 8. 통신 종료
			// 열려있는 스트림 반납하고 마지막에 서버 종료
			pw.close();
			br.close();
			
			client.close(); // 소켓 닫음
			server.close(); // 서버 소켓 닫음
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}

}
