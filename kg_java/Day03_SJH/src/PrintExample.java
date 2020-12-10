
public class PrintExample {

	public static void main(String[] args) {
		
		// 자바의 표준 출력 형식은 크게 3가지 입니다.
		// 1. 개행을 포함하지 않는 print() 함수
		// 2. 자동으로 개행을 포함해주는 println() 함수

		System.out.print("Hello");
		System.out.println("안녕하세요~!");
		System.out.print("bye~");
		System.out.println("안녕히가세요~!");
		
		// 3. 형식 지정 표준 출력 함수 printf
		
		/*
		 # 포메팅 서식 문자 종류
		   %d = 부호가 있는 정수 데이터 (decimal)
		   %f = 실수 데이터 (floation point)
		   %s = 문자열 데이터 (String)
			
		 # 이스케이프 문자
		   \n = 줄 바꿈 명령(enter)
		   \t = 탭 정렬 (4칸 앞으로)		
		*/
		
		
		
		 int month = 12;
		 int day = 25;
		 String anni = "크리스마스";
		 
		 // 12월 25일은 크리스마스 입니다.
		 System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		 
		 System.out.printf("지금 시간은 %d시 %d분 입니다. %s요일 입니다.", 18, 16, "수");
		 
	}

}

