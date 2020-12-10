package com.kh.chap04_assist.part04_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;
import com.kh.chap04_assist.part04_object.model.vo.Student;

public class ObjectDao {
	
	private Student[] stList = new Student[10];
	
	// �ν��Ͻ� �ʱ�ȭ ���
	{
		// ���� ������
		stList[0] = new Student("�캰��", 20, 'F', new Phone("�Ｚ", 990000));
		stList[1] = new Student("��ö��", 22, 'M', new Phone("LG", 880000));
	}
	
	public void fileSave() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("studentList.dat"))) {
			
			// �ݺ����� ���� Student 10�� ���
//			for (int i = 0; i < stList.length; i++) {
//				oos.writeObject(stList[i]);
//			}
			
			// Student[] �迭�� �� ���� ���
			oos.writeObject(stList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public void fileOpen() {
		
		Student[] readList = new Student[10];
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentList.dat"))) {
			
			// �ݺ����� ���� Student 10�� �о����
//			for (int i = 0; i < readList.length; i++) {
//				readList[i] = (Student) ois.readObject();
//			}
			
			// Student[] �迭 �� ���� �о����
			readList = (Student[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		// �о�� ����Ʈ ���
		for (int i = 0 ; i < readList.length; i++) {
			System.out.println(readList[i]);
		}
		
	}
	
}
