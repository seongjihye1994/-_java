package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Sonata s2 = new Sonata();
		Car s3 = new Sonata();
		
		Morning m1 = new Morning();
		Morning m2 = new Morning();
		Car m3 = new Morning();
		
		Tesla t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Car t4 = new Tesla();

		// s1.run();s2.run();s3.run();m1.run(); ....
		
//		Sonata[] sonatas = {s1, s2, s3};
//
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		// Car는 최상위 클래스(부모클래스) 이기 때문에 소나타, 모닝, 테슬라 모두 각자의 배열을 생성하지 않고 Car 배열을 하나 선언하면 요소값으로 들어올 수 있다!
		
		Car[] cars = {s1, s2, s3, m1, m2, m3, t1, t2, t3, t4}; // 자동차 종류가 100개 이상인데 이 모든 차들의 배열을 선안할 수가 없기 때문에 최상위 클래스를 하나 선언하면
		// 배열을 하나만 선언하면 되기 때문에 효율성이 높아진다.
		
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("----------------------------------");
		
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Ntire();
		s1.rearRight = new Ntire();
		
		
		Driver kim = new Driver();
		kim.drive(s1);
		kim.drive(m1);
		kim.drive(t1);
		
		
	}

}
