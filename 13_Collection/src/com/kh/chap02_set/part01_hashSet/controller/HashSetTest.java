package com.kh.chap02_set.part01_hashSet.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

/*
 * Set 계열의 특징 : 순서 유지 x, 중복 저장 x
 * Set 계열의 종류 : HashSet, LinkedSet, TreeSet
*/
public class HashSetTest {
	public void doHashSet() {
		// Set은 인터페이스이므로 객체 생성 불가
		// Set set = new Set(); => x
		
		// Set의 후손 클래스로 객체 생성 (다형성)
		// Set set = new HashSet();
		
		System.out.println("=============== String 클래스로 테스트 ===============");
		HashSet<String> set = new HashSet<>();
		String str1 = "안녕하세요";
		set.add(str1);
		set.add("우리는 지금");
		set.add("Set 공부중!");
		System.out.println(set); // set.toString();
//		=============== String 클래스로 테스트 ===============
//				[Set 공부중!, 안녕하세요, 우리는 지금]
		// 순서 유지 x
		
		String str2 = "안녕하세요";
		set.add(str2);
		System.out.println(set);
		// [Set 공부중!, 안녕하세요, 우리는 지금]
		// 중복된 값 '안녕하세요'는 추가하지 않음
		// 중복 저장 x
		
		// Student -> list basic에서 복사해오기
		System.out.println("=============== Student 클래스로 테스트 ===============");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set에 인스턴스 추가
		hs.add(new Student("김영희", 80));
		Student s1 = new Student("한영희", 100);
		hs.add(s1);
		hs.add(new Student("박영희", 60));
		hs.add(new Student("이영희", 60));
		System.out.println(hs); // -> add 순서 유지되지 않음
		
		Student s2 = new Student("한영희", 100);
		hs.add(s2);
		System.out.println(hs); // -> 중복 값 제거되지 않음
		// why? Object의 hashCode() 를 사용중이라 주소 값이 다르면 다른 객체로 인식
		// s1과 s2의 필드값이 같지만, 다른 객체이므로 다르다고 인식함 (동등객체 : 주소값 다르지만 필드값 같음)
		// Student 클래스에 hashCode를 오버라이딩하여 필드 값이 같은 동등객체로
		// 같은 hashCode 값을 리턴하도록 수정
		// 동일객체는 주소값이 같음!
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.hashCode()); // 1829164700
		System.out.println(s2.hashCode()); // 118352462
		
		// Student 클래스에 hashCode를 오버라이딩 해 주면
		// System.out.println(s1.equals(s2)); // true 값이 나오고
		// 아까 동일 필드를 추가했던 한영희는 추가되어있지 않음
		
		System.out.println("=============== HashSet 출력 테스트 ===============");
		// 리스트는 인덱스가 있어서 list.get(index)로 값을 하나하나 가져올 수 있찌만
		// hashSet은 인덱스가 없으므로 get(index)를 이용한 일반 for문은 사용 불가
		// (1) for Each문 (향상 for문)은 사용 가능!
		for (com.kh.chap02_set.part01_hashSet.model.vo.Student st : hs) {
			System.out.println(st);
		}
		
		System.out.println("=================================");
		// (2) Iterator(반복자) 메소드 사용 가능!
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()) { // it에 다음 값이 있느냐?
			//System.out.println(it.next()); // 단순 출력
			Student st = it.next(); // Student 객체에 담기
			System.out.println(st);
		}
		
		
		
		
		
		
	}

}
