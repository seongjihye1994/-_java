package com.kh.chap01_exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedExceptionTest {

	// CheckedException�� �ݵ�� ���� ó���� ���־�� �ϴ� ����
	// -> ���ǹ��̳� �ҽ� �ڵ� �������δ� �ذ��� �� ����
	// -> �ַ� IOException ó��
	
	public void method1() /*throws IOException*/ {
		method2();
	}
	
	public void method2() /*throws IOException*/ {
		// IO�� ������ ���� �𸣹Ƿ� �����ϰ� �׽�Ʈ
		// Scanner�� ���� Ű����� ���� �Է� �޴� �뵵��
		// java.io.BufferedReader ��ü ����(���ڿ��� �Է� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ڿ��� �Է� : ");
		
		
		// �����(IO)�� "��Ʈ��"�� ���� �ܺ� �ڿ��� �̷����
		// ex. ���� ����� �� �ش� ��ο� �о�� ������ ������ �о�� �� �����Ƿ�
		// IOException �� �ļ��� FileNoFoundException�� �߻���
		
		try {
			String str = br.readLine(); // ���ڿ� �޾ƿ���
			System.out.println("�Է� ���� ���ڿ� : " + str);
		} catch (IOException e) {
			e.printStackTrace(); // �����߻� �� �����ٷ� ���� �߰���
		} finally {
			// ��� �� ��Ʈ���� �ݾ���� �ϹǷ� finally �� �ȿ� ��Ʈ���� �ݴ� ������ �ۼ���
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// br.readLine();�� ������ �ߴ� ������? CheckedException�� ������ ����ó���� �� ��� �ϴ� ��������
		// ����ó���� ���� �ʾұ� ������ ������ ��!
		
		// ���� ó�� 2���� ���
		// 1. throws : ���� ȣ���� �޼ҵ忡�� ���� ó�� ����
		// ���ϴ� ��ġ�� ���� ó���� �� �� �ֵ��� ��
		// main �޼ҵ忡���� ó������ �ʴ� ��� ������ ����
		
		// 2. try ~ catch
		// (1) try {} : ���� �߻� ���ɼ� �ִ� ���� �ۼ�
		// (2) catch(����Ŭ���� �Ű�����) {} : ���ܰ� �߻��Ǵ� ��� ó���ؾ� �ϴ� ���� �ۼ�
		// (3) finally {} : ���� �߻� ���ο� ���� ���� ������ ó���ؾ� �ϴ� ���� ���
		
		
	}
}


// Exception ��ӵ� �׷�����
// Throwable <- Error
//			 <- Exception <- RuntileException : ���α׷� ���� �� ���� / ������ ���� x / ����ó�� ���û��� (if�� �ǰ�) => UncheckedException
//						  <- �� �� (IOException) : ������ ���� / ������ ���� o / ����ó�� �ʼ����� => CheckedException




