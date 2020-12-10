package exception.basic;

public class FinallyExample {

	public static void main(String[] args) {
		
		String[] pets = {"강아지", "고양이", "짹짹이"};
		
		for (int i = 0; i < 4; i++) {
			try {
				System.out.println(pets[i] + "키우고 싶다~");
			} catch (Exception e) {
				System.out.println("애완동물의 정보가 없습니다.");
			} finally { // 예외처리와 상관 없이 무조건 실행해야 하는 것들을 기재한다.
				System.out.println("아무튼 실행되는 문장입니다.");
				System.out.println("-----------------------");
			}
		}
		
//		강아지키우고 싶다~
//		아무튼 실행되는 문장입니다.
//		-----------------------
//		고양이키우고 싶다~
//		아무튼 실행되는 문장입니다.
//		-----------------------
//		짹짹이키우고 싶다~
//		아무튼 실행되는 문장입니다.
//		-----------------------
//		애완동물의 정보가 없습니다.
//		아무튼 실행되는 문장입니다.
//		-----------------------		
		
		
		
	}

}
