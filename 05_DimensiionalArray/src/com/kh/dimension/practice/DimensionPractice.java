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
		
		// ���ֱ�
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
			}
		} 
		// �հ�
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr[i].length - 1; j++) {
				arr[i][3] += arr[i][j];
				arr[3][i] += arr[j][i];
			}
		}
		// -1 �� �� ���� ���
		for (int i = 0; i < arr.length - 1; i++) {
			arr[3][3] += arr[i][3] + arr[3][i]; // �հ� �ֱ�
		} for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%d", arr[i][j]);
			} System.out.println();
		}


	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ũ�� : "); int rowSize = sc.nextInt();
			System.out.print("�� ũ�� : "); int colSize = sc.nextInt();
			
			if ((rowSize <= 1 || rowSize >= 10) || (rowSize <= 1 || colSize >= 10)) {
				System.out.println("�ݵ�� 1~10 ������ ������ �Է��ؾ� �մϴ�.");
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
			{{"��", "��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��","��", "��", "��", "��"},
			{"��", "��", "��", "��", "��"},
			{"��", "��", "! ", "��", "!! "}};
			
			for (int i = 0; i < strArr.length; i++) {
				for (int j = 0; j < strArr[i].length; j++) {
					System.out.print(strArr[j][i] + " ");
				} 
			} 
			
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("�� ũ�� : "); 
			int colSize = sc.nextInt();
			char alp = 'a';
			
			int[][] arr = new int[colSize][];
			for (int i = 0; i < arr.length; i++) {
				System.out.print(i + "���� ũ�� : ");
				int rowSize = sc.nextInt();
				for (int j = 0; j < rowSize; j++) {
					arr[i][j] = 0;
					System.out.print(arr[i][j] + " ");
				} 
			}
			
		}
		
		
		
	}
	
	public void practice8() {
		
		 String students[] = {"�迹��", "�迵��", "����", "������", 
				 "������", "������", "�̿���", "�ӽ�ȯ", "������", 
				 "������", "���¿�", "������"};
		 
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
	 
	        System.out.println("== 1�д� ==");
	        for (int i = 0; i < arr1.length; i++){
	            for (int j = 0; j < arr1[i].length; j++){
	                System.out.print(arr1[i][j] + "  ");
	            } System.out.println();
	        }
	 
	        System.out.println("== 2�д� ==");
	        for (int i = 0; i < arr2.length; i++){
	            for (int j = 0; j < arr2[i].length; j++){
	                System.out.print(arr2[i][j] + "  ");
	            } System.out.println();
	        }
		
	}
	
	public void practice9() {
	
		Scanner sc = new Scanner(System.in);
		
		String students[] = {"�迹��", "�迵��", "����", "������", 
				 "������", "������", "�̿���", "�ӽ�ȯ", "������", 
				 "������", "���¿�", "������"};
		
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
 
        System.out.println("== 1�д� ==");
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "  ");
            } System.out.println();
        }
 
        System.out.println("== 2�д� ==");
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + "  ");
            } System.out.println();
        }
        
		System.out.println("=======================");
		System.out.println("�˻��� �л� �̸��� �Է��ϼ���. : ");
		String name = sc.next();
 
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j].equals(name)) {
                    className = "1";
                    switch(i) {
                    case 0 : rowNum = "ù"; break;
                    case 1 : rowNum = "��"; break;
                    default : rowNum = "��"; break;
                    } switch(j) {
                    case 0 : colNum = "��"; break;
                    default : colNum = "����"; break;
                    }
                }
            }
        } for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                if (arr2[i][j].equals(name)) {
                	 className = "2";
                     switch(i) {
                     case 0 : rowNum = "ù"; break;
                     case 1 : rowNum = "��"; break;
                     default : rowNum = "��"; break;
                     } switch(j) {
                     case 0 : colNum = "��"; break;
                     default : colNum = "����"; break;
                     }
                }
            }
        } System.out.printf("�˻��Ͻ� %s �л��� %s�д� %s��° �� %s�ʿ� �ֽ��ϴ�.\n" 
        		, name, className, rowNum, colNum);		
		
	}
		
		
		
}

