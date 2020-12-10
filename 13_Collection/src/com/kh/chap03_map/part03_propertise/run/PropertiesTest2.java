package com.kh.chap03_map.part03_propertise.run;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest2 {

	public static void main(String[] args) {
		
		Properties prop = new Properties();
		
		// 4. load (InputStream inStream)
		// : 바이트 스트림으로 저장 된 파일의 내용을 읽어와서 Properties 객체에 저장
		//		load(Reader reader)
		// : 문자 스트림으로 저장 된 파일의 내용을 읽어와서 Properties 객체에 저장
		//		loadFromSML (InputStream inStream)
		// : 바이트 스트림으로 저장 된 XML 파일의 내용을 읽어와서 Properties 객체에 저장
		try {
			// prop.load(new FileInputStream("collection.properties")); // 값 채움
			prop.loadFromXML(new FileInputStream("collection.xml"));
			
			// 5. list(PrintStream out) : 특정 out stream을 통한 출력
			prop.list(System.out); // 값 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
