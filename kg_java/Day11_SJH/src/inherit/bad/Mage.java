package inherit.bad;

public class Mage {
	
	// 필드(멤버변수)
	String name;
	int level;
	int atk;
	int hp;
	int mana;
	
	
	// 메서드
	void characterInfo() {
		
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
		System.out.println("# 마나 : " + mana);
	}
	
	
}
	
