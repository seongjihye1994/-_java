package com.kh.chap01_list.part03_sort.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.chap01_list.part03_sort.model.comparator.AscName;
import com.kh.chap01_list.part03_sort.model.comparator.AscScore;
import com.kh.chap01_list.part03_sort.model.comparator.DescName;
import com.kh.chap01_list.part03_sort.model.comparator.DescScore;
import com.kh.chap01_list.part03_sort.model.vo.Student;

public class StudentController {

	public void testSort() {
		ArrayList<Student> sl = new ArrayList</*Student*/>(); // 제네릭스 생략해도 추론 가능
		sl.add(new Student("박영희", 80));
		sl.add(new Student("김영희", 60));
		sl.add(new Student("한영희", 100));
		
		System.out.println("==== 전체 리스트 출력 ====");
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// java.util.Comparator - compare()
		// 새로운 class를 생성하여 Comparator를 상속 받아 compare() 메소드를 오버라이딩하여
		// 기존의 정렬 기준 재정의 -> 여러 개의 정렬 기준 만들 수 있음
		System.out.println("===== Comparator =====");
		System.out.println("===== 점수 오름차순 정렬 =====");
		// AscScore 클래스 만들기		
		// Collections.sort(sl, new AscScore());
		sl.sort(new AscScore());
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// DescScore 클래스 만들기
		System.out.println("===== 점수 내림차순 정렬 =====");
//		 Collections.sort(sl, new DescScore());
		sl.sort((new DescScore()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// AscName 클래스 만들기
		System.out.println("==== 이름 오름차순 정렬 ====");
//		 Collections.sort(sl, new AscName());
		sl.sort((new AscName()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// DescName 클래스 만들기
		System.out.println("==== 이름 내림차순 정렬 ====");
//		Collections.sort(sl, new DescName());
		sl.sort((new DescName()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		
		// java.lang.Comprabele - compareTo()
		// 정렬하고자 하는 객체에 Comparable 상속 받아 compareTo() 메소드 오버라이딩 해서
		// 기존의 정렬 기준 재정의 -> 한개의 정렬 기준만 가능
		// 등수 구현하기 ( = 점수 내림차순)
		System.out.println("==== Comparable ====");
		System.out.println("==== 등수 ====");
		Collections.sort(sl);
		// sl.sort(); -> x : Comparator를 매개변수로 받는 메소드만 정의 되어 있음
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// **** 주의할 점 ****
		// sort() 메소드 실행 시 원본 리스트가 변경되므로
		// 원본 리스트의 변경 없이 sort()를 하고 싶다면 사본 리스트를 만들어서
		// 사본 리스트에 sort() 를 적용해야함
		
		
		
		
		
		
	}

}
