
public class Bread {
	
	// 필드
	int price;
	String name;
	String ingredient;
	
	// 피자빵 기본 생성자
	public Bread() {}
	
	// 초코빵 정의 생성자
	Bread(String bname, int bprice, String bIngredient) {
		name = bname;
		price = bprice;
		ingredient = bIngredient;
	}

	// 메서드
	void info() {
		System.out.println("빵 이름 : " + name);
		System.out.println("빵 가격 : " + price);
		System.out.println("주재료 : " + ingredient);
	}
	
	
	
}
