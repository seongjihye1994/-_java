package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public class V50 extends SmartPhone {

	@Override
	public void charge() {
		System.out.println("��� ����");
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
		System.out.println("1200, 1600�� Ʈ���� ī�޶�");
	}

	@Override
	public void touch() {		
		System.out.println("������");
	}

	@Override
	public void printMaker() {	
		System.out.println("V50�� LG��~");
	}

}
