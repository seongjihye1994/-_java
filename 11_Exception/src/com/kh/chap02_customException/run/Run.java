package com.kh.chap02_customException.run;

import com.kh.chap02_customException.controller.UserExceptionTest;
import com.kh.chap02_customException.exception.UserException;

public class Run {
	
	// ����� ���� Exception
	// ����ڰ� ���� Exception�� ���� �� ����
	// �� ���� : ���α׷��� �ǵ���� �귯���� ���� ��� �߻��ϴ� ����
	// ��, �ڹٿ��� �����ϴ� ���� Ŭ���������� ó���� �� ���� ���ܰ�
	// ���� ��� ����ڰ� ���� ���

	public static void main(String[] args) {
		
		UserExceptionTest uet = new UserExceptionTest();
		
		try {
			uet.method();
		} catch (UserException e) {
			e.printStackTrace();
		}
		

	}

}
