package com.kh.chap03_map.part03_propertise.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// 4. load (InputStream inStream)
		// : ����Ʈ ��Ʈ������ ���� �� ������ ������ �о�ͼ� Properties ��ü�� ����
		//		load(Reader reader)
		// : ���� ��Ʈ������ ���� �� ������ ������ �о�ͼ� Properties ��ü�� ����
		//		loadFromSML (InputStream inStream)
		// : ����Ʈ ��Ʈ������ ���� �� XML ������ ������ �о�ͼ� Properties ��ü�� ����
		try {
			// prop.load(new FileInputStream("collection.properties")); // �� ä��
			prop.loadFromXML(new FileInputStream("collection.xml"));
			
			// 5. list(PrintStream out) : Ư�� out stream�� ���� ���
			prop.list(System.out); // �� ���
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
