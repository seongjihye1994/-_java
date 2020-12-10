package com.kh.part02.personMVC.controller;

import com.kh.part01.object_vs_objectArray.model.vo.Person;

public class PersonController {
	
	private Person[] people = new Person[3];
	private int count = 0; // ���� ���� �� �ο��� ��Ÿ���� ����

	// ȸ�� ������ �߰��ϴ� ����� �ϴ� �޼ҵ�
	public int insertPerson(String name, int age, int wealth) {
		if (count < people.length) {
			people[count++] = new Person(name, age, wealth);
			return 1; // ȸ�� ��� ����			
		}
		return 0; // count�� �迭 index�� �Ѿ ȸ�� ��� ����
	}

	// �迭�� ��� �ִ� ȸ�� ������ ��ȸ�ϱ� ���� �޼ҵ�
	// ����� view���� �Ұ��̴� ��ü �迭�� �ּҰ��� ��������
	public Person[] printPerson() {
		return people;
	}
	
	// ���� ��ϵǾ� �ִ� ȸ���� ���� ��ȯ�ϴ� �޼ҵ�
	public int getCount() {
		return count;
	}

	// �Ű������� ���� ���� ȸ�� �̸��� ��ġ�ϴ� ȸ�� ��ü �ּҰ� ��ȯ
	public Person searchPerson(String search) {
		Person searchPerson = null;

		for (int i = 0; i < count; i++) {
			if (people[i].getName().equals(search));{
				searchPerson = people[i];				
			}
		}
		return searchPerson;
	}

	// ���� ȸ���� ��� ��� ���� �������ִ� �޼ҵ�
	public int avgWealth() {
		int sum = 0;
		if (count == 0) { // 0���� ������ ������ �����ϱ� ����
			return sum; // ��ϵ� ȸ���� ������ 0�� ����
		} else {
			for (int i = 0; i < count; i++) {
				sum += people[i].getWealth();
			}			
		}
		return sum / count;
	}

	/* ���� ���� Ű���带 "����"�� ȸ�� ��ü���� ���� */
	public Person[] searchPerson2(String search) {
		Person[] searchPerson = new Person[3];
		
		int index = 0;	//searchPerson�� �ε��� 
		
		for(int i = 0; i < count; i++) {
			// equals - ���ڿ� ��ġ
			// contains - ���ڿ� ����
			if(people[i].getName().contains(search)) {
				searchPerson[index++] = people[i];
			}
		}
		
		return searchPerson;
	}
}
