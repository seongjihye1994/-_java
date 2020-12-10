package com.kh.chap02_socket.part03_chat.thread;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver implements Runnable { // ���� ������
	
	// 1. Ŭ������ ����� �ʵ� ����
	private DataInputStream in; // ���� �� �����͸� �Է� ���� ��Ʈ��
	
	// 2. �Ű����� �ִ� ������
	public Receiver(Socket socket) {
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// 3. ������ ó�� �۾�
	// Sender���� ��� �� ������ ���� ȭ�鿡 �Է��ϴ� �۾� ó��
	@Override
	public void run() {
		while(true) {
			try {
				System.out.println(in.readUTF()); // ���� �޼��� �ϳ��� �о��
			} catch (IOException e) {
				// e.printStackTrace();
				// ������ Ŭ���̾�Ʈ �� �� ���� ���� �����ϸ� ���� �߻� --> ����
				break; // ���� �߻� �� ����
			} 
			
		}
		
	} 
	

}
