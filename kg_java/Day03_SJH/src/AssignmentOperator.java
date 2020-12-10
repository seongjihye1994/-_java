
public class AssignmentOperator {

	public static void main(String[] args) {
		/*
		 # 대입연산자 (=)
		 # 복합 대입 연산자 (+=, -=, *=, /=, %=)
		   - 변수에 값을 대입할 때 사용하는 연산자입니다.
		   - 복합 대입연산자는 대입연산자에 산술 연산자가 포함되어 있는 형태입니다.	 
		*/
		
		int a = 5;
		int b = 5;
		
		a += 3; // a = a + 3;
		b =+ 3; // b = +3
		
		System.out.println("------------------------------");
		System.out.println(b);
		
		a -= 4;
		System.out.println(a); // 4

		a *= 6;
		System.out.println(a); // 24

		a /= 5;
		System.out.println(a); // 4

		a %= 3;
		System.out.println(a); // 1
		
		
	}
}
