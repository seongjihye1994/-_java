package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

public interface Phone {
	// �߻� Ŭ���� => �Ϲ� ���(���� + �޼ҵ�) + �߻� �޼ҵ�
	// �������̽� => ���� ��� �ʵ� + �߻� �޼ҵ�
	
	// �������̽������� �ʵ�� ������ ��� �ʵ��̱� ������ �������൵ ��
	/*public static final*/ int NUM = 10;
	
	// �������̽������� �޼ҵ�� ������ �߻� �޼ҵ��̱� ������ �������൵ ��
	/*public abstract*/ void makeaCall();
	// �Ϲ� ��ȭ : ��ȣ�� ����, �޴� ��ȭ : ��ȣ�� ������ ��ȭ ��ư�� ����
	
	void takeaCall();	// ��ȭ �ޱ�
	// �Ϲ� ��ȭ : ��ȭ�⸦ ��, �޴� ��ȭ : ���� ��ư�� ����
	
	
	
	
	

}
