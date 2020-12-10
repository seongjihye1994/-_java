package com.kh.chap01_inherit.after.model.vo;

// Product�� ��� �޴� Desktop Ŭ���� 
public class Desktop extends Product {
	// extends -> Ȯ���ϴ�.
	// �θ��� ���� ���� �ް� �ڽ��� ���� �߰��Ͽ� Ŭ������ Ȯ����
	
	private boolean allInOne; // ��ü�� ����
	
	public Desktop() {}

	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		// super() : �θ� ��ü�� ������ ȣ��
		// �ڽİ�ü �ȿ� ���Ԛ�Ű�� �ݵ�� ù �ٿ� ǥ�� --> �׻� �θ���� �����Ǳ� ����!
		super(brand, pCode, pName, price); 
		this.allInOne = allInOne;
	}

	// ���� ���ʹ� �ش�Ŭ������ ����
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String info() {
		// super. �θ� ��ü�� ����Ű�� ���� ����
		// �ڽ� Ŭ���� ������ �θ� Ŭ���� ��ü�� �����Ͽ� �ʵ峪 �޼ҵ� ȣ�� �� ���.
		return super.info() + ", allInOne : " + allInOne;
	}

	@Override
	public void print() {
		System.out.println("���� Desktop ��ü��!");
	}
	
	
	
	
	

}
