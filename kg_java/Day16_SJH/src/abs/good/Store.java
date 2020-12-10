package abs.good;

public class Store extends HeadStore { // 부모클래스가 추상클래스이기 때문에 물려받는 자식에서는 무조건 메서드 오버라이딩을 해줘야 합니다.
		
	public Store() {
		super();
	}
	
		// 부모가 물려준 추상 메서드 중 하나라도 부족하다면 에러가납니다.
		
		@Override
		public void orderApple() {
			System.out.println("사과쥬스의 가격은 3000원 입니다.");
			
		}
		
		@Override
		public void orderBanana() {
			System.out.println("바나나쥬스의 가격은 3500원 입니다.");
			
		}
		
		@Override
		public void orderGrape() {
			System.out.println("포도쥬스의 가격은 4000원 입니다.");
			
		}
		
		@Override
		public void orderMelon() {
			System.out.println("메론쥬스의 가격은 4500원 입니다.");
			
		}

}
