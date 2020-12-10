package poly.player;

public class Warrior extends Player {
	
	int rage;
	
	Warrior(String name) {
		super(name); // 자식의 디폴트 생성자 내부에는 무조건 부모의 생성자가 함께 생성된다. super(), 직접 기재하지 않아도 생성되고, 숨어있는 것.
		//this.name = name; 
		// 부모 생성자에 있는 이름 말고 다른 이름을 받고싶은데 this.name = name;을 굳이 해줄 필요가 없다.
		// 부모 생성자에도 이미 this.name 필드값이 있기 때문에 생성자에 멤버변수로  name을 받고 super(name)으로 이름을 부를 수 있다.
		this.rage = 60; // 부모 생성자에 없는 값은 직접 기재해야 한다.
		
		// this()와 supe()r는 무조건 최 상단에 위치해야 합니다.
		// 또한, this()와 super()는 함께 사용할 수 없습니다.
		// this()를 호춣ㅎ면 이미 this() 내부에 super()가 있기 때문이다!
	}
	
	@Override // 단축키 alt + shift + s -> override/implements methods
	void characterInfo() {
		super.characterInfo(); // 부모 클래스에 있는 메서드를 모두 호출하는 키워드 super
		System.out.println("# 분노 : " + rage);
	}
	
	// - 메서드 오버라이딩 super
	// 메서드 오버라이딩을 하지 않으면 부모의 메서드는 상속되지 않고, 정의한 메서드만 실행되기 때문에
	// 메서드를 상속받기 위해서는 꼭  super를 해줘야 합니다.
	
	
	

}
