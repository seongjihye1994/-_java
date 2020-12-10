package inherit.good;

// # 부모 클래스, 상위 클래스 (Parent, Super class)

// - 데이터를 다른 클래스에게 상속하는 클래스를 부모 클래스라고 부릅니다.
// - 상속을 사용하게 되면 데이터를 물려받는 클래스에게 부모 클래스의 멤버변수(필드)와
//   매서드가 상속됩니다. 단, 생성자는 상속되지 않습니다.

public class Player {

	// 필드(멤버변수)
	// 모두가 가지고 있는 필드의 속성과 메서드를 부모 클래스에 저장한다.
	String name;
	int level;
	int atk;
	int hp;
	
	// 메서드
	void characterInfo() {
		
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
		
		
		
		
	}
	
}
