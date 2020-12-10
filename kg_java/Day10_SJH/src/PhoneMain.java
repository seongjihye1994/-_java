
public class PhoneMain {

	public static void main(String[] args) {
		
		// Phone 객체 생성
		Phone basic = new Phone(); // Phone() : Phone의 생성자를 호출!
		
		
		// 필드값 초기화 (PHone클래스에서 생성자를 생성하고 값을 초기화 해 주면 아래 로직을 적어주지 않아도 된다!)
//		basic.model = "폴더폰";
//		basic.color = "회색";
//		basic.price = 200000;
		
		// Phone 클래스의 메서드 호출
		basic.showSpec();
		
		Phone galaxyS20 = new Phone("갤럭시s20"); // String 매개값을 받을 수 있는 생성자를 이미 만들어 놨기 때문에 가능
		galaxyS20.showSpec();
		
		Phone iPhone11 = new Phone("아이폰 11", "화이트");
		iPhone11.showSpec();
		
	}

}
