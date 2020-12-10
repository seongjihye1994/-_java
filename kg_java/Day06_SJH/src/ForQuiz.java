import java.util.Scanner;

public class ForQuiz {

	public static void main(String[] args) {
		// 사용자에게 구구단 단수를 입력받은 후,
		// 해당 단수의 구구단을 출력해보세요.
		
		// ex) 단수를 입력하세요 : 4
		// *** 구구단 4단 ***
		// ----------------
		// 4 x 1 = 4
		// 4 x 2 = 8 ...
		
		System.out.println("단수를 입력하세요. : ");
		Scanner sc = new Scanner(System.in);
		int inputNum = sc.nextInt();
		
		System.out.printf("***구구단 %d단***\n", inputNum);
		System.out.printf("----------------------\n");
		
		for (int dan = 2; dan <= 9; dan++) {
			for (int gugu = 1; gugu <= 9; gugu++) {
				if (dan == inputNum)
					System.out.printf("%d x %d = %d\n", dan, gugu, dan*gugu);
			}
		
		}
	}

}
