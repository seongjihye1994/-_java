
public class CastingExample3 {
	public static void main(String[] args) {
		
		// 서로 타입이 다른 기본 데이터의 연산 시에는 데이터 타입이 큰 쪽에
		// 맞춰져서 자동으로 형 변환이 진행이 된 뒤에 연산을 진행합니다.
				
		char c = 'B';
		int i = 2;
		
		int intResult = c + i; // int 와 char의 연산을 int형 변수에 대입하면 int형이 출력된다.
		char charResult = (char) (c + i); // c + i의 연산 값이 int이기 때문에 char로 선언한 charResult는 에러가 난다.
										  // 그렇기 때문에 강제형변환을 시켜줘야 한다.
		System.out.println(intResult); // 68
		System.out.println(charResult); // D
		
		int k = 10;
		// double d = k / 4;
		// System.out.println(d); // k는 int형이고, 4는 상수값인데, 상수값은 int형이므로, int와 int의 연산이 먼저 이루어지고, double에 대입 >> 2.0
		double d = (double) k / 4;
		System.out.println(d); // 2.5 >> int는 double보다 작기 때문에, 작은 쪽을 double로 업캐스팅 하면 결과값도 double로 출력된다.
		
		byte b1 = 100;
		byte b2 = 70;
		System.out.println(b1 + b2); // 170
		// byte가 처리할 수 있는 값은 127까지, b1과 b2를 더하면 170이라 개념적으로는 byte가 처리할 수 없으나, int보다 작은 크기의 데이터 연산은
		// int로 변환되어 처리된다. (데이터 손실의 방지 (오버플로우 방지))
		
	}

}
