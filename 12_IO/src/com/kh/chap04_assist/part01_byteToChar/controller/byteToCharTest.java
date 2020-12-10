package com.kh.chap04_assist.part01_byteToChar.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class byteToCharTest {
	// ���� ��ȯ ���� ��Ʈ��
	// java.io.InputStreamReader
	// java.io.OutputStreamWriter
	
	// byte => char ���·� ��ȯ���� �ִ� ���� ��Ʈ��
	// ����Ʈ�� ���� ��ȯ�ϱ� ������ InputStream + Reader �� ���յ� ȥ���� ź��
	
	public void input() {
		// ���� ��Ʈ�� a = new ������Ʈ��(��ݽ�Ʈ��);
		InputStreamReader isr = new InputStreamReader(System.in);
		// ǥ�� ����� : System.in, System.out, System.err
		// JVM�� �ڵ����� ��Ʈ���� �������ֹǷ� new�� �̿��� ���� ��Ʈ���� ������ �ʿ� ����
		// �ٷ� �ܺ� �ڿ����� Ű����, ����͸� ������ ä�� ������� �ν���
		
		// readLine()�̶�� �޼ҵ带 ����ϱ� ���� BufferReader �߰�
		// ���ڸ� �� �� ������ �о�� �� �ִ� readLine();
		// ������Ʈ�� b = new ������Ʈ�� (a);
		BufferedReader br = new BufferedReader(isr);
		
		try {
			System.out.print("�� �Է� : ");
			String value = br.readLine();
			System.out.println("value = " + value);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// ���� ������ try~with~resource ������ �ۼ��ϱ�
		// �Ϲ� try catch�������� try���� ()�� �߰���
		// ()�ȿ� �� ��Ʈ���� ���� ������ �ڵ����� close�ϴ� ����
		// �� ������ ���� finally�� ����� �ʿ䰡 ����.
		try (BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.print("�� �Է� : ");
			String value = br.readLine();
			System.out.println("value = " + value);
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

	public void output() {
		// ������Ʈ�� a = new ������Ʈ��(��ݽ�Ʈ��);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		// ������Ʈ�� b = new ������Ʈ��(a);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			String str = "Hello";
			bw.write(str);
			
			// write() ���ۿ� �״´�
			// flush() ��������
			// bw.flush(); // finally�� bw.close�� ���ָ� bw.flush�� �� �ʿ䰡 ������,
			// ���α׷� ���� �� �߰��߰� �������� �ϴ� ��Ȳ�� ������ finally���� bw.flush()�� ���ָ鼭
			// ���� �������� �Ѵ�.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close(); // close() �� �ڵ����� flush() ����
				// -> bw.close()�� BufferedWriter ������ -> OutputStreamWriter ������ -> System.out ����
				// System.out -> �����ڰ� ������ ��Ʈ���� �ƴ϶� ���α׷����� �����Ǿ ���� �Ǵ� ��Ʈ��
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		try (BufferedWriter bw2 = new BufferedWriter(new OutputStreamWriter(System.out))) {
			String str = "Hello";
			bw2.write(str);
			bw2.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}


}
