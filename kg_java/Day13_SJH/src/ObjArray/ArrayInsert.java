package ObjArray;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		// 1. Person 객체를 생성하기 위해 필요한 회원 정보를
		// 	    스캐너를 통해 입력 받으세요. (이름, 나이, 성별)
		
		// 2. 입력받은 정보를 토대로 Person 객체를 생성하세요.
		
		// 3. 입력은 배열의 크기만큼 받도록 하겠습니다.
		//    배열의 크기는 넉넉하게 100으로 하겠습니다.
		
		// 4. 사용자가 이름을 작성하는 란에 "그만" 이라고 입력했을 시 
		//    입력을 중지하고 반복문을 탈출시켜 주세요.
		
		// 5. 입력받은 정보를 토대로 만들어진 Person객체를 배열에 보관하세요.
		//    배열이 가득 차거나, 입력이 종료되면 생성한 객체들의 personInfo()를
		//    반복문을 이용해서 출력해 주세요.
		
		// 입력 스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		// 객체 배열 생성
		Person[] p = new Person[100];
		
		// 100개까지 입력받거나, 그만을 입력하면 반복문 탈출
		for(int i = 0; i < p.length; i++) { // 시작과 끝이 명확(배열 100개)하면 while문이 아닌, for문을 사용하는 것을 권장
			System.out.println(" *** 회원 정보 입력 *** ");
			System.out.println("이름 : ");
			String name = sc.next();
			if (name.equals("그만")) break;	
			System.out.println("나이 : ");
			int age = sc.nextInt();
			System.out.println("성별 : ");
			String gendor = sc.next();
			
			Person people = new Person(name, age, gendor); // 객체를 생성해서 입력받은 값을 필드로 저장
			p[i] = people; // 배열 p의 인덱스에 people이 받아온 값을 저장
			// p[i] = new Person(name, age, gendor);
			System.out.println("회원 정보 입력 성공!");
			System.out.println("====================");		
		}
		
		// 변수나 메서드에 static이 붙으면 클래스 변수 or 메서드로 객체 생성 없이 클래스명.변수명 or 메서드명으로 다른 클래스에서 사용할 수 있다.
		// 변수나 메서드에 static가 없으면 인스턴스 변수 or 메서드로 객체를 생성하고 클래스 변수명.멤버변수 or 메서드명으로 다른 클래스에서 사용할 수 있다.
		
		// 회원 정보 출력
		for (Person s : p) {
			if (s != null) {
				s.personInfo();
				System.out.println("--------------------");
			} else break;
		}
		
		sc.close();
		

		
		
		


	}

}
