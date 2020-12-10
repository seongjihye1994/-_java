import java.util.Scanner;

public class LoopNesting2 {
	public static void main(String[] args) {

		// - 정수를 하나 입력받아서 해당 숫자까지의 모든 소수를 가로로 출력하고
		// 그 소수들의 합을 구하는 로직을 작성합니다.
		
		// 입력받은 수 : 12
		// 소수 2 3 5 7 11 
		// 소소들의 총 합 : 28
		
		System.out.print("정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
//		int i, j, sum = 0;
		
//		for(i = 2; i <= inputNum; i++) {
//			for (j = 2; j <= i; j++) {
//				if (i % j == 0)
//					break;
//			}
//			if (j == i) {
//				System.out.print(j + " ");
//				sum += j;	
//			}
//		}
//		System.out.println();
//		System.out.println("소수 총 합 : " + sum);
		
		int sum = 0; //소수들의 총 합을 담아줄 변수.
		
		for(int i=1; i<=inputNum; i++) {
			int count = 0; //나누어 떨어질 횟수를 세 줄 변수.
			for(int j=1; j<=i; j++) {
				if(i % j == 0) count++;
			}
			if(count == 2) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n소수들의 총합: " + sum);
		
		sc.close();
		
		
		
	}
}
