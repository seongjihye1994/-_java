package com.kh.chap01_inet.example;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetSample {
	// �����ϰ��� �ϴ� ����� ��Ʈ��ũ ������ Ȯ���� �� �ִ� InetAddress ��ü �׽�Ʈ
	public void isSample() {
		InetAddress localIP;
		try {
			// static InetAddress getLoalHost() : ���� ȣ��Ʈ�� IP �ּ� ��ȯ
			localIP = InetAddress.getLocalHost();
			System.out.println(localIP);
			
			// byte[] getAddress() : IP �ּҸ� byte �迭�� ��ȯ
			byte[] ipAddr = localIP.getAddress();
			System.out.println(Arrays.toString(ipAddr));
			
			// String getHostName() : ȣ��Ʈ�� �̸� ��ȯ
			System.out.println("�� PC �� : " + localIP.getHostName());
			// String getHostAddress() : ȣ��Ʈ�� IP �ּҸ� ��ȯ
			System.out.println("�� IP �� : " + localIP.getHostAddress());
			
			// static InetAddress getByName(String host) : �����θ��� ���� IP �ּ� ����
			InetAddress googleIP = InetAddress.getByName("www.google.com");
			System.out.println("���� ������ : " + googleIP.getHostName());
			System.out.println("���� IP : " + googleIP.getHostAddress());
			
			// �ش� �������� ������ �ִ� IP���� �迭�ε� ���� �� ����
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� ������ ���� : " + naverIPs.length);
			
			for (InetAddress ip : naverIPs) {
				System.out.println(ip);
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
