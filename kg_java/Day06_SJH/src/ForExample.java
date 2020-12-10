
public class ForExample {

	public static void main(String[] args) {
	
		// 1~10까지의 누적합
//		int n = 1;
//		int tot = 0;
//		while(n <= 10) {
//			tot += n;
//		}
		
		int tot = 0;
		for (int n = 1; n <= 10; n++) {
			tot += n;
		}
		
		
		// 1~200까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를
		// 가로로 출력해보세요.
		
		for (int i = 1; i <= 200; i++) {
			if(i % 6 == 0 && i % 12 != 0)
				System.out.print(i + " ");
		}
		
		System.out.println();
		
		// 1~60000까지의 정수 중 177의 배수의 갯수를 출력해보세요.
		
		int count = 0;
		for (int j = 1; j <= 60000; j++) {
			if(j % 177 == 0)
				count++;
		}
		System.out.println(count + "개");
		
		
	}

}
