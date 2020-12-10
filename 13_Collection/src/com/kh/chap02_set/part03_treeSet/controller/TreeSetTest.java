package com.kh.chap02_set.part03_treeSet.controller;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part03_treeSet.model.vo.Student;

public class TreeSetTest {
	public void doTreeSet() {
		System.out.println("========== Integer 클래스로 테스트 ==========");
		TreeSet set = new TreeSet();
		set.add(new Integer(10));
		set.add(new Integer(5));
		set.add(15);	// int -> Integer 오토 박싱
//		set.add("끝");
		// 실행 시 에러 : 정렬 기준을 가지고 저장하므로 같은 타입이 아닌 값이 들어오면
		// java.lang.ClassCastException 발생
		// -> 한가지 타입의 자료형만 저장 가능
		
		// Iterator 이용해서 출력
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// Integer 클래슥 내부적으로 가지고 있는 기준인 오름차순으로 정렬 됨
//		5
//		10
//		15
		// 가장 먼저 들어온 10을 기준으로 작고 큼을 나누어 트리(계열)를 나눔
		
		System.out.println("================== Student 클래스로 테스트 ==================");
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student("김영희", 80));
		ts.add(new Student("한영히", 100));
		ts.add(new Student("박영희", 60));
		// TreeSet 정렬 기준에 있어서 동일한 값이 들어오면?
		// => 중복을 제거함
		ts.add(new Student("박영희", 90)); // -> 이름 오름차순의 경우 중복으로 간주
		ts.add(new Student("이영희", 60)); // -> 성적순의 경우 중복으로 간주
		
		Iterator<Student> it2 = ts.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		} // java.lang.ClassCastException 발생
		// Student 클래스를 TreeSet으로 담을 때 어떤 기준으로 담을 지를 정해주지 않아서 에러 발생
		// Tree 구조는 어떠한 정렬 기준을 가지고 저장됨
		// 해당 기준을 정의해주어야 함 => implements Comparable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
