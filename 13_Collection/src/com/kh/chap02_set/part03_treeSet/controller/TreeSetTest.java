package com.kh.chap02_set.part03_treeSet.controller;

import java.util.Iterator;
import java.util.TreeSet;

import com.kh.chap02_set.part03_treeSet.model.vo.Student;

public class TreeSetTest {
	public void doTreeSet() {
		System.out.println("========== Integer Ŭ������ �׽�Ʈ ==========");
		TreeSet set = new TreeSet();
		set.add(new Integer(10));
		set.add(new Integer(5));
		set.add(15);	// int -> Integer ���� �ڽ�
//		set.add("��");
		// ���� �� ���� : ���� ������ ������ �����ϹǷ� ���� Ÿ���� �ƴ� ���� ������
		// java.lang.ClassCastException �߻�
		// -> �Ѱ��� Ÿ���� �ڷ����� ���� ����
		
		// Iterator �̿��ؼ� ���
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		// Integer Ŭ���� ���������� ������ �ִ� ������ ������������ ���� ��
//		5
//		10
//		15
		// ���� ���� ���� 10�� �������� �۰� ŭ�� ������ Ʈ��(�迭)�� ����
		
		System.out.println("================== Student Ŭ������ �׽�Ʈ ==================");
		TreeSet<Student> ts = new TreeSet<>();
		
		ts.add(new Student("�迵��", 80));
		ts.add(new Student("�ѿ���", 100));
		ts.add(new Student("�ڿ���", 60));
		// TreeSet ���� ���ؿ� �־ ������ ���� ������?
		// => �ߺ��� ������
		ts.add(new Student("�ڿ���", 90)); // -> �̸� ���������� ��� �ߺ����� ����
		ts.add(new Student("�̿���", 60)); // -> �������� ��� �ߺ����� ����
		
		Iterator<Student> it2 = ts.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		} // java.lang.ClassCastException �߻�
		// Student Ŭ������ TreeSet���� ���� �� � �������� ���� ���� �������� �ʾƼ� ���� �߻�
		// Tree ������ ��� ���� ������ ������ �����
		// �ش� ������ �������־�� �� => implements Comparable
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
