import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {
		
		// 1. 배열을 선언하시고 친구들의 이름을 저장하세요.
		// {무지, 네오, 어피치, 라이언, 제이지} (String[] kakao)
		
		// 2. 사용자에게 수정할 친구 이름을 입력받아서 입력한 친구가 배열에 존재한다면
		// 수정할 값을 다시 입력받으세요.
		
		// 3. 이름을 수정한 후에 "수정 후 결과 : ~~~"를 출력하세요.
		
		// 4. 사용자가 입력한 이름이 배열에 없다면 "xxx은 없는 이름입니다."를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
		System.out.println(Arrays.toString(kakao));
		
		System.out.println("수정할 친구를 입력하세요. : ");
		System.out.print("> ");
		
		String name = sc.next();
		
		int idx;
		for (idx = 0; idx < kakao.length; idx++) {
			if (name.equals(kakao[idx])) {
				System.out.println(kakao[idx] + "의 이름을 수정합니다.");
				System.out.println("수정할 이름을 입력하세요 : ");
				System.out.print("> ");
				kakao[idx] = sc.next(); // 변수를 선언하지 않고 입력받은 값을 바로 지목해서 대입한다.
				System.out.println("변경이 완료되었습니다!");
				System.out.println(Arrays.toString(kakao));
				break;
			}
			if (idx == kakao.length){ // 상기 if문이 break되지 않고 끝까지 돌았다는 의미는 if문의 조건이 거짓으로 for문의 제어 idx변수가 kakao배열 끝까지 돌았다는 의미
				System.out.println("없는 이름입니다.");
			}
			
		}

	}

}
