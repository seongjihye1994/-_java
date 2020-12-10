package com.kh.chap01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UnCheckedExceptionTest {
	
	// RunTimeException(�ڵ��ۼ� ���� x ������� ���� o) ������ ���� �������� 5����
	// �������� Exception�� �߻����� �׽�Ʈ �غ���
	public void method1() {
		// 1. ArrayIndexOutOfBoundsException
		// : �迭�� ���ٿ� �߸� �� �ε��� ���� ����ϴ� ���� ��Ȳ
		int[] arr = new int[5];
		for (int i = 0; i < /*=*/arr.length; i++) {
			arr[i] = i; // arr[5]��� �迭�� �ε����� �Ѿ�� �������� ����
			// exception �߻�
		}	
		
		// 2. NullPointException
		// : ���� ������ null�� �ʱ�ȭ �� ��Ȳ���� �޼ҵ带 ȣ���ϴ� ���� ��Ȳ
		int[][] arr2 = new int[2][];
		arr2[0] = new int[2];
		
		System.out.println(arr2);
		System.out.println(arr2[0]);
		System.out.println(arr2[0][0]);
		// System.out.println(arr2[1][0]);
		
		// 3. CastClassException
		// : ����� �� ���� ����ȯ�� ����Ǵ� ���� ��Ȳ
		String str = "1";
		Object obj = str;
		Integer integer = (Integer)obj;

	}
	
	public void method2() {
		// 4. ArithmeticException
		// : ������ ���꿡�� �θ� 0�� ��� �߻��ϴ� ���� ��Ȳ
		// �Ϲ������� if������ 0���� �˻� -> ���⼭�� try~catch ����غ���
		
		// try {} : ���ܰ� �߻� �Ǵ� ���� �ۼ�
		// catch(����Ŭ���� �Ű�����) {} : ���ܰ� �߻� �Ǵ� ��� ó���ؾ� �Ǵ� ���� �ۼ�
		
		int ran = 0;
		double result = 0.0;
		
		for (int i = 0; i < 10; i++) {
			ran = (int)(Math.random() * 10);	// 0~9 ���� �߻�
			try {
				result = 10 / ran; // ���Ⱑ ���ܹ߻�
				// try �������� ������ �߻��ϸ� ���� �ڵ� �������� �ʰ� catch �������� ��
				System.out.printf("ran : 10 / %d = %f\n", ran, result);				
			} catch (ArithmeticException e) {
				// e.printStackTrace(); // �Ƹ�����ƽŬ���� ���ۺ��� e�� p~�޼ҵ� ȣ��
				// System.out.println(e.getMessage()); // / by zero
				System.out.printf("ran : 10 / 0�� �Ұ����մϴ�.\n");
			}
		} 
		
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// 0���� ������ ���� �߻�
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		System.out.print("���� �ϳ� �Է� : ");
		
		// catch���� ������ �ۼ� ����
		
		try {
			int num = sc.nextInt();
			result = 10 / num;
			System.out.println("result : " + result);			
		} catch (ArithmeticException e) {
			System.out.println("0 �Է� �Ұ�!!!");
		} catch (InputMismatchException e) {
			// ���� num�� ���ڰ� �ƴ� �ٸ� ���� �Է��ϸ� InputMismatchException �߻�
			System.out.println("���ڵ� �Է� �Ұ�!!!");
		} catch (RuntimeException e) {
			System.out.println("��� RuntimeException�� �޾��ָ�");
		} catch (Exception e) {
			System.out.println("��� Exception�� �޾��ָ�");
		}
		
		// ������(�ڽ� ��ü�� �θ� Ÿ�� ���۷����� �ٷ�� ���)�� �����Ͽ�
		// �θ� Ÿ������ Exception�� �ѹ��� ó���ص� ������
		// ������ ���� �߻��� �ش��ϴ� ������ ¥���� ��쿡�� ����ȭ�ؾ� ��
		// ���� ���� Exception Ÿ���� ���� ��� �Ǹ� ���� �޾Ƽ� ó���ع����� ������
		// catch ���� ���� ������ ���� (���� Ÿ�Ժ��� ���� ����)

	}
	
	public void method4() {
		// 5. NegativeArraySizeException
		// : �迭 ���� �������� �迭�� ũ�⸦ ������ �����ϴ� ���� ��Ȳ
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = null;
		
		// try {
		if (num > 0) {
			arr = new int[num];			
			// } catch (NegativeArraySizeException e) {
		} else {
			System.out.println("����� �Է��� �ּ���. : ");			
		}
		
	}
	
	// RuntimeException�� ��� ���ǹ��� ���ؼ� ���ʿ� ���ܰ� �߻����� �ʵ���
	// ó�� ���� => ���� ����
	
	
	

}
