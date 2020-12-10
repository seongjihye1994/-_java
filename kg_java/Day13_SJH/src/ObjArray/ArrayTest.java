package ObjArray;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남자"); // 생성자에 값 똑같이 넣어줘야 함
//		Person lee = new Person("이영희", 25, "여자");
//		Person hong = new Person("홍길동", 50, "남자");
		
//		kim.setName(name);
//		kim.setAge(age);
//		kim.setGendor(gendor);
		// 변수가 많으면 다 쓰기 귀찮으니까, 생성자 안에서 art + shift + s로 generate constructor로 한 번에 생성자에 필드값을 초기화 하면, main 메서드에서 굳이 멤버변수를 하나하나 초기화하지 않아도 된다.
		
		Person[] persons = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("홍길동", 50, "남자"),
		};

		//System.out.println(Arrays.toString(persons)); // 배열 내부에 객체 자체가 들어있는 것이 아니라, 객체의 주소값이 들어있음!
		//System.out.println(persons[0]); // 주소값을 가지고 객체에 접근
		
		// 객체의 배열화
		//Person[] persons = {kim, lee, hong};
		
//		kim.personInfo();
//		lee.personInfo();
//		hong.personInfo();
		
		// 반복문을 통한 객체 정보 출력
//		for(int i = 0; i < persons.length; i++) {
//			persons[i].personInfo();
//		}
		
		// 향상 for문
		for (Person p : persons) { // Person 타입
			p.personInfo(); // p 에 인덱스가 차례대로 들어오면서 메서드를 호출함.
		}

		
		
	}

}
