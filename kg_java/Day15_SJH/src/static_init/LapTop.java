package static_init;

public class LapTop {
	
	// 정적 초기화자란??
	
	// 스태틱은 객체를 생성하지 않고 호출할 수 있는데, 객체를 생성하지 않으면 생성자를 사용할 수 없기 때문에,
	// 스태틱만을 위한 생성자가 스태틱 이니셜라이저(정적 초기화자)입니다.

	// static 변수
	public static String company;
	public static String model;
	public static String info;
	// 인스턴스 변수
	public int price;
	
	// 정적 변수(static 변수)를 자동으로 초기화하려면 정적 초기화자를 사용합니다.
	static {
		System.out.println("정적 초기화자가 호출됨!");
		company = "LG";
		model = "Gram";
		info = company + "-" + model;
		//price = 1000000; >> 이 블록은 static변수만 들어올 수 있기 때문에 인스턴스 변수는 사용할 수 없습니다.
	}
	
	// 생성자(객체)
	public LapTop() {
		System.out.println("생성자가 호출됨!");
		company = "LG";
		model = "Gram";
		info = company + "-" + model;
		price = 1000000;
		
	}
}
