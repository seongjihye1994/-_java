package com.kh.chap02_set.part01_hashSet.controller;

import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

/*
 * Set �迭�� Ư¡ : ���� ���� x, �ߺ� ���� x
 * Set �迭�� ���� : HashSet, LinkedSet, TreeSet
*/
public class HashSetTest {
	public void doHashSet() {
		// Set�� �������̽��̹Ƿ� ��ü ���� �Ұ�
		// Set set = new Set(); => x
		
		// Set�� �ļ� Ŭ������ ��ü ���� (������)
		// Set set = new HashSet();
		
		System.out.println("=============== String Ŭ������ �׽�Ʈ ===============");
		HashSet<String> set = new HashSet<>();
		String str1 = "�ȳ��ϼ���";
		set.add(str1);
		set.add("�츮�� ����");
		set.add("Set ������!");
		System.out.println(set); // set.toString();
//		=============== String Ŭ������ �׽�Ʈ ===============
//				[Set ������!, �ȳ��ϼ���, �츮�� ����]
		// ���� ���� x
		
		String str2 = "�ȳ��ϼ���";
		set.add(str2);
		System.out.println(set);
		// [Set ������!, �ȳ��ϼ���, �츮�� ����]
		// �ߺ��� �� '�ȳ��ϼ���'�� �߰����� ����
		// �ߺ� ���� x
		
		// Student -> list basic���� �����ؿ���
		System.out.println("=============== Student Ŭ������ �׽�Ʈ ===============");
		HashSet<Student> hs = new HashSet<>();
		
		// add(E e) : set�� �ν��Ͻ� �߰�
		hs.add(new Student("�迵��", 80));
		Student s1 = new Student("�ѿ���", 100);
		hs.add(s1);
		hs.add(new Student("�ڿ���", 60));
		hs.add(new Student("�̿���", 60));
		System.out.println(hs); // -> add ���� �������� ����
		
		Student s2 = new Student("�ѿ���", 100);
		hs.add(s2);
		System.out.println(hs); // -> �ߺ� �� ���ŵ��� ����
		// why? Object�� hashCode() �� ������̶� �ּ� ���� �ٸ��� �ٸ� ��ü�� �ν�
		// s1�� s2�� �ʵ尪�� ������, �ٸ� ��ü�̹Ƿ� �ٸ��ٰ� �ν��� (���ü : �ּҰ� �ٸ����� �ʵ尪 ����)
		// Student Ŭ������ hashCode�� �������̵��Ͽ� �ʵ� ���� ���� ���ü��
		// ���� hashCode ���� �����ϵ��� ����
		// ���ϰ�ü�� �ּҰ��� ����!
		
		System.out.println(s1.equals(s2)); // false
		System.out.println(s1.hashCode()); // 1829164700
		System.out.println(s2.hashCode()); // 118352462
		
		// Student Ŭ������ hashCode�� �������̵� �� �ָ�
		// System.out.println(s1.equals(s2)); // true ���� ������
		// �Ʊ� ���� �ʵ带 �߰��ߴ� �ѿ���� �߰��Ǿ����� ����
		
		System.out.println("=============== HashSet ��� �׽�Ʈ ===============");
		// ����Ʈ�� �ε����� �־ list.get(index)�� ���� �ϳ��ϳ� ������ �� ���
		// hashSet�� �ε����� �����Ƿ� get(index)�� �̿��� �Ϲ� for���� ��� �Ұ�
		// (1) for Each�� (��� for��)�� ��� ����!
		for (com.kh.chap02_set.part01_hashSet.model.vo.Student st : hs) {
			System.out.println(st);
		}
		
		System.out.println("=================================");
		// (2) Iterator(�ݺ���) �޼ҵ� ��� ����!
		Iterator<Student> it = hs.iterator();
		
		while(it.hasNext()) { // it�� ���� ���� �ִ���?
			//System.out.println(it.next()); // �ܼ� ���
			Student st = it.next(); // Student ��ü�� ���
			System.out.println(st);
		}
		
		
		
		
		
		
	}

}
