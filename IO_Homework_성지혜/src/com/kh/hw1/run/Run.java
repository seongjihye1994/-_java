package com.kh.hw1.run;

import java.util.Scanner;

import com.kh.hw1.model.dao.FileDao;

public class Run {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		FileDao fd = new FileDao();
		
		// �ݺ����� ���� �޴� ����
		while(true) {
			System.out.println("****** MyNote ******");
			System.out.println("1. ��Ʈ ���� �����"); // fileSave
			System.out.println("2. ��Ʈ ����"); // fileOpen
			System.out.println("3. ��Ʈ ��� �����ϱ�"); // fileOpen + fileSave
			System.out.println("4. ������");
			
			System.out.println("��ȣ�� �Է��ϼ���. : ");
			int menu = sc.nextInt();
			
			switch (menu) {
			case 1: fd.fileSave(); break;
			case 2: fd.fileOpen(); break;
			case 3: fd.fileEdit(); break;
			case 4: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է��ϼ̽��ϴ�."); continue;
			}
			
			
		}
		

	}

}
