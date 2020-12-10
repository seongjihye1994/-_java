package com.kh.chap03_component.view;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.kh.chap03_component.controller.TestController;

public class C_TextTest {
	
	TestController tc = new TestController();
	
	public void loginFrame() {
		
		// 프레임 생성
		JFrame frame = new JFrame();
		frame.setSize(800, 300);
		
		// 패널 생성
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2)); // 패널 종류를 그리드로
		panel.setSize(800, 300);
		
		
		// 컴포넌트
		panel.add(new JLabel("ID : ")); // id 칸
		JTextField id = new JTextField(30);
		panel.add(id);
		
		panel.add(new JLabel("PW : "));
		// 비밀번호를 입력할 수 있는 TextField -> 입력 되는 값을 화면 상에서 볼 수 없으며 한글 입력 불가
		JPasswordField pwd = new JPasswordField();
		panel.add(pwd);
		
		JTextArea tArea = new JTextArea(10, 30);
		tArea.setEditable(false);
		
		JButton btn = new JButton("보내기");
		
		// 보내기 버튼이 눌러졌을 떄 id, pwd에 작성 된 값을 가지고 존재하는 유저인지 확인
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String userId = id.getText();
				char[] arr = pwd.getPassword();
				
				String userPwd = ""; // equals를 사용하기 위해 String으로 바꿔줌
				for (int i = 0; i < arr.length; i++) {
					userPwd += arr[i];
				}
				
				int result = tc.login(userId, userPwd);
				
				if (result > 0) tArea.setText("성공적으로 로그인했습니다.");
				else tArea.setText("로그인에 실패했습니다.");
			}
		});
		frame.add(panel, "North"); // 패널을 북쪽방향으로 프레임에 붙임
		frame.add(tArea, "Center");
		frame.add(btn, "South");
			
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
