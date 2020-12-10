package modi.constructor.pac2;

import modi.constructor.pac1.A;

public class C {

	A a1 = new A(false); // 서로 다른 패키지 이기 때문에 import한다.
	
	// A a2 = new A(20); // 생성자 2는 패키지 프랜들리기 때문에 서로 다른 패키지에서 사용 불가능!
	
	// A a3 = new A(3.21); private이기 때문에 당연히 사용 불가능!
	
	
}
