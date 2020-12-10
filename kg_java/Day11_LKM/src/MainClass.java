
public class MainClass {
	
	//피자빵
	static int price = 500;
	static String name = "피자빵";
	static String ingredient = "밀가루";
	static void info() {
		System.out.println("빵 이름: " + name);
		System.out.println("빵 가격: " + price);
		System.out.println("주재료: " + ingredient);
	}
	
	//초코케이크
	static int price2 = 1500;
	static String name2 = "초코케이크";
	static String ingredient2 = "초콜렛";
	static void info2() {
		System.out.println("빵 이름: " + name2);
		System.out.println("빵 가격: " + price2);
		System.out.println("주재료: " + ingredient2);
	}

	public static void main(String[] args) {

		/*
		 - 객체를 생성하지 않았을 때의 예시를 보고
		  빵 객체를 생성할 수 있는 클래스(설계도)를 작성해 보세요.
		  클래스 이름은 Bread로 통일하겠습니다.
		  
		 - MainClass에서 똑같이 피자빵, 초코케이크의 정보를
		  호출해 보세요. (생성자는 여러분들 맘대로~)
		 */
		
		Bread p = new Bread();
		p.name = "피자빵";
		p.price = 500;
		p.ingredient = "밀가루";
		p.info();
		
		Bread c = new Bread("초코케이크", 1500, "초콜렛");
		c.info();
		
		
		
		
		
		
		
	}

}
