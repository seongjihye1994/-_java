package com.kh.chap03_map.part03_propertise.run;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Car;

public class Run {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		
		/*prop.put("�ҳ�Ÿ", new Car("����", 13.3));
		
		System.out.println(prop);
		System.out.println(prop.get("�ҳ�Ÿ"));
		
		try {
			prop.store(new FileOutputStream("test.proterties"), "test");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		// Properties�� .properties ������ ���� ���Ǵ� Ÿ������
		// Ű, �� ��� String���� ����
		
		// 1. setProperty(String key, String value) : �� ����
		prop.setProperty("List", "ArrayList");
		prop.setProperty("Set", "HashSet");
		prop.setProperty("Map", "HashMap");
		prop.setProperty("Map", "Properties");
		System.out.println(prop);
		// ���� ���� x, Ű �ߺ� �Ұ� (�����)
		
		// 2. getProperty(String key) : �� ��������
		System.out.println(prop.getProperty("List"));
		
		// 3. store(OutputStream os, String comments)
		//	 : ���� �� ������ ����Ʈ ��Ʈ������ ���Ͽ� ���
		//	  store(Writer writer, String comments)
		//	 : ���� �� ������ ���� ��Ʈ������ ���Ͽ� ��� ����
		//	  storeToXML(OutputStream os, String comments)
		//	 : ���� �� ������ ����Ʈ ��Ʈ������  XML�� ��� ����
		try {
			// prop.store(new FileOutputStream("collection.propertise"), "collection");
			prop.storeToXML(new FileOutputStream("collection.xml"), "collection");
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		

	}

}