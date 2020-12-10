package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
	public void clientStart() {

		// 0) Ŭ���̾�Ʈ�� �������� ��û�� �ϱ� ���ؼ��� �ݵ�� ������ IP�ּҿ�
		// ��Ʈ��ȣ�� �˾ƾ� ��
				
		int port = 8888;
		try {
			String serverIp = InetAddress.getLocalHost().getHostAddress();
			// ������ serverIp�� �ڱ� �ڽ��� ip�� �����ϱ� ���� InetAddress Ŭ������ getLacalHost() �޼ҵ带 Ȱ��
			// ���� �����ؾ� �� ���� �ּҰ� �ִٸ� �ش� �ּҷ� �Է� ex. "192.168.10.47"
			
			// 1) ������ IP �ּҿ� ������ ���� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü ����
			Socket socket = new Socket(serverIp, port);
			// ���࿡ ��ſ� �����Ѵٸ� null ��ȯ
			// ���� ���� Ȯ���� ���� if�� ���
			if (socket != null) {
				// 2) �������� ����� ��Ʈ�� ����
				// 3) ���� ��Ʈ���� ���� ���� ����
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream());
				
				// 4) ��Ʈ���� ���� �а� ����
				// Ŭ���̾�Ʈ --> ���� �޼��� ����
				pw.println("�ݰ���X��!!");
				pw.flush();
				
				// ���� --> Ŭ���̾�Ʈ �޼��� �о����
				System.out.println("�����κ��� ���� �޼��� : " + br.readLine());
				
				// 5) ��� ����
				// ��Ʈ�� �ݱ�, ���� �ݱ�
				pw.close();
				br.close();
				
				socket.close();
			}
			
			
			
		} catch (java.net.UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}
}
