package com.kh.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "�Ӽ���." : "����� �ƴϴ�.";
		System.out.println(result);
		
		
	}
	
	public void practice2( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input > 0) ? "�Ӽ���." : "������.";
		System.out.println(result);
		
	}
	
	public void practice3( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int input = sc.nextInt();
		
		String result = (input % 2 == 0) ? "¦����." : "Ȧ����.";
		System.out.println(result);
		
	}
	
	public void practice4( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� �Է� : ");
		int inputPeople = sc.nextInt();
		System.out.print("���� ���� �Է� : ");
		int inputCandy = sc.nextInt();
		
		System.out.printf("1�δ� ���� ���� : %d��\n" , inputCandy / inputPeople);
		System.out.printf("���� ���� ���� : %d��\n", inputCandy % inputPeople);
		
		
	}
	
	public void practice5( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		
		System.out.print("��(���ڸ�) : ");
		int myClass = sc.nextInt();
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		System.out.print("����(M/F) : ");
		char gender = (sc.next().charAt(0) == 'F') ? '��' : '��';
		
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double score = sc.nextDouble();
		
		System.out.printf("%d�г� %d�� %d�� %s %c�л��� ������ %.2f�̴�.\n"
				, grade, myClass, num, name, gender, score);
		
		
		
	}
	
	public void practice6( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		
		String result = age > 19 ? "����" : ((age > 13 && age <= 19) ? "û�ҳ�" : "���");
		System.out.println(result);
	}
	
	public void practice7( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.print("�������� �Է� : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3;
		
		System.out.printf("�հ� : %d\n", tot);
		System.out.printf("��� : %.2f\n", avg);
		
		String result = (tot >= 40 && avg >= 60) ? "�հ�" : "���հ�";
		System.out.println(result);
	
		
		
	}
	
	public void practice8( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(-����) : ");
		char primeNum = sc.nextLine().charAt(7);
		
		String result = (primeNum == '2') ? "����" : "����";
		System.out.println(result);
		
	
		
		
	}
	
	public void practice9( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� 1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("�� �ٸ� �� �Է� : ");
		int anotherNum = sc.nextInt();
		
		boolean isTrue = (anotherNum <= num1 || anotherNum > num2) ? true : false;
		System.out.println(isTrue);
		
		
	}
	
	public void practice10( ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 �Է� : ");
		int num1 = sc.nextInt();
		System.out.print("����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.print("����3 �Է� : ");
		int num3 = sc.nextInt();
		
		boolean isTrue = (num1 == num2 && num1 == num3);
		System.out.println(isTrue);
	
	
		
		
	}

}
