package test.controller;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� ���� �� ������ �����մϴ�.");

		while(true) {
			
			System.out.print("���� ���� �� �� �� ���� �Է��ϼ��� : ");
			String myRsp = sc.nextLine();
			
			System.out.printf("����� %s�� �½��ϴ�.\n", myRsp);
			
			int random = (int)(Math.random() * 3); 
			//System.out.println(random);
			String comRsp = "";
					
			switch(random) {
			case 0 : comRsp = "����"; break;
			case 1 : comRsp = "����"; break;
			case 2 : comRsp = "��"; break;
			} 
			
			System.out.printf("��ǻ�ʹ� %s�� �½��ϴ�.\n", comRsp);
			
			if (comRsp.equals(myRsp)) {
				System.out.println("�����ϴ�. �ٽ� �����մϴ�.");
			} else {
				
				boolean result = false;
				
				if (comRsp.equals("����")) { 
					if (myRsp.equals("����")) {
						result = true;
					}
				} else if (comRsp.equals("����")) {
					if (myRsp.equals("��")) {
						result = true;
					}
				} else {
					if (myRsp.equals(("����"))) {
						result = true;
					}
				}
				
				if (result) {
					System.out.println("����� �̰���ϴ�."); break;
				} else {
					System.out.println("����� �����ϴ�."); break;
				}
			}
			
		}
	}

}
