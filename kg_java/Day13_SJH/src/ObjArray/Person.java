package ObjArray;

public class Person {

	// 은닉
	 private String name;
	 private int age;
	 private String gendor;
	 	 
	 // 생성자
	 public Person(String name, int age, String gendor) {
		super();
		this.name = name;
		this.age = age;
		this.gendor = gendor;
	}
	 
	 
	// 빠른 게터와 세터 (alt + shift + s)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
	public int getAte() {
		return age;
	}
	public void setAte(int age) {
		this.age = age;
	}
	
	
	
	public String getGendor() {
		return gendor;
	}
	public void setGendor(String gendor) {
		this.gendor = gendor;
	}
	 
	 
	// 메서드
	void personInfo() {
		System.out.printf("이름 : %s\n나이 : %d세\n성별 : %s\n\n", this.name, this.age, this.gendor);
	}
	
}

