package collection.list;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListDelete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// 1. 리스트의 문법을 이용하여 삭제를 구현해 보세요.
		// 2. 없으면 없는 이름이라고도 얘기해 주세요.
		// {"무지", "네오", "어피치", "라이언", "제이지"};
		
		
		List<String> kakao = new ArrayList<String>();
		kakao.add("무지");kakao.add("네오");kakao.add("어피치");
		kakao.add("라이언");kakao.add("제이지");
		
		System.out.println("현재 저장된 친구들 : " + kakao);
		System.out.println("삭제할 친구를 입력하세요. : ");
		System.out.print("> ");
		
		String name = sc.next();
		
		if (kakao.contains(name)) {
			kakao.remove(name);	
			System.out.println(kakao);
		} else System.out.println("없는 이름입니다.");
		
		sc.close();
		
		
		

	}

}
