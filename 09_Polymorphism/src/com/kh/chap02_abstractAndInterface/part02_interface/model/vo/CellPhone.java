package com.kh.chap02_abstractAndInterface.part02_interface.model.vo;

// �������̽��� ���� ��� ����!
// -> ���� ��ӿ� ���� ������ �غ� ����

// Ŭ������ : Ŭ���� extends Ŭ����
// Ŭ����-�������̽� : Ŭ���� implements �������̽�, �������̽�, ...
// �������̽�-�������̽� : �������̽� extends �������̽�, �������̽�, ...
// ��Ӱ� ���� ���ÿ� �� �� ���� : Ŭ���� extends Ŭ���� implements �������̽�

public interface CellPhone extends Phone, Camera {
	// ��ȭ �ɱ�, ��ȭ �ޱ�, �Կ� ���
	
	// ���� ��� �߰�
	void charge();
	// ���� ����, �Ϲ� ����, ��� ����, ���� ���� ���
	

}
