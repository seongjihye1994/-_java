package com.kh.dimension.practice;

import java.util.Arrays;
import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		int[][] arr = new int[4][4];
		
		int num = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num++;
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
	
	
	public void practice2() {
		int[][] arr = new int[4][4];
		
		int num = 16;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = num--;
				System.out.print(arr[i][j] + " ");
			} System.out.println();
		}
	}
	
	public void practice3() {
		
		String[][] arr = new String[3][3];
		
		for (int i = 0;i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print("(" + i + "," + j + ")");
			} System.out.println();
		}
		
		
		
	}
	
	public void practice4() {
		
		int[][] arr = new int[4][4];
		
		// 값넣기
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
			}
		} 
		// 합계
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[j][i];
			}
		}
		// -1 열 행 까지 출력
		for (int i = 0; i < arr.length - 1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i]; // 합계 넣기
		} for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d", arr[i][j]);
			} System.out.println();
		}


	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("행 크기 : "); int rowSize = sc.nextInt();
			System.out.print("열 크기 : "); int colSize = sc.nextInt();
			
			if ((rowSize <= 1 || rowSize >= 10) || (rowSize <= 1 || colSize >= 10)) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			int[][] arr = new int[rowSize][colSize];
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = (int)(Math.random() * 25) + 65;
					System.out.print((char)arr[i][j] + " ");
				} System.out.println();
			} 
		}
		
		
		
	}
	
	public void practice6() {
		String[][] strArr = new String[][] 
			{{"이", "까", "왔", "앞", "힘"},
			{"차", "지", "습", "으", "냅"},
			{"원","열", "니", "로", "시"},
			{"배", "심", "다", "좀", "다"},
			{"열", "히", "! ", "더", "!! "}};
			
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				} 
			} 
			
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("행 크기 : "); 
			int colSize = sc.nextInt();
			char alp = 'a';
			
			int[][] arr = new int[colSize][];
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i + "행의 크기 : ");
				int rowSize = sc.nextInt();
				for (int j = 0; j < rowSize; j++) {
					arr[i][j] = 0;
					System.out.print(arr[i][j] + " ");
				} 
			}
			
		}
		
		
		
	}
	
	public void practice8() {
		
		 String students[] = {"김예수", "김영해", "방명수", "손은희", 
				 "송종기", "윤은애", "이영지", "임시환", "전지연", 
				 "정중하", "차태연", "하이유"};
		 
	        String arr1[][] = new String[3][2];
	        String arr2[][] = new String[3][2];
	        
	        int idx = 0;
	 
	        for (int i = 0; i < arr1.length; i++){
	            for (int j = 0; j < arr1[i].length; j++){
	                arr1[i][j] = students[idx];
	                idx++;
	            }
	        } for (int i = 0; i < arr2.length; i++){
	            for (int j = 0; j < arr2[i].length; j++){
	            	arr2[i][j] = students[idx];
	                idx++;
	            }
	        }
	 
	        System.out.println("== 1분단 ==");
	        for (int i = 0; i < arr1.length; i++){
	            for (int j = 0; j < arr1[i].length; j++){
	                System.out.print(arr1[i][j] + "  ");
	            } System.out.println();
	        }
	 
	        System.out.println("== 2분단 ==");
	        for (int i = 0; i < arr2.length; i++){
	            for (int j = 0; j < arr2[i].length; j++){
	                System.out.print(arr2[i][j] + "  ");
	            } System.out.println();
	        }
		
	}
	
	public void practice9() {
	
		Scanner sc = new Scanner(System.in);
		
		String students[] = {"김예수", "김영해", "방명수", "손은희", 
				 "송종기", "윤은애", "이영지", "임시환", "전지연", 
				 "정중하", "차태연", "하이유"};
		
		String arr1[][] = new String[3][2];
        String arr2[][] = new String[3][2];
        
        int idx = 0;
        String className = "";
        String colNum = "";
        String rowNum = "";
        
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = students[idx];
                idx++;
            }
        } for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
            	arr2[i][j] = students[idx];
                idx++;
            }
        }
 
        System.out.println("== 1분단 ==");
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "  ");
            } System.out.println();
        }
 
        System.out.println("== 2분단 ==");
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + "  ");
            } System.out.println();
        }
        
		System.out.println("=======================");
		System.out.println("검색할 학생 이름을 입력하세요. : ");
		String name = sc.next();
 
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j].equals(name)) {
                    className = "1";
                    switch(i) {
                    case 0 : rowNum = "첫"; break;
                    case 1 : rowNum = "두"; break;
                    default : rowNum = "세"; break;
                    } switch(j) {
                    case 0 : colNum = "왼"; break;
                    default : colNum = "오른"; break;
                    }
                }
            }
        } for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j].equals(name)) {
                	 className = "2";
                     switch(i) {
                     case 0 : rowNum = "첫"; break;
                     case 1 : rowNum = "두"; break;
                     default : rowNum = "세"; break;
                     } switch(j) {
                     case 0 : colNum = "왼"; break;
                     default : colNum = "오른"; break;
                     }
                }
            }
        } System.out.printf("검색하신 %s 학생은 %s분단 %s번째 줄 %s쪽에 있습니다.\n" 
        		, name, className, rowNum, colNum);		
		
	}
		
		
		
}

