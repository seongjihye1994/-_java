package poly.car;

public class Driver {
	
	// 메서드
	
	public void drive(Car s) { 
		s.run();
	}
	// 차종마다 메서드를 오버로딩(중복)선언 해 줘야 하지만,
	// 부모타입을 파라미터로 받으면
	// Car와 상속되어 있는 자식 객체는 모두 사용할 수 있다.

}
