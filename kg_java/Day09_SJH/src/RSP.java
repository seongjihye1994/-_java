

// 문자열로 이루어진 정수를 실제 정수로 변환하는 방법.
// Integer.parsetInt(문자열 or 문자열이 들어있는 변수)
      
//      String s1 = "10";
//      String s2 = "34";
//      System.out.println(s1 + s2); // 1034
//      
//      int i1 = Integer.parseInt(s1);
//      int i2 = Integer.parseInt(s2);   
//      System.out.println(i1 + i2); // 44



import java.util.Scanner;

public class RSP {

	public static void main(String[] args) {
		
		int win = 0;
		int lose = 0;
		int equal = 0;
		System.out.println("*** 가위 바위 보 게임 ***");
		System.out.println("# 코인을 투입해 주세요. (넣으실 코인의 숫자를 입력해 주세요.)");
		Scanner sc = new Scanner(System.in);
		int inputCoin = sc.nextInt();
		
		outer : while (true) {
			System.out.println("# 해당하는 메뉴의 숫자를 입력해 주세요.");
			System.out.println("# 현재 코인 수 : " + inputCoin);
			System.out.println("-------------------------------");
			System.out.println("# 1. 가위바위보 게임 시작");
			System.out.println("# 2. 전적 보기");
			System.out.println("# 3. 코인 투입하기");
			System.out.println("# 4. 프로그램 종료");
			System.out.println("-------------------------------");
			
			int inputMenu = sc.nextInt();
			switch (inputMenu) {
			case 1 :
				if (inputCoin == 0) {
					System.out.println("# 코인이 없습니다.");
					System.out.println("# 메뉴에서 코인을 투입해 주세요.");
					break;
				} else if (inputCoin > 0) {
					int comRSP = (int) (Math.random()*3);
					System.out.println("-------------------------------");
					System.out.println("# 가위, 바위, 보 중에 하나를 입력하세요.");
					System.out.println("# 게임을 끝내고 싶으시다면 '그만'이라고 입력하세요.");
					String inputRSP = sc.next();
				
					if (inputRSP.equals("가위")) {
						if (comRSP == 1) {
							System.out.println("컴퓨터가 낸 값은 가위");
							System.out.println("비겼습니다.");
							inputCoin --;
							equal ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						} else if (comRSP == 2) {
							System.out.println("컴퓨터가 낸 값은 바위");
							System.out.println("졌습니다.");
							inputCoin --;
							lose --;
							System.out.println("현재 코인 갯수 : " + inputCoin);	
						} else {
							System.out.println("컴퓨터가 낸 값은 보");
							System.out.println("이겼습니다.");
							inputCoin --;
							win ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						}
					} else if (inputRSP.equals("바위")) {
						if (comRSP == 1) {
							System.out.println("컴퓨터가 낸 값은 가위");
							System.out.println("이겼습니다.");
							inputCoin --;
							win ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						} else if (comRSP == 2) {
							System.out.println("컴퓨터가 낸 값은 바위");
							System.out.println("비겼습니다.");
							inputCoin --;
							equal --;
							System.out.println("현재 코인 갯수 : " + inputCoin);	
						} else {
							System.out.println("컴퓨터가 낸 값은 보");
							System.out.println("졌습니다.");
							inputCoin --;
							lose ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						}
					} else if (inputRSP.equals("보")) {
						if (comRSP == 1) {
							System.out.println("컴퓨터가 낸 값은 가위");
							System.out.println("졌습니다.");
							inputCoin --;
							lose ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						} else if (comRSP == 2) {
							System.out.println("컴퓨터가 낸 값은 바위");
							System.out.println("이겼습니다.");
							inputCoin --;
							win --;
							System.out.println("현재 코인 갯수 : " + inputCoin);	
						} else {
							System.out.println("컴퓨터가 낸 값은 보");
							System.out.println("비겼습니다.");
							inputCoin --;
							equal ++;
							System.out.println("현재 코인 갯수 : " + inputCoin);
						} 
					} else {
						System.out.println("게임을 종료합니다.");
						break;
						}
				}	
			case 2 : 
				System.out.println("\n-------------------------------");
				System.out.println("*** 게임 결과 ***");
				System.out.printf("이긴 횟수: %d회\n비긴 횟수: %d회\n진 횟수: %d회\n", win, equal, lose);
				System.out.println("\n-------------------------------");
			    break;
			
			case 3:
				System.out.println("\n-------------------------------");
				System.out.println("코인을 투입하세요.");
				int moreCoin = sc.nextInt();
				System.out.printf("%d개의 코인을 넣었습니다.\n", moreCoin);
				inputCoin += moreCoin;
				System.out.println("현재 코인 갯수 : " + inputCoin + "개");
				break;
			
			case 4 :
				System.out.println("프로그램을 종료할까요? [Y / N]");
				String quit = sc.next();
				if (quit.equals("y") || quit.equals("Y")) {
					break outer;
				} else {
					System.out.println("종료를 취소합니다.");
					break;
				}
			default :
				System.out.println("없는 메뉴입니다.");
			} // switch문

		} // while문

	} // main 문
} // clase문
		

