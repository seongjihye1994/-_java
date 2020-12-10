package final_constant;

public class Earth {
	
	// # 상수 (constant)
	
	// - 상수는 고정된 불변의 값입니다.
	// - static과 final을 섞어놓은 것이 constant 입니다.
	// - 상수는 고정된 불변의 값입니다. 따라서 어디에서 접근을 하더라도
	//   같은 값이 나와야 하며, 값의 변경도 불가능합니다.
	
	// - 따라서, 자바에서는 상수를 선언할 때 static과 final을 동시에 사용합니다.
	
	static final double RADIUS = 6400;
	// 값의 변함을 막으며 모든 객체가 같은 값을 공유 할 수 있도록 static와 final을 써줍니다.
	static final double SURFACE_AREA;
	
	static { // 정적 초기화자 (static의 생성자) , static 변수의 값을 생성자로 초기화하고 싶을 때
		SURFACE_AREA = RADIUS * RADIUS * 4 * Math.PI;
	}

}
