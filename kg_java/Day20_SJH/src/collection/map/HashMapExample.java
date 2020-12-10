package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		// Map 계열 컬렉션은 키(key)와 값(value)이 한 쌍으로 구성된
		// 객체를 저장하는 구조를 가지고 있습니다.
		
		// 카는 중복저장을 허용하지 않지만, 값은 중복 저장을 허용합니다.
		
		// Map<키 자료형, 값 자료형> 변수명 = new HashMap<>();
		
		Map<String, String> map = new HashMap<>();
		
		// 1. map에 객체를 저장 : 변수명.put(key, value)
		map.put("멍멍이", "김철수");
		map.put("야옹이", "홍길동");
		map.put("짹짹이", "박영희");
		
		System.out.println(map); // {멍멍이=김철수, 야옹이=홍길동, 짹짹이=박영희}

		// map은 key의 중복 저장을 허용하지 않습니다.
		// 만약 중복 key를 통해 put을 사용하면 value가 수정됩니다.
		map.put("멍멍이", "박철수"); // 중복 key로 value를 넣으면 key는 그대로, 값이 수정되며, key값이 다르고, value가 중복되는건 상관없이 추가된다.
		map.put("어흥이", "홍길동"); // {어흥이=홍길동, 멍멍이=박철수, 야옹이=홍길동, 짹짹이=박영희}
		System.out.println(map); // {멍멍이=박철수, 야옹이=홍길동, 짹짹이=박영희} 
		
		// 2. map에 저장된 value값을 참조(꺼냄) : 변수명.get(key)
		String name = map.get("야옹이");
		System.out.println("별명이 야옹이인 학생 : " + name); // 별명이 야옹이인 학생 : 홍길동

		// 3. map에 저장된 총 객체의 수 얻기 : 변수명.size()
		System.out.println("map에 저장된 객체의 수  : " + map.size()); // map에 저장된 객체의 수  : 4

		// 4. map에 저장된 key들만 전부 추출하는 메서드 : 변수명.keySet()
		// keySet()을 사용하면 map안에 있는 모든 key들이 Set(객체)으로 포장되어 반환됩니다.
		Set<String> keys = map.keySet();
		for (String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		// 5. map에 저장된 key들의 존재 유무를 확인하는 메서드 : 변수명.containsKey(찾을 key)
		String nick = "메롱이";
		if (map.containsKey(nick)) {
			System.out.printf("별명이 %s인 학생의 이름은 %s입니다.\n", nick, map.get(nick));
		} else System.out.println("존재하지 않는 별명입니다.");
		
		// 6. map의 데이터 삭제 : 변수명.remove(지울 key)
		// remove 메서드에 key를 넣어주면 value도 함께 제거됩니다.
		map.remove("야옹이");
		System.out.println(map);

		
		
	}

}
