package poly.car;

public class MainClass {

	public static void main(String[] args) {
		
		Sonata s1 = new Sonata();
		Car s2 = new Sonata();
		Sonata s3 = new Sonata();
		
		Morning m1 = new Morning();
		Morning m2 = new Morning();
		Car m3 = new Morning();
		
		Car t1 = new Tesla();
		Tesla t2 = new Tesla();
		Tesla t3 = new Tesla();
		Tesla t4 = new Tesla();
		
//		s1.run();s2.run();s3.run();m1.run();m2.run();m3.run();
//		t1.run();t2.run();t3.run();t4.run();
		
//		Sonata[] sonatas = {s1,s2,s3,m1};
//		for(Sonata s : sonatas) {
//			s.run();
//		}
		
		Car[] cars = {s1,s2,s3,m1,m2,m3,t1,t2,t3,t4};
		for(Car c : cars) {
			c.run();
		}
		
		System.out.println("---------------------------------------");
		
		s1.frontLeft = new Ntire();
		s1.frontRight = new Ntire();
		s1.rearLeft = new Ntire();
		s1.rearRight = new Ntire();
		
		Driver kim = new Driver();
		kim.drive(m1);
		kim.drive(t1);
		kim.drive(s1);
		
		
		
		
		
		

	}

}
