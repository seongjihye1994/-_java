package abs.good;

public class Store extends HeadStore {

	public Store() {
		super();
	}
	
	@Override
	public void orderApple() {
		System.out.println("사과쥬스의 가격은 3000원 입니다.");
	}

	@Override
	public void orderBanana() {
		System.out.println("바나나쥬스의 가격은 2800원 입니다.");		
	}

	@Override
	public void orderGrape() {
		System.out.println("포도쥬스의 가격은 3200원 입니다.");		
	}

	@Override
	public void orderMelon() {
		System.out.println("멜론쥬스의 가격은 3500원 입니다.");		
	}

	
	
}
