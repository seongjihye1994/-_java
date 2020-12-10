package com.kh.practice2.run;

import java.util.Scanner;

import javax.naming.NamingException;

import com.kh.practice2.controller.NamingTest;

public class NamingMain {

	public static void main(String[] args) {
		
		NamingTest nt = new NamingTest();
		Scanner sc = new Scanner(System.in);
		System.out.print("���������� �� ���ڿ��� ���ÿ�: ");
		String input = sc.next();
		
		try {
			if (nt.isNumFirst(input) && nt.isReservedWord(input) && nt.isSpecialWord(input)) {
				System.out.printf("%s��(��) ���� ��� �����մϴ�.\n", input);
			}
		} catch (NamingException e) {
			e.printStackTrace();
		}
		

		
	}

}
