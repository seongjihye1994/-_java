package modi.protec.pac2;

import modi.protec.pac1.A;

public class D extends A {
	
	// A a1 = new A(30);
	
	// protected 제한자는 패키지가 다를 경우
	// 두 클래스 사이에 상속 관계가 있다면
	// 두 클래스 사이에 상속 관계가 있다면  super 키워드를 통해
	// 참조를 허용합니다.
	
	public D() {

		// super(3.14); 패키지프렌들리 (x)
		super(30);
		super.x = 1;
		super.method1();
		
	}
	

	
	

}
