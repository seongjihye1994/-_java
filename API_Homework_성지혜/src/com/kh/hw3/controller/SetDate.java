package com.kh.hw3.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SetDate {
	
	public SetDate() {}
	
	public String todayPrint() {
		
//		Calendar today = new GregorianCalendar();
//		int year = today.get(Calendar.YEAR); ... 
//		 이렇게 직접 값을 넣고
//		 return year + "년" + ... 로 리턴해도 됨
		
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String formatDate = sdf.format(today);
		
		return formatDate;
	}
	
	public String setDay() {
		
		Calendar c = new GregorianCalendar(2011, 3 - 1, 21);		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");
		String formatDate = sdf.format(c.getTime());
		
		return formatDate;
	}
	
	

}
