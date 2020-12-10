package exception.throw_;

public class ThrowExample {

	public static int calcSum(int end) throws Exception { // 강제로 발생시킨 예외를 호출부로 던져버림
		if (end <= 0) {
			// 이 시점에서 강제로 예외를 발생시킴!
			throw new Exception(); // throw로 객체를 생성할 수 있다.
		}
		int tot = 0;
		for(int i = 0; i <= end; i++) {
			tot += i;
		} return tot;
	}
	
	// if문에서는 break 사용 불가, break는 switch case나 반복문에서만 사용 가능!
	// return;을 통한 강제종료는 자료형 void인 메서드에서만 사용 가능!
	
	public static void main(String[] args) {
		
		try { // 메인에서는 throws를 사용할 수 없으니 try catch문을 사용한다.
			int result = calcSum(100);
			System.out.println(result);
			
			int result2 = calcSum(-120);
			System.out.println(result2);
		} catch (Exception e) {
			System.out.println("매개값은 0보다 커야 합니다!");
			e.printStackTrace();
		}

		
		
	}

}
