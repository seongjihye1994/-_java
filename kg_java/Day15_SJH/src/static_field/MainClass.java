package static_field;

public class MainClass {

	public static void main(String[] args) {
		
		// Count 객체 생성
		Count c1 = new Count();
		c1.a += 5;
		c1.b += 5; // static 변수는 변수가 조금 기울어져 있다.
		
		System.out.println("인스턴스 변수 c1.a : " + c1.a); // 5
		System.out.println("클래스(정적) 변수 c1.b : " + c1.b); // 5
		
		System.out.println("------------------------------");
		
		Count c2 = new Count();
		c2.a += 7;
		c2.b += 7;
		
		System.out.println("인스턴스 변수 c2.a : " + c2.a); // 7
		System.out.println("클래스(정적) 변수 c2.b : " + c2.b); // 12
		
		System.out.println("------------------------------");
		
		Count c3 = new Count();
		c3.a += 8;
		c3.b += 8;
		
		System.out.println("인스턴스 변수 c3.a : " + c3.a); // 7
		System.out.println("클래스(정적) 변수 c3.b : " + c3.b); // 20
		System.out.println("클래스(정적) 변수 c1.b : " + c1.b); // 20
		
		// static이 붙은 static 클래스 변수는 heap(객체가 저장되는 곳)에 저장되는 것이 아닌 데이터 영역에 저장된다.
		// 그리고 그 데이터 영역에 클래스 이름과 함께 변수와 값이 저장되어 있는것이다.
		// 인스턴스 변수는 주소값을 가지고 객체에 찾아가 접근하지만, 클래스변수는 굳이 주소값을 가지고 객체에 접근할 필요가 없다.
		// static이 붙인 스태틱변수 (클래스변수)는 클ㄹ스의 이름으로 바로 참조할 수 있습니다.
		// 일반 멤버변수(인스턴스 변수)와 혼동할 가능성이 있기 때문에 주소값으로 접근하지 않습니다.
		
		System.out.println("클래스(정적) 변수 Count.b : " + Count.b);
		
		Count.b++;
		Count.b++;
		
		System.out.println("클래스(정적) 변수 Count.b : " + Count.b);
		
	}

}
