package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	// ���� ��ǰ�� ���� �󰡷� ��ǰ
	public static void main(String[] args) {
		// controller�� �ִ� �޼ҵ带 ����ϱ� ���� �ش� Ŭ���� ��ü ����
		ElectronicController ec = new ElectronicController();

		// 1. ������ ���� �� ���� ��
		// ���� ��ǰ(insert)
		/*ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 3));
		ec.insert(new Tablet("Apple", "�����е�", 800000, false));*/
	
		// ��ǰ �� ���� ��ȸ(select)
		/*Desktop d = ec.selectDesktop();
		NoteBook n = ec.selectNoteBook();
		Tablet t = ec.selectTablet();*/
	
		// ���
		/*System.out.println(d);
		System.out.println(n);
		System.out.println(t);*/
	
	
		// 2. ������ ���� ���� ��
		// ���� ��ǰ(insert)
		ec.insert(new Desktop("Samsung", "��ž", 1200000, "Geforce 1070"));
		ec.insert(new NoteBook("LG", "�׷�", 2000000, 3));
		ec.insert(new Tablet("Apple", "�����е�", 800000, false));

		// ��ǰ �� ���� ��ȸ(select)
		Electronic[] elec = ec.select();
		
		// ���
		for (Electronic e : elec) {
			System.out.println(e);
		}
		
		// �������� ����ϴ� ����
		// 1. �θ� Ÿ���� ��ü �迭�� �پ��� �ڽĵ��� �޾� �� �� ����
		// -> �θ� Ÿ�� �ϳ��� �پ��� �ڽĵ��� �ٷ� �� ����
		// 2. �Ű�����/��ȯ���� �������� �����ϴ� ��� �޼ҵ��� ������ ���� �� ����
		
	}

}
