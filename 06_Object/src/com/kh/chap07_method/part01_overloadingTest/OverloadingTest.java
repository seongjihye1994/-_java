package com.kh.chap07_method.part01_overloadingTest;

public class OverloadingTest {
	// �����ε�
	public void test() {}
	
	public void test(int a) {}
	
	public void test(int a, String s) {}
	
	public void test(String s, int a) {} // �Ű������� ������ �߿���
	
	public void test(int a, int b) {}
	
//	public void test(int c, int d ) {}
	// ����! -> �Ű���������� ��� ���� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�� ��
	
	public void test(int a, int b, String str) {
		System.out.println("test");
	}
//	
//	public int test(int a, int b, String str) {
//		return 0;
//	}
//	
//	private void test(int a, int b, String str) {
//		
//	}
	// ����! -> ���� �����ڰ� �ٸ��ٰ� �����ε��� ������� ����
	
	// <���>
	// �����ε��� �޼ҵ���� ���� ��� �߻��ϴµ�,
	// ���� ������, ��ȯ������ �����ϰ�
	// �Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ�߸� ��

}
