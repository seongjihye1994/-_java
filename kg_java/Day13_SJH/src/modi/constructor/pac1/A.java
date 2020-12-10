package modi.constructor.pac1;

public class A {
	
	// 모두 호출 가능
	A a1 = new A(true);
	
	A a2 = new A(30);
	
	A a3 = new A(3.14);
	

	// 생성자 1.
	public A(boolean b) {}
	
	// 생성자 2.
	A(int i) {}
	
	// 생성자 3.
	private A(double d) {}
}
