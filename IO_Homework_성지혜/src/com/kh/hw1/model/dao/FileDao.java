package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kh.hw1.run.Run;

public class FileDao {
	
	public static Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {  // ~writer
//		� ���Ͽ� � ������ ����
//		���� �Է� �޾� ���� ����� �����ϴ� �޼ҵ�
		System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�. (\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
		StringBuilder sb = new StringBuilder(); // �� ���ڿ�
		
		while (true) {
			
			String input = sc.next();
			
			if (input.equals("exit")) break;
			
			sb.append(input);
			sb.append("\n");
		}
		
		System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
		String save = sc.next();
		
		if (save.equalsIgnoreCase("y")) {
			System.out.print("������ ���ϸ��� �Է��ϼ���. : ");
			String fileName = sc.next();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
				bw.write(sb.toString());
				bw.newLine(); // ����
				System.out.println(fileName + ".txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("�ٽ� �޴��� ���ư��ϴ�.");
		}

	}
	
	public void fileOpen() { // ~reader
//		���ϴ� ������ ���� �Է� �� �ܼ� ȭ�鿡 ����ϴ� �޼ҵ�
		System.out.print("���� �� ���ϸ� : ");
		String openFile = sc.next();
		
		// ������ ���۴����� �о��
		try (BufferedReader br = new BufferedReader(new FileReader(openFile + ".txt"))) {
			
			String value = null;
			while ((value = br.readLine()) != null) { 
				System.out.println(value);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileEdit() { // �о���� + �����ϱ� + �ٽ�����
//		���� ������ ������� ���� ������ �߰��� �����ϴ� �޼ҵ�
		System.out.print("���� �� ���ϸ� : ");
		String editFile = sc.next();
		
		// ���� �б�
		try (BufferedReader br = new BufferedReader(new FileReader(editFile + ".txt"))) {
			
			StringBuilder sb = new StringBuilder(); // "" 
			
			String temp = null;
			
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			} 
			
			// ���� ����
			System.out.println("exit�� �Է��ϸ� ����");
			System.out.print("���Ͽ� �߰��� ������ �Է��Ͻÿ�. : ");
			
			while (true) {
				
				String append = sc.next();
				
				if (append.equals("exit")) break;
				
				sb.append(append);
				sb.append("\n");
			}
			
			System.out.print("����� ������ ���Ͽ� �߰��Ͻðڽ��ϱ�? (y/n) : ");
			String addContents = sc.next();
	
			if (addContents.equalsIgnoreCase("y")) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(editFile + ".txt", true))) {
					bw.append(sb.toString());
					bw.newLine();
					System.out.println(editFile + ".txt ������ ����Ǿ����ϴ�.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	
	

}
