package com.kh.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class B_TextArea {
	
	public void textAreaTest() {
		
		JFrame frame = new JFrame();
		
		// 컴포넌트
		JTextField tf = new JTextField(30); // 입력용 텍스트 필드
		JTextArea ta = new JTextArea(10, 30); // 출력용 텍스트 영역
		
		// 이벤트 대상 tf
		// tf -> 텍스트 필드에서 작성 후 엔터를 눌렀을 때 이벤트 처리
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = tf.getText();
				// 값이 초기화되어 지워지지 않고 추가하는 개념 -> append()
				ta.append(text + "\n");
				
				// 텍스트 필드의 내용 지워주기
				tf.setText("");
				tf.requestFocus();
				
			}
		});
		
		
		
		
		frame.add(tf, "North");
		frame.add(ta, "Center");
		
		// 프레임 크기를 지정하지 않으면 프레임이 작게 나옴
		frame.pack(); // -> 프레임 크기를 컴포넌트 배치에 자동으로 맞추어서 프레임이 생성 됨

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
