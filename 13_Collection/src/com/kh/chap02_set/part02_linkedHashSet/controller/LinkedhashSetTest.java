package com.kh.chap02_set.part02_linkedHashSet.controller;

import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class LinkedhashSetTest {
	// HashSet�� ���� ����������, �߰��� �� ������ �����ϸ鼭 ������
	public void doLinkedHashSet() {
		System.out.println("========== LinkedHashSet �׽�Ʈ ==========");
		LinkedHashSet<Student> lhs = new LinkedHashSet<>();
		lhs.add(new Student("�迵��", 80));
		lhs.add(new Student("�ѿ���", 100));
		lhs.add(new Student("�ڿ���", 60));
		lhs.add(new Student("�ڿ���", 60));
		System.out.println(lhs);
		
//		[Student [name=�迵��, score=80], Student [name=�ѿ���, score=100], Student [name=�ڿ���, score=60]]
		// �߰��ϴ� ������ �����ϰ�, �ߺ����� �������� ����!
		// hashCode() �̹� �������̵� �Ǿ� �����Ƿ� �ߺ� ��ü(�ʵ� ���� ���� ���� ��ü)�� ������!
		
		Iterator<Student> it = lhs.iterator();
		while(it.hasNext()) { // ���� ���� �ֳ�?
			System.out.println(it.next()); // ������ ���� ���� ������
		}
		
		// ListIterator : list������ ���� ������ ����� Iterator
		System.out.println("============= ListIterator =============");
		List<Student> list = new ArrayList<>();
		list.addAll(lhs);	// LinkedHashSet�� ������ �ִ� Student 3���� �����͸� Listȭ
		
		ListIterator<Student> lit = list.listIterator();
		
		
		while(lit.hasNext()) {
			System.out.println(lit.next()); // ������ ������ ������
		}
		
		while(lit.hasPrevious()) {
			System.out.println(lit.previous()); // �ڿ��� ������ �����ϴ� ������
		} // ������ �ڵ尡 ������ �ڵ庸�� ���� �ö󰡸� ������ �ȵ�
		// Ŀ���� �� �տ� �ִµ� ���� ���� �ֳİ� ����� ���� ������ ����� �ȵǴ°�
		
		
		
		
	}

}
