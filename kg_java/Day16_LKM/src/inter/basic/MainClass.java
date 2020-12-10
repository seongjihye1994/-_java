package inter.basic;

public class MainClass {

	public static void main(String[] args) {
		
		//인터페이스는 객체를 생성할 수 없는 추상적인 개념입니다.
//		Inter1 i1 = new Inter1(); (x)
		
		System.out.println("1인치: " + Inter1.INCH + "cm");
		
		ImplClass1 i1 = new ImplClass1();
		i1.method1();
		i1.method2();
		i1.testMethod();
		
		System.out.println("----------------------------------------");
		
		//다형성을 적용시키려면 상속이 전제되어야 하지만
		//추가로 인터페이스 구현관계가 있는 경우에도 다형성 발생이 가능합니다.
		
		Inter1 it1 = new ImplClass1();
		it1.method1();
		it1.testMethod();
		//연산자의 우선 순위
		//괄호() -> 참조(.) -> 단항 -> 2항 -> 3항 -> 대입
		((ImplClass1) it1).method2();
		
		
		Inter2 it2 = new ImplClass1();
		it2.method2();
		it2.testMethod();
		
		//구현 클래스가 두 개의 인터페이스와의 서로 상관관계에 있다면
		//인터페이스 타입에서 다른 인터페이스 타입으로 즉시 형 변환이 가능합니다.
		((Inter1) it2).method1();
		
//		Inter1 it3 = new ImplClass3(); (x)
//		Inter2 it4 = new ImplClass2(); (x)
		
		Inter1 it3 = new ImplClass2();
		Inter2 it4 = new ImplClass3();
		
		Inter[] inters = {it1, it2, it3, it4};
		
		
		
		
		
		
		
		
		
		
		

	}

}
