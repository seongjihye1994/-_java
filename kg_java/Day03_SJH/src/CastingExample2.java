
public class CastingExample2 {
	public static void main(String[] args) {
		
		
		/*
		 
		 - 크기가 큰 데이터 타입의 자료를 큰 데이터 타입으로 변환하려면
		      반드시 형 변환 연산자(type)을 사용하여 명시적으로
		      형 변환을 진행해야 합니다. (DownCasting, Type Casting)
			
		 - 명시적으로 형 변환을 하는 이유는 DownCasting
		 
		*/
		
		
		int i = 72;
		// char c = i; // 큰 타입이 작은 타입으로 형변환 하려하면 에러가 난다.
		char c = (char) i; // 큰 타입이 작은 타입으로 들어가기 위해서는 강제로 형변환을 시켜줘야 한다.
		System.out.println("72의 문자값 : " + c); // 본래 72였던 i가 강제 형변환으로 H가 된다. 
		
		double d = 4.98765;
		// int j = d; // double이 int로 형변환 하려면 에러가 난다.
		int j = (int) d; // 그래서 double을 int로 강제 형변환 시켜줘야 한다.
		System.out.println(j); // 4
		
		int k = 1000;
		// byte b = k; int가 byte로 형변환 하려면 에러가 난다.
		byte b = (byte) k; // 그래서 
		System.out.println(b); // -24
		
		/*
		 -%f는 기본적으로 소수점 6자리까지 표현하도록 설계되어 있습니다. 
		 - 만약 자리수를 조절하려면 %.[자리수에 해당하는 숫자]f를 사용합니다.
		 - 특수문자 "%"를 사용하고 싶으면 %%를 사용해준다.
		 */
		
		double rate = 63.456;
		System.out.printf("시험 합격률 : %.2f%%\n", rate); 
		
	}
}
