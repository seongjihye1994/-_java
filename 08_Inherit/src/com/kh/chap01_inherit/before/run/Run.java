package com.kh.chap01_inherit.before.run;

import com.kh.chap01_inherit.before.model.vo.Desktop;
import com.kh.chap01_inherit.before.model.vo.SmartPhone;
import com.kh.chap01_inherit.before.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		// Desktop ��ü ����
		Desktop d = new Desktop("�Ｚ", "d-01", "¯¯����ũž", 2000000, true);
		
		// SmartPhone ��ü ����
		SmartPhone s = new SmartPhone("���", "s-01", "���̻�", 1500000, "KT");
		
		// Desktop ��ü ����
		Tv t = new Tv("LG", "t-01", "�̳� ���� Ƽ��", 3500000, 46);
		
		// ���
		System.out.println(d.info());
		System.out.println(s.info());
		System.out.println(t.info());
		
		// �� ������ Ŭ�������� �������� �ʵ�� �޼ҵ尡 ������
		// �̷��� �ߺ��� �θ� Ŭ������ �����Ͽ� �ߺ������� ������ �� �ְ�
		// ������ ���� ���������� �� ���� ���� ������ �ʿ� ����
		// �θ� Ŭ������ �����ϸ� ��ü������ �ݿ��� ��
		
		// �귣��, ��ǰ�ڵ�, ��ǰ��, ���� --> ����� �ʵ带 �̾� Product Ŭ������
		// �θ� Ŭ������ �����, ������ Ŭ�������� ��ӹް� �ϱ�
		
		

	}

}
