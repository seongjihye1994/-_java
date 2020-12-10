package com.kh.chap04_assist.part02_buffer.model.dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTest2 {
	// 성능 테스트
	public void testFileReader() {
		try (FileReader fr = new FileReader("bufferedTest.txt")) {
			
			long start = System.currentTimeMillis();
			// 현재 시간을 밀리세컨초로 알려줌
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value); // 문자로 바꾸기 위해 char 형변환
			}
			
			long end = System.currentTimeMillis();
			
			System.out.println();
			System.out.println("FileReader 기반 스트림만으로 읽어오는데 걸린 시간 : "
			+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testBufferedTeader() {
		try (BufferedReader br = new BufferedReader(new FileReader("bufferedTest.txt"))) {
			
			long start = System.currentTimeMillis();
			
			String value = "";
			while ((value = br.readLine()) != null) {
				System.out.print(value);
			}
			
			long end = System.currentTimeMillis();
			System.out.println();
			System.out.println("BufferedReader를 보조 스트림으로 사용하여  읽어오는데 걸린 시간 : "
			+ (end - start) + "(ms)");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
