
public class Identifier {

	public static void main(String[] args) {
		
		// 꼭 지켜야 할 규칙 (안 지킬 시 에러가 발생합니다!)
		// 1. 식별자의 이름은 중복을 허용하지 않습니다.
		// 그리고, 대 / 소문자를 철저하게 구분합니다.
		int age = 35;
//		int age = 40; (x)
		int Age = 40;
		System.out.println(age); // 30
		System.out.println(Age); // 40
		
		// 2. 식별자 이름은 숫자로 지정하거나, 숫자로 시작하면 안됩니다.
//		int 700 = 365; (x)
//		int 7number = 7; (x)
		int number7 = 7;
		int num7ber = 7;
		
		// 3. 식별자 이름에 공백을 포함할 수 없습니다.
//		int my birth day = 19940928; (x)
		int mybrithday = 19940928;
		int myBirthDay = 19940928;
		
		// 4. 식별자 이름에 쓸 수 있는 특수문자는 언더바(_), 달러기호($) 뿐입니다.
		//    그러나, 사용을 권장하지는 않습니다.
		String $hello_ = "안녕";
		
		// 5. 키워드(예약어)는 식별자 이름으로 지정이 불가능합니다.
//		String class = "클래스";
		String className = "클래스";
		
		// 6. 한글이나 한자 같은 식별자 이름도 지정이 가능합니다.
		//    그러나 사용을 권장하지 않습니다.
		int 숫자 = 10;
		String 名 = "홍길동";
		System.out.println(숫자);
		System.out.println(名);

	}

}
