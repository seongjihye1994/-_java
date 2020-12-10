
package collection.list;

import java.util.ArrayList; // 클래스 타입의 ArrayList
import java.util.Collections;
import java.util.List; // 인터페이스 타입의 List

public class ArrayListExample {


	public static void main(String[] args) {
		
		
		// 배열
		// String[] str = new String[100];
		
		// *** 리스트 (어레이리스트) // 객체 안에 객체를 넣어놓는 객체들의 조합을 어레이리스트라고 합니다.
		// (Array)List<모아놓을 객체들의 타입> 리스트변수명 = new ArrayList<>();
		List<String> nick = new ArrayList<>();
		
		String str1 = "멍멍이";
		String str2 = "야옹이";
		
		// 1. 리스트에 객체를 추가하는 메서드 : 변수명.add(추가할 객체변수명); or 변수명.add(추가할 새로운 객체);
		nick.add(str1);
		nick.add(str2);
		
		nick.add(new String("짹짹이"));
		nick.add("개구리");
		nick.add("야옹이"); // List는 객체의 중복 저장을 허용합니다.
		
		System.out.println(nick); // == nick.toString()
		
		// 2. 리스트에 객체를 추가하는 메서드 : 변수명.add(index번호, 객체); --> 원하는 인덱스 위치에 객체를 삽입할 수 있습니다.
		nick.add(2, "어흥이");
		System.out.println(nick); // [멍멍이, 야옹이, 어흥이, 짹짹이, 개구리, 야옹이]
		// 값을 추가하면 리스트의 크기는 자동으로 늘어납니다.
		
		// 3. list에 저장된 총 객체의 수 얻기 : 변수명.size();
		System.out.println(nick.size()); // 6
		
		// 4. list에 저장된 객체 참조하는(얻어오는) 메서드 : 변수명.get(index번호)
		String nickname = nick.get(4);
		System.out.println("4번 인덱스의 값 : " + nickname); // 개구리
		
		// 5. list의 데이터를 수정하는 메서드 : 변수명.set(index번호, 수정할 객체);
		nick.set(3, "메롱이");
		System.out.println(nick); // [멍멍이, 야옹이, 어흥이, 메롱이, 개구리, 야옹이]

		// 6. list의 데이터 삭제하는 메서드 : 변수명.remove(index번호); or remove(삭제할 객체(변수));
		nick.remove(5);
		System.out.println(nick); // [멍멍이, 야옹이, 어흥이, 메롱이, 개구리]
		nick.remove(str1);
		System.out.println(nick); // [야옹이, 어흥이, 메롱이, 개구리]

		// 7. list 내부 객체의 존재 유무를 확인하는 메서드 : 변수명.contains(객체); --> boolean타입으로 리턴합니다.
		System.out.println(nick.contains("어흥이")); // true
		System.out.println(nick.contains("삐약이")); // false
		
		// 8. list 내부 객체의 인덱스를 확인하는 메서드 : 변수명.indexOf(객체);
		int idx = nick.indexOf("어흥이");
		System.out.println("'어흥이'가 위치한 인덱스번호 : " + idx); // '어흥이'가 위치한 인덱스번호 : 1
		
		// 9. list의 반복문 처리(향상 for문, 일반 for문 둘 다 사용 가능)
		for (String s : nick) {
			System.out.println(s + "키우고 싶다!");
		}
		for (int i = 0; i < nick.size(); i++) {
			System.out.println(nick.get(i) + "키우고 싶다~");
		}
		
		// 10. list의 내부 객체 전체 삭제하는 메서드 : 리스트변수명.clear();
		nick.clear();
		System.out.println(nick);
		
		// 11. 리스트가 비었는지의 여부를 리턴하는 메서드 : 리스트변수명.isEmpty();
		System.out.println(nick.isEmpty()); // 비어있으면 t, 비어있지 않으면 f
		
		// 12. list의 정렬!
		List<Integer> scores = new ArrayList<>(); // list는 항상 객체만 모아놓을 수 있는 객체이기 때문에, String은 객체라 가능하지만, int와 같은 다른 자료형들은 그 자료형들의 객체형태를 적어줘야 한다.
		
		scores.add(95);scores.add(47);scores.add(59);
		scores.add(80);scores.add(100);scores.add(21);
		
		// 1) 오름차 정렬 : Collections.sort(객체변수명);
		Collections.sort(scores);
		System.out.println(scores); // [21, 47, 59, 80, 95, 100]

		// 2) 내림차 정렬 : Collections.sort(객체변수명, Collections.reverseOrder());
		Collections.sort(scores, Collections.reverseOrder());
		System.out.println(scores); // [100, 95, 80, 59, 47, 21]


		

	}

}
