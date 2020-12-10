package test.controller;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임을 시작합니다.");

		while(true) {
			
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String myRsp = sc.nextLine();
			
			System.out.printf("당신은 %s를 냈습니다.\n", myRsp);
			
			int random = (int)(Math.random() * 3); 
			//System.out.println(random);
			String comRsp = "";
					
			switch(random) {
			case 0 : comRsp = "가위"; break;
			case 1 : comRsp = "바위"; break;
			case 2 : comRsp = "보"; break;
			} 
			
			System.out.printf("컴퓨터는 %s를 냈습니다.\n", comRsp);
			
			if (comRsp.equals(myRsp)) {
				System.out.println("비겼습니다. 다시 시작합니다.");
			} else {
				
				boolean result = false;
				
				if (comRsp.equals("가위")) { 
					if (myRsp.equals("바위")) {
						result = true;
					}
				} else if (comRsp.equals("바위")) {
					if (myRsp.equals("보")) {
						result = true;
					}
				} else {
					if (myRsp.equals(("가위"))) {
						result = true;
					}
				}
				
				if (result) {
					System.out.println("당신이 이겼습니다."); break;
				} else {
					System.out.println("당신이 졌습니다."); break;
				}
			}
			
		}
	}

}
