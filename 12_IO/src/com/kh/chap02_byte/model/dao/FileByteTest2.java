package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteTest2 {
	
	public void fileCopy() {
		// 1. 파일 입력스트림 필요
		// 2. 파일 출력스트림 필요
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		// 존재하는 이미지 파일을 바이트 기반 파일 입력 스트림을 통해 읽어올 것
		try {
			fis = new FileInputStream("bs.jpeg");
			
			// 바이트 기반 출력 스트림을 통해 이미지 파일을 복사해서 출력할 것
			fos = new FileOutputStream("copy.jpeg");
			
			byte[] bArr = new byte[1024];
			
			int cnt = 1; // 바이트 저장 변수
			int input = 0;
			
			while((input = fis.read(bArr)) != -1) {
				fos.write(bArr, 0, input); // 0번 인덱스부터 input까지 넣는다.
				// 만약 파일 크기가 1030이라면?
				// bArr의 0인덱스부터 input(1024)까지 읽어오세요
				// 다음 나머지 6을 읽어온다.
				// 즉 모든 파일 크기를 1020만큼 딱딱 일어오지 않고
				// 마지막은 항상 잉여값을 읽어오기 때문에
				// 배열.length.까지가 아닌 input대입값까지 읽어오는 것이 맞음
				System.out.println(cnt++ + "KB 전송 완료");
			}
			

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	

}
