package com.kh.chap01.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("9. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ��� : ");
		
		int input = sc.nextInt();
		
		String result = "";
		
		switch (input) {
		case 1 :
			result = "�Է�";
			break;
		case 2 :
			result = "����";
			break;
		case 3 :
			result = "��ȸ";
			break;
		case 4 :
			result = "����";
			break;
		case 9 :
			result = "����";
			break;
		default :
			System.out.println("���� ��ȣ�Դϴ�.");
		}
		
		System.out.println(result + " �޴��Դϴ�.");
		
	}
	
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �� �� �Է��ϼ���. : ");
		int input = sc.nextInt();
		
		String result = "";
		
		if (input < 0) result = "����� �Է����ּ���.";
		else if (input % 2 == 0 && input > 0) result = "¦����.";
		else result = "Ȧ����";

		System.out.println(result);
		
		
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������� : ");
		int kor = sc.nextInt();
		System.out.println("�������� : ");
		int eng = sc.nextInt();
		System.out.println("�������� : ");
		int mat = sc.nextInt();
		
		int tot = kor + eng + mat;
		double avg = tot / 3;
		
		if (kor > 40 && eng > 40 && mat > 40) {
			if (tot >= 60) {
				System.out.printf("���� : %d\n", kor);
				System.out.printf("���� : %d\n", eng);
				System.out.printf("���� : %d\n", mat);
				System.out.printf("�հ� : %d\n", tot);
				System.out.printf("��� : %.2f\n", avg);
				System.out.println("�����մϴ�, �հ��Դϴ�.");
			}
		}else System.out.println("���հ��Դϴ�.");
		
		
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String result = "";
		
		switch (month) {
		case 12 :
		case 1 :
		case 2 :
			result = "�ܿ�";
			break;
		case 3 :
		case 4 :
		case 5 :
			result = "��";
			break;
		case 6 :
		case 7 :
		case 8 :
			result = "����";
			break;
		case 9 :
		case 10 :
		case 11 :
			result = "����";
			break;
		default :
			System.out.printf("%d���� �߸� �Էµ� ���Դϴ�.\n", month);
		}
		System.out.printf("%d���� %s �Դϴ�.\n", month, result);
		
		
	}
	
	public void practice5 () {
		Scanner sc = new Scanner(System.in);
		
		String ORIGINALID = "hello";
		String ORIGINALPW = "1234";
		
		System.out.println("id �Է� : ");
		String id = sc.nextLine();
		System.out.println("pw �Է� : ");
		String pw = sc.nextLine();
		
		if (!id.equals(ORIGINALID)) System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		else if (!pw.equals(ORIGINALPW)) System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		else System.out.println("�α��� ����!");
		
		
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ���(������/ȸ��/��ȸ��) : ");
		String lv = sc.nextLine();
		
		switch(lv) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		default :
			System.err.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		}

	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű(m) : ");
		double height = sc.nextDouble();
		System.out.println("������ (kg): ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("bmi ���� : " + bmi);
		
		if (bmi < 18.5) System.out.println("��ü��");
		else if (bmi >= 18.5 & bmi < 23) System.out.println("����ü��");
		else if (bmi >= 23 & bmi < 25) System.out.println("��ü��");
		else System.out.println("����");
		
		
		
		
		
	}
	
	public void practice8 () {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ǿ�����1 �Է� : ");
		int input1 = sc.nextInt();
		System.out.println("�ǿ�����2 �Է�: ");
		int input2 = sc.nextInt();
		System.out.println("�����ڸ� �Է� : ");
		char ysj = sc.next().charAt(0);
		
		int result;
		
		switch(ysj) {
		case '/' :
			result = input1 / input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '+' :
			result = input1 + input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '-' :
			result = input1 - input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '*' :
			result = input1 * input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		case '%' :
			result = input1 % input2;
			System.out.printf("%d %c %d = %d\n", input1, ysj, input2, result);
			break;
		default :
			System.out.println("�߸� �Է��߽��ϴ�.");
			return;
		} 
		
	
	
	
	}
		
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰���� ���� : ");
		int mid = sc.nextInt();
		System.out.print("�⸻��� ���� : ");
		int end = sc.nextInt();
		System.out.print("���� ���� : ");
		int homework = sc.nextInt();
		System.out.print("�⼮ Ƚ�� : ");
		int ott = sc.nextInt();
		
		double tot = mid*0.2 + end*0.3 + homework*0.3 + (double)ott;
		int deadline = 70;
		int day = 20;
		int notOtt = day - ott; // �⼮ ���� ��¥
		
		String result = "";
		
		System.out.println("=========���=========");
		System.out.printf("�߰� ��� ����(20) : %.1f\n", mid * 0.2);
		System.out.printf("�⸻ ��� ����(30) : %.1f\n", end * 0.3);
		System.out.printf("���� ����(30) : %.1f\n", homework * 0.3);
		System.out.printf("�⼮ ����(20) : %.1f\n", (double)ott);
		System.out.printf("���� : %.1f\n", tot);
		
		if (tot >= deadline) { 
			if (notOtt <= ott*0.2) {
				result = "PASS";
				System.out.println(result);	
			} else { 
				result = "FAIL"; 
				System.out.printf("%s [�⼮ Ƚ�� ����] (%d/%d)\n", result, ott, day);
			}
		} else if (notOtt >= ott*0.2) { 
			result = "FAIL";
			System.out.printf("%s [�⼮ Ƚ�� ����] (%d/%d)\n", result, ott, day);
			System.out.printf("%s [���� �̴�] (���� %.1f)\n", result, tot);
		} else {
			result = "FAIL";
			System.out.printf("%s [���� �̴�] (���� %.1f)\n", result, tot);			
		}
		

		
	}
	
	public void practice10 () {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass / Fail");
		System.out.println();
		System.out.println("������ ����� �����ϼ���. : ");
		
		int inputMenu = sc.nextInt();
		
		switch(inputMenu) {
		case 1:
			practice1();
			break;
		case 2:
			practice2();
			break;
		case 3:
			practice3();
			break;
		case 4:
			practice4();
			break;
		case 5:
			practice5();
			break;
		case 6:
			practice6();
			break;
		case 7:
			practice7();
			break;
		case 8:
			practice8();
			break;
		case 9:
			practice9();
			break;
		case 10:
			practice10();
			break;
		default :
			System.out.println("���� �޴��Դϴ�.");
			return;
		}
	}
		
		
		
		
		
}
		
		
		
		
		
		
	
	
	


	
	


