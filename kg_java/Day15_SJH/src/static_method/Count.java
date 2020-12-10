package static_method;

public class Count {

	public int a; // 인스턴스(멤버) 변수
	public static int b; // 정적(클래스) 변수
	
	// 인스턴스 메소드
	// # 인스턴스 메소드 : 인스턴스 메서드 안에서는 정적(static)변수와 인스턴스 변수 모두 참조(사용)할 수 있습니다.
	public int method1() {
		return this.a + Count.b;
	}
	
	// static(클래스) 메소드(블록, 정적 초기화자)
	// # 스태틱 메소드 : static 내부에서는 static가 붙은 변수나 메서드만 사용할 수 있습니다.
	// static 메소드 안에서 non-static(인스턴스 메서드)멤버를 사용하려면 반드시
	// 객체를 생성해서 주소값을 통해 참조해야 합니다.
	public static int method2() {
		Count ccc = new Count(); // 객체 생성 후 멤버변수로 주소값을 참조해야 사용가능
		return ccc.a + Count.b;
	}
	

}
