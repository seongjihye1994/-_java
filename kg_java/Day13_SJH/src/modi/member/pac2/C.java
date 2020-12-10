package modi.member.pac2;

import modi.member.pac1.A;

public class C {

	public C() {
	
		A a = new A(); // public이라 import하면 사용 가능
		
		a.x = 1; // public
		// a.y = 2; 패키지 프렌들리는 같은 패키지까지만 허용하고 다른 패키지에서는 사용 불가
		// a.z = 3; private 
		
		a.method1(); // public
		// a.method2(); 패키지 프렌들리는 같은 패키지까지만 허용하고 다른 패키지에서는 사용 불가
		// a.method3(); private
		
		
	}
}
