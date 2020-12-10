package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	
	// BufferedReader, BufferedWriter�� ���� ���� �����
	// ���� ��Ʈ���� �������� �Ϲ� ��� ��Ʈ�������� �����ߴ� ������ ��� ������
	// *** ���� ��Ʈ���� �ܵ����� ���� �Ұ� ***
	// �ݵ�� ��� ��Ʈ�� ��ü�� �ʿ�!
	
	public void fileSave() {
//		FileWriter fw = new FileWriter("bufferedTest.txt");
//		BufferedWriter bw = new BufferedWriter(fw);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedTest.txt"))) {
			bw.write("�ȳ��ϼ���"); // �̾���
			bw.write(" ������\n"); // �����ϰ� ���� �� \n�� ���� �Է�	
			bw.write("������ ������!");
			bw.newLine(); // ���� �޼ҵ�
			bw.write("ȭ����");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		try (BufferedReader br = new BufferedReader(new FileReader("bufferedTest.txt"))) {
			// BufferedREader�� ���� ������ �� �پ� �о���� ��� readLine()�� ����ϱ� ����
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine());
//			System.out.println(br.readLine()); // ���� �ۼ��� ���� 4���� �о��, ���̻� �о�� ���� ������ null ����
			
			// �ݺ������� ����
			String value = "";
			// read()�� ��ȯ ���� int�� �� �о�� ���� ������ -1��ȯ
			// readLine90�� ��ȯ ���� String�̹Ƿ� �о�� ���� ������ null��ȯ
			while((value = br.readLine()) != null) { // �о���� ����� null�� �ƴҋ� ���� �ݺ�
				System.out.println(value);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
