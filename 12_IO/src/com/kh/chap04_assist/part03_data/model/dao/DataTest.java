package com.kh.chap04_assist.part03_data.model.dao;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class DataTest {
	
	// DataInputStream
	// DataOutputStream --> 바이트 기반 '보조' 스트림
	// 1byte 단위가 아니라 우리가 알고 있는 기본 자료형, String 참조 자료형 단위로
	// 읽고 쓸 수 있음
	
	public void fileSave() {
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member.txt"))) {
			
			// Data 보조 스트리을 이용함으로써 write + 자료형() 추가
			dout.writeUTF("성지혜"); // 문자열
			dout.writeInt(20);
			dout.writeChar('F');
			dout.writeDouble(164.5);
			
			// 실행하고 나니 파일이 깨져있음
			// int는 4byte, char는 2byte, double은 8byte의 크기로 값을 저장하므로
			// txt(문자 기반 파일)를 통해 해석하면 우리 눈에 보이는 모습으로 확인 불가
			// 따라서 char인 F만 확인 가능
			// => 타입에 맞게 읽어와야 데이터 정상 출력 가능
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		// 파일 읽어오기 input
		try (DataInputStream din = new DataInputStream(new FileInputStream("member.txt"))) {
			
			// write에 값을 넣었던 순서대로 들고와야 함
			String name = din.readUTF();
			int age = din.readInt();
			char gender = din.readChar();
			double height = din.readDouble();
			
			System.out.println("name : " + name);
			System.out.println("age : " + age);
			System.out.println("gender : " + gender);
			System.out.println("height : " + height);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileSave2() {
		
	try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("member2.txt"))) {
			
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름을 입력하세요. : ");
			String name = sc.next();
			System.out.print("나이를 입력하세요. : ");
			int age = sc.nextInt();
			System.out.print("성별을 입력하세요. : ");
			char gender = sc.next().charAt(0);
			System.out.print("키를 입력하세요. : ");
			double height = sc.nextDouble();
			System.out.println("입력을 끝내시겠습니까? (y/n) : ");
			char goOn = sc.next().charAt(0);
			
			dout.writeUTF(name);
			dout.writeInt(age);
			dout.writeChar(gender);
			dout.writeDouble(height);
			
			if (goOn == 'y') break;
			
		}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileOpen2() {
		
		// EOFException 에러가 발생하는 로직
		try (DataInputStream din = new DataInputStream(new FileInputStream("member2.txt"))) {
			while(true) {
				System.out.println(din.readUTF() + ", " + din.readInt() + ", " 
						+ din.readChar() + ", " + din.readDouble());				
			}
			
			// EOFException -> End Of File
			// : 파일에 더 이상 읽을 내용이 없을 때 발생하는 exception
			// 발생할 수 밖에 없기 때문에 발생 했을 경우의 로직을 작성
				
		} catch (EOFException e) {
			System.out.println("파일을 다 읽어왔습니다.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
