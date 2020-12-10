package this_super;

public class Hunter extends Player {

	String pet;
	
	Hunter(String name) {
		super(name); // Player(부모)의 생성자의 필드값을 물려받음!
		this.pet = "냥이"; // pet은 부모 생성자에 없는 필드값이므로 초기화
	}
	

	@Override
	void characterInfo() {
		super.characterInfo(); // // Player 클래스 상속
		System.out.println("펫 이름 : " + pet);
		
		
	}
	
	
	
}
