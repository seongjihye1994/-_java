package poly.player;

public class Mage extends Player {
	
	int mana;

	// 생성자
	Mage(String name) {
		super(name); 
		this.mana = 100; 
	}
	
	public void blizzard(Player[] targets) {
		System.out.printf("%s가 눈보라를 시전했습니다.\n", this.name);
		System.out.println("---------------------------------");
		for (Player p : targets) {
			int damage = (int) (Math.random() * 6) + 10;
			p.hp -= damage;
			System.out.printf("%s님의 데미지가 %d만큼 깍였습니다. 남은 hp : %d\n", p.name, damage, p.hp);
			
		}
		
	}

	
	@Override
	void characterInfo() {
		super.characterInfo(); // Player 클래스 상속
		System.out.println("# 마나 : " + mana);
		
		
	}
	
	
	
}
