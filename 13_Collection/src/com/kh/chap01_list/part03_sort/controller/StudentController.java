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
		ArrayList<Student> sl = new ArrayList</*Student*/>(); // ���׸��� �����ص� �߷� ����
		sl.add(new Student("�ڿ���", 80));
		sl.add(new Student("�迵��", 60));
		sl.add(new Student("�ѿ���", 100));
		
		System.out.println("==== ��ü ����Ʈ ��� ====");
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// java.util.Comparator - compare()
		// ���ο� class�� �����Ͽ� Comparator�� ��� �޾� compare() �޼ҵ带 �������̵��Ͽ�
		// ������ ���� ���� ������ -> ���� ���� ���� ���� ���� �� ����
		System.out.println("===== Comparator =====");
		System.out.println("===== ���� �������� ���� =====");
		// AscScore Ŭ���� �����		
		// Collections.sort(sl, new AscScore());
		sl.sort(new AscScore());
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// DescScore Ŭ���� �����
		System.out.println("===== ���� �������� ���� =====");
//		 Collections.sort(sl, new DescScore());
		sl.sort((new DescScore()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// AscName Ŭ���� �����
		System.out.println("==== �̸� �������� ���� ====");
//		 Collections.sort(sl, new AscName());
		sl.sort((new AscName()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// DescName Ŭ���� �����
		System.out.println("==== �̸� �������� ���� ====");
//		Collections.sort(sl, new DescName());
		sl.sort((new DescName()));
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		
		// java.lang.Comprabele - compareTo()
		// �����ϰ��� �ϴ� ��ü�� Comparable ��� �޾� compareTo() �޼ҵ� �������̵� �ؼ�
		// ������ ���� ���� ������ -> �Ѱ��� ���� ���ظ� ����
		// ��� �����ϱ� ( = ���� ��������)
		System.out.println("==== Comparable ====");
		System.out.println("==== ��� ====");
		Collections.sort(sl);
		// sl.sort(); -> x : Comparator�� �Ű������� �޴� �޼ҵ常 ���� �Ǿ� ����
		for (int i = 0; i < sl.size(); i++) {
			System.out.println(sl.get(i));
		} System.out.println();
		
		// **** ������ �� ****
		// sort() �޼ҵ� ���� �� ���� ����Ʈ�� ����ǹǷ�
		// ���� ����Ʈ�� ���� ���� sort()�� �ϰ� �ʹٸ� �纻 ����Ʈ�� ����
		// �纻 ����Ʈ�� sort() �� �����ؾ���
		
		
		
		
		
		
	}

}
