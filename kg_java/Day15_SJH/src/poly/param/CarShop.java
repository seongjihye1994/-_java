package poly.param;

public class CarShop {
	
	public void carPrice(Car c) { // Sonata s 를 파라미터로 받으면 소나타 가격만 받을 수 있음
		// 파라미터로 어떤 값이 들어올지는 메서드를 호출하지 않는 이상 모른다!
		// 그렇기 때문에 객체가 들어올 수 있는지 없는지를 판단하는 instancof를 사용해준다.
		if (c instanceof Sonata) { // c변수에 Sonata 객체가 들어올 수 있는지 검증하는 로직!
			System.out.println("소나타의 가격은 2500만원 입니다.");
		} else if (c instanceof Morning) {
			System.out.println("모닝의 가격은 1500만원 입니다.");
		} else if (c instanceof Tesla) {
			System.out.println("테슬라의 가격은 7000만원 입니다.");
		}
		
	}

}
