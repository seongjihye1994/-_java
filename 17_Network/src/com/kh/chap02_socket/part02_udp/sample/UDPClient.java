package com.kh.chap02_socket.part02_udp.sample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {
	/* 1. 서버가 보낸 메시지를 받을 byte[] 준비
	   2. DatagramSocket 객체 생성	
	   3. 메시지 받을 DatagramPacket객체 준비
	   4. byte[]로 받은 메시지를 String으로 바꾸어 출력
	   5. 소켓 닫음
	 */
	public void clientStart() {
		try {
			
			// 1. 서버가 보낸 메시지를 받을 byte[] 준비
			byte[] inMsg = new byte[100];
			byte[] outMsg;
			
			// 2. DatagramSocket 객체 생성	
			DatagramSocket datagramSocket = new DatagramSocket();
			InetAddress serverAddress = InetAddress.getLocalHost();
			
			// server로 패킷 전송하여 ip와 port번호 얻을 수 있게 함
			outMsg = "hello".getBytes();
			DatagramPacket outPacket = new DatagramPacket(outMsg, outMsg.length, serverAddress, 8888);
			datagramSocket.send(outPacket);
			
			// 3. 메시지 받을 DatagramPacket객체 준비
			DatagramPacket inPacket = new DatagramPacket(inMsg, inMsg.length);
			datagramSocket.receive(inPacket);
			
			// 4. byte[]로 받은 메시지를 String으로 바꾸어 출력
			System.out.println("현재 서버 시간 : " + new String(inPacket.getData()));
			
			// 5. 소켓 닫음
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
