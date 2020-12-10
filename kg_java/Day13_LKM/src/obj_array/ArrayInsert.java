package obj_array;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		/*
		 1. Person 객체를 생성하기 위해 필요한 회원 정보를
		  스캐너를 통해 입력 받으세요. (이름, 나이, 성별)
		  
		 2. 입력받은 정보를 토대로 Person 객체를 생성하세요.
		 
		 3. 입력은 배열의 크기만큼 받도록 하겠습니다.
		  배열의 크기는 넉넉하게 100으로 하겠습니다.
		  
		 4. 사용자가 이름을 작성하는 란에 "그만" 이라고 입력했을 시
		  입력을 중지하고 반복문을 탈출시켜 주세요.
		  
		 5. 입력받은 정보를 토대로 만들어진 Person 객체를 배열에 보관하세요.
		  배열이 가득 차거나 입력이 종료되면 생성한 객체들의 personInfo()를
		   반복문을 이용해서 출력해 주세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		Person[] people = new Person[100];
		
		for(int i=0; i<people.length; i++) {
			System.out.println("*** 회원 정보 입력 ***");
			System.out.print("이름: ");
			String name = sc.next();
			if(name.equals("그만")) {
				System.out.println("입력을 중지합니다.");
				break;
			}
			
			System.out.print("나이: ");
			int age = sc.nextInt();
			
			System.out.print("성별: ");
			String gender = sc.next();
			
			people[i] = new Person(name, age, gender);
			System.out.println("회원 정보 입력 성공!");
			System.out.println("==============================");
			
		}
		
		System.out.println("\n\n*** 회원 정보 ***");
		for(Person p : people) {
			if(p == null) break;
			p.personInfo();
			System.out.println("--------------------------");
		}
			
		sc.close();
		
		
		
		
		
		
		

	}

}
