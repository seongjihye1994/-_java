package this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p = new Player();
//		System.out.println("p의 주소값 : " + p);
		p.name = "플레이어 1";
		p.characterInfo();
		
		System.out.println("--------------------------------");
		
		Player p2 = new Player("플레이어2");
//		System.out.println("p2의 주소값 : " + p2);
		p2.characterInfo();
		
		System.out.println("--------------------------------");
		
		Player p3 = new Player("플레이어3", 100);
		p3.characterInfo();
		
		System.out.println("--------------------------------");
		
		Warrior w1 = new Warrior("전사 1");
		w1.characterInfo();
//		플레이어의 기본 생성자 호출
//		*** 캐릭터 정보 ***
//		# 아이디 : null
//		# 레벨 : 1
//		# 공격력 : 3
//		# 체력 : 50
//		# 분노 : 0
		// Player의 기본 생성자가 호출됨
		
		System.out.println("--------------------------------");
	
		Hunter h1 = new Hunter("헌터 1");
		h1.characterInfo();
		
		System.out.println("--------------------------------");
		
		Mage m1 = new Mage("마법사 1");
		m1.characterInfo();
		
		
		
	}

}
