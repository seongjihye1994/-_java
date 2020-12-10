package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class I_Spinner {
	
	public void spinnerTest() {
		JFrame frame = new JFrame();
		frame.setSize(500, 100);
		
		JPanel panel = new JPanel();
		
		// 1. SpinnerListModel : 문자열
		String[] items = {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel = new SpinnerListModel(items);
		JSpinner spinner1 = new JSpinner(listModel);
		
		panel.add(spinner1);
		
		// 2. SpinnerNumberModel : 숫자
		// 서적값, 최소값, 최대값, 증가값
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
		JSpinner spinner2 = new JSpinner(numberModel);
		
		panel.add(spinner2);
		
		// 2. SpinnerDateModel : 날짜
		Calendar calendar = Calendar.getInstance(); // 오늘 날짜
		Date today = calendar.getTime(); // 전달 값은 Date 타입 // 현재 날짜
		
		calendar.add(Calendar.YEAR, -50); // 현재 값보다 50년 감소한 날짜를 시작 날짜로
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, 100); // 이미 캘린더가 50년 전으로 가 있기 때문에 50년 후로 설정하려면 100으로 설정
		Date end = calendar.getTime();
		
		// 기준 날짜, 시작 날짜, 끝 날짜, 캘린더를 구성하는 상수 중 하나 전달
		// 상수를 쓰는 이유 -> getPreviousValue(), getNextValue() 등을 호출 했을 때 기준으로 사용
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner spinner3 = new JSpinner(dateModel);    // 오늘날짜를 기준으로, 시작, 끝, 년만큼 증가
		
		// 스피너의 포맷 설정
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "yyyy/MM/dd"));
		
		panel.add(spinner3);
		
		// 버튼 생성 후 패널에 올리기
		JButton button = new JButton("전송"); 
		panel.add(button);
		
		// 결과 값을 표현할 패널과 라벨 만들기
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		// 버튼 클릭시 이벤트
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 스피너가 현재 가지고 있는 값을 아는 방법
				// spinner.getValue();
				String result = "";
				result = spinner1.getValue() + " ," +  spinner2.getValue() + " ," + spinner3.getValue();
				text.setText(result);
			}
		});	
		
		frame.add(panel, "North");
		frame.add(resultPanel, "Center");
		// 버튼은 이미 기존 만들어진 panel 에 추가했기 때문에 frame에 또 추가할 필요가 없음
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
