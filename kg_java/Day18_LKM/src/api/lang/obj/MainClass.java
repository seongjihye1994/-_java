package api.lang.obj;

public class MainClass {

	public static void main(String[] args) {
		
		Person hong = new Person("홍길동", 25, "남자");
		Person park = new Person("박영희", 25, "여자");
		
		System.out.println(hong);
		
		if(hong.equals(park)) {
			System.out.println("나이가 서로 같습니다.");
		} else {
			System.out.println("나이가 서로 다릅니다.");
		}
		
		
		
		
		
		
		
		
		
		

	}

}
