package com.kh.part02.personMVC.controller;

import com.kh.part01.object_vs_objectArray.model.vo.Person;

public class PersonController {
	
	private Person[] people = new Person[3];
	private int count = 0; // 현재 저장 된 인원을 나타내는 변수

	// 회원 정보를 추가하는 기능을 하는 메소드
	public int insertPerson(String name, int age, int wealth) {
		if (count < people.length) {
			people[count++] = new Person(name, age, wealth);
			return 1; // 회원 등록 성공			
		}
		return 0; // count가 배열 index를 넘어서 회원 등록 실패
	}

	// 배열에 담겨 있는 회원 정보를 조회하기 위한 메소들
	// 출력은 view에서 할것이니 객체 배열의 주소값만 리턴해줌
	public Person[] printPerson() {
		return people;
	}
	
	// 현재 등록되어 있는 회원의 수를 반환하는 메소드
	public int getCount() {
		return count;
	}

	// 매개변수로 전달 받은 회원 이름과 일치하는 회원 객체 주소값 반환
	public Person searchPerson(String search) {
		Person searchPerson = null;

		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(search));{
				searchPerson = people[i];				
			}
		}
		return searchPerson;
	}

	// 현재 회원의 평균 재산 값을 리턴해주는 메소드
	public int avgWealth() {
		int sum = 0;
		if (count == 0) { // 0으로 나누는 에러를 방지하기 위해
			return sum; // 등록된 회원이 없으면 0을 리턴
		} else {
			for (int i = 0; i < count; i++) {
				sum += people[i].getWealth();
			}			
		}
		return sum / count;
	}

	/* 전달 받은 키워드를 "포함"한 회원 객체들을 리턴 */
	public Person[] searchPerson2(String search) {
		Person[] searchPerson = new Person[3];
		
		int index = 0;	//searchPerson의 인덱스 
		
		for(int i = 0; i < count; i++) {
			// equals - 문자열 일치
			// contains - 문자열 포함
			if(people[i].getName().contains(search)) {
				searchPerson[index++] = people[i];
			}
		}
		
		return searchPerson;
	}
}
