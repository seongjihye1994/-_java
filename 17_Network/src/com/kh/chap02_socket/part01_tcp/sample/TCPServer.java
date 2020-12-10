package com.kh.chap02_socket.part01_tcp.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer { // Ŭ���̾�Ʈ�� ������ ��û��
	public void serverStart() {
		// 1) ��Ʈ ��ȣ ���� (��Ʈ ��ȣ�� �ʿ���)
		
		int port = 8888;
		// ��Ʈ�� ȣ��Ʈ(��ǻ��)�� �ܺο� ����ϱ� ���� ��η� �ϳ��� ȣ��Ʈ�� 65536���� ��Ʈ�� ����
		// 0 ~ 66535 ���̿��� ���� ���� (��, 1023�� ���ϴ� �̹� ������� ��Ʈ�� ������ �̿��� ��Ʈ ����)
		
		try {
			// 2) ServerSocket ��ü ���� �� ��Ʈ ����
			ServerSocket server = new ServerSocket(port); 
			
			// 3) Ŭ���̾�Ʈ�κ��� ���� ��û�� �� �� ���� ���
			//	    ���� ������ ��û�� �� ������ ������ ���߰� ��� ���·� ����
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.");
			
			// 4) ���� ��û�� ���� ��û ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();
			
			// ��û�� ���� Ŭ���̾�Ʈ�� ip ���
			System.out.println(client.getInetAddress().getHostAddress() + "�� ������ ��û��....");
			
			// 5) ���� �� Ŭ���̾�Ʈ���� ����� ��Ʈ�� ����
			// ������ �ΰ��� ��Ʈ��(��/���)�� ������ ������ �� ��Ʈ���� ���� �� ����� ������ ��Ʈ����� ���� ���� ��
			InputStream input = client.getInputStream(); // Ŭ���̾�Ʈ ������ OutputStream �� ���� ��
			OutputStream output = client.getOutputStream(); // Ŭ���̾�Ʈ ������ InputStream�� ���� ��
			
			// 6) ������Ʈ���� ���� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(input)); // input�� char������ ��ȯ�ؼ� �� ��(���۵帮��)�� �о��
			PrintWriter pw = new PrintWriter(output);
			
			// 7. ��Ʈ���� ���� �а� ����
			// Ŭ���̾�Ʈ -> ������ ������ �޼��� �о����
			String message = br.readLine();
			System.out.println("���� �޼��� : " + message);
			
			// ���� -> Ŭ���̾�Ʈ �޼��� ����
			pw.println("������ �ݰ����ϴ�.");
			pw.flush(); // ���ۿ� ���� ���� ��������
			
			// 8. ��� ����
			// �����ִ� ��Ʈ�� �ݳ��ϰ� �������� ���� ����
			pw.close();
			br.close();
			
			client.close(); // ���� ����
			server.close(); // ���� ���� ����
			
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		}

}
