
public class VariableExample {
	public static void main(String[] args) {
		
		/*
		 # 변수 (Variable)
		 1. 변수란 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다. 
		 2. 변수는 생성할 때 변수에 저장되는 데이터의 크기와 모양에 따라 적당한 데이터 타입을 설정합니다.
		    ex) int : 4바이트 정수, String : 문자열(문장)
		 3. 변수는 동일한 이름으로 중복 선언할 수 없습니다.
		 4. 변수 내부의 값은 언제든지 변경이 가능합니다.
		 */
		
		// 변수의 선언 : [자료형(데이터 타입)] [변수명];
		int age;
		
		// 변수의 초기화 : [변수명] = [값];
		age = 40;
		
		// 변수의 값 참조(사용)
		System.out.println(age); // 40
		
		// 변수는 선언과 동시에 초기화를 진행할 수 있습니다. (처음 선언 시 1회만 가능)
		int score = 95;
//		int score = 90; (x)
		score = 90; // 95에서 90으로 초기화, 변수의 값 변경시에는 자료형(데이터타입)을 쓰지 않습니다.
		System.out.println(score); // 90
		
		// 변수에는 다른 변수의 값도 저장이 가능합니다.
		int doubleScore = score * 2;
		System.out.println(doubleScore); // 180
		
		// 변수의 자료형에 맞지 않는 데이터는 저장이 불가능합니다.
//		int count = "한 번"; (x)
//		int count = 23.5; (x)
//		String str = 100; (x)
		
		// 변수는 자료형이 달라도 이름이 동일하다면 중복 선언할 수 없습니다.
		String name = "홍길동";
//		int name = 572; (x)
		
		// 선언 및 초기화하지 않은 변수는 참조가 불가능합니다.
//		int result = doubleScore + num; (x) // num은 선언과 초기화되지 않았기 때문에 참조 불가능
		int result;
//		System.out.println(result); (x) // result는 초기화되지 않았기 때문에 참조 불가능
		
	}
}
