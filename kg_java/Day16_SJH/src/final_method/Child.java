package final_method;

public class Child extends Parent { 

	@Override
	void method1() {
		super.method1();
	}

	@Override
	void method2() {
		super.method2();
	}
	
//	@Override
//	void method3() {
//  System.out.println("메소드 재정의!");
//	}
	// method3는 final 키워드가 붙어있어 자식객체에서 오버라이딩(메서드 제정의) 불가능합니다.
	

}
