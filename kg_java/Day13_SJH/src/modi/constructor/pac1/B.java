package modi.constructor.pac1;

public class B {
	
	A a1 = new A(true); // public이기 때문에 사용 가능
	
	A a2 = new A(50); // 패키지 프렌들리는 같은 패키지 내에서 사용 가능하기 때문에 이것도 가능
	
	// a3 = new A(5.56); // private이기 때문에 사용 불가능!

}
