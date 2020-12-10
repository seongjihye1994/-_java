package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public class A_DateTest {
	
	// 1. Date(java.util)
	public void method1() {
		// 기본 생성자 -> Date 클래스로 오늘 날짜 생성
		Date today = new Date();	// JVM이 제공하는 현재 날짜에 대한 정보
		System.out.println("기본 생성자(오늘 날짜) : " + today);
		
		
		// 매개변수 생성자(Long형 숫자)
		Date when = new Date(123456789000L);
		// -> 1970년 1월 1일 0시 0분 0초부터 경과한 날짜와 시간을 저장한 객체를 생성 (밀리세컨 단위)
		System.out.println("매개변수 생성자(Long형) " + when);
		
		// 매개변수 생성자 -> 2020년 10월 26일로 날짜 세팅
		System.out.println("====== 2020년 10월 26일 ======");
		Date date = new Date(2020-1900, 10-1, 26); // 값 3개 전달
		// -1900년, 월은 0부터 시작
		// 1900년을 빼줘야 함
		System.out.println("year, month, date 생성자 : " + date);
		// -> 시간은 매개변수로 전달하지 않으면 0시 0분 0초로 들어감
		
		// 기본 생성자로 생성 후 set 메소드를 통해 값 초기화
		Date date2 = new Date();
		date2.setYear(2020 - 1900);
		date2.setMonth(10 - 1);
		date2.setDate(26);
		
		System.out.println("set~() 이용해 초기화 : " + date2);
		
		// get~() 사용
		System.out.println(date2.getYear() + 1900 + "년");
		System.out.println(date2.getMonth() + 1 + "월");
		System.out.println(date2.getDate() + "일");
		System.out.println(date2.getHours() + "시");
		System.out.println(date2.getMinutes() + "분");
		System.out.println(date2.getSeconds() + "초");
		
		// 왜 메소드에 줄이 그어져 있나요?
		// deprecated란?
		// 에러는 아니지만, 앞으로는 사용하지 말아달라는 의미
		
		// Date 클래스에서는 기본 생성자, 매개변수 생성자(long형) 사용
		
		// 특정 형태로 날짜를 출력하고 싶을 떄 SimpleDateFormat 클래스 사용
		// 매개변수로 형식을 지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 hh시 mm분 ss초");
		String formatDate = sdf.format(date2); // 매개변수로 Date 타입의 객체 전달
		System.out.println(formatDate);
		// 2020년 10월 26일 월요일 10시 36분 06초

		
		
		
		
		
		
		
		
		
	}
	
	

}
