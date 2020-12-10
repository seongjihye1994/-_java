package com.kh.chap02_abstractAndInterface.part01_abstract.model.vo;

public abstract class Sports {
	
	// � �������� ����� �����ϹǷ� �����ϴ� ����� ���
	private int people;
	
	public Sports() {}

	public Sports(int people) {
		super();
		this.people = people;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}
	
	@Override
	public String toString() {
		return "Sports [people=" + people + "]";
	}

	// � �������� ���Ѿ��ϴ� ���� ������ ���������� ���� �ٸ�
	// -> �� ���������� �׿� ���� ���� �ݵ�� �����ؾ� ��( = �ݵ�� �������̵� �ؾ� ��)
	// -> rule() �޼ҵ� �߻� �޼ҵ�� ����
	public abstract void rule();
	// -> Ŭ������ abstract ���� �ٿ����� ������ abstract �޼ҵ带 ������ �� �����Ƿ� �ٿ�����.
	
	

}
