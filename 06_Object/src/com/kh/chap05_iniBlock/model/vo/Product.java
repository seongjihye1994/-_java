package com.kh.chap05_iniBlock.model.vo;

public class Product {
	
	// ��� ���� == �ν��Ͻ� ����
	private String pName = "���ϼ�";
	private int price = 900000;
	
	// Ŭ���� ����
	private static String brand = "����";
	
	// �ν��Ͻ� ���(�ν��Ͻ� ������ �ʱ�ȭ��Ű�� ���)
	// �ν��Ͻ� ��ü �����ø��� �ʱ�ȭ ��
	{
		pName = "cyon";
		price = 2000000;
		
		brand = "����";
		// �ν��Ͻ� ��Ͽ����� static ������ �ʱ�ȭ �� �� �ִ�.
		// static �ʵ�� �̹� ���α׷� ���� �� ������� �ִ� �����̹Ƿ�,
		// ��ü ���� ���� ���� �ʱ�ȭ�ϴ� �ν��Ͻ� ��ȭ ���� ������
		// ����� ��
	}
	
	// static ���(static ������ �ʱ�ȭ��Ű�� ���)
	// ���α׷� ���� �� �� �ѹ��� �ʱ�ȭ
	static {
		brand = "���";
		
//		pName = "���̻�"; // static��Ͽ��� �ν��Ͻ������� �ʱ�ȭ�� �� x
//		price = 2000000; // �ν��Ͻ������� new ��ü�� ������ �Ŀ� �����ϱ� ����
		// static ������ ���α׷� ���� ���� �� ��� �ʱ�ȭ�Ǵ� �����ε�,
		// �ν��Ͻ� ������ ���ܳ��⵵ ���� static �������� �ν��Ͻ� ������
		// �ʱ�ȭ�Ϸ��� �ϱ� ������ ������ ���� ��!
		// ��, �����Ǵ� ������ static >> instance ������ static�� ����
		// �����Ǳ� ������ ���� �������� ���� �ν��Ͻ� ������ static���� �ʱ�ȭ�� �� ����!
	}
	
	public Product() {}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static String getBrand() {
		return brand;
	}

	public static void setBrand(String brand) {
		Product.brand = brand;
		// ��ü�� �ʵ忡 �����ϴ� ���� �ƴ� ���� �޸��� brand�� �����ؾ� �ϹǷ�
		// this ��� x
	}
	
	public String information() {
		return "Product [pName=" + pName + ", price=" + price + ", brand=" + brand + "]";
	}
	
	
	

}
