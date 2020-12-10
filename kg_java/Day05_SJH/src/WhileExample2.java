
public class WhileExample2 {
	public static void main(String[] args) {
		
		// 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
		
		int i = 48; // begin
		
		while(i <= 150) { // end
			if (i % 8 == 0) {
				System.out.print(i + " ");
			}
			i++; // step
		}
				
		System.out.println(); // 단순 줄 개행
		
		// 1~100까지의 정수 중 4의 배수이면서 8의 배수는 아닌 수를
		// 가로로 출력하세요.
		
		int j = 1; // begin
		
		while(j <= 100) { // end
			if (j % 4 == 0 && !(j % 8 == 0))
				System.out.print(j + " ");
			j++; // step
		}
		
		System.out.println(); // 단순 줄 개행
		
		// 1~30000까지의 정수 중 258의 배수의 갯수를 구해보세요.
		
		int n = 1;
		int count = 0;
		
		while(n < 30001) {
			if (n % 258 == 0) {
				count++;
			}
			n++;
		}
		System.out.println("258 배수의 갯수 : " + count + "개");
		
		
		
		
		
	}

}
