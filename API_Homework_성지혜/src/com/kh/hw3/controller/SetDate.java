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
//		 �̷��� ���� ���� �ְ�
//		 return year + "��" + ... �� �����ص� ��
		
		Date today = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String formatDate = sdf.format(today);
		
		return formatDate;
	}
	
	public String setDay() {
		
		Calendar c = new GregorianCalendar(2011, 3 - 1, 21);		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E����");
		String formatDate = sdf.format(c.getTime());
		
		return formatDate;
	}
	
	

}
