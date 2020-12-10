
public class LojicalOperator {
	public static void main(String[] args) {
		
		// 비교(관계) 연산자 (<, <=, >, >=, ==, !=)
		// 좌항과 우항의 크기를 비교하여 결과값으로 항상 논리형 타입 값을
		// 도출합니다.
		
		System.out.println(10 >= 10); // true
		System.out.println(10 > 10); // false
		
		/*
		 # 논리연산자 (&, &&, |, ||)
		   - 좌항과 우항의 논리값을 연산하여 하나의 논리값을 도출합니다.
		   1. &, && : 양쪽 항의 논리값이 모두 true일 경우에만 true를 도출한다.
		   2. |, || : 양쪽 항의 논리값 중 한쪽만 true여도 true를 도출한다.		  
		*/
		
		int x = 10, y = 20;
		System.out.println(x > 10 && y < 30); // f
		System.out.println(x > 10 || y < 30); // t
		
		System.out.println(x > 10 & y < 30); // f   
		System.out.println(x > 10 | y < 30); // t
		
		// 논리연산자 하나와 두개의 차이점은?
		// 하나는 좌항에서 결과가 도출되어도 우항을 비교하러 가기 때문에 연산 속도 처리가 느린 반면,
		// 두개는 좌항에서 결과가 도출되면 우항을 비교하러 가지 않기 때문에 연산 속도 처리가 비교적 빠르다.
		
		
		// 논리 반전 연산자 (! : 단항)
		// 논리값을 단순히 반전시킵니다. true -> false, false -> true
		int z = 10;
		System.out.println(z == 10);
		System.out.println(!(z == 10));
		
		int a = 5; // 0000 0101 > 1111 1010 > 1의 보수 > 2의 보수 > +1 > 부호비트 제외하면 6 > -6
		System.out.println(~a);
		
		
		
		
	}
}
