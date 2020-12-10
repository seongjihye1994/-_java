import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		
		// 정수 1개를 입력 받아서 해당 정수가 소수 (prime number)
		// 인지를 판별하시면 됩니다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요... : ");
		
		int input = sc.nextInt();
		int i = 1; // 소수의 판별을 위해 입력받은 정수 input을 지속적으로 나누어 볼 변수
		int count = 0; // 나누어 떨어진 횟수를 세어 줄 변수

		while(i <= input) {
			if (input % i == 0) {
				count++;
				//break;
			}
			i++;
		}
//		if (i == input) {
//			System.out.println("소수임");
//		} else
//			System.out.println("소수가 아님");
		if (count == 2) { // 나누어 떨어진 횟수가 2개밖에 없으면(즉 1과 자기 자신밖에 없다면)
			System.out.println("소수임");
		} else {
			 System.out.println("소수가 아님");
		}
		
		System.out.println("--for문--");
		
		int j = 2;
		for (j = 2; j <= input; j++) {
			if (input % j == 0)
				break;
		}
		if (j == input)
			System.out.println("소수임");
		else
			System.out.println("소수가 아님");
		
		System.out.println("--while문 + 3항연산--");
		
		int pr = 2;
		while(input % pr != 0) { // 소수이면
			pr++;
		}
		System.out.println(input == pr? "소수임": "소수가 아님");
	}

}
