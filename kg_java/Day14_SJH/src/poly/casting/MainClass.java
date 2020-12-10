package poly.casting;

public class MainClass {

	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.n1 = 1;
		// p.n2 = 2; 부모는 자식의 변수나 메서드는 사용할 수 없다.
		
		p.method1();
		p.method2();
		// p.method3(); 부모는 자식의 변수나 메서드는 사용할 수 없다.
		
		System.out.println("-----------------------");

		Child c = new Child();
		
		c.n1 = 1; // 부모로부터 물려받은 속성
		c.n2 = 2; // 자식 고유의 속성
		
		c.method1();
		c.method2();
		c.method3();
		
		System.out.println("-----------------------");
		
		// 다형성 적용 (promotion)
		
		Parent p2 = new Child(); // 부모타입에 자식객체
		p2.n1 = 2;
		// p2.n2 = 2; (x)
		
		p2.method1();
		p2.method2();
		// p2.method3(); (x)
		System.out.println(p2);
		
		// 다형성이 적용되면 자식클래스의 본래의 멤버(멤버변수, 메서드)를 참조하지 못하는 문제가 발생합니다.
		// 이를 해결하기 위하여 강제 타입 변환 (Downcasting)으로 형변환해서 사용합니다.
		// 부모는 자식의 어떤것도 사용할 수 없기 때문입니다.
		
		Child c2 = (Child) p2; // p2는 부모객체, 상위클래스가 하위클래스에 접근해 사용하려면 다운캐스팅 해 줘야 한다.
		c2.n2 = 2;
		c2.method3();
		
		System.out.println("p2의 주소값 : " + p2);
		System.out.println("c2의 주소값 : " + c2);
		
		// 다형성이 한번도 발생하지 앟은 객체는
		// 강제 형 변환을 진행할 수 없습니다.
		
		// Child c3 = (Child) p; // Child c3 = new Parent(); // 자식객체는 태어날때부터 부모의 super로 생성자를 갖고 태어나기 때문에 자식객체가 생겨나면 부모객체도 함께 생성되지만
		// 부모객체가 생성될때 자식객체가 생성되지는 않는다.
		// 자식이 부모를 낳을 순 없다.
		
		
		
		
		

	}

}
