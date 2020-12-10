package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Person;
import com.kh.part02.personMVC.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		// 3. ���� �޴� �ۼ�
		while(true) {
			System.out.println("==== �޴� ====");
			System.out.println("1. ȸ�� �߰�");
			System.out.println("2. ȸ�� ��ü ��ȸ");
			System.out.println("3. ȸ�� �̸� �˻�");
			System.out.println("4. ȸ�� ��� ��� ��ȸ");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine(); // ���� ����
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : printPerson(); break;
			case 3 : searchPerson2(); break;
			case 4 : 
				// Ư���� ��� ������ ���� �ʿ����� �ʾ� �ٷ� controller�� ��� ��� �� ��û
				System.out.println("��� ��� : " + pc.avgWealth());
				break;
			case 9 : System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�ٽ� �Է����ּ���."); break;
			}
		}
		// 4. �����͸� ���� model.vo.Person ���� �����
		// 5. �����Ϳ� ������� ��û�� ó���� �� Controller �����
	}
	
	// 6. ȸ�� �߰� view
	public void insertPerson() {
		System.out.println("=== ȸ�� ���� �Է� ===");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		System.out.print("��� : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		// Person ��ü�� ������ �ʰ� �Է� ���� ������ Controller�� ���� ȸ�� �߰� ��û�� ��
		int result = pc.insertPerson(name, age, wealth);
		
		// result�� ���� ���� ���� ��ȯ -> ���� �Ϸ� or ���� ����
		if (result > 0) {
			System.out.println("ȸ�� ���� ������ �Ϸ� �Ǿ����ϴ�.");
		} else {
			System.out.println("ȸ�� ���� �Է¿� ���� �Ͽ����ϴ�.");
		}
	
	}
	
	// 7. ȸ�� ���� ��� view
	public void printPerson() {
		// ��� ȸ���� ���� ������ controller�� ��û
		Person[] people = pc.printPerson(); // ��ü �迭 ��ȯ����~!
		
		// ���� ȸ�� ���� ���� ������ controller�� ��û
		// ��? ȸ�� ������ ����ϴ� �κп� �迭�� ���̸�ŭ �ݺ����� ���� �ȵǱ� ����
		// �迭 �ε����� 3������, ȸ���� 1�� �� ���� ���� �ֱ� ����
		int count = pc.getCount(); // ȸ�� �� ��ȯ����~!
		
		if (count == 0) {
			System.out.println("���� ��� �� ȸ���� �����ϴ�.");
		} else {
			for (int i = 0; i < count; i++ ) {
				System.out.println(people[i].infor());				
			}
		}
	}
	
	// 8. ȸ�� ���� �˻� view
	public void searchPerson() {
		System.out.println("�˻��� �̸� : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search); // �˻��� ȸ�� ���� ��ȯ����~!
	
		if (searchPerson != null) {
			System.out.println(searchPerson.infor());
		} else { // �˻����� �� �ش� �̸��� ���� ȸ���� ������ null�� ��ȯ����
			System.out.println("�˻��� ����� �����ϴ�.");
		}
	}
	
	// 9. ȸ�� �˻�2 (Ű���� ���� �� ���)
		public void searchPerson2() {
			System.out.print("�˻��� �̸� : ");
			String search = sc.nextLine();
			
			Person[] searchPerson = pc.searchPerson2(search);
			
			if (searchPerson[0] != null) {
				for (int i = 0; i < pc.getCount(); i++) {
					if (searchPerson[i] != null)	// �˻� �� �ο��� ������ ���� �ε����� null�̾ ���� �߻��� �� �����Ƿ�
						System.out.println(searchPerson[i].infor());
				}
			} else {
				System.out.println("�˻� �� ����� �����ϴ�.");
			}
	
	
		}
}
