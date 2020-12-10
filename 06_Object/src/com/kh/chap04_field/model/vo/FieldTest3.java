package com.kh.chap04_field.model.vo;

// Ŭ���� ����(static ����)�� ���ؼ� �˾ƺ���
public class FieldTest3 {
	
	// ���� ������ ������ Ŭ���� ������ static ���� ���� ������ ����
	// static Ű���尡 ������ ���α׷� ���� ���ڸ��� static �޸�
	// ������ �Ҵ� ��
	
	public static String pubSta = "public static";
	private static String priSta = "private static";
	
	// static ������ FieldTest3��� Ŭ����(Ʋ)�� ��
	// ��� ��ü���� "����"�ϴ� ����
	
	public FieldTest3() {} // ������
	
	// private �� ���� ���� /���� �޼ҵ�
//	public void setPriSta(String proSta) {
//		this.setPriSta = priSta;
//	}
	
	// static�� ��ü ������ ���� �ʾƵ� ���α׷� ����� ���ÿ�
	// static ������ �Ҵ� �Ǳ� ������ this�� ������ ����
	
	public static void setPriSta(String priSta) {
		FieldTest3.priSta = priSta; // static �޼ҵ�� Ŭ������.���� ȣ��
	}
	public static String getPriSta() {
		return "private static";
	}

	
	
	
	

}
