package com.kh.chap03_map.part02_treeMap.controller;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;
import com.kh.chap03_map.part02_treeMap.comparator.DescString;

public class TreeMapTest {
	
	public void doTreeMap () {
		
		TreeMap<String, Car> tm = new TreeMap<>();
		
		// 1. put(K kye, V value) : �� �߰�
		tm.put("�ҳ�Ÿ", new Car("����", 13.3));
		tm.put("K5", new Car("���", 16.1));
		tm.put("������", new Car("������", 15.3));
//		System.out.println(tm);
		// -> key ���� String�� �������̵� �� compareTo�� �������� ���ڿ� �������� ����
		// ���� -> ������ ��
		
		// �ٸ� key���� ���� value �Է�
		tm.put("�ƹݶ�", new Car("����", 13.3));
//		System.out.println(tm);
		
		// ���� key���� �ٸ� value �Է�
		tm.put("������", new Car("������", 16.3));
//		System.out.println(tm);
		
		// 2. �������� ���� ���
		// (1) ����� ���� vo�� ���ı����� ��� Comparable�� ��� �޴� �޼ҵ� ���� ����
		// (2) �Ű����� �����ڸ� ���� ������ (String, Wrapper Ŭ���� ��)
		TreeMap<String, Car> descTm = new TreeMap<>(new DescString()); // ��������
		descTm.put("�ҳ�Ÿ", new Car("����", 13.3));
		descTm.put("K5", new Car("���", 16.1));
		descTm.put("������", new Car("������", 15.3));
//		System.out.println(descTm);
		
		// 3. keySet(), entrySet() �̿��Ͽ� �ϳ��� ����ϴ� ���� -> tm, descTm
		// keySet() + Iterator
		// keySet() + for each
		// entrySet() + Iterator
		// entrySEt() + for each
		
		Set<String> ks = tm.keySet();
		Iterator<String> ksit = ks.iterator();
		
		// keySet() + Iterator
		while (ksit.hasNext()) {
			String key = ksit.next();
			System.out.printf("Ű : %s, �� : %s\n", key, tm.get(key));
		}
		
		System.out.println();
		
		// keySet() + for each
		for (String key : tm.keySet()) { // for each �� �̴�������ȭ ���� �ʾƵ� �ٷ� ��� ����
			System.out.printf("Ű : %s, �� : %s\n", key, tm.get(key));			
		}
		
		System.out.println();

		// -----------------------------------------------------------------------------------
		
		Set<Entry<String, Car>> es = tm.entrySet();
		Iterator<Entry<String, Car>> it = es.iterator();
		
		// entrySet() + Iterator
		while (it.hasNext()) {
			Entry<String, Car> entry = it.next();
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		
		System.out.println();
		
		// entrySEt() + for each
		for (Entry<String, Car> entry : tm.entrySet()) {
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());
		}
		
		
		
		
		
		
		
		
	}

}
