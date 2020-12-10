package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	
	// DataInputStream
	// DataOutputStream --> ����Ʈ ��� '����' ��Ʈ��
	// 1byte ������ �ƴ϶� �츮�� �˰� �ִ� �⺻ �ڷ���, String ���� �ڷ��� ������
	// �а� �� �� ����
	
	public void fileSave() {
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))) {
			
			// Data ���� ��Ʈ���� �̿������ν� write + �ڷ���() �߰�
			dout.writeUTF("������"); // ���ڿ�
			dout.writeInt(20);
			dout.writeChar('F');
			dout.writeDouble(164.5);
			
			// �����ϰ� ���� ������ ��������
			// int�� 4byte, char�� 2byte, double�� 8byte�� ũ��� ���� �����ϹǷ�
			// txt(���� ��� ����)�� ���� �ؼ��ϸ� �츮 ���� ���̴� ������� Ȯ�� �Ұ�
			// ���� char�� F�� Ȯ�� ����
			// => Ÿ�Կ� �°� �о�;� ������ ���� ��� ����
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		// ���� �о���� input
		try (DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {
			
			// write�� ���� �־��� ������� ���;� ��
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			
			System.out.println("name : " + name);
			System.out.println("age : " + age);
			System.out.println("gender : " + gender);
			System.out.println("height : " + height);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileSave2() {
		
	try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member2.txt"))) {
			
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸��� �Է��ϼ���. : ");
			String name = sc.next();
			System.out.print("���̸� �Է��ϼ���. : ");
			int age = sc.nextInt();
			System.out.print("������ �Է��ϼ���. : ");
			char gender = sc.next().charAt(0);
			System.out.print("Ű�� �Է��ϼ���. : ");
			double height = sc.nextDouble();
			System.out.println("�Է��� �����ðڽ��ϱ�? (y/n) : ");
			char goOn = sc.next().charAt(0);
			
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeChar(gender);
			dout.writeDouble(height);
			
			if (goOn == 'y') break;
			
		}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen2() {
		
		// EOFException ������ �߻��ϴ� ����
		try (DataInputStream din = new DataInputStream(new FileInputStream("member2.txt"))) {
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " 
						+ din.readChar() + ", " + din.readDouble());				
			}
			
			// EOFException -> End Of File
			// : ���Ͽ� �� �̻� ���� ������ ���� �� �߻��ϴ� exception
			// �߻��� �� �ۿ� ���� ������ �߻� ���� ����� ������ �ۼ�
				
		} catch (EOFException e) {
			System.out.println("������ �� �о�Խ��ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
