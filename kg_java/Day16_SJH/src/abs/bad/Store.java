package abs.bad;

public class Store extends HeadStore {
	
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원 입니다.");
	}
	
	public void orderBANANA() { // 오버라이딩이 아님(메소드 이름이 다름)
		System.out.println("바나나쥬스의 가격은 2800원 입니다.");
	}
	
	public void grapeOrder() { // 오버라이딩이 아님(메소드 이름이 다름)
		System.out.println("포도쥬스의 가격은 3200원 입니다.");
	}

	
}
