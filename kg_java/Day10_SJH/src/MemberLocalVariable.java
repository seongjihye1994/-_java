
// # 멤버변수 (field, class member variable)

// 1. 클래스 블록에 선언된 변수를 의미합니다.

// 2. 메모리의 heap 영역에 저장되며, 값을 초기화하지 않아도
// 	    각 데이터 타입의 기본값으로 자동 초기화 됩니다. (int는 0, String에는 null, double에는 0.0)

// 3. 객체를 가리키고 있는 레퍼런스변수(참조변수)가 사라지거나
//    주소값을 잏어버리게 되면, 메모리에서 가비지 컬렉터(gc)에 의해
//    자동으로 제거됩니다.

// ------------------------------------------------------------------------------

// # 지역변수 (local variable)

// 1. 메서드나 생성자 블록 내부에서 선언된 변수를 의미합니다.

// 2. 메모리의 stack 영역에 저장되며, 선언된 블록을 벗어나면
//    메모리에서 자동으로 제거됩니다.

// 3. 값을 초기화하지 않으면 변수를 사용할 수 없습니다.


public class MemberLocalVariable {
	
	int a; // 멤버변수 (클래스 블록)
	
	void printNumber(int c) { // 매개변수(지역변수)(매서드 내부)
		
		//int b; // 지역변수(메서드 내부)
		
		System.out.println("멤버변수 : " + a); // 멤버변수는 직접 초기화하지 않아도 자동으로 초기화가 되기 때문에 사용할 수 있다.
		// System.out.println("지역변수 : " + b); >> 지역변수는 초기화하지 않으면 사용할 수 없다.
		System.out.println("매개변수 : " + c); 
		
	}

	public static void main(String[] args) {

		MemberLocalVariable member = new MemberLocalVariable();
		member.printNumber(4);
	}

}
