package exception.basic;

public class TryCatchExalple {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 0; // j에 0이 대입되어 나눗셈이 연산되면 에러, 하지만 빨간줄은 뜨지 않습니다. 이를 해결하기 위해 예외처리를 해줍니다.
		
		System.out.println("나눗셈 시작!");
		
		try {
			// 트라이 블록 내부에는 예외 발생 가능성이 있는 코드를 작성합니다.
			System.out.printf("%d / %d = %d\n", i, j, i/j); 
		} catch (Exception e) { // Exception 클래스의 변수 e, Exception이라는 부모클래스 타입의 변수 e는 그 예외가 Exception의 자식이라면 어떤 예외든 다 받아줌
			// catch 블록 내부에는 try에서 예외가 발생했을 시 실행할 코드를 작성합니다.
			System.out.println("0으로 나누지 마세요!");
		}
				
		System.out.println("프로그램 정상 종료!");

	}

}
