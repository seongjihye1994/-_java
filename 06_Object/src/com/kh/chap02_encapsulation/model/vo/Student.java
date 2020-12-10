package com.kh.chap02_encapsulation.model.vo;

public class Student {
	// 1. �ʵ�
	// ���������� [�����] �ڷ��� ������;
	
	private String name;
	private int kor;
	private int math;
	private int eng;
	
	// 2. ������ : ��ü�� �����ϱ� ���� ������ �޼ҵ�
	// 		���������� Ŭ������([�Ű�����]) {
	//
	// }
	public Student() { // ����Ʈ ����~
		
	}
	
	// 3. �޼ҵ� : ����� �����ϴ� �κ�
	// ���������� Ÿ�� �޼ҵ��([�Ű�����]) {
	//
	// }
	
	
	public void setName(String name) { // �ʵ��� ���� �޾Ƽ� �������ִ� �޼ҵ�
		// name = name;
		// �Ű������� name = �Ű������� name;
		// {} ���������� �ش� �������� ������� ������ �켱������ ���� ����
		
		// �츮�� ���ϴ� �ڵ��
		// �ʵ��� name = �Ű������� name;
		this.name = name;
		// this���� �ش� ��ü�� �ּҰ��� ��� ����	
	}
	
	// 3_1. setter
	// ������(�ʵ�)���� ��� �� �����ϴ� ����� �ϴ� �޼ҵ�
	// �� �� �޼ҵ�� �ܺ� ���� �����ϵ��� �ؾ� �ϱ� ������ public ���� ������ ���
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	// 3_2. getter
	// ���� ��ȯ���ִ� ����� �ϴ� �޼ҵ�
	// getter �޼ҵ���� ī�� ǥ����� �̿��Ͽ� getXXX�� ��� ������
	// ���������ڴ� �ܺο��� ������ �� �־�� �ϹǷ� public
	// �ʵ尪�� ��ȯ����� �ϹǷ� ��ȯ�ϰ��� �ϴ� �ڷ����� ��ȯ���� ����
	// getter �޼ҵ�� ���� �ش� �ʵ� ���� ��ȯ���ִ� �޼ҵ�� �ش� �޼ҵ�� ���ɵǴ� ���� �����Ƿ�
	// �Ķ���ʹ� �ۼ��� �ʿ䰡 ����
	public String getName() { // ���ʹ� ��ȯ�� ����� �ϴ� ����Ÿ���� �־�� �մϴ�.
		return name; // this�� �Ⱥ��̴� ������? getter �޼ҵ� �ȿ��� �������� name�� �����Ƿ�,
					// �򰥸��� �ʱ� ������ this�� ������ �ʾƵ� �ʵ�  name�� �ν���
	}
	public int getKor() {
		return kor;
	}
	public int getMath() {
		return math;
	}
	public int getEng() {
		return eng;
	}
	
	// ��� �ʵ� ���� �� ��ģ ���ڿ��� ��ȯ�ϴ� �޼ҵ�
	public String info() {
		return "�̸� : " + name + " �������� : " + kor + 
				" �������� : " + math + " �������� : " + eng;
	}
	

}
