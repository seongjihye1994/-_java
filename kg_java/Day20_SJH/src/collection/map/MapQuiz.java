package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz {

	public static void main(String[] args) {
		
		// 1. engKor이라는 이름으로 Map을 하나 생성하세요.
		
		// 2. 사용자가 '그만'을 입력할 때 까지 영단어를 입력받습니다.
		
		// 3. 총 두번을 입력받는데, 영단어를 key로, 한글 뜻을 value값으로
		//    저장하여 Map에 등록하세요.
		
		// 4. '그만'을 입력받아 단어장 만들기를 종료하면,
		//    그 동안 입력받았던 사전의 내부 데이터를 전부 출력하세요.
		//    영단어 : 한글뜻
		//    영단어 : 한글뜻..
		
		Map<String, String> engKor = new HashMap<String, String>();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[영어 단어장 만들기]");
		System.out.println("- 종료하시려면 '그만'을 입력하세요.");
		
		while(true) {
			System.out.println("영단어 : ");
			String inputKey = sc.next();
			
			System.out.println("===========================");
			
			if (inputKey.equals("그만")) break;
			else {
				if (engKor.containsKey(inputKey)) {
					System.out.println("이미 등록된 단어입니다.");
				} else {
					System.out.println("한글 뜻 : ");
					String inputValue = sc.next();
					engKor.put(inputKey, inputValue);	
				}					
			} System.out.println("단어 저장 완료!");
			System.out.println("===========================");					
		}
		System.out.println(" *** 오늘 공부한 단어 *** ");
		System.out.println("===========================");
		Set<String> danci = engKor.keySet();
		for (String d : danci) {
			System.out.println(d + ":" + engKor.get(d));
		}
		System.out.println("===========================");

	}

}
