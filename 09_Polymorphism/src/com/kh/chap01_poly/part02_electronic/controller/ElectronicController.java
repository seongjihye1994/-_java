package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// ������ǰ ��
public class ElectronicController {
	
	// 1. ������ ���� �� ���� �� -> �켱 �԰� �� ��ǰ�� ���� ������ ����
	private Desktop desk = null;
	private NoteBook note = null;
	private Tablet Tab = null;
	
	/*public void insert(Desktop desktop) {
		desk = desktop;
	}

	public void insert(NoteBook noteBook) {
		note = noteBook;
	}

	public void insert(Tablet tablet) {
		tab = tablet;
	}

	// �ش� �ʵ� �� ��ȯ�ô� �����ε� �Ұ� -> �޼ҵ�� ��� �ٸ��� 3�� �ۼ�
	public Desktop selectDesktop() {
		return desk;
	}

	public NoteBook selectNoteBook() {
		return note;
	}

	public Tablet selectTablet() {
		return tab;
	}*/
	
	// 2. ������ ���� ���� �� -> ��ü �迭�� ��� ����
	private Electronic[] elec = new Electronic[3];
	private int count = 0; // index ������ ����
	
	// �Ű������� �θ� Ÿ������ ����
	public void insert(Electronic any) {
		elec[count++] = any;
	}

	// ��ȯ�� �θ� Ÿ������ ����
	public Electronic[] select() {
		return elec;
	}
	
	
	
	
	
	
	
	

}
