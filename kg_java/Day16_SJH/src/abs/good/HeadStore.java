package abs.good;

public abstract class HeadStore {

	// ** 추상클래스, 추상메서드
	
	// 1. 추상 클래스의 메서드에 abstract를 붙이면 해당 메서드는
	//    실체가 없는 추상 메서드가 되며, 이 메서드는 상속을 통해 자식 클래스에서
	//    무조건 오버라이딩을 하도록 강요됩니다. ( <-> final)
	// 2. 추상 메서드는 실체가 존재하지 않는 메서드의 틀 역할을 하기 때문에
	//    메서드의 바디({}) 부분이 없고, 세미콜론으로 메서드 선언을 마감합니다.
	// 3. 일반 클래스에서는 추상 메서드를 선언할 수 없습니다.
	//    추상 메서드가 하나라도 존재하는 경우에는 반드시 해당 클래스도 추상 클래스로
	//    선언해야 합니다.
	// 4. 추상클래스에 추상메서드만을 서언할 필요는 없습니다.
	//    일반 멤버변수 및 메서드도 얼마든지 선언이 가능합니다.
	
	
	
	// 자식객체가 무조건 오버라이딩을 강요받도록 abstract를 붙임 (추상메서드)
	public abstract void orderApple();
	public abstract void orderBanana();
	public abstract void orderGrape();
	public abstract void orderMelon();
	
	
	// 추상 클래스(부모클래스)는 스스로의 객체를 생성할 수는 없습니다.
	// 추상클래스의 객체는 해당 클래스를 상속하는 자식클래스의 생성자 내의
	// super()에 의해 호출되어 생성됩니다.
	// 추상메서드를 만들어줄 자식객체가 생성되지 않았기 때문에
	// 자식이 생성되지 않으면 부모가 생성되지 않습니다.
	
	public HeadStore() { 
		System.out.println("HeardStore의 객체 생성!");
		// HeadStore의 생성자는 존재하기 때문에 문법적으로는 객체를 생성할 수 있지만,
		// 자식객체가 생성되지 않았기 때문에 스스로의 객체를 생성할 수 없습니다.
	}
	
	// 일반 메서드도 선언 가능합니다.
	public void orderWaterMelon() {
		System.out.println("수박쥬스의 가격은 4000원 입니다.");
	}
	
	// 일반 멤버변수도 선언 가능합니다.
	public int i;
	
	
}
