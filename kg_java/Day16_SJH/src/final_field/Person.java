package final_field;

public class Person {

	final String nation = "대한민국"; // final 키워드가 붙은 변수는 상수로 인식되어 초기화되지 않으면 사용할 수 없다.
	final String name;
	int age;
	
	public Person(String name) {
		this.name = name; // final변수를 초기화하는 방법 2가지, 1. 변수 생성과 동시에 초기화 2. 생성자를 생성하고 초기화
	}


}
