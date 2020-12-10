package modi.member.pac1;

public class B {

	public B() {
		
		A a = new A();
		a.x = 1; // public 이라 사용 가능
		a.y = 2; // 같은 패키지라 패키지 프렌들리 사용 가능
		// a.z = 3; private은 사용불가
		
		a.method1();
		a.method2();
		// a.method3(); private라 사용 불가
		
	}
	
}
