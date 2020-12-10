package com.kh.chap01_inherit.after.run;

import com.kh.chap01_inherit.after.model.vo.Desktop;
import com.kh.chap01_inherit.after.model.vo.SmartPhone;
import com.kh.chap01_inherit.after.model.vo.Tv;

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

		// �θ� ���� �ʵ忡 ����
		System.out.println(d.getBrand());
		System.out.println(s.getpCode());
		System.out.println(t.getPrice());
		
		d.print();
		s.print();
		t.print();
		
		// * ����� Ư¡
		// - Ŭ������ ��� ���� ���� ��Ӹ� ���� (�θ�� �ϳ�)
		// - ��õǾ����� ������ ��� Ŭ������ Object Ŭ������ �ļ�
		// - ��, Object Ŭ������ �����ϴ� �޼ҵ���� ��� ��ü��
		//   ����� �� ������, �������̵� �Ͽ� �޼ҵ� ���ۼ� ����
		// - �θ� Ŭ������ ������, �ʱ�ȭ ����� ����� �� ��
		// --> �ڽ� Ŭ���� �ȿ��� �θ� Ŭ������ ������ ȣ�� super()
		// �ڽ� ��ü ���� �� �θ� Ŭ���� �����ڰ� ���� ����
		// - �θ��� private ���(�ʵ�, �޼ҵ�)�� ����� ������ ���� ���� �Ұ�
		// --> setter / getter �� �̿��ؼ� ���������� �����ؾ� ��.
		// ��, protected�� ���� �����ڸ� �ۼ��ϸ� ��� ���迡�� �������� ��� ����
		// ex) super.price ���
		
		
		
		
		
		
	}

}
