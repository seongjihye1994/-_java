package com.kh.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import com.kh.hw3.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
//		5���� ������ ���� ������ ��ü�迭�� Object��Ʈ���� ����
//		���Ͽ� �����ϴ� �޼ҵ�
	public void fileSave() {
	
		Book[] bk = new Book[5]; // Book��ü�� ���� ��ü �迭
		
		{
			bk[0] = new Book("C���", "��浿", 10000, setCalendar(2012, 2, 2), 0.1);
			bk[1] = new Book("�ڹ�", "�̱浿", 20000, setCalendar(2013, 3, 3), 0.2);
			bk[2] = new Book("C++", "�ڱ浿", 30000, setCalendar(2014, 4, 4), 0.3);
			bk[3] = new Book("���̽�", "���浿", 40000, setCalendar(2015, 5, 5), 0.4);
			bk[4] = new Book("����Ŭ", "�ֱ浿", 50000, setCalendar(2016, 6, 6), 0.5);
		}
		
		// ��ü �迭�� 3���� ��뵥���ͷ� �ʱ�ȭ
		// (���ǳ�¥�� �Ʒ� setCalendar �޼ҵ带 Ȱ��)
		
		// try with resource �������� ��books.dat�����Ͽ� 
		// ����ǰ� ObjectOutputStream��
		// FileOutputStream�� ����
		// ���Ͽ� ��ü �迭�� �� ����
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			oos.writeObject(bk);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//		������ ��¥�� Calendar�� ��ȯ �޼ҵ�
	public Calendar setCalendar(int year, int month, int date) {
		
		Calendar time = new GregorianCalendar(year, month - 1, date);
		return time;
	}
	
//		���Ϸκ��� ������ ���� ����
//		�� �ҷ��ͼ� �ֿܼ� ����ϴ� �޼ҵ�
	public void fileRead() {
		
		Book[] bk = new Book[10];
		
		// try with resource ���� (FileNotFoundException�� ClassNotFoundException,
		// EOFException, IOException ó��
		// ���� ��books.dat�������� �ҷ����� ObjectInputStream�� FileInputStream�� ����
		// �ݺ����� ���� ���� �� �о� ���� �� ��books.dat �б� �Ϸ�!�� ���
		// (EOFException Ȱ��)
		// �ݺ����� ���� bk ���(null�� �����ϰ�)
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			
		bk = (Book[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("book.dat �б� �Ϸ�!");
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// �о�� ����Ʈ ���
		for (int i = 0 ; i < bk.length; i++) {
			if (bk[i] != null) {
				System.out.println(bk[i]);				
			}
		}

		
	}
	
	
	

}
