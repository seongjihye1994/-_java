package static_singleton;

public class Singleton {
	
	// # 싱글톤 디자인 패턴
	// 		- 클래스의 객체 생성을 단 1개로 제한하기 위한 디자인 패턴
	// 1. 외부에서 이 클래스의 객체를 생성할 수 없도록 생성자를 단 한개만 선언한 후,
	//    private 접근 제한을 붙입니다.
	// 2. 생성자를 호출할 수 있는 영역은 같은 클래스 내부 뿐이므로
	// 	    자신의 클래스 내부에서 스스로의 객체를 단 1개만 생성한다.
	// 3. 외부에서 이 클래스의 객체를 요구할 때, 2번에서 미리 만들어 놓은
	//    단 하나의 객체의 주소값을 공개된 메서드를 통해 리턴합니다.
	
	// 1. 생성자에 private를 붙임
	private Singleton() {
		System.out.println("객체가 생성됨!");
	}
	
	// 2. 자신의 클래스 내부에서 스스로의 객체를 1개만 생성
	private static Singleton s = new Singleton(); // 무조건 getInstance() 메소드를 통해서만 주소값을 받을 수 있게 처리하기 위해 private static Singleton s = new Singleton();에 private 를 붙여준다.
	
	// 3. public으로 공개된 메서드를 통해 2번의 주소값을 리턴함
	public static Singleton getInstance() { // 메서드 이름 getInstance()는 관례임
		// 모든 클래스가 전역적으로 싱글톤 객체를 사용해야 하니까 static을 붙여준다.
		return s;
	}
	
	
	
	/////////////////////////////////////////////////////////
	
	public void method1() {
		System.out.println("꼭 필요한 메서드");
	}
	
	public void method2() {
		System.out.println("무조건 사용해야 하는 메서드");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
