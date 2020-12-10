import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		
		// - 스캐너를 사용하여 이름과 나이를 입력받아서
		// 이름 : xxx
		// 나이 : xx세
		// 출생년도 : xxxx년
		
		// 을 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요.. : ");
		String name = sc.next();
		System.out.println("나이를 입력하세요.. : ");
		int age = sc.nextInt();
		
		int birthYear = 2020 - age + 1;
		
		System.out.println("-----------------------------------");
		System.out.printf("이름 : %s\n나이 : %d세\n출생년도 : %d년\n", name, age, birthYear);
		System.out.println("-----------------------------------");
		
		sc.close();
		
	}

}
