package com.kh.hw1.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.kh.hw1.run.Run;

public class FileDao {
	
	public static Scanner sc = new Scanner(System.in);
	
	public FileDao() {}
	
	public void fileSave() {  // ~writer
//		어떤 파일에 어떤 내용을 저장
//		할지 입력 받아 파일 출력을 실행하는 메소드
		System.out.print("파일에 저장할 내용을 반복해서 입력하시오. (\"exit\"을 입력하면 내용 입력 끝) : ");
		StringBuilder sb = new StringBuilder(); // 빈 문자열
		
		while (true) {
			
			String input = sc.next();
			
			if (input.equals("exit")) break;
			
			sb.append(input);
			sb.append("\n");
		}
		
		System.out.print("저장하시겠습니까? (y/n) : ");
		String save = sc.next();
		
		if (save.equalsIgnoreCase("y")) {
			System.out.print("저장할 파일명을 입력하세요. : ");
			String fileName = sc.next();
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName + ".txt"))) {
				bw.write(sb.toString());
				bw.newLine(); // 개행
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("다시 메뉴로 돌아갑니다.");
		}

	}
	
	public void fileOpen() { // ~reader
//		원하는 파일을 파일 입력 후 콘솔 화면에 출력하는 메소드
		System.out.print("열기 할 파일명 : ");
		String openFile = sc.next();
		
		// 파일을 버퍼단위로 읽어옴
		try (BufferedReader br = new BufferedReader(new FileReader(openFile + ".txt"))) {
			
			String value = null;
			while ((value = br.readLine()) != null) { 
				System.out.println(value);
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void fileEdit() { // 읽어오기 + 수정하기 + 다시저장
//		기존 파일을 입출력을 통해 내용을 추가해 수정하는 메소드
		System.out.print("수정 할 파일명 : ");
		String editFile = sc.next();
		
		// 파일 읽기
		try (BufferedReader br = new BufferedReader(new FileReader(editFile + ".txt"))) {
			
			StringBuilder sb = new StringBuilder(); // "" 
			
			String temp = null;
			
			while ((temp = br.readLine()) != null) {
				System.out.println(temp);
			} 
			
			// 파일 쓰기
			System.out.println("exit을 입력하면 나감");
			System.out.print("파일에 추가할 내용을 입력하시오. : ");
			
			while (true) {
				
				String append = sc.next();
				
				if (append.equals("exit")) break;
				
				sb.append(append);
				sb.append("\n");
			}
			
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			String addContents = sc.next();
	
			if (addContents.equalsIgnoreCase("y")) {
				try (BufferedWriter bw = new BufferedWriter(new FileWriter(editFile + ".txt", true))) {
					bw.append(sb.toString());
					bw.newLine();
					System.out.println(editFile + ".txt 파일이 변경되었습니다.");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
	
	
	

}
