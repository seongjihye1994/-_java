package obj_array;

import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		
//		Person kim = new Person("김철수", 32, "남자");
//		Person lee = new Person("이영희", 25, "여자");
//		Person hong = new Person("홍길동", 50, "남자");
		
//		kim.personInfo();
//		lee.personInfo();
//		hong.personInfo();
		
//		int[] arr = new int[5];
		
//		Person[] people = new Person[3];
//		people[0] = kim;
//		people[1] = lee;
//		people[2] = hong;
		
		Person[] people = {
				new Person("김철수", 32, "남자"),
				new Person("이영희", 25, "여자"),
				new Person("홍길동", 50, "남자")
		};
		
//		System.out.println(people[0]);
		
//		for(int i=0; i<people.length; i++) {
//			people[i].personInfo();
//		}
		
		for(Person p : people) {
			p.personInfo();
		}
		
		
		
		
		
		
		

	}

}
