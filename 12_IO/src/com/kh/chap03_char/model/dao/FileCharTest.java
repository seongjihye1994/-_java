package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class FileCharTest {
	// 텍스트 입출력은 문자 단위 입출력을 하는 Reader / Writer가 편리함
	
	public void fileSave() {
		// FileWriter 사용 - 문자 기반 파일 출력 스트림
		FileWriter fw = null;
		
		try {
			// 파일이 존재하지 않으면 자동으로 파일 생성
			// 기존에 파일이 있으면 덮어씌움
			// 덮어쓰기 싫고 추가로 값을 넣고 싶을 때는 매개변수 생성자에
			// true 사용 (default는 false)
			fw = new FileWriter("charTest.txt", true); // true : 이어쓰기
			
			// 1. write(int c) 2. write(char[] cbuf) 3. write(char[] cbuf, int off, int len)
			// 4. write(String str) 5. write(String str, int off, int len)
			
			fw.write("KH정보교육원"); // 4번
			fw.write("L오전강의장", 0, 3); // 5번
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		// FileReader - 문자 기반 파일 입력 스트림
		FileReader fr = null;
		
		try {
			fr = new FileReader("charTest.txt");
			
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
