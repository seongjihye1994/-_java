package com.kh.dimension;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionalArray {
	// ������ �迭 : ������ �迭 ���� ���� �ϳ��� ���� ��
	
	public void method1() {
		// ������ �迭 ����
		
		// �ڷ���[][] �迭��;
		// �ڷ���[] �迭��[];
		// �ڷ��� �迭��[][];
		
		int[][] arr1;
		int[] arr2[];
		int arr3[][];
		// ������ �ϰ� �Ǹ� stack�� ���۷��� ���� ����
		
		// ������ �迭 �Ҵ�(heap�� �迭 ����)
		// �迭�� = new �ڷ���[��ũ��][��ũ��];
		
		arr1 = new int[3][5];
		// �Ҵ��� �ϰ� �Ǹ� heap ������ �ش� ũ�⸸ŭ�� ������ �Ҵ��
		
		System.out.println("���� ���� : " + arr1.length); // 3
		System.out.println("���� ���� : " + arr1[0].length); // 5
		
		// ****
		// ****
		// ****
		// ****
		// ****
		
		// �ܺ� for�� --> ���� ������ŭ �ݺ�
		// ���� for�� --> ���� ������ŭ �ݺ�
		
		// ������ �迭�� �����ϰ� ����
//		arr1 = new int[3][5];
		for (int i = 0; i < arr1.length; i++) { // �� (����)
			for (int j = 0; j < arr1[i].length; j++) { // �� (����)
				System.out.print(arr1[i][j] + " ");
			} System.out.println();
		}
		
	}
	
	
	public void method2() {
		int[][] arr = new int[3][5];
		// 1 2 3 4 5 
		// 6 7 8 9 10 
		// 11 12 13 14 15
		
		int value = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = value++; // ���� �ٲ𶧸��� +1
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			} System.out.println(); // �� ���� ������ ����
 		} 

	}
	
	
	public void method3() {
		// ������ �迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
		int[][] arr = {{1, 2, 3, 4, 5},
					  {6, 7, 8, 9, 10},
					  {11, 12, 13, 14, 15}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println(); // �� ���� ������ ����
		}

	}
	
	public void method4() {
		// ���� �迭
		// ���� ���������� �� �࿡ ���� ���� ������ �������� ���� ����
		// �ڷ����� ���� 1���� �迭 ���� ���� �ϳ��� ���� ���� 2���� �迭�̹Ƿ�
		// �����ִ� 1���� �迭�� ���̰� �ݵ�� ���� �ʿ�� ����
		// ��, ���� �����ϳ�, �� ���� ���� ���̴� �������� ���� �� �ִٴ� �ǹ�
		
		// �����迭
		int[][] arr = new int[3][]; // �� ���̴� �Էµ��� �ʾƵ�, ���� ���̰� �ԷµǸ� ����  x
		
		arr[0] = new int[2]; // 0���� 2��
		arr[1] = new int[1]; // 1���� 1��
		arr[2] = new int[3]; // 2���� 3��
		// -> �� �࿡ �� �ٸ� �迭�� ������ �� �ֵ��� �Ҵ�
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
		
	}
	
	public void method5() {
		
		// ���� �迭�� �Ҵ�� �ʱ�ȭ ���ÿ�
		int[][] arr = {{1, 2}, {3}, {4, 5, 6}};
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			} System.out.println();
		}
	}
	
	public void method6() {
		// double �� 2�� 4�� �迭�� �����
		// 3�� �л��� ����(0��), ����(1��) ������ �Է¹ް� 
		// ������ ��(3��)���� �հ踦 ���
		
		double[][] arr = new double[2][4];
		
		Scanner sc = new Scanner(System.in);
		
		// �Է¹޴� �ݺ���
		for (int i = 0; i < arr.length; i++) {
			double sum = 0; // �� �ึ�� �հ踦 ������ ����
			for (int j = 0; j < arr[i].length - 1; j++) { // 0, 1, 2 ������ ���� �Է� �޴� �ݺ���(-1)
				if (i == 0) System.out.print(j + 1 + "�� �л� ���� ����: ");
				else System.out.print(j + 1 + "�� �л� ���� ����: ");
				arr[i][j] = sc.nextDouble();
				sum += arr[i][j];
			} arr[i][3] = sum;
		}
		
		// ����ϴ� �ݺ���
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) System.out.print("���� ����: ");
			else System.out.print("���� ����: ");
			for (int j = 0; j < arr[i].length; j++) { // 0, 1, 2, 3�� ��� ����ϴ� �ݺ���
				if (j < arr[i].length - 1) System.out.print(arr[i][j] + " ");
				else System.out.print("�հ�: " + arr[i][j]);				
			} System.out.println();
		} 

	}
	

	public void method7() {
		// char�� 2���� �迭 5�� 5���� ����� ��� ���� �Է� �޾�
		// �ش� ��ǥ�� ���� 'X'�� ��ȯ�� 2���� �迭 ����ϱ�
		// �ݺ� �����ϵ� ���̳� �� �Է½� 0�̸� 5�̻��� ���� �ԷµǸ� ���α׷� ����
		
		char[][] arr = new char[5][5];
		
		Scanner sc = new Scanner(System.in);
		
		int row;
		int col;
		
		while(true) {
			System.out.print("�� �ε��� �Է� >> ");
			row = sc.nextInt();
			System.out.print("�� �ε��� �Է� >> ");
			col = sc.nextInt();
			
			if (row < 0 || row > 4 || col < 0 || col > 4) break;
			
			arr[row][col] = 'X';
			
			// ��¹� �ۼ��ϱ�
			System.out.print("\t");
			for (int h = 0; h < 5; h++) { // �� 
				System.out.print(h + "\t");
			} System.out.println();
			
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i + "\t"); // ��
				for (int j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + "\t");
				} System.out.println();
			} System.out.println();
		} System.out.println("���α׷� ����");
	}
	
	
	public void method8() {
		// 1~10������ ���� ���� 3�� 3�� �迭�� �ߺ� ���� �ֱ�
		// 1. ������ �迭�� �̿��ؼ� ���� �ߺ� ����
		int[] arr = new int[3*3];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			
			// �ߺ� Ȯ�� �� �ߺ� �� �ٽ� ���� �� ������ ���� i--
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; break;
				}
			}	
		} System.out.println("==== ������ �迭 ��� ====");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		} System.out.println();
		
		// ������ ������� �ߺ� ���� �� ������ �迭�� --> ������ �迭�� �ֱ�
		int[][] newArr = new int[3][3];
		
		int idx = 0; // �뵵�� ������ �迭�� 0�� ~������ �ε������� �����ϱ� ���� ����
		
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				newArr[i][j] = arr[idx++]; // �� 1�����迭���� ���� ���� �� �迭�� �����ϱ� ����
			}
		}
		
		System.out.println("==== ������ �迭 ��� ====");
		for (int i = 0; i < newArr.length; i++) {
			for (int j = 0; j < newArr[i].length; j++) {
				System.out.print(newArr[i][j] + " ");
			} System.out.println();
		}
	}
}
