package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest2 {
	
	public void fileCopy() {
		// 1. ���� �Է½�Ʈ�� �ʿ�
		// 2. ���� ��½�Ʈ�� �ʿ�
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// �����ϴ� �̹��� ������ ����Ʈ ��� ���� �Է� ��Ʈ���� ���� �о�� ��
		try {
			fis = new FileInputStream("bs.jpeg");
			
			// ����Ʈ ��� ��� ��Ʈ���� ���� �̹��� ������ �����ؼ� ����� ��
			fos = new FileOutputStream("copy.jpeg");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1; // ����Ʈ ���� ����
			int input = 0;
			
			while((input = fis.read(bArr)) != -1) {
				fos.write(bArr, 0, input); // 0�� �ε������� input���� �ִ´�.
				// ���� ���� ũ�Ⱑ 1030�̶��?
				// bArr�� 0�ε������� input(1024)���� �о������
				// ���� ������ 6�� �о�´�.
				// �� ��� ���� ũ�⸦ 1020��ŭ ���� �Ͼ���� �ʰ�
				// �������� �׻� �׿����� �о���� ������
				// �迭.length.������ �ƴ� input���԰����� �о���� ���� ����
				System.out.println(cnt++ + "KB ���� �Ϸ�");
			}
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
