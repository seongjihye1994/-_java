import java.util.Scanner;

public class BreakQuiz {

	public static void main(String[] args) {
		
		/*
		 1. 2가지의 정수를 1~100사이의 난수를 발생시켜서
		 지속적으로 문제를 출제한 후 정답을 입력받으세요.
		 사용자가 0을 입력하면 반복문을 탈출시키세요.
		 
		 2. 종료 이후에 정답 횟수와 오답 횟수를 각각 출력하세요.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int tn = 0;
		int fn = 0;
		int correct;
		int incorrect;
		
		while(true) {
			
			System.out.println("--------------------------");
			System.out.println("*** 덧셈 퀴즈 ***");
			System.out.println("# 끝내시려면 0을 입력하세요.");
			
			int rn = (int) (Math.random()*101 - 1) + 1;
			int rn2 = (int) (Math.random()*101 - 1) + 1;
			int num = (int) (Math.random()*2); // 0과 1 >> 2개의 난수 발생
			//int num = (int) (Math.random()*3 - 1);
			
			System.out.println("--------------------------");
			System.out.println(num);
			
			if (num == 0) {
				System.out.printf("%d + %d = ???\n", rn, rn2);
				System.out.println("> ");
			} else {				
				System.out.printf("%d - %d = ???\n", rn, rn2);
				System.out.println("> ");
			}
			
			int inputNum = sc.nextInt();	
			
			if (inputNum == 0) {
				System.out.println("프로그램 종료");
				break;
			} else if (inputNum == rn + rn2) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				tn ++; break;
			} else if (inputNum == rn - rn2) {
				System.out.println("정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				tn ++; break;		
			} else {
				System.out.println("오답입니다.");
				fn ++;
			}
		}
		System.out.println("--------------------------------");
		System.out.printf("정답 횟수 : %d회\n", tn);
		System.out.printf("오답 횟수 : %d회\n", fn);
		
		sc.close();

	}

}
