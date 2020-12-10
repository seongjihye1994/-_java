package final_field;

public class MainClass {

	public static void main(String[] args) {
		
		Person kim = new Person("김철수");
		// kim.nation = "미국"; // final로 정의된 nation 변수는 값 수정이 불가능합니다.
		// kim.name = "김마이클";
		kim.age = 20; // final을 붙이지 않은 변수는 값 수정이 가능합니다.
		
		Person park = new Person("박영희");
		// park.nation = "중국"; // 역시 person 객체의 nation 변수가 final로 정의되어 있기 때문에 값수정이 불가능합니다.
		// park.name = "박중국";
	}

}
