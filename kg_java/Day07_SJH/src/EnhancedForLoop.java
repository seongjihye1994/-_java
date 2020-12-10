
public class EnhancedForLoop {

	public static void main(String[] args) {
		// 배열에서 사용할 수 있는 향상 for문
		
		// 선언과 동시에 초기화를 할 때 new String[] 처음에는 생략 가능
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		
//		for (int i = 0; i < week.length; i++) {
//			System.out.println(week[i] + "요일");
//		}
		
		for(String day : week) { // 향상 for문 > 반복 배열 내의 타입 반복 돌릴 배열 내의 요소값을 차례대로 저장 할 변수 : 반복을 돌릴 배열 변수
			System.out.println(day + "요일");
		}
		// 전체적인 범위를 처리하는 상황에는 향상 for문이 효율적이고,
		// 디테일한 범위를 지정해서 반복을 돌릴 때에는 일반 for문이 효율적이다.
		
		System.out.println("---------------------------------------");
		
		// 1. scores 라는 이름으로 int 배열을 하나 선언해서 점수 데이터를 바로 저장하세요.
		// {96, 88, 74, 63, 100, 55}
		
		// 2. 향상 for문(forEach)을 사용하여 총점과 평균을 구해보세요.
		// 총점 (int), 평균(double, 소수점 둘 째 자리까지 표현)
		
		int[] scores = {96, 88, 74, 63, 100, 55};
		int tot = 0;
		for (int s : scores) {		
			tot += s;
		}		
		
		double avg = (double) tot / scores.length; 
		System.out.printf("총점 : %d, 평균 : %.2f\n", tot, avg);

		}
		
	}

