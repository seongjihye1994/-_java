package mvc.view;

import java.util.Scanner;

import mvc.controller.LibraryManager;
import mvc.model.vo.Book;
import mvc.model.vo.Member;

public class LibraryMenu {
	
	LibraryManager lm = new LibraryManager();
	public static Scanner sc = new Scanner(System.in);
	public static int idx = 0;
	
	public void mainMenu() {
		
		System.out.print("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
			
		while (true) {
			System.out.println("=== �޴� ===");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.println("���Ͻô� �޴��� �Է��ϼ���. : ");
			int inputMenu = sc.nextInt();
			
			switch (inputMenu) {
			case 1: lm.myPage(); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default :
				System.out.println("���� �޴��Դϴ�."); break;
			} break;
		}
	}

	

	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			if (bList[i] != null) {
				System.out.printf("%d�� ���� : ", i);
				System.out.println(bList[i].toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� �Է� : ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		for (Book sl : searchList) {
			if (sl == null) break;
			System.out.println(sl.toString());
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.println("�뿩�� ���� ��ȣ ���� : ");
		int index = sc.nextInt();
		int result = lm.rentBook(index);
		if (result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		} else if (result == 1) {
			System.out.println("���� �������� �뿩 �Ұ��մϴ�.");
		} else {
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�. ������������ ���� Ȯ���ϼ���.");
		}
	}


	
	
	

	
	
	
	

}
