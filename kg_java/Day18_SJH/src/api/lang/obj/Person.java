package api.lang.obj;

public class Person {

	String name;
	int age;
	String gendor;
	
	public Person(String name, int age, String gendor) {
		super();
		this.name = name;
		this.age = age;
		this.gendor = gendor;
	}
	
	@Override
	public String toString() {
		return "이름 : " + this.name + "\n나이 : " + this.age + "\n성별 : " + this.gendor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person p = (Person) obj;
			
			if (this.age == p.age) {
				return true;
			}
		}
		return false;
	}
	
	
	
	void personInfo () {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("성별 : " + this.gendor);
	}


	
	
	
	
	
}
