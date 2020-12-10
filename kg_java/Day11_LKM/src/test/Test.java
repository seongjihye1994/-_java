package test;

//import fruit.Apple;
//import fruit.Banana;
//import fruit.Melon;
import fruit.*; //fruit 패키지의 모든 클래스를 import 하겠다.
import juice.*;

public class Test {

	public static void main(String[] args) {
		
		//다른 패키지 내의 같은 이름을 가진 클래스 객체를 생성할 때는
		//반드시 패키지 경로를 표시해 주셔야 합니다.
		
		fruit.Apple a = new fruit.Apple();
		juice.Apple a2 = new juice.Apple();
		Banana b = new Banana();
		Melon m = new Melon();
		
		
		
		
		
		
		

	}

}
