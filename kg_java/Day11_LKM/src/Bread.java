
public class Bread {
	
	String name;
	int price;
	String ingredient;
	
	Bread() {}
	
	Bread(String bName, int bPrice, String bIngredient) {
		name = bName;
		price = bPrice;
		ingredient = bIngredient;
	}
	
	void info() {
		System.out.println("*** 빵 정보 ***");
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주재료: " + ingredient);
	}

}









