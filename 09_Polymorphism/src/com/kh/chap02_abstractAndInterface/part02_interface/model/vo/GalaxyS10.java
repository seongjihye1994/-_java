package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class GalaxyS10 extends SmartPhone {
	// SmartPhone�� �߻�Ŭ�����̱� ������ ��� ������ ������
	// �������̵� �������!

	@Override
	public void charge() {
		System.out.println("��� ����, ��� ���� ����");
	}

	@Override
	public void makeaCall() {
		System.out.println("��ȣ�� ������ ��ȭ ��ư�� ����");		
	}

	@Override
	public void takeaCall() {
		System.out.println("���� ��ư�� ����");				
	}

	@Override
	public void picture() {
		System.out.println("1300�� ��� ī�޶�");						
	}

	@Override
	public void touch() {
		System.out.println("������, ������ ����");					
	}

	@Override
	public void printMaker() {
		System.out.println("Galaxy S10�� �Ｚ��~");						
	}

}
