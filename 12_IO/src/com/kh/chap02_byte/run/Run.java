package com.kh.chap02_byte.run;

import com.kh.chap02_byte.model.dao.FileByteTest;
import com.kh.chap02_byte.model.dao.FileByteTest2;

public class Run {

	public static void main(String[] args) {
		// 바이트 기반 스트림 --> 데이터를 1바이트 단위로 전송하는 작업
		
		// FileInputStream / FileOutputStream --> 외부 매체로 파일 사용
		// 내 프로그램 안으로 파일을 1Byte씩 읽어옴
		// 내 프로그램에서 파일을 1Buye 단위로 내보냄
		FileByteTest fb = new FileByteTest();
//		fb.fileSave(); // 파일 저장
//		fb.fileOpen(); // 파일 오픈
		
		FileByteTest2 fb2 = new FileByteTest2();
		fb2.fileCopy();

	}

}
