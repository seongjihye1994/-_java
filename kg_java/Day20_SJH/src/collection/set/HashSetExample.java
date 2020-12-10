package collection.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		// *** HashSet 클래스는 Set 이라는 인터페이스를 구현한 클래스입니다.
		// 저장된 객체의 순서를 보장하지 않고, 중복 또한 허용하지 않습니다.
		
		// Set 인터페이스를 구현한 클래스 중 대표적으로 사용하는 클래스 중 하나입니다.
		
		Set<String> set = new HashSet<>();
		
		// 1. Set에 객체를 추가하는 메서드 : 변수명.add(객체)
		set.add("김밥");set.add("김말이");set.add("떡볶이");
		set.add("단무지");set.add("김말이"); // set은 중복 저장을 허용하지 않습니다.
		
		System.out.println(set); // toString()이 오버라이딩 되어있기 때문에 그냥 변수명만 적어줘도 된다.
		// [김밥, 김말이, 단무지, 떡볶이]
		// 각 요소들을 인덱스번호로 생각하면 안된다! 또한 값의 중복을 허용하지 않는다!
		
		// 2. set에 저장된 객체의 수를 알아보는 메서드 : 변수명.size();
		System.out.println("set에 저장된 객체 수 : " + set.size()); // 4
		
		// 3. set의 객체 데이터를 검색하려면 '반복자(Iterator)'를 통해
		//    모든 객체를 대상으로 한번씩 반복해서 꺼내봐야 합니다.
		Iterator<String> iter = set.iterator();
		
		// Iterator의 next()메서드는 set에 저장된 객체를 하나씩 꺼내옵니다.
//		String s1 = iter.next(); // String을 타입으로 받는다.
//		System.out.println(s1); // 김밥
//		String s2 = iter.next(); 
//		System.out.println(s2); // 김말이
//		String s3 = iter.next(); 
//		System.out.println(s3); // 단무지
//		String s4 = iter.next(); 
//		System.out.println(s4); // 떡볶이
//		
//		String s5 = iter.next(); // NoSuchElementException 에러!, Iterator의 next()메서드는 set객체 안에 더이상 조회할 요소가 없으면 에러가뜹니다.
//		System.out.println(s5); 
		
		// 반복자 객체의 next()를 통해 set의 내부 데이터를
		// 반복 조회할 때, 더 이상 조회할 데이터가 없으면 예외를 발생시킵니다.
		
		// 그렇기 때문에 hasNext() 메서드를 통해 set에서 데이터를
		// 더 조회할 수 있는지의 여부를 항상 체크해야 합니다.
		
		// 반복문을 통한 객체 꺼내기
		while(iter.hasNext()) { // 조회할 값이 없어지면 f가 되고 반복문 종료됨.
			System.out.println(iter.next());
		}
		
		System.out.println("---------------------------------");
		
		// set에 있는 데이터를 쉽게 뽑는법!
		for (String s : set) { // 향상 for문 안에는 hasNext()메서드가 이미 포함되어 있기 때문에 다른 조건식을 적어주지 않아도 된다.
			System.out.println(s);
		}
		
		// 4) set의 데이터 삭제 : 변수명.remove(삭제할 객체)
		set.remove("단무지");		
		System.out.println(set);
	
		// 5) set을 list로 변환하는 방법.
		List<String> list = new ArrayList<>(set); // 1) 리스트 객체 생성  2) set의 객체를 ArrayList의 매개변수로 전달
		System.out.println(list);
		System.out.println(list.get(2));
		
		// 6) set의 데이터 전체 삭제 : 변수명.clear()
		set.clear();
		System.out.println(set);
		
		
	
	}

}
