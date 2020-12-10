package com.kh.chap03_component.view;

import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class K_Dialog {
	
	public void dialogTest() {
		// 프레임 생성
		JFrame frame = new JFrame("dialogTest");
		
		// 패널 생성하여 버튼 올리기
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Dialog");
		panel.add(button1);
		
		// 다이얼로그 설정 값 넣어 생성
		Dialog dialog = new Dialog(frame, "새로운 창 이름"); 
		dialog.setBounds(200, 300, 300, 300);
		
		// 버튼을 클릭했을 때 심플다이얼로그 보이게 하기
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);
			}
			
		});
		
		// dialog에 닫기 버튼 생성하여 올림
		JButton button2 = new JButton("close");
		dialog.add(button2);
		
		//닫기 버튼 누를때 다이얼로그 닫히기
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose();
				
			}
			
		});
		
		// 패널에 버튼 하나 더 생성하여 올림
		JButton button3 = new JButton("Input Dialog");
		panel.add(button3);
		
		
		// 입력 대화상자 열기
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. 입력 다이어로그
				// String result = JOptionPane.showInputDialog("내용을 입력하세요");
				// System.out.println(result);
				// 취소 버튼이나 입력 없이 닫히면 null 리턴
				
				// 2. 확인 다이어로그
				//											다이어로그 메세지 타이틀  옵션 종류     
				// JOptionPane.showConfirmDialog(parentComponent, message, title, optionType)
				//							다이어로그가 출력되는 영역의 범위 지정(ex frame), null이면 화면 중앙에
				// int result = JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창", JOptionPane.YES_NO_OPTION);
				// int result = JOptionPane.showConfirmDialog(null, "확인하시겠습니까?", "확인 창", JOptionPane.YES_NO_CANCEL_OPTION);
				// System.out.println(result);
				
				// 3. 메세지 다이어로그
				JOptionPane.showMessageDialog(button3, "위험합니다.", "danger", JOptionPane.ERROR_MESSAGE);
//				JOptionPane.showMessageDialog(null, "위험합니다.", "danger", JOptionPane.INFORMATION_MESSAGE);
//				JOptionPane.showMessageDialog(null, "위험합니다.", "danger", JOptionPane.PLAIN_MESSAGE);
//				JOptionPane.showMessageDialog(null, "위험합니다.", "danger", JOptionPane.QUESTION_MESSAGE);
//				JOptionPane.showMessageDialog(null, "위험합니다.", "danger", JOptionPane.WARNING_MESSAGE);
			}
			
		});
		
		// 패널을 프레임에 올리고 컴포넌트 내용 크기에 맞추어 pack
		frame.add(panel);
		frame.pack();
		
		// 항상 필요한 구문
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
