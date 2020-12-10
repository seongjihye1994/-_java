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
		// this()를 호춣하면 이미 this() 내부에 super()가 있기 때문이다!
	}
	
	// 돌진 메서드
	public void rush(Player target) { // 단일 타겟
		// 1. rush라는 기술을 사용하는 사람의 이름을 적절한 키워드를 사용하여 출력해 주세요.
		// 2. 이 기술을 맞은 사람의 피해량을 출력해 주세요.
		// 		전사는 10피해, 마법사는 20의 피해, 사냥꾼은 15의 피해를 각각 입습니다.
		// 3. 직업별로 다른 피해량을 instanceof 키워드를 사용하여 각각 출력해 주세요.
		// 4. 남은 체력도 마찬가지로 출력해 주세요.
		System.out.printf("%s님이 %s님에게 돌진을 시도했습니다.\n", this.name, target.name);

		if (target instanceof Hunter) {
			System.out.printf("%s(사냥꾼)님이 15의 피해를 입었습니다.\n", target.name);
			target.hp -= 15;
			System.out.printf("%s(사냥꾼)님의 남은 체력 : %d\n",target.name, target.hp);
		} else if (target instanceof Mage) {
			System.out.printf("%s(마법사)님이 20의 피해를 입었습니다.\n", target.name);
			target.hp -= 20;
			System.out.printf("%s(마법사)님의 남은 체력 : %d\n",target.name, target.hp);
		} else {
			System.out.printf("%s(전사)님이 10의 피해를 입었습니다.\n", target.name);
			target.hp -= 15;
			System.out.printf("%s(전사)님의 남은 체력 : %d\n",target.name, target.hp);
			System.out.println("====================================================");
		} 
		System.out.println("====================================================");
		
		
	}
	
	
	@Override // 단축키 alt + shift + s -> override/implements methods
	void characterInfo() {
		super.characterInfo(); // 부모 클래스에 있는 메서드를 모두 호출하는 키워드 super
		System.out.println("# 분노 : " + rage);
	}
	
	
	
	

}
