package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
			System.out.print(iArr[i] + " ");
		} System.out.println();
	} 
	
	public void practice2() {
		int[] iArr = new int[10];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = i + 1;
		} System.out.println();	
		int[] copy = new int[10];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = iArr[copy.length - 1 - i];
			System.out.print(copy[i] + " ");
		}
		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int[] input = new int[sc.nextInt()];
		
		for (int i = 0; i < input.length; i++) {
			input[i] = i + 1;
			System.out.print(input[i] + " ");
		}
		
	}
	
	public void practice4() {
		String[] fruit = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(fruit[1]);
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : "); String input1 = sc.next();
		System.out.print("문자 : "); char input2 = sc.next().charAt(0);
		int count = 0;
		char[] str = new char[input1.length()];
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", input1, input2);
		for (int i = 0; i < str.length; i++) {
			str[i] = input1.charAt(i);
			if (str[i] == input2) {
				System.out.print(i + " "); count++;
			} 
		} System.out.println(); 
		System.out.printf("%c 의 개수 : %d개\n", input2, count);
		
	}
	
	public void practice6() {
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int input = sc.nextInt();
		
		if (input >= 7) {
			System.out.println("잘못 입력하셨습니다."); return;
		} for (int i = 0; i <= input; i++) {
			if (input == i) {
				System.out.println(day[i] + "요일");
			}	
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int[] input = new int[sc.nextInt()];
		int sum = 0;
		
		for (int i = 0; i < input.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : \n", i);
			input[i] = sc.nextInt(); sum += input[i];
		} System.out.println(Arrays.toString(input));
		System.out.println("총 합 : " + sum);
	}
		
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("3 이상인 홀수 정수 : ");
			int input = sc.nextInt();
			if (input % 2 == 0 || input < 3) {
				System.out.println("다시 입력하세요."); continue;
			} int[] iArr = new int[input];
			 for (int i = 0; i < iArr.length; i++) {
				 if (i > iArr.length / 2) iArr[i] = iArr.length - i;
				 else iArr[i] = i + 1;
			 } System.out.println(Arrays.toString(iArr)); return;
		}
	
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		String[] chicken = {"양념", "간장", "마늘", "후라이드"};
		
		System.out.println(Arrays.toString(chicken));
		System.out.print("치킨 이름을 입력하세요. : ");
		String inputChicken = sc.next();
		int i;
		
		for (i = 0; i < chicken.length; i++) {
			if (inputChicken.equals(chicken[i])) {
				System.out.println(inputChicken + "치킨 배달 가능");
				return;
			} 
		} if (i == chicken.length) System.out.println(inputChicken + "치킨은 없는 메뉴입니다.");
		
		
		
	}
	
	public void practice10() {
		int[] nums = new int[10];
				
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 10) + 1;
			nums[i] = rn;
		} System.out.println(Arrays.toString(nums));
	}
	
	public void practice11() {
		int[] nums = new int[10];
				
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 10) + 1;
			nums[i] = rn;
			for (int j = 0; j < i; j++) {
				if (nums[i] == nums[j]) {
					System.out.println("중복 발생");
					i--; break;
				}
			}
		} System.out.println(Arrays.toString(nums));
	}
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호 입력(-포함) : ");
		String input = sc.next();
		
		char[] origin = new char[input.length()];
		char[] copy = origin;
		
		for (int i = 0; i < origin.length; i++) {
			origin[i] = input.charAt(i);
			System.out.print(origin[i]);
		} System.out.println();
		for (int i = 0; i < copy.length; i++) {
			if(i < 8) System.out.print(copy[i]);				
			 else System.out.print("*");
		}
		

		
	}
	
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[6];
		
		for (int i = 0; i < nums.length; i++) {
			int rn = (int)(Math.random() * 45) + 1;
			nums[i] = rn;
			for (int j = 0; j < i; j++) { 
				if (nums[i] == nums[j]) { 
					i--; break;
				}
			}
		} Arrays.sort(nums);
		 System.out.println(nums);
	}
	
	public void practice14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : "); String input1 = sc.next();
		char[] str = new char[input1.length()];
		int count = 0;
		int i = 0;;
		int j = 0;
		for (i = 0; i < str.length; i++) {
			str[i] = input1.charAt(i);
			for (j = 0; j < i; j++) { 
				if (str[i] == str[j]) break;
			} if (j == i) count++;
		} 
		
		System.out.print("문자열에 있는 문자 : " + Arrays.toString(str));
		System.out.println();
		System.out.println("문자 개수 : " + count);
		
		
	}
	
	public void practice15() { // 복사 응용
		// 1. 사용자에게 배열의 길이 입력받기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하시오 : ");
		int size = sc.nextInt();
		sc.nextLine(); // 버퍼 비우기
		
		// 2. 입력받은 길이 만큼의 문자열 배열 선언 및 할당
		String[] arr = new String[size];
		
		// 3. 각 인덱스별 값을 사용자에게 입력받기
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+1 + "번째 문자열 : ");
			arr[i] = sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
			char ch = sc.nextLine().charAt(0);
			
			/*String str = sc.nextLine();
			str.toUpperCase().equals("Y");
			str.equalsIgnoreCase("Y");*/
			
			if (ch == 'y' || ch == 'Y') {
				
				System.out.print("더 입력하고 싶은 개수 : ");
				int addSize = sc.nextInt();
				sc.nextLine(); // 버퍼 비우기
				
				String[] newArr = new String[arr.length + addSize];
				
				for (int i = 0; i < newArr.length; i++) {
					if (i < arr.length) {	// 기존의 배열은 먼저 복사하고
						newArr[i] = arr[i];	
					} else {		// 그 후에는 다시 입력받도록
						System.out.print(i + 1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				
				arr = newArr; // 기존 배열에 새로운 배열의 주소값 대입 --> 기존 배열 사라지게 됨
				
			} else {
				break;
			}
		}

		System.out.println(Arrays.toString(arr));
	}
					
			
			
			
			

			
		
		
			
		
		
	
	
		
	
	
}


