package exception.throws_;

public class ThrowsExample {
	
	static String[] greetings = {"안녕", "헬로", "니하오"};
	
	// # throws
	
	// throws 는 예외의 원인이 메서드 선언부(클래스)가 아니라 호출부(메인)에 있을 경우
	// 예외 처리를 호출부로 떠넘기는 방식입니다.
	
	// throws는 생성자에서도 선언이 가능하며, 메서드나 생성자 호출 시
	// 예외처리를 강요하고 싶을 때 사용합니다.

	static void greet(int idx) throws Exception { // 예외가 터지면 무조건 호출부로 넘겨버린다.
		System.out.println(greetings[idx]);
	}
	
	public static void main(String[] args) { // 메인에 throws를 붙이면 예외 처리하지 않겠다는 의미이다.
		
		try {
			greet(3);
		} catch (Exception e) {
			e.printStackTrace(); 
			// printStackTrack() 메서드는 예외 발생 원인을 역추적하여
			// 예외가 어디에서 발생했는지, 그 이유는 무엇인지를
			// 메세지를 통해 개발자에게 전달하므로 자주 사용하는 메서드입니다.		
		}
		
		System.out.println("프로그램 정상 종료!");
		
		
		
	}

}
