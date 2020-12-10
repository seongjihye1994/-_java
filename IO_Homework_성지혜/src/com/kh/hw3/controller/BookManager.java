package com.kh.hw3.controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import com.kh.hw3.model.vo.Book;

public class BookManager {
	
	Scanner sc = new Scanner(System.in);
	
	public BookManager() {}
	
//		5가지 도서에 대한 정보를 객체배열과 Object스트림을 통해
//		파일에 저장하는 메소드
	public void fileSave() {
	
		Book[] bk = new Book[5]; // Book객체를 받을 객체 배열
		
		{
			bk[0] = new Book("C언어", "김길동", 10000, setCalendar(2012, 2, 2), 0.1);
			bk[1] = new Book("자바", "이길동", 20000, setCalendar(2013, 3, 3), 0.2);
			bk[2] = new Book("C++", "박길동", 30000, setCalendar(2014, 4, 4), 0.3);
			bk[3] = new Book("파이썬", "서길동", 40000, setCalendar(2015, 5, 5), 0.4);
			bk[4] = new Book("오라클", "최길동", 50000, setCalendar(2016, 6, 6), 0.5);
		}
		
		// 객체 배열을 3번의 사용데이터로 초기화
		// (출판날짜는 아래 setCalendar 메소드를 활용)
		
		// try with resource 구문으로 “books.dat”파일에 
		// 저장되게 ObjectOutputStream과
		// FileOutputStream을 생성
		// 파일에 객체 배열의 값 저장
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			oos.writeObject(bk);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
//		지정된 날짜의 Calendar형 반환 메소드
	public Calendar setCalendar(int year, int month, int date) {
		
		Calendar time = new GregorianCalendar(year, month - 1, date);
		return time;
	}
	
//		파일로부터 도서에 대한 정보
//		를 불러와서 콘솔에 출력하는 메소드
	public void fileRead() {
		
		Book[] bk = new Book[10];
		
		// try with resource 구문 (FileNotFoundException과 ClassNotFoundException,
		// EOFException, IOException 처리
		// 으로 “books.dat”파일을 불러오게 ObjectInputStream과 FileInputStream을 생성
		// 반복문을 통해 값을 다 읽어 들인 후 “books.dat 읽기 완료!” 출력
		// (EOFException 활용)
		// 반복문을 통해 bk 출력(null은 제외하고)
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			
		bk = (Book[]) ois.readObject();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("book.dat 읽기 완료!");
			e.printStackTrace();			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		
		// 읽어온 리스트 출력
		for (int i = 0 ; i < bk.length; i++) {
			if (bk[i] != null) {
				System.out.println(bk[i]);				
			}
		}

		
	}
	
	
	

}
