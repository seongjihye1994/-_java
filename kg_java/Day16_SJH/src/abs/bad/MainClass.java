package abs.bad;

public class MainClass {
	public static void main(String[] args) {
		
		HeadStore s = new Store(); // 다형성
		
		s.orderApple(); // 오버라이딩이 제대로 됨
		s.orderBanana(); // 오버라이딩으 제데로 되지 앟음
		s.orderGrape(); // 오버라이딩으 제데로 되지 앟음
		s.orderMelon(); // 오버라이딩으 제데로 되지 앟음
		
		
		
	}

}
