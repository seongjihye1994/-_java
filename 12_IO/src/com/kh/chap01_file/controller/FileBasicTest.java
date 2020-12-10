package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {

	// java.io ��Ű���� �ִ� File Ŭ������ �̿��� ���� ����/���� -> ���Ͽ� ���� ������ �׽�Ʈ
	public void method1() {
		// 1. ���� ������Ʈ�� ���� �����ϱ�
		File f1 = new File("test.txt"); // �����
		// ��������� �޸𸮿� ��ü�� �ִ� ����
		// ���ϸ� test.txt
		try {
			f1.createNewFile(); // �� ���� ����
			
			// 2. �����ϴ� �⺻ ����̺곪 ������ ���� ���� -> ��α��� ����
			File f2 = new File("C:\\text.txt"); // D����̺꿡 ����(������)
			f2.createNewFile();
			
			// 3. ������ ���� ����� ���� �����ϱ�
			// File f3 = new File("D:\\temp\\text.txt"); // ���� ��ο� ����
			// f3.createNewFile();
			// java.io.IOException : ������ ��θ� ã�� �� �����ϴ�. -> �ٷ� �����ϴ� ���� ����
			
			File f3 = new File("C:\\temp");
			// mkdir() : ���ο� ���丮 ����
			// mkdirs() : ��� �� ���� ��� ���丮 ����
			f3.mkdirs();
			
			File f4 = new File("C:\\temp\\test.txt");
			f4.createNewFile();
			
			// ������� ���� ���丮�� delete() �� �� ����
			// ���� ���ο� �ִ� ���Ϻ��� ����� �� �� ������ ���� �� ����
			f4.delete();
			f3.delete();
			
			// �����ϴ��� ? : .exists()
			// �������� ? : .isFile()
			System.out.println(f1.exists());
			System.out.println(f1.isFile());
			System.out.println(f3.exists());
			System.out.println(f3.isFile());
			
			File folder = new File("parent");
			folder.mkdir(); // parent �̸��� ���� ����
			File file = new File("parent\\person.txt");
			file.createNewFile(); // parent �ȿ� person.txt ���� ����

			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���� ��� : " + file.getAbsolutePath());
			System.out.println("���� ��� ��� : " + file.getParent());
			System.out.println("���� �뷮 : " + file.length());
			System.out.println("���� ���� : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
