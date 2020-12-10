package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	// java.util.Scanner��� Ŭ������ �̿��Ͽ�(����Ʈ)
	// Ű����� �Է� �޴� ��� ������

	public void inputScanner1() {
		
		Scanner sc = new Scanner(System.in);
		
		// ������� ������ �Է� �ް� �� �Է� ���� ������ ����ϴ� ���α׷�
		System.out.print("����� �̸��� �����Դϱ�? : ");
		String userName = sc.next(); // next()�� ���� �������� ���ڸ� �޾ƿ�
		System.out.print("����� ���̴� ����Դϱ�? : ");
		int userAge = sc.nextInt();
		System.out.print("����� Ű�� ���Դϱ�?(�Ҽ��� ù���ڸ����� �Է�) : ");
		double userHeight = sc.nextDouble();
		
		System.out.printf("����� �̸��� %s�̰�, ���̴� %d��, Ű�� %.1fcm �Դϴ�.\n", userName, userAge, userHeight);
		
	}
	
	// Scanner ��� ���� ���� �߻��ϴ� ���� �˾ƺ���
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		// sc.nextLine()�� ������ ������ �޼ҵ�� ������ �о���� Ÿ�Կ� �´� ���� �о��
		// * int, double, next �� ������ ���� ����
		// �ش� ���� �о���� �� ����ڰ� �Է��� ���� ���� ���ۿ� �����ְ� ��
		// �ٽø��� ���̸� �Է��� �� sc.nextInt()���� int���� age��� ������ ����ǰ�
		// '����'�� ���ۿ� �����ִ� ���¿��� ������ �ּҰ� �Է��� ���� sc.nextLine() �޼ҵ忡��
		// �Ʊ� ���ۿ� �����־��� '����'�� �ڵ����� �о�ͼ� �Է��� �����ٰ� �����ϰ� �Ѿ�� �� --> address �������� �� ���� ���� ��
		
		// ��� : nextLine() ������ nextLine() ���� �ٸ� �޼ҵ尡 �´ٸ� ���ۿ� �����ִ� ������ �������.
		// nextLine()�� ���͵� �Դ� ģ��~!
		// ���ۿ� �ִ� ������ ����ֱ�!
		sc.nextLine();
		
		System.out.print("�ּ� : ");
		String address = sc.nextLine();
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		
		System.out.printf("%s���� ���̴� %d�� �̸�, �ּҴ� %s�̰�, "
				+ "Ű�� %.1fcm �Դϴ�.\n"
				, name, age, address, height);
		
		
	}
	
	public void inputScanner3() {
		// ���� ����
		String name;
		char gender;
		int age;
		double height;
		
		// Ű����� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ� �Է� ���� �� -> sc.nextLine(), sc.next()
		// ������ �Է� ���� �� -> sc.nextInt()
		// �Ǽ��� �Է� ���� �� -> sc.nextDouble()
		// �� �ۿ� byte, boolean�� �⺻ �ڷ����� �Է� ���� ������ ����������
		// nextXXX() ���·� �޼ҵ� ���
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		
		System.out.print("���� (M/F) : ");
		// gender = sc.nextChar(); // ���Ϲ��ڸ� �Է¹������� �ߴ��� nextChar()��� �޼ҵ�� �������� ����
		gender = sc.nextLine().charAt(0); // ���ڷ� ���� �� �ڸ���
		// sc.nextLine()�� ����� String�� ���� 0��° ���ڸ� ���� (CharAt(0))
		// String�� �������� ���Ϲ���(char)�� �پ��ִ� �����̹Ƿ�,
		// charAt(index)�� �̿��Ͽ� char������ �ٲپ� ��
		// ��ġ �����ϴ� ����� ���ڿ� ���� ���� ���ں��� 0���� �����ؼ� 1�� ������Ű�� ��
		
		System.out.print("���� : ");
		age = sc.nextInt();
		
		System.out.print("Ű : ");
		height = sc.nextDouble();
		
		System.out.printf("%s���� �������� >> "
				+ "���� : %c, ���� : %d��, Ű : %.1fcm�Դϴ�.\n"
				, name, gender, age, height);
		
		
		
	}
	
	

}
