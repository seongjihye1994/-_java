package com.kh.chap01_file.controller;

import java.io.File;
import java.io.IOException;

public class FileBasicTest {

	// java.io 패키지에 있는 File 클래스를 이용한 파일 생성/삭제 -> 파일에 대한 간단한 테스트
	public void method1() {
		// 1. 현재 프로젝트에 파일 생성하기
		File f1 = new File("test.txt"); // 상대경로
		// 여기까지는 메모리에 객체로 있는 상태
		// 파일명 test.txt
		try {
			f1.createNewFile(); // 새 파일 생성
			
			// 2. 존재하는 기본 드라이브나 폴더에 파일 생성 -> 경로까지 지정
			File f2 = new File("C:\\text.txt"); // D드라이브에 생성(절대경로)
			f2.createNewFile();
			
			// 3. 폴더를 새로 만들고 파일 생성하기
			// File f3 = new File("D:\\temp\\text.txt"); // 없는 경로에 생성
			// f3.createNewFile();
			// java.io.IOException : 지정된 경로를 찾을 수 없습니다. -> 바로 생성하는 것을 금지
			
			File f3 = new File("C:\\temp");
			// mkdir() : 새로운 디렉토리 생성
			// mkdirs() : 경로 상에 없는 모든 디렉토리 생성
			f3.mkdirs();
			
			File f4 = new File("C:\\temp\\test.txt");
			f4.createNewFile();
			
			// 비어있지 않은 디렉토리는 delete() 할 수 없음
			// 폴더 내부에 있는 파일부터 지우고 난 후 폴더를 지울 수 있음
			f4.delete();
			f3.delete();
			
			// 존재하는지 ? : .exists()
			// 파일인지 ? : .isFile()
			System.out.println(f1.exists());
			System.out.println(f1.isFile());
			System.out.println(f3.exists());
			System.out.println(f3.isFile());
			
			File folder = new File("parent");
			folder.mkdir(); // parent 이름의 폴더 생성
			File file = new File("parent\\person.txt");
			file.createNewFile(); // parent 안에 person.txt 파일 생성

			System.out.println("파일명 : " + file.getName());
			System.out.println("저장 경로 : " + file.getAbsolutePath());
			System.out.println("저장 상대 경로 : " + file.getParent());
			System.out.println("파일 용량 : " + file.length());
			System.out.println("상위 폴더 : " + file.getParent());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
