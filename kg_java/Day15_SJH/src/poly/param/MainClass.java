package poly.param;

public class MainClass {

	public static void main(String[] args) {

		Driver kim = new Driver();
		
		Car s = (Sonata) kim.buyCar("소나타"); // 부모 타입으로 리턴을 받기 때문에 타입을 다운캐스팅 해줘야 값을 집어넣을 수 있다. 
		// Car(부모객체)로 받으면 안되나? >> 이렇게 돼버리면 자식 객체가 가지고 있는 기능(메서드나 필드)는 부모타입이 사용할 수 없으므로 기능을 불러올 수 없다.
		s.run();
		// s.enterMembership(); // 만약 Car(부모타입)으로 받으면 이 기능을 수행할 수 없음, 부모객체는 이 메서드가 없기 떄문!
		
		// 즉, 처음부터 부모타입으로 받으면 편하지만, 그렇게하면 자식객체의 기능을 사용할 수 없기 떄문에
		// 자식 타입으로 받고 대입되는 값을 다운캐스팅 해준다.
		
		System.out.println("===========================");
		
		CarShop shop = new CarShop();
		shop.carPrice(s);
		shop.carPrice(new Morning()); // 모닝은 객체가 없는 상태니까 객체 자체를 만들어서 매개값으로 날려버림. 그러면 매개변수 Car c가 받게됨.
		shop.carPrice(kim.buyCar("테슬라")); // buyCar 메소드를 부르면서 호출되니까 두 메서드가 같이 실행됨.
	}

}
