package this_super;

public class Mage extends Player {
	
	int mana;

	Mage(String name) {
		super(name); // Player(부모)의 생성자의 필드값을 물려받음!
		this.mana = 100; // mana는 부모 생성자에 없는 필드값이므로 초기화
	}
	
	@Override
	void characterInfo() {
		super.characterInfo(); // Player 클래스 상속
		System.out.println("# 마나 : " + mana);
		
		
	}
	
	
	
}
