package com.kh.chap01_list.part02_list.controller;


import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part02_list.model.vo.Music;

public class ListController {

	// List 계열 틀징 : 순서 유지, 중복 저장 가능
	// List 계열 종류 : ArrayList(동기화 x), Vector(동기화 O), LinkedList
	// LinkedList -> 객체 삽입, 삭제가 빈번한 경우는 ArrayList보다 효율이 좋음
	// vector는 ArrayList의 구버전이며 리스트 계열의 사용 메소드는 동일하므로 ArrayList를 대표로 테스트
	
	public void doList() {
		// List는 인터페이스이므로 객체 생성 불가
//		List list = new List(); // 객체 생성 x
		
		// List의 후손 클래스인 ArrayList로 객체 생성(다형성 : 부모 레퍼런스로 자식 객체를 다룸)
//		List list = new ArrayList();
		
		// 노란줄 (경고 메세지)가 뜨는 이유?
		// 어떤 타입을 저장하는지 규정하지 않아서 안정성에 문제가 있다고 알려주는 메세지
		// 제네릭스 <Music>으로 지정해주면 경고가 사라지고 String 값은 저장 불가능 하게 됨
		// 제네릭스 설정 이유
		// 1. 안정성 (다른 타입이 들어갈 시 컴파일 에러 발생)
		// 2. 반환형 다운 캐스팅 필요 없음
		
		ArrayList<Music> list = new ArrayList<Music>(3);
		// 기본 생성자 -> 크기 지정 x -> 기본 10
		// 매개변수 생성자 -> 크기 지정 o
		System.out.println(list);
		
		// 1. add(E e) : 리스트의 맨 끝에 인스턴스 데이터 추가
		list.add(new Music("제시", "눈누난나"));
		list.add(new Music("화사", "Maria"));
		list.add(new Music("오마이걸", "살짝 설랬어"));
//		list.add("끝"); // *** Music으로 제네릭스 설정하면 String 타입은 add 불가능하므로 에러 발생 ***
		
		// 3으로 크기를 지정했는데 "끝"을 추가해도 오류 x
		// -> 1) 크기의 제한이 없음
		// Music 객체가 아닌 String 객체를 넣어도 상관 x
		// -> 2) 여러 타입의 객체를 저장할 수 있음
				
		System.out.println(list);
		
		// 2. add(int index, E e) : 인덱스 지정하여 해당 인덱스에 E 추가
		list.add(1, new Music("Anne-Marie", "2002")); // 1번 인덱스에 추가
		System.out.println(list);
		
		// 3. set(int index, E e) : 지정한 인덱스의 값을 E로 변경
		list.set(1, new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야")); // 1번 인덱스를 변경
		System.out.println(list);
		
		// 4. size() : 리스트 안에 몇 개의 데이터가 들어 있는지 리턴
		System.out.println(list.size());
		
		// 5. remove(int index) : 해당 인덱스의 인스턴스 삭제
		list.remove(0);
		System.out.println(list.size());
		// -> 3) 추가, 삭제 시 자동 처리(별도의 알고리즘 작성할 필요 없음) 되어 간단함
		
		// 6. get(int index) : 해당 인덱스의 인스턴스 조회
		Music m = /*(Music)*/ list.get(0); 
		// 제네릭스 설정 전 : get 메소드가 Object 타입으로 리턴되어 Music으로 다운 캐스팅
		// *** 제네릭스 설정 후 : get 메소드의 리턴 타입이 Music으로 한정 되므로 캐스팅 불필요 
		System.out.println(m);
		
		// 7. contains(Object o) : 해당 객체를 포함하고 있는지 참 거짓 리턴
		System.out.println(list.contains(new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야")));
		// 실행 시 false가 나옴, why??
		// 여기서 contains는 객체의 필드값을 비교하는게 아니라 주소값을 비교하고 있음
		// 실제 필드값을 비교하게 하려면 -> Music 클래스에 필드값을 비교하는 equals() 오버라이딩되어야 함
		// Music클래스에 equals()를 오버라이딩 한 후 다시 실행하면 true를 리턴
		
		// 8. indexOf(object o) : 해당 값을 가진 인덱스를 리턴 -> 해당하는 값이 없으면 -1 리턴
		// contains() 내부에서 호출 되었던 메소드로 역시 equals() 오버라이딩이 되어야 잘 동작함
		System.out.println(list.indexOf(new Music("장범준", "흔들리는 꽃들 속에서 네 샴푸향이 느껴진거야")));

		// 9. subList(int index1, int index2) : index1부터 index2 -1 까지 List로 추출하여 리턴
		List sub = list.subList(0, 2);
		System.out.println(sub);
		
		// 10. addAll(Collection c) : 리스트의 끝에 컬렉션 추가
		list.addAll(sub);
		System.out.println(list);
		
		// 11. isEmpty() : 리스트 안의 값이 비었는지 참 거짓 리턴
		System.out.println(list.isEmpty());
		
		// 12. clear() : 전체 삭제
		// list.clear();
		// System.out.println(list.isEmpty());
		
		// 반복문을 통해 담긴 객체 하나씩 접근하여 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		} System.out.println(); // 개행
		
		// 향상 된 for문 (for Each문)
		for (Music music : list) {
			System.out.println(music);
		}
		
	}

}
