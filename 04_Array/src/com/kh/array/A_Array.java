package com.kh.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class A_Array {
	// * �迭 : ���� �ڷ����� ������ �ϳ��� �������� �ٷ�� ��
	//         ���� �� ������ �ε����� �����Ǹ� �Τ������� 0���� ����
	
	public void method1() {
		// �迭�� �� ���� ���
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		// �̷� ������ ����ؼ� ���鰳�� ������ �ִٸ�..?
		// ���� �������� ����ϱ� ���ؼ� �Ǵ� �����ϱ� ���ؼ��� ��� ������־�� ��
		// ���� �������� ��� ���� �ڷ����̹Ƿ� �迭�� ����ϸ� �ξ� �����ϰ� ���α׷��� ����
		
		// 1. �迭 ���� ���
		// 1) �ڷ���[] �迭��;
		// 2) �ڷ��� �迭��[];
		
		int[] arr; // �ڷ��� �ڿ� ���ȣ�� �ִ� ���� �ٷ� �迭���� �� �� ����
//		int arr2[];
		
		// 2. �迭 �Ҵ�
		// �迭�� = new �ڷ���[�迭ũ��];
		
		arr = new int[5];
		
		// ����� ���ÿ� �Ҵ�
		int[] arr1 = new int[5];
		
		// 3. �ʱ�ȭ
		// �迭��[�ε���] = ��;
		
//		arr[0] = 0;
//		arr[1] = 1;
//		arr[2] = 2;
//		arr[3] = 3;
//		arr[4] = 4;
		
		// �迭�� ���� : ������ �� �ε����� ��ġ�� ���� ������ ��Ģ�� �ִٸ� �ݺ��� ��� ����
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i; // �ݺ������� �� ����
			System.out.print(arr[i] + " "); // ���
		} 
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	public void method2() {
		// ���� ����
		int i; // �޸� ������ ���� ���� �ڽ��� ����� ����
				// �� �� �޸��� stack�̶�� ������ �Ҵ�
		char[] cArr;
		// �迭 ����
		int[] iArr; // �迭�� �����ϸ� ���� ����� �Ȱ��� stack ������ ������ ����
					// ������ �� ������ ���� ���� �뵵�� �ƴ϶�, � �ּҸ� ������ ����
					// ���� ���� ��� ������ �׳� ������� �ϰ� �ּ� ���� ��� ������ ��������/���۷��� ���� ��� ��
		// ��, �⺻ �ڷ������� ���� �� ������ �Ϲ� ����
		// �� �ܷ� ���� �� ��� -> ���۷��� ����
		
		iArr = new int[5];
		cArr = new char[10];
		// ���� ���� new��� �����ڸ� ���� �迭�� �Ҵ��ϰ� �Ǹ�
		// �޸��� heap ������ �ش� �迭�� ũ�⸸ŭ�� ������ ���������
		// �� ������ �ּҰ��� stack������ ���۷��� ������ ����
		
		// ����, �ش� �迭�� ���� �ְų� ������ �� �ش� �ּҸ� �����ؼ� �����
		
		// ���� �迭 ����� �Ҵ��� ���ÿ�
		int[] iArr2 = new int[5];
		char[] cArr2 = new char[10];
		
		// ���������� Arrays.toString�� ���� ������, �ּҰ��� �����
		System.out.println("iArr : " + iArr);
		System.out.println("iArr2 : " + iArr2);
		System.out.println("cArr : " + cArr);
		System.out.println("cArr2 : " + cArr2);
		
	}
	
	public void method3() {
		char[] cArr = new char[5];
		int[] iArr = new int[3];
		// ��������� �迭�� �����ϰ� �Ҵ縸 �߰�,
		// ���� ���� ���� ���� ����(�ʱ�ȭx)
		
		// �ش� �ε����� �����ؼ� ����ϸ� � ���� �������� �ݺ������� ��� Ȯ���ϱ�
		for (int i = 0; i < cArr.length; i++ ) {
			System.out.println(cArr[i]);
		}
		System.out.println("====================");
		for (int i = 0; i < iArr.length; i++ ) {
			System.out.println(iArr[i]);
		}
		
//		int num;
//		System.out.println(num); // ���������� ������ �ʱ�ȭ�� �Ǿ�� ���(���)����!
		
		// ������ �迭�� ���, ���������ʹ� �޸� �ʱ�ȭ ���� �ʾƵ� ���� ���� ��µȴ�.
		// �⺻������ int(byte, short)���� 0, double(float)�� 0.0, String, char�� ������ �⺻���̴�.
		// �迭�� ���� ���� �ʱ�ȭ���� �ʴ´ٸ� jvm�� ������ �⺻ ������ �迭�� �ʱ�ȭ�ȴ�.
		// �ֳĸ� heap �������� ���� ���� ������ ������ �� ����!
		// �׷��� �ʱ�ȭ�� ���ϸ� jvm�� �ڵ����� �ʱⰪ�� �ο����ش�.
		
		System.out.println("iArr�� ���� : " + iArr.length);
		System.out.println("cArr�� ���� : " + cArr.length);
		
		// ���ڿ��� ���̸� ��� ���� length()��� �޼ҵ带 �̿��Ѵ�.
		// String �� ���ڿ� ���̴� �޼ҵ�� �����ϰ� �ֱ� ����
		// �迭�� ���̸� �� �� �ִ� ����� �޼ҵ尡 �ƴ� � ������ ������
		// ���� .length()�� �ƴ϶�, .length ���� �����ϱ�!
		// -> ���ڿ�����.length();   >> ���ڿ��� ���� ��ȯ
		// -> �迭����.length;    >> �迭�� �ε��� ���� ��ȯ
		
		
	}
	
	public void method4() {
		// ����ڿ��� �Է� ���� ������ �迭�� ���̸� �����غ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Ҵ��� �迭�� ���� : ");
		int size = sc.nextInt();
		
		// double�� �迭 dArr�� ����ڰ� �Է��� size��ŭ �Ҵ��غ���
		double[] dArr = new double[size];
		System.out.println(dArr); // �ּҰ� ���
		System.out.println("dArr�� ���� : " + dArr.length); // �Է��� �迭�� ���� ���
		for (int i = 0; i < dArr.length; i++) {
			System.out.println(dArr[i]); // ���̸�ŭ�� 0.0�� ��µ�~ 
		}
		
	}
	
	public void method5() {
		int[] iArr = new int[5];
		
		// 2, 4, 6, 8, 10
		int num = 2;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = num;
			num += 2;
			System.out.print(iArr[i] + " ");
			// ��, i�� �ܼ��� �迭�� ���̸� �þ���� ������ ��
		}
		
		
		System.out.println("iArr�� �ؽ��ڵ� �� : " + iArr.hashCode());
		// hashCode() -> �ּ� ���� �ؽ� ������ ���� 10���� ������ ����
		System.out.print("iArr�� ���� : " + iArr.length);
		
//		iArr[5] = 12;
		// -> ���࿡ �迭�� ũ�⸦ ����� �ε����� �߰��� ���� �־��ָ� ����!
		
		// ���� ū �迭�� ���� -> �� �� ������ ũ��� ������ �Ұ�����
		// ���� ũ�⸦ �ٲٷ��� �ٽ� �迭�� ũ�⸦ �����ؼ� �Ҵ� ���־�� ��!
		iArr = new int[10];
		// 10�̶�� ũ���� �迭�� heap ������ ���� �����ϰ�
		// ���� ������ �ּҸ� ���� �ִ� iArr�̶�� ���۷��� ������ ���� �� ��
		
		System.out.println("====== ���� ���� iArr ======");
		System.out.println("iArr�� �ؽ��ڵ� ��(�ּҰ�) : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
		
		// �ּҰ��� �ٲ� ���� Ȯ���� �� ����
		// ������ �����ϰ� �ִ� 5��¥�� �迭�� ������ ����� ���ο� ���� �����ϰ� ����!
		// �׷��� ��¾ �迭�� ��� ������ �������� �ʰ� heap������ �յ� ���ٴϴٰ� 
		// ���� �ð��� ������ �� �̻� ���� ���ٰ� �Ǵ��Ͽ� ������ �ݷ��Ͱ� �����ع���(�ڵ� �޸� ����)
		
		iArr = null;
		// ���۷��� ������ null ���� ���� �Ǹ� �ּҰ��� null�� �ٲ�
		// ��, �����ϰ� �ִ� �ּҰ� ���ٴ� �ǹ�
		// -> heap�� �ִ� ������ ���� �� ���� ����Ƿ� ���� �ĳ��� ������ ������ �÷��Ͱ� ������
		System.out.println("====== ���� ���� iArr ======");
		System.out.println("iArr�� �ؽ��ڵ� ��(�ּҰ�) : " + iArr.hashCode());
		System.out.println("iArr�� ���� : " + iArr.length);
	
	}
	
	public void method6() {
		// �迭 1)���� �� 2)�Ҵ�� ���ÿ� 3)�ʱ�ȭ ���� �ϱ�
		int[] iArr = {1, 2, 3, 4, 5};
		//  -> �߰�ȣ ���� ����ϴ� ��� new �����ڸ� ������� �ʾƵ� �Ǹ�,
		//     ���� ������ŭ �ڵ����� ũ�� �Ҵ�
		
		int[] iArr2 = new int[] {1, 2, 3, 4, 5};
		// �̷��Ե� ��� ����
		
		System.out.println(iArr == iArr2); // == �ּҰ���
		// iArr�� iArr2�� �� �ִ� ���� �����ϹǷ� == �� Ȯ���غ���.
		// ����� false
		// ���۷��� �������� ������ �ִ� �ּ� ���� ���ϰ� �ְ�
		// ���� heap ������ �Ҵ� �Ǿ� �ִ� �ٸ� �迭�̹Ƿ� �ּҴ� ���� �� ����.
		// ��, �Ҵ�� ���� ����, �ּҴ� �޶��~!~!!~~!

	}
	
	public void method7() {
		String[] sArr = new String[5]; // String ���ڿ��� �迭 ��� ����
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i]); // null ��
		}
		
		Scanner sc = new Scanner(System.in);
		// 0�� �ε������� ������ �ε������� �ݺ��Ͽ�
		// ����ڿ��� ���ڿ��� �Է� �ް� ���� �� �ֱ�
		
		for (int i = 0; i < sArr.length; i++) {
			System.out.print("���ڿ� �Է� : ");
			sArr[i] = sc.nextLine(); // 5�� �ݺ��Ͽ� �Է¹ް� ����
		} System.out.println(Arrays.toString(sArr));
	}
	
	public void method8() {
		// ����ڿ��� 5���� Ű�� ������ �Է� �޾� �迭�� ��Ƶΰ�
		// �ݺ����� ���� 5���� Ű�� ����, ��� ���ϱ�
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		double tot = 0;
		
		for (int i = 0; i < height.length; i++ ) {
			System.out.printf("%d��° Ű�� �Է��ϼ���. : ", i);
			height[i] = sc.nextDouble();
			tot += height[i];
		} System.out.printf("���� : %.1f\n", tot);
		System.out.printf("��� : %.1f\n", tot / height.length); // �迭�� ���̸�ŭ ����
		
		
	}
	
	public void method9 () {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int size = sc.nextInt();
		int[] arr = new int[size]; // ����ڿ��� �Է� ���� ��ŭ�� �迭 ũ�� ����
		
		// �ش� �迭�� 	1���� 100������ �������� �߻����Ѽ� �ֱ�
		// ���1. java.lang.Math Ŭ������ random() �޼ҵ�
		// ���2. java.util.Random Ŭ����
		
		Random ran = new Random();
		System.out.println("int ������ ���� : " + ran.nextInt()); // -> () �� �������� �������� �ʾ��� ��
		// -21�� ~ 21������� int�� ǥ���� �� �ִ� ���� ���� �ȿ��� �߻� �Ǵ� ���� ��
		System.out.println("1 ~ 100 ������ ���� : " + ran.nextInt(100) + 1); // (������) + ���۰� >> 0���� �����ϱ� ������ +1 �ϱ�
		// 100�� ������ 0~99������ ���� �߻�, 1 ~ 100������ ������ ������� +1
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1; // 1 ~ 100 ������ ������ �迭�� �Ҵ�
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void method10() {
		// ����ڿ��� ���ڿ��� �Է� �޾� ��� ���ڿ��� �� ���ڸ� ���� �迭�� ���ʷ� �ֱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()]; // �Է¹��� ���ڿ��� ���̸�ŭ�� �迭 ����
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
			System.out.println(arr[i]);
		}
	}
	
	public void method11() {
		// �ִ밪 �ּҰ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		
		// 5���� ���� ������ �� �ִ� ������ �迭 ���� �� �Ҵ�
		int[] input = new int[5];
		
		// �� �ε����� ����ڷκ��� �� �Է� ����
		for (int i = 0; i < input.length; i++) {
			System.out.print(i + 1 + "��° �Է� : ");
			input[i] = sc.nextInt();
		}
		
		// �� ó�� ���� arr[0]���� �ִ밪�� �ּҰ��� ���� ������ �ʱ�ȭ �� ��
		int max = input[0]; // -21700000
		int min = input[0]; // 21700000
		
		// 1�� �ε������� �迭 ������ ���ϱ�
		for (int i = 1; i < input.length; i++) { // 0�� ���� ������ �ʿ䰡 ����(�̹� �ּҰ��� �ִ밪�� 0�� �ε����� �����߱� ������ ���� �ʿ䰡 ����)
			if (max < input[i]) max = input[i]; // 0�� �ε����� i�ε������� ������ max�� �Ѱ����
			if (min > input[i]) min = input[i]; // 0�� �ε����� i�ε������� ũ�� mix�� �Ѱ����
		} System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
		
		
	}
	
	

}
