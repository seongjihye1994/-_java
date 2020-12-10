package poly.param;

public class MainClass {

	public static void main(String[] args) {

		Driver kim = new Driver();
		Car s = kim.buyCar("소나타");
		s.run();
		Sonata s2 = (Sonata) s;
		s2.enterMembership();
		
		System.out.println("-------------------------------------");
		
		CarShop shop = new CarShop();
		shop.carPrice(s);
		shop.carPrice(new Morning());
		shop.carPrice(kim.buyCar("테슬라"));
		
		
		
		
		
		
		
		
	}

}
