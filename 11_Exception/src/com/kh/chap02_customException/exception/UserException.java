package com.kh.chap02_customException.exception;

// �ش� Ŭ������ ���� Ŭ������ ����� ���ؼ��� �ݵ�� Exception Ŭ������ ���
public class UserException extends Exception {

	public UserException() {} // �⺻ ������
	
	// �Ű����� �����ڿ��� ���� ���� �޼����� ���� Ŭ������ �Ű����� �����ڷ� �����Ͽ�
	// �ش� Exception�� ���� �޼��� ���� ����
	public UserException(String msg) {
		super(msg);
	}
	
	
}

