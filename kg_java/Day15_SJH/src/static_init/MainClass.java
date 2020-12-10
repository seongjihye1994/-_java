package static_init;

public class MainClass {

	public static void main(String[] args) {
		
//		LapTop l1 = new LapTop();
		System.out.println("노트북의 정보 : " + LapTop.info);
		// 객체 생성된 걸 주석처리 해 버리면 생성자를 만들 수 없기 때문에 null값이 찍힌다.
		// 이를 위해 static만을 위한 정적 초기화자를 생성한다.
		// 정적 초기화자는 직접 부르는 게 아니라, 생성한 후 메인에서 조건에 맞으면 자동으로 호출된다.
		
		// 정적 초기화자를 호출(사용)하려면 클래스를 로딩하시면 됩니다.
		// # 클래스 로딩 방법 (1번 2번 둘 중에 하나만 실행하면 됨)
		// 1. 클래스 이르믈 참조하여 정적 멤버를 호출.
		// 2. 샛페를 생성함.
		// 정적 초기화자는 클래스 로딩 시 최초 1회만 호출됩니다.
		
		

	}

}
