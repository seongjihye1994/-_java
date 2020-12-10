package final_method;

public class Parent { // class에 final을 붙이면 상속이 불가능합니다.
	
	// - 클래스 선언 시 final을 사용하면 그 클래스는 상속이 불가능해집니다.
	// - final 클래스는 자식 클래스를 가질 수가 없고, 오직 외부에서 객체 생성을 통해서만
	//   사용할 수 있습니다.
	
	void method1() {}
	void method2() {}
	
	final void method3() {} // final이 붙은 메서드는 자식객체에서 오버라이딩 불가능합니다.

}
