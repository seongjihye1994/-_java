package overloading;

public class MainClass {

	public static void main(String[] args) {
		
		// Calculator 클래스에 clacRectArea() 메서드를 선언하여
		
		// 1. 길이를 하나만 전달하면 정사각경의 넓이를 리턴합니다.
		// 2. 길이를 두 개 전달하면(가로, 세로) 직사각형의 넓이를 리턴합니다.
		// 3. 길이를 세 개 전달하면(밑변, 윗변, 높이) 사다리꼴의 넓이를 리턴합니다.
		
		// MainClass에서 객체를 생성한 후에 직접 메서드를 호출해서 출력해 보세요.
		// (길이가 5인 정사격형의 넓이, 가로 10, 세로 20인 직사각형의 넓이,
		// 윗변 5, 밑변 10, 높이 6인 사다리꼴의 넓이)
	
		Calculator c = new Calculator(); // static영역에서 메서드를 사용하려면 객체를 생성하거나, 메서드에 static을 붙여야한다.
		
		System.out.println(c.clacRectArea(5)); // 정사각형
		System.out.println(c.clacRectArea(10, 20)); // 직사각형
		System.out.println(c.clacRectArea(5, 10, 6)); // 사다리꼴
			
	}

}
