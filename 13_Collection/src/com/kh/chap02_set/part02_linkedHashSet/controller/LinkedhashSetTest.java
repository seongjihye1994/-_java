package com.kh.chap02_set.part02_linkedHashSet.controller;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class LinkedhashSetTest {
	// HashSet과 거의 동일하지만, 추가할 떄 순서를 유지하면서 저장함
	public void doLinkedHashSet() {
		System.out.println("========== LinkedHashSet 테스트 ==========");
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		lhs.add(new Student("김영희", 80));
		lhs.add(new Student("한영희", 100));
		lhs.add(new Student("박영희", 60));
		lhs.add(new Student("박영희", 60));
		System.out.println(lhs);
		
//		[Student [name=김영희, score=80], Student [name=한영희, score=100], Student [name=박영희, score=60]]
		// 추가하는 순서도 저장하고, 중복값은 저장하지 않음!
		// hashCode() 이미 오버라이딩 되어 있으므로 중복 객체(필드 값이 같은 동등 객체)를 제거함!
		
		Iterator<Student> it = lhs.iterator();
		while(it.hasNext()) { // 다음 값이 있냐?
			System.out.println(it.next()); // 있으면 다음 값을 가져와
		}
		
		// ListIterator : list에서만 구현 가능한 양방향 Iterator
		System.out.println("============= ListIterator =============");
		List<Student> list = new ArrayList<>();
		list.addAll(lhs);	// LinkedHashSet이 가지고 있는 Student 3명의 데이터를 List화
		
		ListIterator<Student> lit = list.listIterator();
		
		
		while(lit.hasNext()) {
			System.out.println(lit.next()); // 기존과 동일한 순방향
		}
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()); // 뒤에서 앞으로 진행하는 역방향
		} // 역방향 코드가 순방향 코드보다 위로 올라가면 실행이 안됨
		// 커서가 맨 앞에 있는데 이전 값이 있냐고 물어보니 값이 없으니 출력이 안되는것
		
		
		
		
	}

}
