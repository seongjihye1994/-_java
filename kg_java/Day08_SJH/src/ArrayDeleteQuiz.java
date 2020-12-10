import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {
		
		// 1. 삭제할 이름을 입력받아서 해당 값을 삭제해주세요.
		// 2. 삭제 후 정보도 출력해 주세요.
		// 3. 없으면 없는 이름이라고도 출력해 주세요.
		// ** ArrayDelete.java 참고 ** 
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.println(Arrays.toString(kakao));
		
		System.out.println("삭제할 친구를 입력하세요. : ");
		System.out.print("> ");
		
		String name = sc.next();
		
		int i;
		for (i = 0; i < kakao.length; i++) {
			if (name.equals(kakao[i])) {
				System.out.println(kakao[i] + "의 이름을 삭제합니다.");
				for (int j = i; j < kakao.length-1; j++) {
					kakao[j] = kakao[j+1];
				}
				break;
			}
		}
		if (i != kakao.length) { // 이름을 찾았을 경우?
			String[] temp = new String[kakao.length-1];
			for (int idx = 0; idx < temp.length; idx++) {
				temp[idx] = kakao[idx];
			}
			kakao = temp; temp = null;
			System.out.print("삭제 후 정보는 ");
			System.out.print(Arrays.toString(kakao));
		} else {
			System.out.println("존재하지 않는 이름입니다.");
		}
		
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
