package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class D_RadioButton {
	
	public void radioButtonTest() {
		JFrame frame = new JFrame("라디오버튼 테스트");
		frame.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 커피를 주문후시겠습니까?");
		
		topPanel.add(label);
		frame.add(topPanel, "North");
		
		// 라디오 버튼 생성
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Medium Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		// 라디오 버튼은 복수 선택이 불가능하게 선택하게 만드는 용도이므로
		// 버튼을 반드시 그룹으로 묶어줘야 함
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		// 라디오 버튼을 넣을 패널 생성
		JPanel sizePanel = new JPanel();
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);

		frame.add(sizePanel, "Center");
		
		// 결과 영역 (이벤트)
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultPanel.add(text);
		frame.add(resultPanel, "South");
		
		small.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small Size가 선택되었습니다.");
			}
		});
		
		medium.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Midum Size가 선택되었습니다.");
			}
		});
		
		large.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large Size가 선택되었습니다.");				
			}
		});
		
		
		
		
		
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

}
