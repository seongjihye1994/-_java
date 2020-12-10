
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 
		 - 크기가작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
		      자바 가상 머신(JVM)이 자동으로 타입을 올려서 변환해 줍니다.
		   (promotion, upcasting)
		 
		*/
		
		byte b = 10;
		int i = b; // byte -> int로 자동 형변환
		System.out.println(i);
		
		char c = 'A';
		int j = c; // char -> int로 자동 형변환
		System.out.println("A의 유니코드 번호 : " + j); // 65
		
		int k = 500;
		double d = k; // int -> double로 자동 형변환
		System.out.println(d); // 500.0
	
	}

}
