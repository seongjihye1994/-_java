package overloading;

// # 오버로딩 (중복) : 하나의 클래스 내부에서 같은 이름을 가진 메서드나
// 생성자를 여러 개 중복해서 선언할 수 있게 해주는 문법
// 중복을 사용하면 하나의 메서드로 매개 변수의 윻ㅇ에 따라 다른 동작이 실행되게 됩니다.

// - 오버로딩 적용 조건 : 
// 1. 매개 변수의 데이터 타입이 다를 것! or
// 2. 매개 변수의 전달 순서가 다를 것 ! or
// 3. 매개 변수의 갯수가 다를 것!

public class Calculator {
	
	void inputData() {}
	
	void inputData(int a) {}
	
	void inputData(int a, int b) {}
	
	void inputData(String s) {}
	
	void inputData(int a, double d) {}
	
	void inputData(double d, int a) {}
	
	//void inputData(int number) {} // (x) 정수 매개값을 받는 매개값 int a가 이미 있기 때문.
	
	//int inputData(int number) { // (x) 오로지 매개변수를 보고 판단함, 리턴타입(반환유형)은 오버로딩에 영향을 미치지 못한다.
	//	return 0;
	//}
	

	// static이 없는 메서드
	int clacRectArea(int r) {
	
		return r * r;
	}
	
	int clacRectArea(int w, int h) {
		
		return w * h;	
	}
		
	int clacRectArea(int f, int c, int h) {
		
		return (f + c) * h / 2 ; // 사다리꼴 구하는 공식
	}
		

	

}
