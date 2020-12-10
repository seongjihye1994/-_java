package com.kh.chap02_socket.part03_chat.controller;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.kh.chap02_socket.part03_chat.thread.Receiver;
import com.kh.chap02_socket.part03_chat.thread.Sender;

public class ChatServerManager {
	public void startServer() {
		String name = "Server"; // ���� ��ǻ�� �̸� �����ֱ�
		
		// ������ TCP ���� ���α׷��� ���� ���߾� ����
		// 1) ��Ʈ ��ȣ ����
		int port = 8888;
		
		try {
			// 2) ������ ���� ��ü ���� �� ��Ʈ�� ����
			ServerSocket server = new ServerSocket(port);
			System.out.println("Server Start | ���� �����....");
			
			// 3) Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���⸦ ��ٸ�
			// 4) ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			System.out.println("Ŭ���̾�Ʈ�� ������ �Ǿ����ϴ�.");
			
			// *** ��/���� �۾��� ������ �����
			// ä�� ���α׷��� ������ó�� �۽��� �ް� ������ �ϴ� ���� �ƴ϶�
			// ��ȭ��ó�� �۽��� �����鼭 ���ÿ� ���ŵ� �� �� �־�� ��
			// �̸� ���� �۽Ű� ������ ������ ������� ó��
			// �۽Ÿ� ó���ϴ� ������� ���Ÿ� ó���ϴ� ������ 2���� ����
			
			// 5) ������ ����� ��/���� �۾��� ������ ����
			Sender sender = new Sender(client, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(client);
			Thread rth = new Thread(receiver);
			
			sth.start(); // �߽� ������ ���۽�Ű��
			rth.start(); // ���� ������ ���۽�Ű��
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
