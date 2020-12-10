package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// vo : value object(값들의 객체) == dto => data transfer object(데이터 전송 객체)

// dao : data access object : DataBase의 data에 접근하기 위한 객체
// DBMS를 배우기 이전에는 File에 Data를 저장하여 입출력하는 것으로 구현할 것

public class FileByteTest {

	// 파일 저장하기! (FileOutputStream)
	public void fileSave() {
		// 파일 저장 -> 프로그램으로부터 파일을 내보냄! => 파일 출력 => FileOutput
		// FileOutputStream 사용
		File file = new File("sample.txt");
		FileOutputStream fout = null;
		
		// -> 해당 스트림을 열 때는 FileNotFoundException(파일찾지못함)
		// 에러가 발생할 수 있기 때문에 try~catch 처리해야함
		try {
			// 1. 파일 객체 전달
			// FileOutputStream fout = new FileOutputStream(file);
			
			// 2. 문자열로 파일 이름 바로 전달
			fout = new FileOutputStream("byteTest.txt", true); // true : 이어쓰기
			// -> 파일이 없으면 내부적으로 만들어 주는데 왜 FileNotFoundException이 발생할까?
			// 경로가 맞으면 기본적으로 자동으로 생성해 주지만,
			// 지정한 경로가 없거나 맞지 않을 때는 FileNotFoundException이 발생한다
			// ex) abc\\byteTest.txt 와 같이 존재하지 않는 경로로 전달하면 에러!
			
			// 파일에 내용을 써보자!
			// 1. write(inb b)
			fout.write(65); // 대문자 A
			fout.write('B');
			
			// 2. write(byte[] b)
			byte[] bArr = {97, 98, 99}; // 소문자 a b c
			fout.write(bArr);
			
			// 3. write(byte[] b, int off, int len)
			// 주어진 배열에 저장 된 내용 중 off번째(인덱스)부터 len(길이)개 만큼 쓰기
			fout.write(bArr, 1, 2); // 1번째 인덱스부터 2개를 쓰겠다.
			
			// 최상위 IOE로 처리할 수 있지만, 세부적으로 처리하고 싶을 떄는 하위 에러를
			// 더 기재해줌
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 스트림은 사용 후 반드시 반납해야 하므로 스트림.close() 메소드 호출 필요
			// 해당 스트림에 대한 선언은 try{} 블럭 바깥에서 해주어야 finally{} 블럭에서도
			// 인식할 수 있음
			try {
				fout.close(); // fout 변수를 지역변수로 인식하면 에러가남 (try안에 적으면 지역변수이기 떄문)
			} catch (IOException e) {
				e.printStackTrace();
			} 
		}
		
	}
	
	
	
	
	

	// 파일 읽어오기! (FileInputStream)
	public void fileOpen() {
		// 파일을 연다 -> 프로그램에서 파일을 읽어옴 -> 입력 스트림
		
		FileInputStream fis = null;
		
		try { // FileNtFoundException 발생 가능으로 트라이캐치 처리
			fis = new FileInputStream("byteTest.txt");
			
			// 읽어오는 방식
			// 1. int read() : 1byte를 읽어오면 더 이상 읽어올 값이 없으면 -1을 반환
			// 2. int read(byte[] b) : 배열 b의 크기만큼 읽어서 배열을 채우고 읽어온 데이터의 수 반환
			// 3. int read(byte[] b, int off, int len) : 최대 len개의 byte를 읽어서 배열 b의 지정된 위치(off)부터 저장
			
//			System.out.println(fis.read()); // IOException 발생 가능
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
//			System.out.println(fis.read());
			// 7글자인데 8번 호출, 1byte씩 읽어오다 값이 없으면 -1 반환
			
			// 반복문으로 바꾸기 -> fis.read()를 두 번 호출하는 것이 아니라 변수로 받아서 처리해야 두번씩 읽어오지 않음
//			while(fis.read() != -1) { // 여기서도 읽어오고
//				System.out.println((char)fis.read()); // 여기서도 읽어옴
//				// char로 형변환해서 출력 ==> 알파벳으로 읽어오기 위해
//			}
			
			int value = 0;
			while((value = fis.read()) != -1) { // 읽어와서 value에 대입 후 비교 진행
				System.out.println((char)value);
				// char로 형변환해서 출력 ==> 알파벳으로 읽어오기 위해
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
