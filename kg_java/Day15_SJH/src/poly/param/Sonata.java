package poly.param;

public class Sonata extends Car {

	@Override // 재정의
	void run() {
		System.out.println("소나타가 달립니다~");
	}
	
	void enterMembership() {
		System.out.println("멤버십에 가입합니다.");
	}

}
