
public class WhileExample1 {
	public static void main(String[] args) {
		
		int total = 0; // 누적합을 담아줄 변수
		int n = 1; // 제어변수 : 반복문의 횟수를 제어할 변수 (begin)
		
		while(n <= 10) { // 논리형 조건식 : 반복문의 끝을 지정 (end)
			total += n; // 증가하는 n을 total에 누적
			n++; // 증감식 : 반복문의 종료를 위해 제어변수의 값을 조정 (step)
			
		}
		System.out.println("1~10까지의 누적합 : " + total);
		
		System.out.println("-----------------------------------");
		
		int i = 1;
		while(i <= 10) {
			System.out.println("안녕하세요! 반갑습니다!");
			i++;
		}
		
	}

}
