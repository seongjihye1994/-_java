package static_singleton;

public class MainClass {
	public static void main(String[] args) {
		
//		Singleton s1 = new Singleton();
//		s1.method1();
//		s1.method2();
		
		// 무분별한 객체 생성을 막기위해 외부에서 객체 생성하는것을 막으려면?
		// 생성자를 만들고 초기화하는 생성자에 private를 붙인다.
		
		Singleton s1 = Singleton.getInstance(); // getInstance 메소드 호출
		s1.method1();
		s1.method2();
		
		// 무조건 getInstance() 메소드를 통해서만 주소값을 받을 수 있게 처리하기 위해 private static Singleton s = new Singleton();에 private 를 붙여준다.
		
	}

}
