
public class ConditionalOperator {
	public static void main(String[] args) {
		
		/*
		 
		 # 3항 연산자
		 - 피 연산자 (연산을 당하는 값)가 3개인 연산자를 말합니다.
		 - (조건식 ? 좌항 : 우항)
		 - 조건식을 비교하여 true가 도출되었을 시에 좌항을,
		   false가 도출되었을 시에 우항의 식이 실행됩니다.
		   
		 */
		
		String result = (5 == 4 ? "참입니다." : "거짓이예요.");
		System.out.println(result);
		System.out.println(5 != 4 ? "참입니다." : "거짓이예요.");
		
		// 난수(랜덤값)를 발생시키는 메서드 Math.random();
		// 0.0 이상 1.0 미만의 랜덤 실수값을 반환합니다.
		
		// 기본값
//		double rn = Math.random();
//		System.out.println(rn);
		
		// 1~10까지의 정수 난수를 발생시키고 싶어요~
		int rn = (int)(Math.random()*10 + 1); // 0.0 * 11 == 0, 1.0 * 11 == 11 // 앞자리를 바꾸기 위해 +1을 한다. (1.0 이상 12.0 미만) // 12.0 을 11로 바꾸려면 
		// 최초 곱할 때 11이 아닌 10을 곱해주면 됨
		// 뒷자리는 곱하기로, 앞자리는 더하기로, 곱할때 -1을 해줌
		
		// 10~100까지의 정수 난수
		int rn2 = (int)((Math.random()*91) + 10);
		System.out.println(rn2);
		// 1. 범위의 끝자리값에서 +1을 한다.
		// 2. +1한 범위의 끝자리값에서 시작자리만큼 갯수를 뺀다.
		// 3. 범위의 시작자리를 더해준다.
		
		
		
		
		
	}

}
