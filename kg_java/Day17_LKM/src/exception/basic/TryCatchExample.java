package exception.basic;

public class TryCatchExample {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0;
		
		System.out.println("나눗셈 시작!");
		
		try {
			//try블록 내부에는 예외 발생 가능성이 있는 코드를 작성합니다.
			System.out.printf("%d / %d = %d\n", i, j, i/j);
		} catch(Exception e) {
			//catch블록 내부에는 try에서 예외가 발생했을 시 실행할 코드를 작성합니다.
			System.out.println("0으로 나누지 마세요!");
		}

		
		System.out.println("프로그램 정상 종료!");
		
		
		
		
		
		
		

	}

}
