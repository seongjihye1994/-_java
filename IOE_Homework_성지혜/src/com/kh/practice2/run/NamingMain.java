package com.kh.practice2.run;

import java.util.Scanner;

import javax.naming.NamingException;

import com.kh.practice2.controller.NamingTest;

public class NamingMain {

	public static void main(String[] args) {
		
		NamingTest nt = new NamingTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("변수명으로 쓸 문자열을 쓰시오: ");
		String input = sc.next();
		
		try {
			if (nt.isNumFirst(input) && nt.isReservedWord(input) && nt.isSpecialWord(input)) {
				System.out.printf("%s는(은) 변수 사용 가능합니다.\n", input);
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		

		
	}

}
