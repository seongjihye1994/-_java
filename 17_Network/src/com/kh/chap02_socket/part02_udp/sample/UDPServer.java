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
	 * TCP�� UDP�� Ư¡�� ������
	 * 
	 * TCP(Transmission Control Protocol) : ���������� ���� �� ����ϴ� ��� (��ȭ) 
	 * - Byte-stream���� ������ ��踦 ���� ���� 
	 * - ������ ���� ������ ���� 
	 * - �������� ���ſ��θ� Ȯ���Ͽ� �����Ͱ� �սǵǸ� ������ 
	 * - �ŷڼ� �ִ� ������ ���� 
	 * - UDP ���� �ӵ��� ���� -> �������� ���ۼӵ����� �������� �߿��� ��� ���
	 * 
	 * 
	 * UDP(User Datagram Protocol) : �񿬰����̸� ������� ����ϴ� ��� (����) 
	 * - datagram ���� �������� ��踦 ������ 
	 * - �������� ���� ������ �ٲ� �� ���� 
	 * - �������� ���ſ��θ� Ȯ�� ���ϹǷ� �����Ͱ� �սǵǾ ��¿ �� ���� 
	 * - �ŷڼ� �ִ� ����� ���� ���� 
	 * - TCP ���� ���ۼӵ��� ���� -> �ǽð� ����ó�� �������� ���� �ӵ��� �߿��� ��� ���
	 * 
	 */

	
	public void serverStart() {

		// Ŭ���̾�Ʈ�� DatagramPacket�� �����ؼ� DatagramSocket���� ������ ����
		// ������ ���� ���� DatagramPacket�� getAddress(), getPort()�� ȣ���ؼ�
		// Ŭ���̾�Ʈ�� ������ �� �����ð��� DataPacket()�� ��Ƽ� ����

		/*
		 * 1. ������ ��Ʈ��ȣ ���� 
		 * 2. DatagramSocket ��ü ���� 
		 * 3. ������ Ŭ���̾�Ʈ IP�ּҸ� ���� InetAddress ��ü ���� 
		 * 4. ������ �޽����� byte[]�� �ٲ� 
		 * 5. ������ �޽����� DatagramPacket ��ü�� ���� 
		 * 6. ���� ���۷����� ����Ͽ� �޽��� ���� 
		 * 7. ���� ����
		 */

		try {
			// 1. ������ ��Ʈ��ȣ ����
			int port = 8888;

			// 2. DatagramSocket ��ü ����
			DatagramSocket socket = new DatagramSocket(port);
			DatagramPacket inPacket, outPacket;

			byte[] inMsg = new byte[10];
			byte[] outMsg;

			// �����͸� �����ϱ� ���� ��Ŷ ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);

			// ��Ŷ�� ���� �����͸� ����
			socket.receive(inPacket);

			// 3. ������ Ŭ���̾�Ʈ IP�ּҸ� ���� InetAddress ��ü ����
			// ������ ��Ŷ���κ��� client�� ip �ּҿ� port�� ����
			InetAddress address = inPacket.getAddress();
			int port2 = inPacket.getPort();
			System.out.println(new String(inPacket.getData()));

			// ������ ���� �ð��� �ú��� ���·� ��ȯ
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
			String time = sdf.format(new Date());
			// 4. ������ �޽����� byte[]�� �ٲ�
			outMsg = time.getBytes();

			// 5. ������ �޽����� DatagramPacket ��ü�� ����
			outPacket = new DatagramPacket(outMsg, outMsg.length, address, port2);

			// 6. ���� ���۷����� ����Ͽ� �޽��� ����
			socket.send(outPacket);

			// 7. ���� ����
			socket.close();

		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
