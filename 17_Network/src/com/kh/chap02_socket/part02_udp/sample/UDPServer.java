package com.kh.chap02_socket.part02_udp.sample;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UDPServer {

	/*
	 * TCP와 UDP의 특징과 차이점
	 * 
	 * TCP(Transmission Control Protocol) : 연결기반으로 연결 후 통신하는 방식 (전화) 
	 * - Byte-stream으로 데이터 경계를 구분 안함 
	 * - 데이터 전송 순서가 보장 
	 * - 데이터의 수신여부를 확인하여 데이터가 손실되면 재전송 
	 * - 신뢰성 있는 데이터 전송 
	 * - UDP 보다 속도가 느림 -> 데이터의 전송속도보다 안정성이 중요한 경우 사용
	 * 
	 * 
	 * UDP(User Datagram Protocol) : 비연결기반이며 연결없이 통신하는 방식 (소포) 
	 * - datagram 으로 데이터의 경계를 구분함 
	 * - 데이터의 전송 순서가 바뀔 수 있음 
	 * - 데이터의 수신여부를 확인 안하므로 데이터가 손실되어도 어쩔 수 없음 
	 * - 신뢰성 있는 통신을 하지 않음 
	 * - TCP 보다 전송속도가 빠름 -> 실시간 전송처럼 데이터의 전송 속도가 중요한 경우 사용
	 * 
	 */

	
	public void serverStart() {

		// 클라이언트가 DatagramPacket을 생성해서 DatagramSocket으로 서버에 전송
		// 서버는 전송 받은 DatagramPacket의 getAddress(), getPort()를 호출해서
		// 클라이언트의 정보를 얻어서 서버시간을 DataPacket()에 담아서 전송

		/*
		 * 1. 서버의 포트번호 정함 
		 * 2. DatagramSocket 객체 생성 
		 * 3. 연결한 클라이언트 IP주소를 가진 InetAddress 객체 생성 
		 * 4. 전송할 메시지를 byte[]로 바꿈 
		 * 5. 전송할 메시지를 DatagramPacket 객체에 담음 
		 * 6. 소켓 레퍼런스를 사용하여 메시지 전송 
		 * 7. 소켓 닫음
		 */

		try {
			// 1. 서버의 포트번호 정함
			int port = 8888;

			// 2. DatagramSocket 객체 생성
			DatagramSocket socket = new DatagramSocket(port);
			DatagramPacket inPacket, outPacket;

			byte[] inMsg = new byte[10];
			byte[] outMsg;

			// 데이터를 수신하기 위한 패킷 생성
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// 패킷을 통해 데이터를 수신
			socket.receive(inPacket);

			// 3. 연결한 클라이언트 IP주소를 가진 InetAddress 객체 생성
			// 수신한 패킷으로부터 client의 ip 주소와 port를 얻음
			InetAddress address = inPacket.getAddress();
			int port2 = inPacket.getPort();
			System.out.println(new String(inPacket.getData()));

			// 서버의 현재 시간을 시분초 형태로 반환
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String time = sdf.format(new Date());
			// 4. 전송할 메시지를 byte[]로 바꿈
			outMsg = time.getBytes();

			// 5. 전송할 메시지를 DatagramPacket 객체에 담음
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port2);

			// 6. 소켓 레퍼런스를 사용하여 메시지 전송
			socket.send(outPacket);

			// 7. 소켓 닫음
			socket.close();

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
