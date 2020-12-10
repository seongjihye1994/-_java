package this_super;

public class MainClass {

	public static void main(String[] args) {

		Player p = new Player();
		p.name = "플레이어1";
//		System.out.println("p의 주소값: " + p);
		p.characterInfo();
		
		System.out.println("------------------------------------");
		
		Player p2 = new Player("플레이어2");
//		System.out.println("p2의 주소값: " + p2);
		p2.characterInfo();
		
		System.out.println("------------------------------------");

		Player p3 = new Player("플레이어3", 100);
		p3.characterInfo();
		
		System.out.println("------------------------------------");

		Warrior w1 = new Warrior("전사1");
		w1.characterInfo();
		
		System.out.println("------------------------------------");

		Mage m1 = new Mage("마법사1");
		m1.characterInfo();
		
		
		
		
		
	}

}
