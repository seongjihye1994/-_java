package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

	// 1. ���� ���� : �迭�� �ּҸ��� ����
	// 2. ���� ���� : ������ ���ο� �迭�� �ϳ� �����ؼ� ���� ���� ������ ����
	
	public void method1() {
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin; // ��������
		
		// ���� ���
		System.out.println("���� ���� : �ּҰ� ����, �ε��� ���� ���� �� ����!");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		} System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// ���� �� copy �迭�� �̿��ؼ� 2�� �ε����� ���� 99�� ����
		copy[2] = 99;
		
		System.out.println("==== ���纻 �迭 �� ���� �� ====");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());

	}
	
	public void method2() {
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[5];
		
		System.out.println("���� ���� : �ּҰ� �ٸ�, ���� �� ����ǵ� ���簪 ���� x");
		for (int i = 0; i < origin.length; i++) {
			copy[i] = origin[i];
		} System.out.println();
		
		// ���� ���
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");
		} System.out.println();
		
		// �� ���� �Ǿ����� ���纻 ���
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
		copy[2] = 99; // ���� �迭 �ε��� �� ����
		
		System.out.println("==== ���纻 �迭 �� ���� �� ====");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		System.out.println("origin�� �ּҰ� : " + origin.hashCode());
		System.out.println("copy�� �ּҰ� : " + copy.hashCode());
		
		// ���纻 �迭�� ���� ���� �� ���� Ȯ���� �� ����
		// ��, ���� ����� �迭�� �ּҸ� �����ϱ� ������, �迭 ���� ����Ǿ ���� ���������
		// ���� ����� �迭�� �ε��� ���� ��� �����ϱ� ������, �迭 ���� ����Ǿ ī�ǹ迭�� �ε������� ������� �ʴ´�.
		
		
	}
	
	public void method3() {
		// 2. System Ŭ�������� arraycopy() �޼ҵ带 �̿��� ����
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[10]; // ���� �迭 �� ũ�� ����
		
		// (���� �迭��, ��������� �ε���, ���纻�迭��, ���纻�迭�� ���� ���۵� ��ġ, ���� ���� ����)
		System.arraycopy(origin, 0, copy, 2, origin.length);
		
		// origin �迭�� copy �迭�� �����ϴµ�, �̶�,
		// origin �迭�� 0�� �ε������� �������� ���� ���̸�ŭ��
		// copy �迭�� 2�� �ε������� ä��ڴٴ� �ǹ�
		
		System.out.println("���� ���� �޼ҵ�1 : System.arraycopy, �ּҰ� �ٸ�!");
		System.out.println("==== ���纻 �迭 �� ���� �� ====");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// copy�� �޳ؽ� ���� �����ص� origin �迭�� ������ ���� ���� ��
		// �ٸ� �ּ� ���� ������ �ֱ� ������
		
		// System.arraycopy() �޼ҵ带 �̿��ϸ� ���� ��ġ, ������ ������ ������ �� ����
		// for���� ������� �ʰ� for���� ���� ��� ���� ����

	}
	
	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyOf() �޼ҵ� ���
		// Arrays Ŭ������ �迭�� �̿��� �� ������ �޼ҵ���� ��Ƴ��� Ŭ����
		
		// Arrays.copyOf() -> ���� ������ ���̸�ŭ ������ ũ�� �Ҵ�
		// ������ ���̰� ���� �迭���� �� ��� ���� �迭�� �ִ� ���� ��� ���� (���� �ε����� 0)
		// ������ ���̰� ���� �迭���� ª�� ��� ���� �迭���� ������ ���̸�ŭ ����
		// ���� ��ġ ��Ʈ�� �Ұ�!
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(���� �迭, ���� ������ ����);
		int[] copy = Arrays.copyOf(origin, 5);
		
		System.out.println("���� ���� �޼ҵ�2 : Arrays.copyOf, �ּҰ� �ٸ�!");
		System.out.println("==== ���纻 �迭 �� ���� �� ====");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
		// -> origin.length ���� ���� ��/ũ ���� �־ �׽�Ʈ�غ���
		// ���� ���� ������ �� ���������� �ε������� ��µǰ�, ū ���� ������ ������ �ε����� ����Ʈ ������ ä����
		
		
	}
	
	public void method5() {
		// 4. clone() �޼ҵ� �̿��� ����
		// ���� �ε��� ������ �� ������, ���� �迭�� ��ä�� ������ ���ο� �迭 �Ҵ�
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		System.out.println("���� ���� �޼ҵ�3 : ���纻�迭��.clone, �ּҰ� �ٸ�!");
		System.out.println("==== ���纻 �迭 �� ���� �� ====");
		System.out.println("���� �迭 ���");
		for (int i = 0; i < origin.length; i++) {
			System.out.print(origin[i] + " ");			
		} System.out.println();
		System.out.println("���纻 �迭 ���");
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i] + " ");
		} System.out.println();
		
	}
	
	
}
