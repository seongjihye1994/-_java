package inherit.good;

public class Mage extends Player {
	
	int mana;

	@Override
	void characterInfo() {
		super.characterInfo(); // Player 클래스 상속
		System.out.println("# 마나 : " + mana);
		
		
	}
	
	
	
}
