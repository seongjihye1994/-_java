package com.kh.part02.personMVC.run;

import com.kh.part02.personMVC.view.PersonMenu;

// ȸ���� �����ϴ� ���α׷��� MVC ������ �̿���
// ȸ�� �߰�, ��ü ��ȸ, �̸� �˻�, ��� ��� ��ȸ ����� ����

// MVC �����̶�?
// ������ ���� �� �ϳ��� MVC�� Model, View, Controller�� ����

// Model : data, ������ ������ å������ ��Ʈ
// vo -> value object (���� ���� ��ü)

// View : ����� �������̽�, ������ ����� ��Ʈ

// Controller : �����Ϳ� ����� �������̽��� �մ� �ٸ� ����


public class Run {

	public static void main(String[] args) {
		new PersonMenu().mainMenu();

		
	}

}
