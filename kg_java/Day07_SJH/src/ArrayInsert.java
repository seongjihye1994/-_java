import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		
		String[] names = new String[6];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < names.length; i++) {
			System.out.println("이름을 입력하세요. : ");
			String name = sc.next(); // 공백이 없는 문자를 입력받음
			
			// 자바에서는 문자열 동등 비교 시에 '==' 연산자를 사용하면
			// 제대로 비교가 되지 않습니다.
			
			// 문자열 String 타입이 기본 데이터 타입이 아닌 객체 참조 타입이기 때문입니다.
			
			// 그러므로 문자열 동등 비교를 진행할 때는 비교문자열1.equals(비교문자열2)를 사용하여
			// 문자열 동등 비교를 진행하셔야 합니다.			
			
			// .equals()는 두 문자를 맨 처음에는 길이를 비교하고, 길이가 동등하면 해당 문자열을 char형태로 바꿔
			// 문자열 하나하나를 비교하고, 두 문자가 동일하다면 참을 반환합니다.
			
			if(name.equals("그만")) { 
				System.out.println("입력을 종료합니다."); break;
			}
			names[i] = name; // 배열의 요소값 삽입
		}	
		
		//System.out.println(Arrays.toString(names));
		System.out.println("------------------------------");
		System.out.print("입력받은 이름 : ");
		
		for(String str : names) {
			if (str == null) break; // null을 출력하고 싶지 않을 때(Arrays.toString은 배열 내부의 모든 값을 보여주기 때문에, null을 출력하고 싶지 않을 때는 Arrays.toString을 사용하지 않고 반복문을 돌려준다.)
			System.out.print(str + " ");
		}
	}

}
