package modi.member.pac1;

public class A {

	// 필드
	
	public int x; // public

	int y; // 패키지 프렌들리

	private int z; // private
	
	
	// 빠른 기본 생성자(ctrl + space + enter)
	public A() {
		
		x = 1;
		y = 2;
		z = 3;
		
		method1();
		method2();
		method3();
	}
	
	// 메서드
	
	public void method1() {} // public
	void method2() {} // 패키지 프렌들리
	private void method3() {} // private
	
	
	
	
	
	
	
}
