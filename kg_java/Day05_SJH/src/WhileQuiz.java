import java.util.Scanner;

public class WhileQuiz {
	public static void main(String[] args) {
		
		// 1. 정수를 2개 입력받으세요. (x, y)
		// 2. x 부터 y까지의 누적합계를 while을 사용하여 구하는 코드를 작성하세요.
		// ex) "x 부터 y 까지의 누적합계 : z"
		
		System.out.print("정수 2개를 입력하세요.. : ");
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int cx = x;
		int y = sc.nextInt();
		int temp;
		int total = 0;
		
		if (x > y) { // 만약 처음 입력한 정수가 두번째 입력한 정수보다 크다면? 변수 swap 한다.
			temp = x;
			x = y;
			y = temp;
		}
		
		while(x <= y) {
			total += x;
			x++;
		}
		System.out.printf("%d 부터 %d 까지의 누적합계 : %d", cx, y, total);
		
		sc.close();
		
		
		
		
		
		
		
		
	}

}
