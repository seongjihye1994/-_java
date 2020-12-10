import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {
			if (i == 5) continue; // i가 1씩 증가하며 출력되다가 i가 5가 되면 if문이 참으로 종속문이 수행되면서 continue를 만나 5는 건너뛰게 된다.
			System.out.print(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		
		// 1~30까지의 정수 중 홀수만 가로로 출력해보자.
		
		for(int j = 0; j < 30; j++) {
			if (j % 2 == 0) continue;
			System.out.print(j + " ");
		}
		
		System.out.println("--------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		while(true) {
			System.out.print("> ");
			int answer = sc.nextInt();
			
			if (answer == 1) break;
			else if (answer == 0) {
				System.out.println("다른 정수를 입력해 주세요!"); // 0으로 나누려고 할 때
				continue;
			}
			System.out.println("100 / 입력한 정수의 나눗셈 결과 : " + (100/answer));
		}
		
		
		
		
		
		
		
	}

}
