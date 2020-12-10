package poly.param;

public class Driver {

	public Car buyCar(String name) { // 메서드 호출시 매개값으로 던져오는 것을 받음
		if (name.equals("소나타")) {
			System.out.println("소나타를 구입합니다.");
			return new Sonata();	
		} else if (name.equals("모닝")) {
			System.out.println("모닝을 구입합니다.");
			return new Morning();
		} else if (name.equals("테슬라")) {
			System.out.println("테슬라를 구입합니다.");
			return new Tesla();
		} else {
			return null;
		}
	}
	
}
