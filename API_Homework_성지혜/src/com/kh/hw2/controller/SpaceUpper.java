package com.kh.hw2.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.kh.hw1.controller.TokenController;

public class SpaceUpper {
	
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	StringBuilder sb = new StringBuilder();
//	List<String> arrays = new ArrayList<String>();
//	List<StringBuilder> sbList = new ArrayList<StringBuilder>();
	
	public SpaceUpper() {}

	public void spaceToUpper() {
		
		System.out.print("���� �Է� : ");
		String eng = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(eng);
		
		while(stn.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder(stn.nextToken());
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
			// ���۷�������.setCharAt(�ε���, ���幮��); ==> �ش� �ε����� �ش� ���� ����
			System.out.println(sb.toString());
		}
	
	}
	
	
	
	

}
