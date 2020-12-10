package inter.basic;

public interface Inter1 extends Inter {

	// 인터페이스에서 변수를 선언하면 자동으로 상수 취급(기울어진 모양)합니다.
	double INCH = 2.54;
	
	// 인터페이스는 생성자를 가지고 있지 않습니다.
//	public Inter1() {
//		System.out.println("인터페이스의 생성자?");
//	}
	
	// 인터페이스에서 메서드를 선언하면 자동으로 추상메서드로 취급하기 때문에 바디({})를 선언할 수 없습니다.
	void method1();
	
	
	
}
