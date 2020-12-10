package com.kh.test;

import com.kh.test.person.model.vo.Person;

public class Test {

	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		pArr[0] = new Person("이름1", 'f');
		pArr[1] = new Person("이름2", 'm');
		pArr[2] = new Person("이름3", 'f');
		
		for (int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
				
		
	}
}
