package static_calc;

public class Claculator {
	
	// 계산기마다 색깔이 각각 다를 수 있기 때문에 color 같은 변수는 계산기 색깔을 하나로 통일하지 않는 이상
	// 데이터를 공유시키지 말고, 객체별로 따로 관리해야 합니다.
	String color; // 계산기 컬러
	
	
	// 반면에, pi와 같은 원주율값은 계산기마다 값이 동일하기 때문에
	// static을 붙여서 데이터를 공유하게 하는 것이 유리합니다.
	static double pi = 3.14159265;
	
	
	// ---------------------------------------------------------------------------------------
	
	
	// 메서드 내부에서  non-static 데이터를 참조하고 있는 메서드는  해당 변수의 정확한 위치 (객체의 주소값)을 알려줘야 하기 때문에
	// 정적 메서드로 선언하기 부적합합니다.
	public void paint(String color) {
		System.out.println("계산기에 " + color + "색을 칠합니다.");
		this.color = color; // this를 붙여야 하는 메서드에서는 static가 없어야 한다.
	} 
	
	
	// 메서드 내부에서 인스턴스 변수를 참조하지 않고, 범용성 있게 사용하는
	// 메서드는 static 키워드를 붙여서 정적 메서드로 선언하는 것이 좋습니다.
	// 즉, 1. 메서드 내부에서 인스턴스멤버변수를 참조하지 않고, 2. 모든 클래스에서 범용적으로 사용하는 기능
	public static double areaCircle(int r) {
		return r * r * pi;
	}
	

	
}
