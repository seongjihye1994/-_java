package com.kh.chap03_map.part01_hashMap.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;

public class HashMapTest {

	
	// Map 계열의 특징 : 키(Key)와 값(value)으로 구성 되어 있으며 키와 값은 모두 객체
	//				   키는 중복 저장 x -> Set 방식
	//				   값은 중복 저장 o -> List 방식
	//				   키가 중복 된 값이 다시 저장 되면 기존 키에 값을 덮어 씌움
	// Map 계열의 종류 : HashMap, HashTable, LinkedHashMap, Propertise, TreeMap
	// HashMap : Key 객체는 hashCode(), equals() 재정의 해야 함 -> Set에서 처럼 동등 객체 중복 저장 x
	//			  주로 String 클래스를 키 타입으로 사용(이미 hashCode(), equals() 오버라이딩 되어 있음)
	// HashTable : HashMap의 구버전, 동기화 지원
	// LinkedHashMap : HashMap를 상속 받아 구현 된 클래스로 저장 순서가 유지 된다는 차이점만 있음
	
	
	public void doHashMap() {
		
		HashMap<String, Car> hm = new HashMap<>();
		
		// List, Set 값 추가 => add() : Collection 인터페이스를 구현
		
		// Map 값추가
		// 1. put(K key, V value) : 지정한 키와 값 객체를 맵에 저장
		hm.put("소나타", new Car("현대", 13.3));
		hm.put("K5", new Car("기아", 16.1));
		hm.put("말리부", new Car("쉐보레", 15.3));
		System.out.println(hm); // 넣은 순서 유지 x
		
		// 다른 Key에 같은 value
		hm.put("아반떼", new Car("쉐보레", 13.3));
		System.out.println(hm); // 다른 key를 가지면 같은 value 저장 가능
		
		// 같은 key에 다른 value
		hm.put("말리부", new Car("쉐보레", 16.3));
		System.out.println(hm); // 같은 key를 가지면 새롭게 입력한 value로 덮어써짐
		
		// Map value 가져오기
		// 2. get(K key) : 저장한 키의 값(value) 객체 가져오기
		Car c = /*(Car)*/hm.get("K5");
		System.out.println(c);
		
		// 3. containsKey(Object Key) : Key가 있으면 true 반환
		//	  containsValue(Object value) : value가 있으면 true 반환
		System.out.println(hm.containsKey("말리부")); // true
		System.out.println(hm.containsValue(new Car("쉐보레", 16.3))); // 객체를 하나 만들어서 기존 객체가 있는지 비교
		// -> false
		// why?
		// .equals()메소드를 오버라이딩 하지 않았기 떄문
		// 값이 같지만 다른 객체로 인식 (오버라이딩 전 : 주소값 비교)
		// 					    (오버라이딩 후 : 값 비교)
		// containsKey는 String클래스를 사용하므로 equals()가 오버라이딩 되어 실제 필드 값 비교를 함
		// -> containsValue는 우리가 만든 Car 클래스를 사용하므로 equals()가 오버라이딩 되어 있지 않아
		//    Object 클래스의 equals()를 호출하여 주소값을 비교함
		// -> Car 클래스에 HashCode와 equals를 오버라이딩 후 다시 비교하면  true 리턴
		
		// 4. remove(K key) : 해당 키 값의 인스턴스 삭제
		hm.remove("아반떼");
		System.out.println(hm);
		
		// size(), clear(), isEmpty() 등 동일한 사용법이므로 생략
		
		// -----------------------------------------------------------
		
		// Map 엘리먼트에 하나하나 접근하기
		// 1. values() : 모든 value값만 Collection에 담아 반환
		System.out.println(hm.values());
		System.out.println();
		
		// Map은 key-value를 페어로 저장하고 있기 때문에 iterator() 직접 호출 불가
		// KeySet(), entrySet()과 같은 메소드를 통해 Set 형태로 키와 값을 얻어온 뒤
		// iterator() 호출
		
		// 2. keySet() : 모든 key를 Set에 담아 반환
		// (1) keySet() + Iterator
		Set<String> keySet = hm.keySet();
		Iterator<String> it = keySet.iterator();
		
		// Iterator 사용하기
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("키 : %s, 값 : %s\n", key, hm.get(key));
		} // 값은 왜 hm.get(key)?
		// hm.getValue()는 안되나?
		
		// (2) keySet() : for Each 문 이용하기
		for (String key : hm.keySet()) { // keySet에서 이더레이터로 바꾸지 않고 for-each문으로 바로 출력
			System.out.printf("키 : %s, 값 : %s\n", key, hm.get(key));			
		}
		
		// 3. entrySet() : 모든 entry 객체(key + value)를 set에 담아 반환
		Set<Entry<String, Car>> entrySet = hm.entrySet();
		Iterator<Entry<String, Car>> it2 = entrySet.iterator();
		
		while(it2.hasNext()) {
			Entry<String, Car> entry = it2.next();
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());			
		}
		
		// (2) entrySet() : for Each 문 이용하기
		System.out.println("entrySet() for each문");
		for (Entry<String, Car> entry : hm.entrySet()) {
			System.out.printf("키 : %s, 값 : %s\n", entry.getKey(), entry.getValue());			
		}
		
				
		
	}
	

}
