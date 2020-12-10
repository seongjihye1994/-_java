package com.kh.array;

import java.util.Arrays;

public class C_ArraySort {
	
	public void method1() {
		// �迭�� �����ϱ⿡ �ռ���, ������ ������ ���� �����غ���
		
		// �켱 �� ���� ������ ���� ���� �����ϴ� ��
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("=== ���� �� ===");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		// num1�� num2�� ���� ���� �ٲ۴ٰ� �����غ���.
		// num1 = num2;
		// num2 = num1;
		// �̰� �ȵ�!!
		
		// ���� ���� �ӽ÷� ������ ���ο� ������ ����� ���� �̵� ��Ű��!
		int temp; // �ӽ÷� ���� �����ص� ����
		temp = num1;
		num1 = num2;
		num2 = temp;
				
		System.out.println("=== ���� �� ===");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		
		
	}
	
	public void method2() {
		// �迭�� �����ϰ� ��ġ ���� ����
		int[] arr = {2, 1, 3}; // -> �ϳ��� �������� �б� : 1, 3, 2
		
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
	}
	
	public void method3() { // �����ϱ�~! (������, ������)
		int[] arr = {2, 5, 4, 1, 3};
		
		// ���� ����(insertion sort) == ��������
		// �迭�� n�� �ε��� ���� 0~n������ 
		
		// �� ����    �� ���
		// i=1		j=0~0
		// i=2		j=0~1
		// i=3		j=0~2
		// i=4		j=0~3
		
		// ��, i=1���� �迭 ������ �ε������� �ݺ��� ��
		// j=0���� i-1���� �ݺ�
		// ��, ���⼭ i�� 5�϶�, j�� 2, i�� j���� �ڿ��ִ� �ε���
		
		for (int i = 1; i < arr.length; i++) { // ������ �Ǵ� �ε����� �� ���� ������Ű�� �ݺ���
			for (int j = 0; j < i; j++) { // �ε����� ������ ������  �ش� �ε��� ��(<= i-1; or < i)���� ���� ���ϴ� �ݺ���
				System.out.println("���� �ε��� ��ġ : " + i + ", " + j);
				System.out.println();
				// �������� ������ ���� ó��
				// ���� �������� ������ �ϰ� �ʹٸ�, �ε�ȣ�� �ݴ�� ����ϸ� ��
				if (arr[i] < arr[j]) { // �տ� �ִ� �� arr[j]�� �� ũ�� �������� ������ ���� ������ �ٲٱ�
					System.out.println("=== ��ȯ �߻� ===");
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				// ���� ����� �ٷ� Ȯ���غ��� �ݺ���
				// Arrays.toString(�迭) : �����ϰ� �迭�� �� �ٷ� ����ؼ� Ȯ���� �� �ִ� �޼ҵ�
				System.out.println(i + "ȸ�� : " + Arrays.toString(arr));
			}
		} // ���� ���ĵ� Ȯ�� �ݺ��� 
		System.out.println("=======================");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}
	
	public void method4() {
		int[] arr = {2, 5, 4, 1, 3};
		
		// ���������� ����
//		Arrays.sort(arr);
//		Arrays.sort(arr, 0, 3);
		// fromIndes, toInex
		// 0�� �ε������� 3�� �ε��� ������ ���� : 0 ~ 2 ����
		
		System.out.println(Arrays.toString(arr));
		
		// ���������� ������ �������� �����Ƿ�
		// ���ο� �迭�� ���� �Ųٷ� ����
		int[] copy = new int[5];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = arr[copy.length - 1 - i]; // �Ųٷ� ����
		} System.out.println(Arrays.toString(copy));
	}
	
	

}
