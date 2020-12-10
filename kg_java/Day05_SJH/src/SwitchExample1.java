import java.util.Scanner;

public class SwitchExample1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요....");
		int point = sc.nextInt();
		
		/*
		 
		 - switch 키워드 뒤에 나오는 괄호 안에는 boolean형 조건식이 아닌
			1. 변수나 2. 변수의 연산식을 적어야 하며, 타입은 정수 or 문자열만 가능합니다.
		 	실수는 경우의 수가 너~~무 많기 때문에 들어올 수 없다.
		 	
		*/
		
		switch(point / 10) { // 변수의 연산식
		// 10점 단위로 학점을 매기기 때문에 나머지는 필요가 없다. 그래서 /를 쓴다. 
		case 10 :
			if(point > 100) { // 100점을 입력하면 if문이 거짓으로 case 9로 내려감
				System.out.println("점수를 잘못 입력하셨습니다.");
				break;
			}
		
		case 9: // 10으로 나눈 점수의 몫이 90(==9)점 일 때
			System.out.println("당신의 학점은 A입니다.");
			break; // 탈출문(해당 케이스만 실행하고 switch문을 탈출해라!)
			
		case 8: // 10으로 나눈 점수의 몫이 80(==8)점 일 때
			System.out.println("당신의 학점은 B입니다.");
			break;
			
		case 7: // 10으로 나눈 점수의 몫이 70(==7)점 일 때
			System.out.println("당신의 학점은 C입니다.");
			break;
			
		case 6: // 10으로 나눈 점수의 몫이 60(==6)점 일 때
			System.out.println("당신의 학점은 D입니다.");
			break;
		default :
			if(point > 100) { // 입력값이 되도않는 975?? 라면
				System.out.println("점수를 잘못 입력하셨습니다.");
			} else {
				System.out.println("당신의 학점은 F입니다.");
			}
		}
		
	 	sc.close();
		
	}
}
