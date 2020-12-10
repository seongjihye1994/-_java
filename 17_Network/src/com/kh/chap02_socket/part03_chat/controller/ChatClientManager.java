package com.kh.chap02_socket.part03_chat.controller;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import com.kh.chap02_socket.part03_chat.thread.Receiver;
import com.kh.chap02_socket.part03_chat.thread.Sender;

public class ChatClientManager {
	public void startClient() {
		String name = "Client"; // Ŭ���̾�Ʈ �� (~�� ���½��ϴ�.)
		
		int port = 8888;
		String ServerIP = null;
		
		try {
			// ���� ��ǻ�Ϳ��� ����, Ŭ���̾�Ʈ ��� �����ϹǷ� ���� ��ǻ���� IP�� ���� IP
			ServerIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("Client Start");
			
			// Ŭ���̾�Ʈ�� ���� ��ü ����
			Socket socket = new Socket(ServerIP, port);
			
			System.out.println("������ ���� �Ǿ����ϴ�.");
			
			// Ŭ���̾�Ʈ�� �޼����� ������ ���� �� �ֵ��� ������ ����
			Sender sender = new Sender(socket, name);
			Thread sth = new Thread(sender);
			
			Receiver receiver = new Receiver(socket);
			Thread rth = new Thread(receiver);
			
			sth.start(); // �߽� ������ ���۽�Ű��
			rth.start(); // ���� ������ ���۽�Ű��
			
			// 4���� �帧�� ���ÿ� ������ (�������� �ۼ���, Ŭ���̾�Ʈ���� �ۼ���)
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
