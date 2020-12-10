package com.kh.chap04_assist.part04_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part04_object.model.vo.Phone;

public class SimpleDao {
	// object  Input / outputStream
	
	public void fileSave() {
		Phone ph = new Phone("�Ｚ", 990000);
		Phone ph2 = new Phone("LG", 880000);
		// Phone ����ȭ ���� �ʾ��� �� java.io.NotSerializableException �߻�
		
		try(ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("phone.dat"))) {
			oos.writeObject(ph);
			oos.writeObject(ph2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	public void fileOpen() {
		try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream("phone.dat"))) {
			
			// �о �ٷ� ����ϱ�
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			// readObject -> �о�� ���뿡 �´� Ŭ������ ���ٸ� ClassNotFoundException �߻� ����
			
			// ���۷��� ������ ��Ƽ� ����ϱ�
			Phone p1 = (Phone) ois.readObject(); // �θ� ��ü�� Object�� ���ϵǱ� ������ �ڽİ�ü�� �ٿ�ĳ���� �������
			System.out.println(p1);
			Phone p2 = (Phone) ois.readObject();
			System.out.println(p2);
			// readObject �� � object�� ����� �𸣹Ƿ� ��� object�� ������
			// Object Ŭ���� Ÿ������ ���� ��(������)
			// -> �ٷ���� �ϴ� Ÿ������ �ٿ� ĳ�����ؼ� �����
			
			// ���� �� �̻� ���� ��ü�� ���µ� readObject()�� ȣ���Ѵٸ�?
			Phone p3 = (Phone) ois.readObject();
			System.out.println(p3);
			// java.io.EOFException �߻�

		}  catch (EOFException e) {
			System.out.println("������ �� �о����ϴ�.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) { // �� ��ü�� Ŭ������ ���� ���� ����
			e.printStackTrace();
		}
		
	}
	
	

}
