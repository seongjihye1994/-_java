package com.kh.array;

import java.util.Arrays;
import java.util.Scanner;

public class D_Overlap {
	
	// �迭 �ߺ� ����
	public void method1() {
		// ����ڿ��� 5���� ���� �Է� �޾� �迭�� ����
		// ��, �ߺ� ���� ������� ����
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[5];
		
		for (int i = 0; i < input.length; i++) {
			System.out.println(i + "��° ���� �� : ");
			input[i] = sc.nextInt(); // �Է� ���� ����, ������ �Է� ���� �� �� �ߺ� ���� �ִ��� Ȯ��
			for (int j = 0; j < i; j++) { // �ߺ� Ȯ��(�Է¹��� �� i���� Ȯ��)
				if (input[i] == input[j]) { // �ߺ��� �����Ѵٸ�
					System.out.println("�ߺ� ���� �����մϴ�.");
					i--; // ��? break�� �ܺ� for���� i++�� ���� ������ �� �ε����� ���� �ٽ� �ޱ� ���ؼ� --�� ���� ����� ���� ������ �ʽ��ϴ�!
					break;
				}
			}
			System.out.print(input[i] + " ");
		}
		
		
	}

	
	public void method2() {
		int[] arr = new int[5];
		// 1~10������ ������ �ߺ� ���� ä���
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(j + "��°�� " + i + "��° : " + arr[i] + " �ߺ�");
					i--; // �Ʒ� break������ �ܺ� for���� ���ǽ����� ���� i++�� �ȴ�.
					break; //�׷��� �ߺ��� �ڸ��� �ٽ� ä���� �ϱ� ������ i�� -- ���ش�.
				}
			}
		} System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
