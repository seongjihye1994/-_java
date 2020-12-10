package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			System.out.print(iArr[i] + " ");
		} System.out.println();
	} 
	
	public void practice2() {
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		} System.out.println();	
		int[] copy = new int[10];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = iArr[copy.length - 1 - i];
			System.out.print(copy[i] + " ");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int[] input = new int[sc.nextInt()];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = i + 1;
			System.out.print(input[i] + " ");
		}
		
	}
	
	public void practice4() {
		String[] fruit = {"���", "��", "����", "������", "����"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : "); String input1 = sc.next();
		System.out.print("���� : "); char input2 = sc.next().charAt(0);
		int count = 0;
		char[] str = new char[input1.length()];
		
		System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : ", input1, input2);
		for (int i = 0; i < str.length; i++) {
			str[i] = input1.charAt(i);
			if (str[i] == input2) {
				System.out.print(i + " "); count++;
			} 
		} System.out.println(); 
		System.out.printf("%c �� ���� : %d��\n", input2, count);
		
	}
	
	public void practice6() {
		String[] day = {"��", "ȭ", "��", "��", "��", "��", "��"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int input = sc.nextInt();
		
		if (input >= 7) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�."); return;
		} for (int i = 0; i <= input; i++) {
			if (input == i) {
				System.out.println(day[i] + "����");
			}	
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int[] input = new int[sc.nextInt()];
		int sum = 0;
		
		for (int i = 0; i < input.length; i++) {
			System.out.printf("�迭 %d��° �ε����� ���� �� : \n", i);
			input[i] = sc.nextInt(); sum += input[i];
		} System.out.println(Arrays.toString(input));
		System.out.println("�� �� : " + sum);
	}
		
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("3 �̻��� Ȧ�� ���� : ");
			int input = sc.nextInt();
			if (input % 2 == 0 || input < 3) {
				System.out.println("�ٽ� �Է��ϼ���."); continue;
			} int[] iArr = new int[input];
			 for (int i = 0; i < iArr.length; i++) {
				 if (i > iArr.length / 2) iArr[i] = iArr.length - i;
				 else iArr[i] = i + 1;
			 } System.out.println(Arrays.toString(iArr)); return;
		}
	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"���", "����", "����", "�Ķ��̵�"};
		
		System.out.println(Arrays.toString(chicken));
		System.out.print("ġŲ �̸��� �Է��ϼ���. : ");
		String inputChicken = sc.next();
		int i;
		
		for (i = 0; i < chicken.length; i++) {
			if (inputChicken.equals(chicken[i])) {
				System.out.println(inputChicken + "ġŲ ��� ����");
				return;
			} 
		} if (i == chicken.length) System.out.println(inputChicken + "ġŲ�� ���� �޴��Դϴ�.");
		
		
		
	}
	
	public void practice10() {
		int[] nums = new int[10];
				
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 10) + 1;
			nums[i] = rn;
		} System.out.println(Arrays.toString(nums));
	}
	
	public void practice11() {
		int[] nums = new int[10];
				
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 10) + 1;
			nums[i] = rn;
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					System.out.println("�ߺ� �߻�");
					i--; break;
				}
			}
		} System.out.println(Arrays.toString(nums));
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է�(-����) : ");
		String input = sc.next();
		
		char[] origin = new char[input.length()];
		char[] copy = origin;
		
		for (int i = 0; i < origin.length; i++) {
			origin[i] = input.charAt(i);
			System.out.print(origin[i]);
		} System.out.println();
		for (int i = 0; i < copy.length; i++) {
			if(i < 8) System.out.print(copy[i]);				
			 else System.out.print("*");
		}
		

		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 45) + 1;
			nums[i] = rn;
			for (int j = 0; j < i; j++) { 
				if (nums[i] == nums[j]) { 
					i--; break;
				}
			}
		} Arrays.sort(nums);
		 System.out.println(nums);
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : "); String input1 = sc.next();
		char[] str = new char[input1.length()];
		int count = 0;
		int i = 0;;
		int j = 0;
		for (i = 0; i < str.length; i++) {
			str[i] = input1.charAt(i);
			for (j = 0; j < i; j++) { 
				if (str[i] == str[j]) break;
			} if (j == i) count++;
		} 
		
		System.out.print("���ڿ��� �ִ� ���� : " + Arrays.toString(str));
		System.out.println();
		System.out.println("���� ���� : " + count);
		
		
	}
	
	public void practice15() { // ���� ����
		// 1. ����ڿ��� �迭�� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��Ͻÿ� : ");
		int size = sc.nextInt();
		sc.nextLine(); // ���� ����
		
		// 2. �Է¹��� ���� ��ŭ�� ���ڿ� �迭 ���� �� �Ҵ�
		String[] arr = new String[size];
		
		// 3. �� �ε����� ���� ����ڿ��� �Է¹ޱ�
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "��° ���ڿ� : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			/*String str = sc.nextLine();
			str.toUpperCase().equals("Y");
			str.equalsIgnoreCase("Y");*/
			
			if (ch == 'y' || ch == 'Y') {
				
				System.out.print("�� �Է��ϰ� ���� ���� : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // ���� ����
				
				String[] newArr = new String[arr.length + addSize];
				
				for (int i = 0; i < newArr.length; i++) {
					if (i < arr.length) {	// ������ �迭�� ���� �����ϰ�
						newArr[i] = arr[i];	
					} else {		// �� �Ŀ��� �ٽ� �Է¹޵���
						System.out.print(i + 1 + "��° ���ڿ� : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr; // ���� �迭�� ���ο� �迭�� �ּҰ� ���� --> ���� �迭 ������� ��
				
			} else {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
					
			
			
			
			

			
		
		
			
		
		
	
	
		
	
	
}


