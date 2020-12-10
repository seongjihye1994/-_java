package com.kh.chap04_date.controller;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class B_CalendarTest {
	// 2. Calendar(java.util)
	// 		GregorianCalendar(java.util) => Calendar�� �ļ� Ŭ����
	
	public void method1() {
		// 1. Calendar�� ���� ��¥ �����ϱ�
		Calendar cToday = Calendar.getInstance();
		// Calendar�� new~ �� ��ü ���� �Ұ�
		// ��? Calendar ��ü ��ü�� protected�� �Ǿ��־� ��Ӱ��迡���� ��ü ���� ����
		// �׷��� Calendar.getInstance()�޼ҵ� ���
		
		// 2. Calendar�� �ڽ� Ŭ������ GregorianCalendar�� ���� ��¥ �����ϱ�
		GregorianCalendar gToday = new GregorianCalendar();
		
		// ��, ��, �� , �� , ��, �� ������ �ʵ�(�������)�� �̿��Ͽ� ���� �ٷ� �� ����
		int year = cToday.get(Calendar.YEAR); // ()���� int��
		int month = cToday.get(Calendar.MONTH) + 1; // 1���� �����ϴϱ� -1 �������
		int date = cToday.get(Calendar.DATE);
		int ampm = cToday.get(Calendar.AM_PM);
		int hour = cToday.get(Calendar.HOUR);
		int min = cToday.get(Calendar.MINUTE);
		int sec = cToday.get(Calendar.SECOND);
		
		String sAmPm = (ampm == Calendar.AM) ? "����" : "����";
		
		System.out.printf("%d�� %02d�� %02d�� %s %02d�� %02d�� %02d��\n",
				year, month, date, sAmPm, hour, min, sec);
//		2020�� 10�� 26�� ���� 10�� 49�� 38��
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss��");

//		String formatDate = sdf.format(cToday);
//		System.out.println(formatDate);
		// Exception in thread "main" java.lang.IllegalArgumentException:
		// Cannot format given Object as a Date
		// �����߻�
		// format()�� �Ű������� Date Ÿ������ ���� �Ǿ�� ��
		// �׷��� Ķ���� Ÿ���� date Ÿ������ ��ȯ�� �� ����
		String formatDate = sdf.format(cToday.getTime());
		System.out.println(formatDate);
		
		// �Ű������� ��, ��, ��, ��, ��, �� �����ϸ鼭 ��ü ���� or Set~()�� ����
		Calendar c = new GregorianCalendar(2020, 10 - 1, 26, 11, 9, 0);
		String formatDate2 = sdf.format(c.getTime());
		System.out.println(formatDate2);
	}
	
	// Date / Calendar / GregorianCalendar

}
