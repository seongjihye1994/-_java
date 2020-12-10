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
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
			
		while (true) {
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.println("원하시는 메뉴를 입력하세요. : ");
			int inputMenu = sc.nextInt();
			
			switch (inputMenu) {
			case 1: lm.myPage(); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default :
				System.out.println("없는 메뉴입니다."); break;
			} break;
		}
	}

	

	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for (int i = 0; i < bList.length; i++) {
			if (bList[i] != null) {
				System.out.printf("%d번 도서 : ", i);
				System.out.println(bList[i].toString());
			}
		}
	}
	
	public void searchBook() {
		System.out.print("검색할 제목 키워드 입력 : ");
		String keyword = sc.nextLine();
		Book[] searchList = lm.searchBook(keyword);
		for (Book sl : searchList) {
			if (sl == null) break;
			System.out.println(sl.toString());
		}
	}
	
	public void rentBook() {
		selectAll();
		System.out.println("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lm.rentBook(index);
		if (result == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		} else if (result == 1) {
			System.out.println("나이 제한으로 대여 불가합니다.");
		} else {
			System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다. 마이페이지를 통해 확인하세요.");
		}
	}


	
	
	

	
	
	
	

}
