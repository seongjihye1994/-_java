package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	StringBuilder sb = new StringBuilder(); 
	
	public String afterToken(String str) { // 공백 제거 글자 반환
		
		String result = "";
		StringTokenizer stn = new StringTokenizer(str);
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		} return result;
	}
	
	public String firstCap(String input) { // 첫 글자 대문자로
		for (int i = 0; i < input.length(); i++) {
	         sb.append(input.charAt(i));
	      } Character one = Character.toUpperCase(sb.charAt(0));	      
	      sb.setCharAt(0, one); // 0 -> one
	      // 레퍼런스변수.setCharAt(인덱스, 저장문자); ==> 해당 인덱스에 해당 문자 저장
	      
	      return sb.toString();
	}
	
	public int findChar(String input, char one) { // 문자 찾고 반환
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one || Character.toUpperCase(input.charAt(i)) == Character.toUpperCase(one)) {
	              count++;
	         }
		} return count;
	}
	

}
