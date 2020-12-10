
public class MainClass {

	public static void main(String[] args) {


		// -객체를 생성하지 않았을 때의 예시를 보고
		// 빵 객체를 생성할 수 있는 클래스(설계도)를 작성해보세요.
		// 클래스 이름은 Bread로 통일하겠습니다.
		
		// -MainClass 에서 똑같이 피자빵, 초코케이크의 정보를 호출해 보세요.
		// (생성자는 마음데로~)
		
		// 피자빵 클래스 생성
		Bread pizza = new Bread();
		
		// 피자빵 값 초기화
		pizza.name = "피자빵";
		pizza.price = 500;
		pizza.ingredient = "밀가루";
		
		pizza.info();
		
		// -------------------------------------------------
		
		// 초코빵 클래스 생성과 동시에 정의 생성자에 의한 값 초기화
		Bread choco = new Bread("초코케이크", 1500, "초콜렛");
		
		choco.info();
		
		
	}

}

