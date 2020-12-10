package com.kh.part02.personMVC.view;

import java.util.Scanner;

import com.kh.part01.object_vs_objectArray.model.vo.Person;
import com.kh.part02.personMVC.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		// 3. 메인 메뉴 작성
		while(true) {
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 전체 조회");
			System.out.println("3. 회원 이름 검색");
			System.out.println("4. 회원 평균 재산 조회");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
			switch(menu) {
			case 1 : insertPerson(); break;
			case 2 : printPerson(); break;
			case 3 : searchPerson2(); break;
			case 4 : 
				// 특별히 출력 구문이 많이 필요하지 않아 바로 controller로 재산 평균 값 요청
				System.out.println("평균 재산 : " + pc.avgWealth());
				break;
			case 9 : System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("다시 입력해주세요."); break;
			}
		}
		// 4. 데이터를 담을 model.vo.Person 먼저 만들기
		// 5. 데이터와 사용자의 요청을 처리해 줄 Controller 만들기
	}
	
	// 6. 회원 추가 view
	public void insertPerson() {
		System.out.println("=== 회원 정보 입력 ===");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		System.out.print("재산 : ");
		int wealth = sc.nextInt();
		sc.nextLine();
		
		// Person 객체를 만들지 않고 입력 받은 정보를 Controller로 보내 회원 추가 요청을 함
		int result = pc.insertPerson(name, age, wealth);
		
		// result로 성공 실패 여부 반환 -> 저장 완료 or 저장 실패
		if (result > 0) {
			System.out.println("회원 정보 저장이 완료 되었습니다.");
		} else {
			System.out.println("회원 정보 입력에 실패 하였습니다.");
		}
	
	}
	
	// 7. 회원 정보 출력 view
	public void printPerson() {
		// 모든 회원에 대한 정보를 controller로 요청
		Person[] people = pc.printPerson(); // 객체 배열 반환받음~!
		
		// 현재 회원 수에 대한 정보를 controller로 요청
		// 왜? 회원 정보를 출력하는 부분에 배열의 길이만큼 반복문을 돌면 안되기 때문
		// 배열 인덱스는 3이지만, 회원이 1명만 들어가 있을 수도 있기 때문
		int count = pc.getCount(); // 회원 수 반환받음~!
		
		if (count == 0) {
			System.out.println("현재 등록 된 회원이 없습니다.");
		} else {
			for (int i = 0; i < count; i++ ) {
				System.out.println(people[i].infor());				
			}
		}
	}
	
	// 8. 회원 정보 검색 view
	public void searchPerson() {
		System.out.println("검색할 이름 : ");
		String search = sc.nextLine();
		
		Person searchPerson = pc.searchPerson(search); // 검색한 회원 정보 반환받음~!
	
		if (searchPerson != null) {
			System.out.println(searchPerson.infor());
		} else { // 검색했을 때 해당 이름을 가진 회원이 없으면 null로 반환받음
			System.out.println("검색된 사람이 없습니다.");
		}
	}
	
	// 9. 회원 검색2 (키워드 포함 시 출력)
		public void searchPerson2() {
			System.out.print("검색할 이름 : ");
			String search = sc.nextLine();
			
			Person[] searchPerson = pc.searchPerson2(search);
			
			if (searchPerson[0] != null) {
				for (int i = 0; i < pc.getCount(); i++) {
					if (searchPerson[i] != null)	// 검색 된 인원이 적으면 뒤의 인덱스가 null이어서 에러 발생할 수 있으므로
						System.out.println(searchPerson[i].infor());
				}
			} else {
				System.out.println("검색 된 사람이 없습니다.");
			}
	
	
		}
}
