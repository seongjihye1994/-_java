package com.kh.hw1.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	StringBuilder sb = new StringBuilder(); 
	
	public String afterToken(String str) { // ���� ���� ���� ��ȯ
		
		String result = "";
		StringTokenizer stn = new StringTokenizer(str);
		while(stn.hasMoreTokens()) {
			result += stn.nextToken();
		} return result;
	}
	
	public String firstCap(String input) { // ù ���� �빮�ڷ�
		for (int i = 0; i < input.length(); i++) {
	         sb.append(input.charAt(i));
	      } Character one = Character.toUpperCase(sb.charAt(0));	      
	      sb.setCharAt(0, one); // 0 -> one
	      // ���۷�������.setCharAt(�ε���, ���幮��); ==> �ش� �ε����� �ش� ���� ����
	      
	      return sb.toString();
	}
	
	public int findChar(String input, char one) { // ���� ã�� ��ȯ
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == one || Character.toUpperCase(input.charAt(i)) == Character.toUpperCase(one)) {
	              count++;
	         }
		} return count;
	}
	

}
