package com.kh.chap02_socket.part02_udp.sample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	/* 1. ������ ���� �޽����� ���� byte[] �غ�
	   2. DatagramSocket ��ü ����	
	   3. �޽��� ���� DatagramPacket��ü �غ�
	   4. byte[]�� ���� �޽����� String���� �ٲپ� ���
	   5. ���� ����
	 */
	public void clientStart() {
		try {
			
			// 1. ������ ���� �޽����� ���� byte[] �غ�
			byte[] inMsg = new byte[100];
			byte[] outMsg;
			
			// 2. DatagramSocket ��ü ����	
			DatagramSocket datagramSocket = new DatagramSocket();
			InetAddress serverAddress = InetAddress.getLocalHost();
			
			// server�� ��Ŷ �����Ͽ� ip�� port��ȣ ���� �� �ְ� ��
			outMsg = "hello".getBytes();
			DatagramPacket outPacket = new DatagramPacket(outMsg, outMsg.length, serverAddress, 8888);
			datagramSocket.send(outPacket);
			
			// 3. �޽��� ���� DatagramPacket��ü �غ�
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			datagramSocket.receive(inPacket);
			
			// 4. byte[]�� ���� �޽����� String���� �ٲپ� ���
			System.out.println("���� ���� �ð� : " + new String(inPacket.getData()));
			
			// 5. ���� ����
			datagramSocket.close();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
