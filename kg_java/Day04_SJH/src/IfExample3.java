import java.util.Scanner;

public class IfExample3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요... : ");
		int height = sc.nextInt();
		
		if (height >= 140) {
			System.out.println("나이를 입력하세요... : ");
			int age = sc.nextInt();
			if (age >= 8)
				System.out.println("놀이기구 탑승이 가능합니다.");
			else if (age >= 6)
				System.out.println("보호자 동반 시 탑승이 가능합니다.");
			else
				System.out.println("나이가 6세 미만입니다.");
				System.out.println("놀이기구 탑승이 불가합니다.");
		}
		else {
			System.out.println("키가 140미만입니다.");
			System.out.println("놀이기구 탑승이 불가합니다.");
		}
		
		
		System.out.println(height);
		//System.out.println(age); // 지역변수로 선언되었기 때문에 main 함수에서는 사용할 수 없음
		// if 문이 실행되지 않으면 age변수는 생성조차 되지 않기 때문에 main함수에서는 사용할 수 없다.
		// 또한, if문 블록이 끝나면 age변수는 소멸되기 때문에 역시 main함수에서는 사용할 수 없다.
		// 그렇기 때문에 자료형이 없는 같은 변수명은 사용할 수 없고, int age = 20; 으로 자료형을 선언하면 main에서 사용 가능하다.
		
		sc.close();
	}

}
