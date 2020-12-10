package inherit.good;

public class Hunter extends Player {

	String pet;

	@Override
	void characterInfo() {
		super.characterInfo(); // // Player 클래스 상속
		System.out.println("펫 이름 : " + pet);
		
		
	}
	
	
	
}
