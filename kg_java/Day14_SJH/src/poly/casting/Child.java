package poly.casting;

public class Child extends Parent {

	public int n2; // 자식 고유의 멤버변수(필드)

	@Override
	public void method2() {
		System.out.println("재정의된 2번 메소드 호출!");
	}
	
	public void method3() {
		System.out.println("자식 고유의 3번 메소드 호출!");
	}
	
	
	
}
