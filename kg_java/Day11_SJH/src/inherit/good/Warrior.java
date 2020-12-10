package inherit.good;


// # 자식 클래스, 하위 클래스 (Chile, Sub class)

// - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
//   자식 클래스라고 부릅니다.

// - 상속을 적용시키려면 자시클래스 선언부의 클래스 이름 뒤에
//   키워드 extends 를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.


public class Warrior extends Player {
	
	int rage;
	
	@Override // 단축키 alt + shift + s -> override/implements methods
	void characterInfo() {
		super.characterInfo(); // 부모 클래스에 있는 메서드를 모두 호출하는 키워드 super
		System.out.println("# 분노 : " + rage);
	}
	
	// - 메서드 오버라이딩 super
	// 메서드 오버라이딩을 하지 않으면 부모의 메서드는 상속되지 않고, 정의한 메서드만 실행되기 때문에
	// 메서드를 상속받기 위해서는 꼭  super를 해줘야 합니다.
	
	
	

}
