package com.kh.chap04_field.model.vo;

public class FieldTest1 {
	// Ŭ�������� ��� ������ ���� �����ڴ� public, default ��
	// �ʵ忡�� ��� ������ ���� �����ڴ� 4����
	
	// 1. public -> ��𼭵�(���� ��Ű��, �ٸ� ��Ű�� ���) ���� ����
	// 2. protected -> ���� ��Ű�� ���� ���� + ���� �ٸ� ��Ű����� ��� �������� ���� ����
	// 3. default -> ���� ��Ű�� ���� ����
	// 4. private -> ���� �ڱ� �ڽ� Ŭ���������� ���� ����
	
	// 1. �ʵ�
	public String pub = "public";
	protected String pro = "protected";
	String def = "default"; // ����Ʈ�� ����
	private String pri = "private";
	
	// 2. ������
	public FieldTest1() {}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getDef() {
		return def;
	}

	public void setDef(String def) {
		this.def = def;
	}

	public String getPri() {
		return pri;
	}

	public void setPri(String pri) {
		this.pri = pri;
	}
	
	// 3. �޼ҵ� (getter/setter)
	// public -> ���� ���� �����ϴ� ���� ���� �ʿ� x
	// �������� ���� ���ѵ� �� ������ ���� ���� �ʿ� o
	
	
	
	
	
}
