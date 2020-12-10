package poly.player;



public class Player {

	// 필드(멤버변수)
	// 모두가 가지고 있는 필드의 속성과 메서드를 부모 클래스에 저장한다.
	String name;
	int level;
	int atk;
	int hp;
	
	// 생성자
	Player() {
		level = 1;
		atk = 3;
		hp = 50;
	}
	
	Player(String name) {
		this(); // 오버로딩한 기본 생성자를 부르는 행위! (레벨, atk, hp의 필드값이 모두 같기 때문에 똑같은 생성자를 부르면 코드를 줄일 수 있다.)
		this.name = name; // p2.name
	}
	
	Player(String name, int hp) {
		this(name); // 바로 위의 String name이 들어있는 2번 생성자를 호출! 여기서 name은 this가 가리키고 있는 객체(실시간으로 실행되는 객체)인 플레이어 3번의 이름을 가리킨다.
		this.hp = hp; // hp는 값이 바뀌어야 하기 때문에 주석없이 적어줘야 한다. 만약 주석처리를 해버리면 hp는 100이 아닌 50이 된다.
	}
	
	// 메서드
	void characterInfo() {
		
		System.out.println("*** 캐릭터 정보 ***");
		System.out.println("# 아이디 : " + name);
		System.out.println("# 레벨 : " + level);
		System.out.println("# 공격력 : " + atk);
		System.out.println("# 체력 : " + hp);
//		System.out.println("지금 이 메서드를 부른 객체의 이름 : " + this.name);
		// this.멤버변수 : 각각의 객체마다 숨겨진 멤버변수
		// 생성자를 만들고 객체를 생성할 때마다 그 객체의 필드값이 사용될 때 마다 유동적으로 바뀐다!
		
		
		
		
		
		
	}
	
}
