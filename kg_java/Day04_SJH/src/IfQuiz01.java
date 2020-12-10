import java.util.Scanner;

public class IfQuiz01 {
	public static void main(String[] args) {
		
		/*
		 1. 스캐너를 사용하여 키와 나이를 입력받으세요.
		 2. 키가 140 이상, 나이가 8살 이상이어야 탑승이 가능한
		 	놀이기구의 탑승 가능 여부를 조건문을 사용하여 판단해보세요.
		 	
		 	ex)
		 	키 : 140, 나이 : 8, > 놀이기구  o
		 	키 : 145, 나이 : 7, > 놀이기구  x
		 	키 : 135, 나이 : 8, > 놀이기구  x
		 	
		 3. 탑승 가능 여부와 상관없이 "오늘 하루 즐거운 시간 되세요~!"
		 	를 출력하세요.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("키와 나이를 입력하세요... : ");
		int height = sc.nextInt(); int age = sc.nextInt();
		if (height >= 140 && age >= 8) {
			System.out.println("탑승 가능");
		} else {
			System.out.println("탑승 불가");
		}
		System.out.println("오늘 하루 즐거운 시간 되세요~!");
		
		sc.close();
		
	}
}
