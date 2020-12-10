package com.kh.practice2.controller;

import javax.naming.NamingException;

public class NamingTest {
	
	String[] reservedWord = {"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
			"continue", "default", "do", "double", "else", "enum", "extends", "false", "final", "finally", "float", "for", "if",
			"goto", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
			"private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "true", "try", "void", "volatile", "while"};
	
	char[] SpecialWord = {'!', '@', '#', '%', '^', '&', '*', 
			'(', ')', ':', ',', '.', '/', '|', ' ', 
			'~', '`', '-', '+', '[', ']', '{', '}', 
			'?', '<', '>', '='};
	
	char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
	
	public NamingTest() {}
	
//	���� ���ڿ��� ������ ����
//	�� Ȯ��. ��� ��Ģ�� ��߳�
//	�� "���� ��� ��Ģ�� ��߳�
//	�ϴ�.(����� ��� �Ұ���)"
//	�̶�� ���ܸ� ����.
	public boolean isReservedWord(String user) throws NamingException {
		for (int i = 0; i < reservedWord.length; i++) {
			if (user.equals(reservedWord[i])) {
				throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�. (����� ��� �Ұ���)");
			} 
		}
		return true;
	}
	
	
//	���� ���ڿ��� ���� ���
//	��� ������ ����(Ư������
//	����)�� ����ִ��� Ȯ��. ��
//	�� ��Ģ�� ��߳��� "���� ��
//	�� ��Ģ�� ��߳��ϴ�.(������
//	�� '_', '$', ���� ��� ����)"
//	�̶�� ���ܸ� ����
	public boolean isSpecialWord(String user) throws NamingException {
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == (SpecialWord[i])) {
				throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�. (�����ڿ� '_', '$', ���� ��� ����)");
			} 
		} 
		return true;
	}
	
//	���� ���ڿ��� �� �� ���ڰ�
//	�������� Ȯ��. ��� ��Ģ��
//	��߳��� ������ ��� ��Ģ��
//	��߳��ϴ�.(�� �� ���� �Ұ�
//	��)�� �̶�� ���ܸ� ����.	
	public boolean isNumFirst(String user) throws NamingException {
		for (int i = 0; i < user.length(); i++) {
			if (user.charAt(i) == nums[i]) {
				throw new NamingException("���� ��� ��Ģ�� ��߳��ϴ�. (�� �� ���� �Ұ���)");
			} 
		}
		return true;
	}

}
