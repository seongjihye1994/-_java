package exception.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		try {
			
			System.out.println("정수  : ");
			int n = sc.nextInt();
			
			int result = 100 / n;
			
			System.out.println(arr[result]);
			
			String s = null;
			s.equals("안녕");
			
		} catch (InputMismatchException | ArithmeticException e) { // 정수로 들어오거나, 0을 입력했을 때의 예외 처리 (하나의 캐치문으로 2개 이상의 예외처리를 시행할 수 있습니다.) 
			System.out.println("잘못된 입력 값입니다!");
		}  catch (ArrayIndexOutOfBoundsException e) { // 배열 범위를 벗어났을 떄의 예외
			System.out.println("인덱스 범위를 벗어났어요!");
		} catch (NullPointerException e) { // null 오류가 발생했을 떄의 예외
			System.out.println("null 오류가 발생했습니다!");
		} catch (Exception e) { // 다중 캐치를 사용할 때는 나머지 캐치를 하나 더 작성해 주는 것이 좋다.
			System.out.println("알 수 없는 오류가 발생했어요!"); // 또한, Exception e 예외는 어떤 예외던 모두 받아 처리할 수 있기 때문에
														// 항상 맨 마지막에 선언해야 한다.
		}
	}


}
