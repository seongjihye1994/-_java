
public class BreakExample {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			if (i > 7) // i가 8이 되는 순간 참이므로 break > 1부터 7까지는 거짓이므로 break 수행 안함.
				break;
			System.out.println(i + " ");
		}
		System.out.println("\n반복문 종료!");
		
		System.out.println("-----------------------------------");
		
		// 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한 번에
		// 종료시키고 싶다면 바깥쪽 반복문에 label을 붙입니다.
		// 그리고 break 선언 시 label을 함께 선언합니다.
		
		outer : for(int i = 0; i <= 2; i++) {
			for(int j = 0; j <= 1; j++) {
				if (i == j) break outer;
				System.out.println(i + "-" + j);
			}
		}
		
		// 외부 반복문에 outer라는 이름을 붙이고 내부 반복문의 break에 outer(이름)을 붙이면
		// 내부 반복문의 break로 외부 반복문까지 한 번에 종료시킬 수 있다.
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
