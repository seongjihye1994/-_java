package com.kh.chap03_component.view;

import java.awt.Color;
import java.awt.Dimension;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class H_List {
	public void listTest() {
		JFrame frame = new JFrame("리스트 테스트");
		frame.setSize(300, 200);
		
		// 리스트를 올릴 패널
		JPanel listPanel = new JPanel();
		
		// 리스트를 구성할 배열 생성
		String[] cities = {"서울", "대전", "대구", "부산", "경기", "인천", "강원", "제주"};
		
		// 리스트 생성
		JList list = new JList(cities);
		
		// 리스트 경계선 디자인 설정
		list.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 10));
	
		// 리스트에 스크롤바 추가
		JScrollPane scroller = new JScrollPane(list);
		
		// 스크롤 컴포넌트 패널에 올림
		listPanel.add(scroller);
		
		// Dimension : 크기를 지정하기 위한 클래스
		scroller.setPreferredSize(new Dimension(200, 100));
		
		// 선택 모드 1. 단일 선택 모드
		// list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		// 선택 모드 2. 복수 선택 모드 -> 인접한 리스트만 복수 선택
		list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		
		// 선택 모드 3. 복수 선택 모드 -> 인접한  + 멀리있는 리스트만 복수 선택
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		// 결과 영역 이벤트
		JPanel resultPanel = new JPanel(); // 결과영역 패널
		
		JLabel label = new JLabel("선택 된 항목 : ");
		JTextField selected = new JTextField(10);
		selected.setEditable(false); // 결과 출력 영역이니 수정 불가
		
		// 리스트가 선택 되었을 경우의 이벤트 감지
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// 다중 선택 모드의 경우 선택 된 값을 리스트로 리턴 받음
				List l = list.getSelectedValuesList();
				String result = "";
				for (int i = 0; i < l.size(); i++) {
					result += l.get(i) + " ";
				}
				// 반복문으로 쌓아 둔 결과 값을 텍스트 필드에 넣음
				selected.setText(result);
			}
		});
		
		
		resultPanel.add(label);
		resultPanel.add(selected);
		
		frame.add(resultPanel, "South");
		frame.add(listPanel, "North");
	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	

}
