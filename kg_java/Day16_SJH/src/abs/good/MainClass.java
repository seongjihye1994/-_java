package abs.good;

public class MainClass {

	public static void main(String[] args) {
		
		// HeadStore h = new HeadStore(); (x)
		// HeadStore의 생성자는 존재하기 때문에 문법적으로는 객체를 생성할 수 있지만,
		// 자식객체가 생성되지 않았기 때문에 스스로의 객체를 생성할 수 없습니다.
		
		HeadStore s = new Store(); // 다형성
		
		s.orderApple();
		s.orderBanana();
		s.orderGrape();
		s.orderMelon();
		s.orderWaterMelon(); // 오버라이딩 (x)

	}

}

