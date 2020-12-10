package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo : value object(������ ��ü) == dto => data transfer object(������ ���� ��ü)

// dao : data access object : DataBase�� data�� �����ϱ� ���� ��ü
// DBMS�� ���� �������� File�� Data�� �����Ͽ� ������ϴ� ������ ������ ��

public class FileByteTest {

	// ���� �����ϱ�! (FileOutputStream)
	public void fileSave() {
		// ���� ���� -> ���α׷����κ��� ������ ������! => ���� ��� => FileOutput
		// FileOutputStream ���
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		
		// -> �ش� ��Ʈ���� �� ���� FileNotFoundException(����ã������)
		// ������ �߻��� �� �ֱ� ������ try~catch ó���ؾ���
		try {
			// 1. ���� ��ü ����
			// FileOutputStream fout = new FileOutputStream(file);
			
			// 2. ���ڿ��� ���� �̸� �ٷ� ����
			fout = new FileOutputStream("byteTest.txt", true); // true : �̾��
			// -> ������ ������ ���������� ����� �ִµ� �� FileNotFoundException�� �߻��ұ�?
			// ��ΰ� ������ �⺻������ �ڵ����� ������ ������,
			// ������ ��ΰ� ���ų� ���� ���� ���� FileNotFoundException�� �߻��Ѵ�
			// ex) abc\\byteTest.txt �� ���� �������� �ʴ� ��η� �����ϸ� ����!
			
			// ���Ͽ� ������ �Ẹ��!
			// 1. write(inb b)
			fout.write(65); // �빮�� A
			fout.write('B');
			
			// 2. write(byte[] b)
			byte[] bArr = {97, 98, 99}; // �ҹ��� a b c
			fout.write(bArr);
			
			// 3. write(byte[] b, int off, int len)
			// �־��� �迭�� ���� �� ���� �� off��°(�ε���)���� len(����)�� ��ŭ ����
			fout.write(bArr, 1, 2); // 1��° �ε������� 2���� ���ڴ�.
			
			// �ֻ��� IOE�� ó���� �� ������, ���������� ó���ϰ� ���� ���� ���� ������
			// �� ��������
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// ��Ʈ���� ��� �� �ݵ�� �ݳ��ؾ� �ϹǷ� ��Ʈ��.close() �޼ҵ� ȣ�� �ʿ�
			// �ش� ��Ʈ���� ���� ������ try{} �� �ٱ����� ���־�� finally{} ��������
			// �ν��� �� ����
			try {
				fout.close(); // fout ������ ���������� �ν��ϸ� �������� (try�ȿ� ������ ���������̱� ����)
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	
	
	
	
	

	// ���� �о����! (FileInputStream)
	public void fileOpen() {
		// ������ ���� -> ���α׷����� ������ �о�� -> �Է� ��Ʈ��
		
		FileInputStream fis = null;
		
		try { // FileNtFoundException �߻� �������� Ʈ����ĳġ ó��
			fis = new FileInputStream("byteTest.txt");
			
			// �о���� ���
			// 1. int read() : 1byte�� �о���� �� �̻� �о�� ���� ������ -1�� ��ȯ
			// 2. int read(byte[] b) : �迭 b�� ũ�⸸ŭ �о �迭�� ä��� �о�� �������� �� ��ȯ
			// 3. int read(byte[] b, int off, int len) : �ִ� len���� byte�� �о �迭 b�� ������ ��ġ(off)���� ����
			
//			System.out.println(fis.read()); // IOException �߻� ����
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			// 7�����ε� 8�� ȣ��, 1byte�� �о���� ���� ������ -1 ��ȯ
			
			// �ݺ������� �ٲٱ� -> fis.read()�� �� �� ȣ���ϴ� ���� �ƴ϶� ������ �޾Ƽ� ó���ؾ� �ι��� �о���� ����
//			while(fis.read() != -1) { // ���⼭�� �о����
//				System.out.println((char)fis.read()); // ���⼭�� �о��
//				// char�� ����ȯ�ؼ� ��� ==> ���ĺ����� �о���� ����
//			}
			
			int value = 0;
			while((value = fis.read()) != -1) { // �о�ͼ� value�� ���� �� �� ����
				System.out.println((char)value);
				// char�� ����ȯ�ؼ� ��� ==> ���ĺ����� �о���� ����
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
