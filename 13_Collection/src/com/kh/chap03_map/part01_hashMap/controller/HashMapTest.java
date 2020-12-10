package com.kh.chap03_map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;

public class HashMapTest {

	
	// Map �迭�� Ư¡ : Ű(Key)�� ��(value)���� ���� �Ǿ� ������ Ű�� ���� ��� ��ü
	//				   Ű�� �ߺ� ���� x -> Set ���
	//				   ���� �ߺ� ���� o -> List ���
	//				   Ű�� �ߺ� �� ���� �ٽ� ���� �Ǹ� ���� Ű�� ���� ���� ����
	// Map �迭�� ���� : HashMap, HashTable, LinkedHashMap, Propertise, TreeMap
	// HashMap : Key ��ü�� hashCode(), equals() ������ �ؾ� �� -> Set���� ó�� ���� ��ü �ߺ� ���� x
	//			  �ַ� String Ŭ������ Ű Ÿ������ ���(�̹� hashCode(), equals() �������̵� �Ǿ� ����)
	// HashTable : HashMap�� ������, ����ȭ ����
	// LinkedHashMap : HashMap�� ��� �޾� ���� �� Ŭ������ ���� ������ ���� �ȴٴ� �������� ����
	
	
	public void doHashMap() {
		
		HashMap<String, Car> hm = new HashMap<>();
		
		// List, Set �� �߰� => add() : Collection �������̽��� ����
		
		// Map ���߰�
		// 1. put(K key, V value) : ������ Ű�� �� ��ü�� �ʿ� ����
		hm.put("�ҳ�Ÿ", new Car("����", 13.3));
		hm.put("K5", new Car("���", 16.1));
		hm.put("������", new Car("������", 15.3));
		System.out.println(hm); // ���� ���� ���� x
		
		// �ٸ� Key�� ���� value
		hm.put("�ƹݶ�", new Car("������", 13.3));
		System.out.println(hm); // �ٸ� key�� ������ ���� value ���� ����
		
		// ���� key�� �ٸ� value
		hm.put("������", new Car("������", 16.3));
		System.out.println(hm); // ���� key�� ������ ���Ӱ� �Է��� value�� �������
		
		// Map value ��������
		// 2. get(K key) : ������ Ű�� ��(value) ��ü ��������
		Car c = /*(Car)*/hm.get("K5");
		System.out.println(c);
		
		// 3. containsKey(Object Key) : Key�� ������ true ��ȯ
		//	  containsValue(Object value) : value�� ������ true ��ȯ
		System.out.println(hm.containsKey("������")); // true
		System.out.println(hm.containsValue(new Car("������", 16.3))); // ��ü�� �ϳ� ���� ���� ��ü�� �ִ��� ��
		// -> false
		// why?
		// .equals()�޼ҵ带 �������̵� ���� �ʾұ� ����
		// ���� ������ �ٸ� ��ü�� �ν� (�������̵� �� : �ּҰ� ��)
		// 					    (�������̵� �� : �� ��)
		// containsKey�� StringŬ������ ����ϹǷ� equals()�� �������̵� �Ǿ� ���� �ʵ� �� �񱳸� ��
		// -> containsValue�� �츮�� ���� Car Ŭ������ ����ϹǷ� equals()�� �������̵� �Ǿ� ���� �ʾ�
		//    Object Ŭ������ equals()�� ȣ���Ͽ� �ּҰ��� ����
		// -> Car Ŭ������ HashCode�� equals�� �������̵� �� �ٽ� ���ϸ�  true ����
		
		// 4. remove(K key) : �ش� Ű ���� �ν��Ͻ� ����
		hm.remove("�ƹݶ�");
		System.out.println(hm);
		
		// size(), clear(), isEmpty() �� ������ �����̹Ƿ� ����
		
		// -----------------------------------------------------------
		
		// Map ������Ʈ�� �ϳ��ϳ� �����ϱ�
		// 1. values() : ��� value���� Collection�� ��� ��ȯ
		System.out.println(hm.values());
		System.out.println();
		
		// Map�� key-value�� ���� �����ϰ� �ֱ� ������ iterator() ���� ȣ�� �Ұ�
		// KeySet(), entrySet()�� ���� �޼ҵ带 ���� Set ���·� Ű�� ���� ���� ��
		// iterator() ȣ��
		
		// 2. keySet() : ��� key�� Set�� ��� ��ȯ
		// (1) keySet() + Iterator
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		
		// Iterator ����ϱ�
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("Ű : %s, �� : %s\n", key, hm.get(key));
		} // ���� �� hm.get(key)?
		// hm.getValue()�� �ȵǳ�?
		
		// (2) keySet() : for Each �� �̿��ϱ�
		for (String key : hm.keySet()) { // keySet���� �̴������ͷ� �ٲ��� �ʰ� for-each������ �ٷ� ���
			System.out.printf("Ű : %s, �� : %s\n", key, hm.get(key));			
		}
		
		// 3. entrySet() : ��� entry ��ü(key + value)�� set�� ��� ��ȯ
		Set<Entry<String, Car>> entrySet = hm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());			
		}
		
		// (2) entrySet() : for Each �� �̿��ϱ�
		System.out.println("entrySet() for each��");
		for (Entry<String, Car> entry : hm.entrySet()) {
			System.out.printf("Ű : %s, �� : %s\n", entry.getKey(), entry.getValue());			
		}
		
				
		
	}
	

}
