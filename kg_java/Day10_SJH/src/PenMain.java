
public class PenMain {

	public static void main(String[] args) {
		
		// 펜의 기능과 속성들을 사용하려면 설계도 (class)를 
		// 바탕으로 펜 객체를 생성해야 합니다.
		// 1. class(디자인틀) 생성 >> 2. main메서드 안에서 객체 생성 >> 3. 객체의 주소값을 변수에 대입
		
		// 객체 생성문법 : 클래스타입 변수명 = new 클래스이름();
		Pen redPen = new Pen();
		// Pen객체의 주소값을 가진 redPen 변수에 Pen클래스의 객체를 대입한다.
		
		// 참조 연산자(.)를 통해 객체의 속성과 기능을
		// 사용할 수 있습니다.
		redPen.color = "빨강"; // 멤버변수를 호출하고 속성에 값을 넣어줌
		redPen.price = 500;
		
		// 객체 생성
		Pen bluePen = new Pen();
		
		// 속성
		bluePen.color = "파랑";
		bluePen.price = 600;
		
		// 메서드
		redPen.write();
		bluePen.write();
		
		redPen.priceInfo();
		bluePen.priceInfo();
		
		// 서로 주소값이 다르다!
		System.out.println(redPen);
		System.out.println(bluePen);
		
		
		

	}

}
