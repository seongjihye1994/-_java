import java.util.Scanner;

public class IfExample1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		int point = sc.nextInt();
		System.out.println("내 점수 : " + point + "점");
		System.out.println("---------------------------------");
		
		if (point >= 70) {
			System.out.println("70점 이상입니다.");
			System.out.println("합격하셨습니다!");
		} else {
			System.out.println("70점 미만입니다.");
			System.out.println("불합격 하셨습니다.");
		}
		System.out.println("시험 치루느라 고생하셨습니다~!");
		
	}
}
