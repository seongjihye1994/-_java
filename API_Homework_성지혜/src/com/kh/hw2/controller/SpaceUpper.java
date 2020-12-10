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
		
		System.out.print("영문 입력 : ");
		String eng = sc.nextLine();
		
		StringTokenizer stn = new StringTokenizer(eng);
		
		while(stn.hasMoreTokens()) {
			StringBuilder sb = new StringBuilder(stn.nextToken());
			sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));
			// 레퍼런스변수.setCharAt(인덱스, 저장문자); ==> 해당 인덱스에 해당 문자 저장
			System.out.println(sb.toString());
		}
	
	}
	
	
	
	

}
