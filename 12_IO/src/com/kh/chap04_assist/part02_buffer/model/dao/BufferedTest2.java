package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest2 {
	// ���� �׽�Ʈ
	public void testFileReader() {
		try (FileReader fr = new FileReader("bufferedTest.txt")) {
			
			long start = System.currentTimeMillis();
			// ���� �ð��� �и������ʷ� �˷���
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value); // ���ڷ� �ٲٱ� ���� char ����ȯ
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println();
			System.out.println("FileReader ��� ��Ʈ�������� �о���µ� �ɸ� �ð� : "
			+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testBufferedTeader() {
		try (BufferedReader br = new BufferedReader(new FileReader("bufferedTest.txt"))) {
			
			long start = System.currentTimeMillis();
			
			String value = "";
			while ((value = br.readLine()) != null) {
				System.out.print(value);
			}
			
			long end = System.currentTimeMillis();
			System.out.println();
			System.out.println("BufferedReader�� ���� ��Ʈ������ ����Ͽ�  �о���µ� �ɸ� �ð� : "
			+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
